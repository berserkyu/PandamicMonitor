<template>
  <div class="login_container">
    <!--登录块-->
    <div class="login_box">
      <!--logo-->
      <div class="avatar_box">
        <img src="../assets/logo.png" alt/>
      </div>
      <!--表单-->
      <el-form ref="loginForm" :model="loginForm" :rules="loginRules" class="login_form" label-width="0">
        <!--用户名-->
        <el-form-item prop="username">
          用户名/邮箱：
          <el-input v-model="loginForm.username" prefix-icon="iconfont icon-denglu"></el-input>
        </el-form-item>
        <!--密码-->
        <el-form-item prop="password">
          密码：
          <el-input type="password" v-model="loginForm.password" prefix-icon="iconfont icon-mima"></el-input>
        </el-form-item>

        <el-link type="primary" class="register">注册账号</el-link>

        <!--按钮-->
        <el-form-item class="btns">
          <el-button type="primary" v-on:click="user">用户登录</el-button>
          <el-button type="info" v-on:click="admin">管理员登录</el-button>
        </el-form-item>
      </el-form>
    </div>
  </div>
</template>

<script src="https://unpkg.com/axios/dist/axios.min.js"></script>
<script>
  const {defaults} = require("autoprefixer");

  export default {
    name: "Login",
    data() {
      return {
        loginForm: {
          username: "changed@hotmail.com",
          password: "newPword",
        },
        responseResult: [],

        loginRules: {
          username: [
            { required: true, message: '请输入用户名/邮箱', trigger: 'blur' },
            { min: 10, max: 30, message: '长度在 10 到 30 个字符', trigger: 'blur' }
          ],
          password: [
            { required: true, message: '请输入密码', trigger: 'blur' },
            { min: 6, max: 15, message: '长度在 6 到 15 个字符', trigger: 'blur' }
          ]
        },
      };
    },
    methods:{
      user() {
        this.$axios
          .post('/pandemicmonitor/login',{

            mail: this.loginForm.username,
            password: this.loginForm.password
          })
          .then(successResponse => {
            if(successResponse.data.code === 200){
              this.$router.replace({path:'/helloworld'})
              this.$message.success("用户登录成功！");
            }else
              this.$message.error("邮箱或密码不存在！");

          })
          .catch(failResponse =>{
            alert("跨域操作失败！")
          })
      },
      admin() {
        this.$axios
          .post('/pandemicmonitor/login',{
          mail: this.loginForm.username,
          password: this.loginForm.password
        })
          .then(successResponse => {
            if(successResponse.data.code === 200){
            this.$router.replace({path:'/home'})
            this.$message.success("管理员登录成功！");
          }else
            this.$message.error("邮箱或密码不存在！");

        })
          .catch(failResponse =>{
            alert("操作失败！")
          })
      },
    }
  }
</script>

<style scoped>
  /*根节点样式*/
  .login_container {
    background-color: rgba(188, 236, 141, 0.84);
    height: 100%;
  }
  /*输入框样式*/
  .login_box {
    width: 450px;
    height: 300px;
    background-color: #fff;
    border-radius: 15px;
    position: absolute;
    left: 50%;
    top: 50%;
    transform: translate(-50%, -50%);
  }
  .avatar_box{
    width: 130px;
    height: 130px;
    border: 1px solid white;
    border-radius: 50%;
    padding: 5px;
    position: absolute;
    left: 50%;
    transform: translate(-50%,-60%);
    background-color: #ffff80;
  }
  img{
    width: 100%;
    height: 100%;
    position: absolute;
    top: 5%;
    left: 0;
    transform: scale(0.7);
  }

  .btns{
    display: flex;
    justify-content: flex-end;
  }
  .login_form{
    position: absolute;
    bottom: 0;
    width: 100%;
    padding: 0 10px;
    box-sizing: border-box;
  }

  .register{
    position: absolute;
    bottom: 10%;
  }
</style>
