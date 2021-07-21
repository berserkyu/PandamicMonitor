<template>
  <div class="addresslist_container">
    <!--搜索筛选-->
    <el-form :inline="true" :model="addresslistForm" class="address_search">
      <el-form-item label="搜索：">
        <el-input v-model="addresslistForm.addressid" placeholder="请输入地址编号"></el-input>
      </el-form-item>
      <el-form-item>
        <el-button type="primary" icon="el-icon-search" @click="search">搜索</el-button>
        <el-button type="primary" icon="el-icon-refresh" @click="getdata">刷新</el-button>
      </el-form-item>
    </el-form>
    <!--地点信息列表-->
    <el-main>
      <el-table :data="tableData" highlight-current-row border style="width: 100%;" class="addresslist_table" height="500px" >
        <el-table-column label="地址编号" prop="locId"></el-table-column>
        <el-table-column label="地点" prop="address"></el-table-column>
        <el-table-column label="二维码">
          <template slot-scope="scope">

            <el-popover
              placement="bottom"
              :title="scope.row.realName"
              trigger="click">


              <el-button slot="reference" @click="showQRCode(scope.row.locId)">点击显示二维码</el-button>
              <div id="qrcode"></div>
            </el-popover>
          </template>
        </el-table-column>
        <el-table-column label="操作" width="180" align="center">
          <template slot-scope="scope">
            <el-button type="text" icon="el-icon-edit" @click="edit(scope.row)">编辑</el-button>
            <el-button type="text" icon="el-icon-delete" class="deleteColor" @click="del(scope.row.locId)">删除</el-button>
          </template>
        </el-table-column>
      </el-table>
      <!--编辑地点信息对话框-->
      <el-dialog title="编辑地点信息" :visible.sync="editFormVisible" width="30%" close-on-click-modal="false" close-on-press-escape="false" show-close="false">
        <!--编辑地点信息表单-->
        <el-form label-width="120px" :model="editForm" :rules="editRules" ref="editForm" class="edit_Form">
          <!--编辑地址编号输入框-->
          <el-form-item label="地址编号" prop="addressid">
            <el-input v-model="editForm.addressid" placeholder="请输入地址编号" readonly></el-input>
          </el-form-item>
          <!--编辑地点输入框-->
          <el-form-item label="地点" prop="address">
            <el-input v-model="editForm.address" placeholder="请输入地点" clearable></el-input>
          </el-form-item>
        </el-form>
        <!--编辑地点信息对话框按钮-->
        <div slot="footer" class="dialog_footer">
          <el-button @click="editFormVisible = false">取消</el-button>
          <el-button type="primary" @click="save">保存</el-button>
        </div>
      </el-dialog>
    </el-main>
  </div>
</template>

<script>
  import QRCode from "qrcodejs2";

  export default{
    mounted() {
      this.getdata();
    },
    name:'AddressList',
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
        tableData: [],
        editFormVisible: false,
        addresslistForm:{
          addressid:''
        },
        editForm:{
          addressid:'',
          address:'',
        },
        /*Form组件提供的表单验证功能，通过rules属性传入约定的验证规则，并将Form-Item的prop属性设置为需校验的字段名*/
        /*编辑用户信息表单验证*/
        editRules:{
          addressid:[
            {required:true, message:'请输入地址编号', trigger:'blur'}
          ],
          address:[
            {required:true, message:'请输入地点', trigger:'blur'},
            {min:5, max:50, message:'长度在5到50个字符', trigger:'blur'}
          ]
        }
      }
    },
    methods:{
      search(){ //搜索按钮方法
        this.$axios
          .post('/location/get',{
            locId: this.addresslistForm.addressid
          })
          .then(successResponse => {
            console.log("success");
            this.tableData = successResponse.data.tableData;
          }) .catch(failResponse =>{alert("跨域操作失败！")})
      },
      save() { //编辑用户表单的保存
        this.$confirm('是否确定编辑此地点信息？', '提示', {
          confirmButtonText: '确定', //弹出框的确定提交按钮
          cancelButtonText: '取消', //弹出框的取消提交按钮
          type: 'warning', //弹出框类型
          center: true
        }).then(() => { //按下确定弹出消息

          this.$axios
            .post('location/changename', {
              locName: this.editForm.address,
              locId: this.editForm.addressid,
            })
            .then(successResponse => {
              if (successResponse.data.code === 200) {
                this.$message({
                  type: 'success',
                  message: '编辑地点信息成功！'
                });
              } else {
                this.$message({
                  type: 'error',
                  message: '编辑地点信息失败！'
                });
              }
            }) .catch(failResponse =>{alert("跨域操作失败！")})

        })
      },
      edit(obj){ //编辑按钮方法
        this.editForm = obj;
        this.editForm.addressid = obj.locId;
        this.editFormVisible = true;
      },
      del(addressid){ //删除按钮方法
        console.log(addressid);
        this.$confirm('是否确定删除此地点？', '提示', {
          confirmButtonText: '确定', //弹出框的确定提交按钮
          cancelButtonText: '取消', //弹出框的取消提交按钮
          type: 'warning', //弹出框类型
          center:true
        }).then(() => { //按下确定弹出消息

          this.$axios
            .post('/location/delete', {
              locId: addressid
            })
            .then(successResponse => {
              if (successResponse.data.code === 200) {
                this.$message({
                  type: 'success',
                  message: '删除地点成功！'
                });
                this.getdata();
              } else {
                this.$message({
                  type: 'error',
                  message: '删除地点失败'
                });
              }
            }) .catch(failResponse =>{alert("跨域操作失败！")})
        })
      },
      getdata() {
        console.log("get all data");
        this.$axios
          .get('/location/getall')
          .then(successResponse => {
            if(successResponse.data.code === 200){
              console.log("success");
              console.log(successResponse);
              this.tableData = successResponse.data.tableData;
            }else{
              console.log("failed");
            }

          }) .catch(failResponse =>{alert("跨域操作失败！")})
      },
      showQRCode(addressid){
        console.log(addressid);
          document.getElementById("qrcode").innerHTML = "";
          let qrcode = new QRCode("qrcode", {
            width: 200,
            height: 200,
            text: "PandemicMonitor"+""+addressid,
            colorDark: "#000",
            colorLight: "#fff",
          });
          console.log(addressid+"qrcode done");

      }
    }
  }
</script>

<style scoped>
  /*根节点样式*/
  .addresslist_container{
    background-color: white;
    height:100%;
    width:100%;
  }
  .address_search{
    margin-top:20px;
    padding-top: 20px;
    padding-left: 30px;
  }
  .deleteColor{
    color:red;
  }
</style>
