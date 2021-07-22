<template>
  <div>
    <!--开启弹窗拍摄按钮-->
    <el-button
      type="primary"
      @click="onScan"
      icon="el-icon-full-screen"
      size="small">
      扫描二维码
    </el-button>
    <!--用于扫描二维码弹窗-->
    <el-dialog
      title="二维码扫描" center
      :visible.sync="visible"
      destroy-on-close
      @close="onCancel"
      width="700px">
      <!--二维码扫描框-->
      <div class="box">
        <qrcode-stream @decode="onDecode" :camera="camera" :track="paintOutline" class="scanBox"></qrcode-stream>
      </div>
    </el-dialog>

    <!--用户打卡记录列表-->
    <el-main>

      <el-table :data="tableData"  highlight-current-row border style="width: 100%;"
                class="visitList_table" height="500">
        <el-table-column label="地址编号" prop="locId"></el-table-column>
        <el-table-column label="省" prop="province"></el-table-column>
        <el-table-column label="市" prop="city"></el-table-column>
        <el-table-column label="区" prop="area"></el-table-column>
        <el-table-column label="地址" prop="address"></el-table-column>
        <el-table-column label="地点" prop="locName"></el-table-column>
        <el-table-column label="危险水平" prop="cautionLevel"></el-table-column>
        <el-table-column label="时间" prop="dateVisit"></el-table-column>
        <el-table-column label="日期" prop="timeVisit"></el-table-column>

      </el-table>
    </el-main>
  </div>
</template>

<script>
  export default {
  name: "QRscan",
  mounted() {
    this.getData();
    console.log(this.tableData);
  },

  data() {
    return {
      tableData:[],
      camera: 'auto', //摄像头
      visible: false, //弹窗是否可视
    }
  },

    methods: {
    //扫描
    onDecode(decodedString) {
      console.log(decodedString);
      if(decodedString.length<15 || decodedString.substr(0,15)!=="PandemicMonitor"){
        this.$message.error("二维码不包含有效信息");
      }else {
        const n = decodedString.length;
        this.$axios.post("visit/add",{
          locId: decodedString.substr(15,n-15),
          mail: this.$cookies.get("mail"),
          date: Date.now()
        }).then(successResponse=>{
          if(successResponse.data.code === 200){
            this.$message.success("登记成功！地点编号：" + decodedString.substr(15,n-15));
            this.onCancel();
            this.getData();
          }else{
            this.$message.error("登记失败(地点信息或未被录入)");
          }
        }).catch(failResponse=>{
          this.$message.error("操作失败！");
        })
      }
    },
    //开启对话框
    onScan() {
      this.visible = true;
      this.camera = 'auto';
    },
    //关闭对话框
    onCancel() {
      this.visible = false;
      this.camera = 'off';
    },

    //标记二维码
    paintOutline (detectedCodes, ctx) {
      for (const detectedCode of detectedCodes) {
        const [ firstPoint, ...otherPoints ] = detectedCode.cornerPoints

        ctx.strokeStyle = "green";
        ctx.lineWidth = 10;
        ctx.beginPath();
        ctx.moveTo(firstPoint.x, firstPoint.y);
        for (const { x, y } of otherPoints) {
          ctx.lineTo(x, y);
        }
        ctx.lineTo(firstPoint.x, firstPoint.y);
        ctx.closePath();
        ctx.stroke();
      }
    },
    //显示打卡列表
    getData() {
      console.log(this.$cookies.get('idNo'));
      this.$axios
        .post('/visit/showData',{
          idNo: this.$cookies.get('idNo')
        })
        .then(successResponse => {
          console.log(successResponse.data.code);
          if(successResponse.data.code === 200)
            this.tableData = successResponse.data.tableData;
        })
        .catch(failResponse =>{alert("跨域操作失败！")})
    }
  }
}
</script>

<style scoped>
/*扫描弹窗样式*/
.box {
  display: flex;
  justify-content: center;
}

/*扫描框样式*/
.scanBox{
  height: 600px;
  width: 600px;
}

.el-button{
  margin-left: 20px;
}
</style>

