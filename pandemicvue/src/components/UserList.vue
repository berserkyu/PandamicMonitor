<template>
  <div class="userlist_container">

    <!--搜索筛选-->
    <el-form :inline="true" :model="userlistForm" class="user_search">
      <el-form-item label="搜索：">
        <el-input v-model="userlistForm.name" placeholder="请输入姓名"></el-input>
      </el-form-item>
      <el-form-item>
        <el-button type="primary" icon="el-icon-search" @click="search">搜索</el-button>
        <el-button type="primary" icon="el-icon-plus" @click="add">新增用户</el-button>
      </el-form-item>
    </el-form>
    <!--用户信息列表-->
    <el-main>
      <el-table :data="tableData"  highlight-current-row border style="width: 100%;" class="userlist_table" height="500">
        <el-table-column prop="fullName" label="姓名"></el-table-column>
        <el-table-column prop="idNo" label="证件号"></el-table-column>
        <el-table-column prop="mail" label="电子邮箱"></el-table-column>
        <el-table-column label="操作" width="180" align="center">
          <template slot-scope="scope">
            <el-button type="text" icon="el-icon-edit" @click="edit(scope.row)">编辑</el-button>
            <el-button type="text" icon="el-icon-delete" class="deleteColor" @click="del(scope.row.idNo)">删除</el-button>
          </template>
        </el-table-column>
      </el-table>
      <!--新增用户信息对话框-->
      <el-dialog title="新增用户信息" :visible.sync="addFormVisible" width="30%" close-on-click-modal="false" close-on-press-escape="false" show-close="false">
        <!--新增用户信息表单-->
        <el-form label-width="100px" :model="addForm" :rules="addRules" ref="addForm" class="add_Form">
          <!--姓名输入框-->
          <el-form-item label="姓名：" prop="name">
            <el-input v-model="addForm.name" placeholder="请输入用户的真实姓名" clearable></el-input>
          </el-form-item>
          <el-form-item label="证件号：">
            <!--选择证件类型选择器-->
            <el-form-item prop="idtype">
              <el-select v-model="addForm.idtype" placeholder="请选择用户的证件类型">
                <el-option label="身份证" value="0"></el-option>
                <el-option label="港澳台身份证" value="1"></el-option>
              </el-select>
            </el-form-item>
            <!--证件号输入框-->
            <el-form-item prop="idno">
              <el-input v-model="addForm.idno" placeholder="请输入用户的证件号" clearable></el-input>
            </el-form-item>
          </el-form-item>
          <!--邮箱输入框-->
          <el-form-item label="电子邮箱：" prop="email">
            <el-input v-model="addForm.email" placeholder="请输入用户的电子邮箱" clearable></el-input>
          </el-form-item>
          <!--密码输入框-->
          <el-form-item label="密码：" prop="password">
            <el-input v-model="addForm.password" placeholder="请输入密码" clearable show-password></el-input>
          </el-form-item>
        </el-form>
        <!--新增用户信息对话框按钮-->
        <div slot="footer" class="dialog_footer">
          <el-button @click="addFormVisible = false">取消</el-button>
          <el-button type="primary" @click="save">保存</el-button>
        </div>
      </el-dialog>
      <!--编辑用户信息对话框-->
      <el-dialog title="编辑用户信息" :visible.sync="editFormVisible" width="30%" close-on-click-modal="false" close-on-press-escape="false" show-close="false">
        <!--编辑用户信息表单-->
        <el-form label-width="100px" :model="editForm" :rules="editRules" ref="editForm" class="edit_Form">
          <!--姓名输入框-->
          <el-form-item label="姓名：" prop="name">
            <el-input v-model="editForm.fullName" placeholder="请输入用户的真实姓名" clearable></el-input>
          </el-form-item>
          <!--邮箱输入框-->
          <el-form-item label="电子邮箱：" prop="email">
            <el-input v-model="editForm.mail" placeholder="请输入用户的电子邮箱" clearable></el-input>
          </el-form-item>
          <!--地址输入框-->
          <el-form-item label="地址" prop="address">
            <el-input v-model="editForm.address" placeholder="请输入用户的家庭地址" clearable ></el-input>
          </el-form-item>
          <!--联系方式输入框-->
          <el-form-item label="联系方式" prop="phonenumber">
            <el-input v-model="editForm.phoneNo" placeholder="请输入用户的手机号码/电话号码" clearable></el-input>
          </el-form-item>
        </el-form>
        <!--编辑用户信息对话框按钮-->
        <div slot="footer" class="dialog_footer">
          <el-button @click="editFormVisible = false">取消</el-button>
          <el-button type="primary" @click="save2">保存</el-button>
        </div>
      </el-dialog>
    </el-main>
  </div>
</template>

<script>
var oldmail;
export default{
  mounted() {
    this.getdata();
  },
  name:'UserList',
  data(){
    return{
      tableData:[],
      addFormVisible: false,
      editFormVisible: false,
      userlistForm:{
        name:''
      },
      user_info: [],
      addForm:{
        name:'',
        idtype:'',
        idno:'',
        email:'',
        password:''
      },
      editForm:{
        fullName:'',
        mail:'',
        address:'',
        phoneNo:''
      },
      /*Form组件提供的表单验证功能，通过rules属性传入约定的验证规则，并将Form-Item的prop属性设置为需校验的字段名*/
      /*新增用户信息表单验证*/
      addRules:{
        name:[
          {required:true, message:'请输入用户的真实姓名', trigger:'blur'}
        ],
        idtype:[
          {required:true, message:'请选择用户的证件类型', trigger:'change'}
        ],
        idno:[
          {required:true, message:'请输入用户的证件号', trigger:'blur'}
        ],
        email:[
          {required:true, message:'请输入用户的电子邮箱', trigger:'blur'},
          {type:'email', message:'请输入正确的邮箱地址', trigger:['blur','change']}
        ],
        password:[
          {required:true, message:'请输入密码', trigger:'blur'},
          {min:6, max:15, message:'长度在6到15个字符', trigger:'blur'}
        ],
      },
      /*编辑用户信息表单验证*/
      editRules:{
        name:[
          {required:true, message:'请输入用户的真实姓名', trigger:'blur'}
        ],
        email:[
          {required:true, message:'请输入用户的电子邮箱', trigger:'blur'},
          {type:'email', message:'请输入正确的邮箱地址', trigger:['blur','change']}
        ],
        address:[
          {required:true, message:'请输入用户的家庭地址', trigger:'blur'},
          {min:10, max:50, message:'长度在10到50个字符', trigger:'blur'}
        ],
        phonenumber:[
          {required:true, message:'请输入用户的电话号码/手机号码', trigger:'blur'},
          {min:1, max:15, message:'长度在1到15个字符', trigger:'blur'}
        ],
      }
    }
  },
  methods:{
    search(){ //搜索按钮方法
      console.log("get all data");
      this.$axios
        .post('getuserbyname',{
          fullName: this.userlistForm.name
        })
        .then(successResponse => {
          console.log("success");
          this.tableData = successResponse.data.tableData;
        }) .catch(failResponse =>{alert("跨域操作失败！")})
    },
    add(){ //显示新增用户表单
      this.addForm = {};
      this.addFormVisible = true;
    },
    save() { //新增用户表单的保存
      this.$confirm('是否确定新增此用户？', '提示', {
        confirmButtonText: '确定', //弹出框的确定提交按钮
        cancelButtonText: '取消', //弹出框的取消提交按钮
        type: 'warning', //弹出框类型
        center: true
      }).then(() => { //按下确定弹出消息

        this.$axios
          .post('register', {
            fullname: this.addForm.name,
            idtype: this.addForm.idtype,
            idNo: this.addForm.idno,
            mail: this.addForm.email,
            password: this.addForm.password
          })
          .then(successResponse => {
            if (successResponse.data.code === 200) {
              this.$message({
                type: 'success',
                message: '新增用户成功！'
              });
            } else {
              this.$message({
                type: 'error',
                message: '新增用户失败'
              });
            }
          }) .catch(failResponse =>{alert("跨域操作失败！")})

      })
    },
    save2() { //编辑用户信息表单的保存
      this.$confirm('是否确定编辑此用户信息？', '提示', {
        confirmButtonText: '确定', //弹出框的确定提交按钮
        cancelButtonText: '取消', //弹出框的取消提交按钮
        type: 'warning', //弹出框类型
        center: true
      }).then(() => { //按下确定弹出消息

        this.$axios
          .post('/changeuserinfo', {
            name: this.editForm.fullName,
            oldMail: oldmail,
            newMail: this.editForm.mail,
            address: this.editForm.address,
            phoneno: this.editForm.phoneNo
          })
          .then(successResponse => {
            if (successResponse.data.code == 200) {
              this.$message({
                type: 'success',
                message: '编辑用户信息成功！'
              });
            } else {
              this.$message({
                type: 'error',
                message: '编辑用户信息失败'
              });
            }
          }) .catch(failResponse =>{alert("跨域操作失败！")})

      })
    },
    edit(obj){ //编辑按钮方法
      console.log(obj);
      this.editForm = obj;
      this.editFormVisible = true;
      this.editForm.email =obj.mail;
      oldmail = obj.mail;
    },
    del(idNoParam) { //删除按钮方法
      this.$confirm('是否确定删除此用户？', '提示', {
        confirmButtonText: '确定', //弹出框的确定提交按钮
        cancelButtonText: '取消', //弹出框的取消提交按钮
        type: 'warning', //弹出框类型
        center: true
      }).then(() => { //按下确定弹出消息
        console.log(idNoParam);
        this.$axios
          .post('deleteuser', {
            idNo: idNoParam
          })
          .then(successResponse => {
            if (successResponse.data.code === 200) {
              this.$message({
                type: 'success',
                message: '删除用户成功！'
              });
              this.getdata();
            } else {
              this.$message({
                type: 'error',
                message: '删除用户失败'
              });
            }
          }) .catch(failResponse =>{alert("跨域操作失败！")})
      })
    },
    getdata() {
      console.log("get all data");
      this.$axios
        .get('/getalluser')
        .then(successResponse => {
          console.log("success");
          this.tableData = successResponse.data.tableData;
        }) .catch(failResponse =>{alert("跨域操作失败！")})
    }
  }
}

</script>

<style scoped>
/*根节点样式*/
.userlist_container{
  height:100%;
  width:100%;
}

.user_search{
  margin-top:20px;
  margin-left: 15px;
  padding: 0 10px;
}

.deleteColor{
  color:red;
}
</style>
