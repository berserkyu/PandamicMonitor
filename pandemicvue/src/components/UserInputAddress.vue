<template>
  <div class="useraddress_container">
    <!--用户输入地址块-->
    <div class="useraddress_box">

      <el-form ref="useraddressForm" :model="useraddressForm" :rules="useraddressRules" class="useraddress_Form" label-width="90px">
        <p><b>若有地址编号可直接填地址编号并提交，若无请手动输入所在地的详细地址并提交。</b></p>
        <!--地址编号输入-->
        <el-form-item label="地址编号：" prop="addressid">
          <el-input v-model="useraddressForm.addressid" placeholder="请输入您所在地点的地址编号" clearble></el-input>
        </el-form-item>
        <el-form-item class="btns">
          <el-button type="primary" @click="submit">提交</el-button>
        </el-form-item>
      </el-form>
      <!--表单-->
      <el-form ref="useraddressForm" :model="useraddressForm2" :rules="useraddressRules2" class="useraddress_Form2" label-width="90px">
        <!--地区输入-->
        <el-form-item label="地区：" prop="address">
          <el-input v-model="useraddressForm2.address" placeholder="请输入地区，如xx省xx市xx区/县" clearable></el-input>
        </el-form-item>
        <!--详细地址输入-->
        <el-form-item label="详细地址：" prop="moreaddress">
          <el-input v-model="useraddressForm2.moreaddress" placeholder="请输入详细地址，如乡村名称、小区楼栋、门牌号等" clearable></el-input>
        </el-form-item>
        <!--地点名字输入-->
        <el-form-item label="地点名字：" prop="moreaddress2">
          <el-input v-model="useraddressForm2.moreaddress2" placeholder="请输入地点名称，如商店名字、商场名称等" clearable></el-input>
        </el-form-item>
        <!--提交按钮-->
        <el-form-item class="btns2">
          <el-button type="primary" @click="submit2">提交</el-button>
        </el-form-item>
      </el-form>
    </div>
  </div>
</template>

<script>
  export default {
    name: "UserAddress",
    data(){
      var validateNum = (rule, value, callback) => { //限制地址编号框只能输入正整数方法
        let reg = /^[1-9]([0-9])*$/ //正整数限制
        let flag = reg.test(value);
        if(!flag){ //如果不等于正整数返回错误
          callback(new Error('必须输入正整数'))
        }
        else{
          callback()
        }
      };
      return{
        useraddressForm:{
          addressid:''
        },
        useraddressForm2:{
          address:'',
          moreaddress:'',
          moreaddress2:''
        },
        /*Form组件提供的表单验证功能，通过rules属性传入约定的验证规则，并将Form-Item的prop属性设置为需校验的字段名*/
        useraddressRules:{ //地址编号的表单验证
          addressid:[
            {min:1, max:18, message:'长度在1到18个字符', trigger:'blur'},
            {validator: validateNum, trigger:'blur'}
          ]
        },
        useraddressRules2:{ //手动输入地址的表单验证
          address:[{min:5, max:50, message:'长度在5到50个字符', trigger:'blur'}],
          moreaddress:[{min:5, max:50, message:'长度在5到50个字符', trigger:'blur'}],
          moreaddress2:[{min:5, max:50, message:'长度在5到50个字符', trigger:'blur'}]
        }
      }
    },
    methods: {
      /*输入地址编号提交按钮*/
      submit(){
      },
      /*手动输入地点提交按钮*/
      submit2() {
        /*按提交按钮弹出提示框*/
        this.$confirm('是否确认提交输入信息？', '提示', {
          confirmButtonText: '确定', //弹出框的确定提交按钮
          cancelButtonText: '取消', //弹出框的取消提交按钮
          type: 'warning', //弹出框类型
          center:true
        }).then(() => { //按下确定弹出消息
          this.$message({
            type: 'success',
            message: '提交输入信息成功！'
          });
        }).catch(() => { //按下取消弹出消息
          this.$message({
            type: 'info',
            message: '已取消提交'
          });
        });
      }
    }
  }
</script>

<style scoped>
  /*根节点样式*/
  .useraddress_container {
    height: 100%;
  }
  .useraddress_box {
    width: 900px;
    height: 500px;
    background-color: #fff;
    border-radius: 15px;
    position: absolute;
    left: 50%;
    top: 50%;
    transform: translate(-35%, -43%);
  }
  /*按钮样式*/
  .btns{
    display: flex;
    justify-content: flex-end;
  }
  .btns2{
    display: flex;
    justify-content: flex-end;
  }
  /*表单样式*/
  .useraddress_Form{
    position: relative;
    bottom: 0;
    width: 100%;
    padding: 0 10px;
    box-sizing: border-box;
  }
  .useraddress_Form2{
    position: absolute;
    bottom: 0;
    width: 100%;
    padding: 0 10px;
    box-sizing: border-box;
  }
  /*上一页链接样式*/
  .past{
    position: absolute;
    bottom: 12.5%;
  }
</style>
