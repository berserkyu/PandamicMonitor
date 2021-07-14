<template>
  <div class="infoUpdate_container">
    <!--登录块-->
    <div class="infoUpdate_box">
      <!--表单-->
      <el-form ref="infoUpdateForm" :model="infoUpdateForm" :rules="infoUpdateRules" class="infoUpdate_form" label-width="0">
        <!--姓名-->
        <el-form-item prop="username">
          真实姓名：
          <el-input v-model="infoUpdateForm.username" ></el-input>
        </el-form-item>
        <!--电邮-->
        <el-form-item prop="email">
          电子邮箱：
          <el-input type="email" v-model="infoUpdateForm.email" ></el-input>
        </el-form-item>
        <!--地址-->
        <el-form-item prop="address">
          地址：
          <el-input type="address" v-model="infoUpdateForm.address" ></el-input>
        </el-form-item>
        <!--手机号码-->
        <el-form-item prop="phone">
          手机号码：
          <el-input type="phone" v-model="infoUpdateForm.phone" ></el-input>
        </el-form-item>

        <!--按钮-->
        <el-form-item class="btns">
          <el-button type="primary" v-on:click="infoUpdateSubmit">更新信息</el-button>
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
  name: "infoUpdate",
  data() {
    return {
      infoUpdateForm: {
        username: "",
        email: "",
        address: "",
        phone: "",
      },
      infoUpdateRules: {
        /*姓名约束*/
        username: [
          { required: true, message: '请输入真实姓名', trigger: 'blur' },
          { min: 2, max: 15, message: '格式错误，请输入真实姓名', trigger: 'blur'}
        ],
        /*电邮约束*/
        email: [
          { required: true, message: '请输入电子邮箱', trigger: 'blur' },
          { min: 10, max: 30, message: '格式错误，必须包含@字符', trigger: 'blur' }
        ],
        /*地址约束*/
        address: [
          { required: true, message: '请输入地址', trigger: 'blur' },
          { min: 10, max: 50, message: '请输入正确的地址', trigger: 'blur' }
        ],
        /*电话号码约束*/
        phone: [
          { required: true, message: '请输入电话号码', trigger: 'blur' },
          { min: 10, max: 15, message: '请输入正确的电话号码', trigger: 'blur' }
        ]
      },
    };
  },
  methods:{
    infoUpdateSubmit(){
      this.$axios
        .post('/changelogininfo',{
          name: this.infoUpdateForm.username,
          mail: this.infoUpdateForm.email,
          address: this.infoUpdateForm.address,
          phoneno: this.infoUpdateForm.phone,
        })
        .then(successResponse =>{
          if(successResponse.data.code === 200) {
            this.$message.success("更新用户信息成功！");
          }else
            this.$message.error("更新信息格式错误！");
        }).catch(failResponse =>{alert("跨域操作失败！")})
    }
  }
}
</script>

<style scoped>
/*根节点样式*/
.infoUpdate_container {
  height: 100%;
}
/*输入框样式*/
.infoUpdate_box {
  width: 1000px;
  height: 500px;
  background-color: #fff;
  border-radius: 15px;
  position: absolute;
  left: 50%;
  top: 50%;
  transform: translate(-35%, -40%);
}
/*按钮样式*/
.btns{
  display: flex;
  justify-content: flex-end;
}
.infoUpdate_form{
  position: absolute;
  bottom: 0;
  width: 100%;
  padding: 0 10px;
  box-sizing: border-box;
}
</style>
