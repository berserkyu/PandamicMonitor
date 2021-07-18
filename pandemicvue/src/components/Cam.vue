
<template>
  <div>
    <!--开启弹窗拍摄按钮-->
    <el-button
      type="primary"
      @click="onTake"
      icon="el-icon-camera"
      size="small">
      二维码拍摄上传
    </el-button>
    <!--用于拍摄上传二维码弹窗-->
    <el-dialog
      title="二维码上传"
      :visible.sync="visible"
      @close="onCancel"
      width="700px">
      <!--拍摄上传对话框-->
      <div class="box">
        <video id="videoCamera" class="canvas" :width="scanWidth" :height="scanHeight" autoPlay></video>
        <canvas id="canvasCamera" class="canvas" :width="scanWidth" :height="scanHeight"></canvas>
        <!--<qrcode-stream @decode="onDecode"></qrcode-stream>-->
      </div>
      <div slot="footer">
        <!--扫描按钮-->
        <el-button
          @click="onDecode"
          icon="el-icon-full-screen"
          size="small">
          <qrcode-stream @decode="onDecode"></qrcode-stream>
          扫描
        </el-button>
        <!--拍摄二维码按钮-->
        <el-button
          @click="drawImage"
          icon="el-icon-camera"
          size="small">
          拍下二维码
        </el-button>
        <!--重新拍摄按钮-->
        <el-button
          @click="resetCanvas"
          icon="el-icon-refresh"
          size="small">
          重新拍摄
        </el-button>
        <!--关闭拍摄上传弹窗按钮-->
        <el-button
          @click="onCancel"
          icon="el-icon-circle-close"
          size="small">
          取消
        </el-button>
        <!--拍摄后上传按钮-->
        <el-button
          @click="onUpload"
          :loading="loading"
          type="primary"
          icon="el-icon-upload2"
          size="small">
          上传二维码
        </el-button>
      </div>
    </el-dialog>
  </div>
</template>

<script>
//拍摄上传二维码的组件
//父组件通过函数 getImg 获取照片路径,如 @getImg="getImg"
//const Address = require('../utils/url');//上传图片的地址
export default {
  name: "QRscan",
  data() {
    return {
      imgSrc: "",
      visible: false, //弹窗
      loading: false, //加载上传的按钮
      thisVideo: null,
      thisContext: null,
      thisCancas: null,
      scanWidth: 300,
      scanHeight: 300
    }
  },
  methods: {
    //扫描
    onDecode (decodedString) {
      console.log(decodedString);
    },
    //开启对话框
    onTake() {
      this.visible = true;
      this.getCompetence();
    },
    //关闭对话框
    onCancel() {
      this.visible = false;
      this.resetCanvas();
      this.stopNavigator();
    },
    //将base64转换成文件上传
    onUpload() {
      if (this.imgSrc) {
        const file = this.imgSrc; //将整个base64给file
        const time = (new Date()).valueOf(); //时间戳生成
        const name = time + ".png"; //文件名
        const conversions = this.dataURLtoFile(file, name); //base64转为图片的方法
        const data = new FormData();
        data.append('file', conversions);
        const options = {
          method: "POST",   //请求方法
          body: data,
          headers: {
            'Accept': 'application/json'
          },
        };
        this.loading = true;
        fetch(Address.UPLOAD, options)
          .then((response) => {
            return response.json();
          })
          .then((responseText) => {
            this.loading = false;
            if (responseText.code === 0) {
              this.imgSrc = responseText.data.src;
              this.$emit('getImg', responseText.data.src); //父组件传递
              this.onCancel();
              this.$notify({
                title: '二维码上传成功',
                message: responseText.msg,
                type: 'success'
              });
            }
          })
          .catch((error) => {
            this.loading = false;
            this.$notify.error({
              title: '二维码上传失败',
              message: error.msg,
            });
          })
      }
      else {
        this.$notify({
          title: 'warning!',
          message: '请先拍摄二维码',
          type: 'warning'
        });
      }
    },
    //镜头权限的调用
    getCompetence() {
      //在model中render后才能取得dom节点,不能直接获取
      this.$nextTick(() => {
        const _this = this;
        this.open = false; //关闭摄像头
        this.thisCancas = document.getElementById('canvasCamera');
        this.thisContext = this.thisCancas.getContext('2d');
        this.thisVideo = document.getElementById('videoCamera');
        //旧版本浏览器可能不支持mediaDevices，因此先设置一个空对象
        if (navigator.mediaDevices === undefined) {
          navigator.mediaDevices = {}
        }
        //部分浏览器实现了部分mediaDevices，不能只分配一个对象
        //用getUserMedia以避免覆盖现有属性。
        //若缺少getUserMedia属性则添加它。
        if (navigator.mediaDevices.getUserMedia === undefined) {
          navigator.mediaDevices.getUserMedia = function (constraints) {
            //若有则先获取现存的getUserMedia
            let getUserMedia = navigator.webkitGetUserMedia || navigator.mozGetUserMedia || navigator.getUserMedia;
            //部分浏览器不支持则返回错误信息
            //确保接口一致
            if (!getUserMedia) {
              return Promise.reject(new Error('getUserMedia is not implemented in this browser'))
            }
            //用Promise将调用包装到旧的navigator.getUserMedia
            return new Promise(function (resolve, reject) {
              getUserMedia.call(navigator, constraints, resolve, reject)
            })
          }
        }
        const constraints = {
          audio: false,
          video: {width: _this.scanWidth, height: _this.scanHeight, transform: 'scaleX(-1)'}
        };
        navigator.mediaDevices.getUserMedia(constraints).then(function (stream) {
          //旧的浏览器可能无srcObject
          if ('srcObject' in _this.thisVideo) {
            _this.thisVideo.srcObject = stream
          } else {
            //避免在新的浏览器中使用它，因为它正在被弃用。
            _this.thisVideo.src = window.URL.createObjectURL(stream)
          }
          _this.thisVideo.onloadedmetadata = function (e) {
            _this.thisVideo.play()
          }
        }).catch(err => {
          this.$notify({
            title: '警告',
            message: '没有开启摄像头权限或浏览器版本不兼容.',
            type: 'warning'
          });
        });
      });
    },
    //绘制图片
    drawImage() {
      //canvas画图
      this.thisContext.drawImage(this.thisVideo, 0, 0, this.scanWidth, this.scanHeight);
      //获取图片base64链接
      this.imgSrc = this.thisCancas.toDataURL('image/png');
    },
    //base64转换文件
    dataURLtoFile(dataurl, filename) {
      let arr = dataurl.split(',');
      let mime = arr[0].match(/:(.*?);/)[1];
      let bstr = atob(arr[1]);
      let n = bstr.length;
      let u8arr = new Uint8Array(n);
      while (n--) {
        u8arr[n] = bstr.charCodeAt(n)
      }
      return new File([u8arr], filename, {type: mime})
    },
    //清空画布
    clearCanvas(id) {
      let c = document.getElementById(id);
      let cxt = c.getContext("2d");
      cxt.clearRect(0, 0, c.width, c.height);
    },
    //重置画布
    resetCanvas() {
      this.imgSrc = "";
      this.clearCanvas('canvasCamera');
    },
    //摄像头关闭
    stopNavigator() {
      if (this.thisVideo && this.thisVideo !== null) {
        this.thisVideo.srcObject.getTracks()[0].stop();
        this.open = true;//切换成打开摄像头
      }
    },
  },
  beforeDestroy() {
    this.stopNavigator()
  },
  onDecode (decodedString) {
    console.log(decodedString);
  }
}
</script>

<style scoped>
.box {
  display: flex;
  justify-content: space-between;
}

.canvas {
  border: 2px solid #e8e8e8;
  border-radius: 30px;
}

</style>

