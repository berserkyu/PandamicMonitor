<template>
  <!--引入container布局-->
  <el-container class="home-container">
    <!--头部-->
    <el-header height="80px">
      <div class="div">
        <img class="img" src="../../assets/img.png" alt/>
        <span class="span">重大传染病疫情流调系统</span>
      </div>
      <el-button type="danger" v-on:click="logout">登出</el-button>
    </el-header>
    <!--主体-->
    <el-container>
      <!--侧边栏-->
      <el-aside width="230px">
        <el-menu background-color="#4a5064"
                 text-color="#fff"
                 active-text-color="#409eff">

          <el-submenu index="1">
            <template slot="title">
              <i class="el-icon-location"></i>
              <span>导航一</span>
            </template>

            <el-menu-item-group>
              <template slot="title">分组一</template>
              <el-menu-item index="1-1">选项1</el-menu-item>
              <el-menu-item index="1-2">选项2</el-menu-item>
            </el-menu-item-group>

            <el-menu-item-group title="分组2">
              <el-menu-item index="1-3">选项3</el-menu-item>
            </el-menu-item-group>

          </el-submenu>
        </el-menu>
      </el-aside>
      <!--内容-->
      <el-main>
        <router-view></router-view>
      </el-main>
    </el-container>
  </el-container>
</template>


<script>
  export default {
    name: 'Home',
    data(){
      return{
        menuList:[
          {
            id:0,
            title: '用户列表',
            path: '/userlist',
            mainId:0
          },
          {
            id:1,
            title: '修改用户密码',
            path: '/changepassword',
            mainId:1
          },
          {
            id:2,
            title: '更新用户信息',
            path: '/infoupdate',
            mainId:1
          },
        ],
      }
    },
    //Onload时间
    created() {
      this.getMenuList();
    },
    methods:{
      logout(){
        this.$confirm('是否确定登出？', '提示', {
          confirmButtonText: '确定',
          cancelButtonText: '放弃',
          type: 'warning'
        }).then(() => {
          this.$message({
            type: 'success',
            message: '登出成功!'
          });
          window.sessionStorage.clear();
          this.$router.push("/login");
        }).catch(() => {
          this.$message({
            type: 'info',
            message: '已取消登出操作！'
          });
        });
      },
      getMenuList(){

      },
    }
  }
</script>

<style  scoped>
  .home-container {
    height: 100%;
  }

  .el-header {
    background-color: rgba(188, 236, 141, 0.84);
    display: flex;
    justify-content: space-between;
    padding-left: 250px;
    align-items: center;
    color: #000000;
    font-size: 25px;
  }

  .div {
    display: flex;
    align-items: center;
  }

  .span {
    margin-left: 15px;
  }


  .el-aside {
    background-color: #444444;
  }
  .el-menu{
    border-right: none;
  }

  .el-main {
    background-color: #eaedf1;
  }

  img {
    width: 230px;
    height: 80px;
    position: absolute;
    left: 0;
  }
  .toggle-button{
    background-color: #4a5064;
    font-size: 10px;
    line-height: 24px;
    color: #fff;
    text-align: center;
    letter-spacing: 0.2em;
    cursor: pointer;
  }
</style>

