<template>
  <div class="changePass_container">
    <!--登录块-->
    <div class="changePass_box">
      <!--表单-->
      <el-form ref="changePassForm" :model="changePassForm" :rules="changePassRules" class="changePass_form" label-width="0">
        <!--旧密码-->
        <el-form-item prop="password">
          旧密码：
          <el-input v-model="changePassForm.oldPass" ></el-input>
        </el-form-item>
        <!--新密码-->
        <el-form-item prop="password">
          新密码：
          <el-input type="password" v-model="changePassForm.newPass" ></el-input>
        </el-form-item>
        <!--新密码确认-->
        <el-form-item prop="password">
          新密码确认：
          <el-input type="password" v-model="changePassForm.newPassC"></el-input>
        </el-form-item>


        <!--按钮-->
        <el-form-item class="btns">
          <el-button type="primary" v-on:click="changePassword">更改密码</el-button>
          <el-button type="info">重置</el-button>
        </el-form-item>
      </el-form>
    </div>
  </div>
</template>

<script>
// 引入autoprefixer（为了引用successResponse）
const {defaults} = require("autoprefixer");
export default {
  name: "changePassword",
  data() {
    return {
      changePassForm: {
        oldPass: "",
        newPass: "",
        newPassC: "",
        isOldPassValid: "",
        isNewPassCValid: "",
      },
      changePassRules: {
        /*旧密码约束*/
        oldPass: [
          { required: true, message: '请输入旧密码', trigger: 'blur' },
          { min: 6, max: 15, message: '密码错误', trigger: 'blur' }
        ],
        /*新密码约束*/
        newPass: [
          { required: true, message: '请输入密码', trigger: 'blur' },
          { min: 6, max: 15, message: '长度在 6 到 15 个字符', trigger: 'blur' }
        ],
        /*新密码确认约束*/
        newPassC: [
          { required: true, message: '请输入确认密码', trigger: 'blur' },
          { min: 6, max: 15, message: '长度在 6 到 15 个字符', trigger: 'blur' }
        ]
      },
    };
  },
  methods:{
    // validateOldPassword(){
    //   this.$axios
    //   .post('',{
    //     oldPassword: this.changePassForm.oldPass
    //   })
    //   .then(successResponse =>{
    //     if(successResponse.data.code === 200)
    //       this.changePassForm.isOldPassValid = true;
    //     else
    //     {
    //       this.changePassForm.isOldPassValid = false;
    //       this.$message.error("旧密码错误！");
    //     }
    //   }).catch(failResponse =>{alert("跨域操作失败！")})
    // },
    validateConfirmPassword(){
      if(this.changePassForm.newPass === this.changePassForm.newPassC)
        this.changePassForm.isNewPassCValid = true;
      else
      {
        this.changePassForm.isNewPassCValid = false;
        this.$message.error("确认密码错误！");
      }
    },
    changePassword(){
      this.validateConfirmPassword();
      if(this.changePassForm.isNewPassCValid )
      {
        this.$axios
          .post('/changelogininfo',{
            oldPassword: this.changePassForm.oldPass,
            newPassword: this.changePassForm.newPass
          })
          .then(successResponse =>{
            if(successResponse.data.code === 200)
              this.$message.success("密码更改成功！");
            else
              this.$message.error("旧密码错误！");
          }).catch(failResponse =>{alert("跨域操作失败！")})
      }
    }
  }
}
</script>

<style scoped>
/*根节点样式*/
.changePass_container {
  height: 100%;
}
/*输入框样式*/
.changePass_box {
  width: 500px;
  height: 400px;
  background-color: #fff;
  border-radius: 15px;
  position: absolute;
  left: 50%;
  top: 50%;
  transform: translate(-30%, -40%);
}
/*按钮样式*/
.btns{
  display: flex;
  justify-content: flex-end;
}
.changePass_form{
  position: absolute;
  bottom: 0;
  width: 100%;
  padding: 0 10px;
  box-sizing: border-box;
}
</style>
