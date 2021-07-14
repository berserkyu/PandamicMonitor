<template>
  <div class="register_container">
    <!--注册块-->
    <div class="register_box">
      <div class="avatar_box">
        <img src="../assets/logo.png" alt/>
      </div>
      <!--表单-->
      <el-form ref="registerForm" :model="registerForm" :rules="registerRules" class="register_Form" label-width="100px">
        <!--姓名输入框-->
        <el-form-item label="姓名：" prop="name">
          <el-input v-model="registerForm.name" placeholder="请输入您的真实姓名" clearable></el-input>
        </el-form-item>
        <!--性别单选框-->
        <el-form-item label="性别：" prop="gender">
          <el-radio-group v-model="registerForm.gender">
            <el-radio label="1">男</el-radio>
            <el-radio label="2">女</el-radio>
          </el-radio-group>
        </el-form-item>
        <!--日期选择器-->
        <el-form-item label="出生日期：" prop="birth">
          <el-date-picker
            v-model="registerForm.birth" type="date" placeholder="选择日期">
          </el-date-picker>
        </el-form-item>
        <!--证件号输入框-->
        <el-form-item label="证件号：">
          <el-form-item prop=certificatetype>
            <el-select v-model="registerForm.certificatetype" placeholder="请选择您的证件类型">
              <el-option label="身份证" value="0"></el-option>
              <el-option label="港澳台身份证" value="1"></el-option>
            </el-select>
          </el-form-item>
          <el-form-item prop="certificateid">
            <el-input v-model="registerForm.certificateid" placeholder="请输入您的证件号" clearable></el-input>
          </el-form-item>
        </el-form-item>
        <!--邮箱输入框-->
        <el-form-item label="电子邮箱：" prop="email">
          <el-input v-model="registerForm.email" placeholder="请输入您的电子邮箱(必须包含@)" clearable></el-input>
        </el-form-item>
        <!--地址输入框-->
        <el-form-item label="地址：" prop="address">
          <el-input v-model="registerForm.address" placeholder="请输入您的家庭地址" clearable></el-input>
        </el-form-item>
        <!--联系方式输入框-->
        <el-form-item label="联系方式：" prop="phonenumber">
          <el-input v-model="registerForm.phonenumber" placeholder="请输入您的电话号码/手机号码" clearable></el-input>
        </el-form-item>
        <!--密码输入框-->
        <el-form-item label="密码：" prop="password">
          <el-input type="password" v-model="registerForm.password" placeholder="请输入您的密码" clearable show-password></el-input>
        </el-form-item>
        <!--确认密码输入框-->
        <el-form-item label="确认密码：" prop="checkpassword">
          <el-input type="password" v-model="registerForm.checkpassword" placeholder="请再输入一遍密码" clearable show-password></el-input>
        </el-form-item>
        <!--跳转登录页面-->
        <el-link v-on:click="login" type="primary" class="login">登录账号</el-link>
        <!--按钮-->
        <el-form-item class="btns">
          <el-button type="primary" @click="submitForm('registerForm')">注册</el-button>
          <el-button @click="resetForm('registerForm')">重置</el-button>
        </el-form-item>
      </el-form>
    </div>
  </div>
</template>

<script>
export default {
  name: "Register",
  data(){
    /*判断两次输入密码是否一致*/
    var validatePass = (rule, value, callback) => {
      if(value === ''){
        callback(new Error('请输入密码'));
      }
      else{
        if(this.registerForm.checkpassword !== ''){
          this.$refs.registerForm.validateField('checkpassword');
        }
        callback();
      }
    };
    var validatePass2 = (rule, value, callback) => {
      if(value === ''){
        callback(new Error('请再次输入密码'));
      }
      else if(value !== this.registerForm.password){
        callback(new Error('两次输入密码不一致！'));
      }
      else{
        callback();
      }
    };
    return{
      registerForm:{
        name:'',
        gender:'',
        birth:'',
        certificatetype:'',
        certificateid:'',
        email:'',
        address:'',
        phonenumber:'',
        password:'',
        checkpassword:'',
      },
      /*Form组件提供的表单验证功能，通过rules属性传入约定的验证规则，并将Form-Item的prop属性设置为需校验的字段名*/
      registerRules:{
        name:[
          {required:true, message:'请输入您的真实姓名', trigger:'blur'}
        ],
        gender:[
          {required:true, message:'请选择您的性别', trigger:'blur'}
        ],
        birth:[
          {required:true, message:'请选择您的出生日期', trigger:'change'}
        ],
        certificatetype:[
          {required:true, message:'请选择您的证件类型', trigger:'change'}
        ],
        certificateid:[
          {required:true, message:'请输入您的证件号', trigger:'blur'}
        ],
        email:[
          {required:true, message:'请输入您的电子邮箱', trigger:'blur'},
          {type:'email', message:'请输入正确的邮箱地址', trigger:['blur','change']}
        ],
        address:[
          {required:true, message:'请输入您的地址', trigger:'blur'},
          {min:10, max:50, message:'长度在10到15个字符', trigger:'blur'}
        ],
        phonenumber:[
          {required:true, message:'请输入您的电话号码/手机号码', trigger:'blur'},
          {min:1, max:15, message:'长度在1到15个字符', trigger:'blur'}
        ],
        password:[
          {required:true, message:'请输入密码', trigger:'blur'},
          {min:6, max:15, message:'长度在6到15个字符', trigger:'blur'},
          {validator:validatePass, trigger:'blur'}
        ],
        checkpassword:[
          {required:true, message:'请输入密码', trigger:'blur'},
          {min:6, max:15, message:'长度在6到15个字符', trigger:'blur'},
          {validator:validatePass2, trigger:'blur'}
        ]
      }
    }
  },
  methods:{
    submitForm(formName){
      this.$refs(formName).validate((valid) =>{
        /*若表单验证成功则注册成功，否则注册失败*/
        if(valid){
          alert('注册成功！');
        }
        else{
          console.log('注册失败！');
          return false;
        }
      });
    },
    resetForm(formName){
      this.$refs(formName).resetFields();
    },
    login(){
      this.$router.replace({path:'/login'})
    }
  }
}
</script>

<style scoped>
/*根节点样式*/
.register_container{
  background-color:rgba(188, 236, 141, 0.84);
  height:100%;
  width:100%;
}
/*输入框样式*/
.register_box{
  width:1000px;
  height:700px;
  background-color:#fff;
  border-radius:15px;
  position:absolute;
  left:50%;
  top:50%;
  transform:translate(-50%, -50%);
}
/*logo样式*/
.avatar_box{
  width:50px;
  height:50px;
  border:1px solid white;
  border-radius:50%;
  padding:5px;
  position:absolute;
  left: 50%;
  transform:translate(-50%,-60%);
  background-color:#ffff80;
}
img{
  width:100%;
  height:100%;
  position:absolute;
  top:5%;
  left:0;
  transform:scale(0.7);
}
/*按钮样式*/
.btns{
  display:flex;
  justify-content:flex-end;
}
/*表单样式*/
.register_Form{
  position:absolute;
  bottom:0;
  width:100%;
  padding:0 10px;
  box-sizing:border-box;
}
/*登录链接样式*/
.login{
  position:absolute;
  bottom:5%;
}
</style>
