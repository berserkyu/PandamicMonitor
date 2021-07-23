<template>
  <!--引入container布局-->
  <el-container class="home-container">
    <!--头部-->
    <el-header height="80px">
      <div class="div">
        <img class="img" src="../../assets/img.png" alt/>
        <span class="span">重大传染病疫情流调系统</span>
      </div>
      <!--显示欢迎字样-->
      <div class="welcomeLogin">
        <span>{{welcome}}</span>
      </div>
      <!--登出按钮-->
      <el-button type="danger" v-on:click="logout">登出</el-button>
    </el-header>
    <!--主体-->
    <el-container>
      <!--侧边栏-->
      <el-aside width="230px">
        <el-menu background-color="#4a5064"
                 text-color="#fff"
                 active-text-color="#409eff"
                 unique-opened
                 :router = "true"
                 default-active="/cam">

          <el-submenu :index="item.id" v-for="item in menuList" :key="item.id">
            <template slot="title">
              <i :class="item.icon"></i>
              <span>{{ item.title }}</span>
            </template>
            <el-menu-item-group>
              <el-menu-item :index="i.path" v-for="i in item.sList" :key="i.id">
                <i :class="i.icon"></i>
                <span>{{ i.title }}</span>
              </el-menu-item>
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
  // 引入autoprefixer（为了引用successResponse）
  const {defaults} = require("autoprefixer");
  export default {
    name: 'Home',
    data(){
      return{
        welcome:'',
        menuList:[
          {
            id: 0,
            title: '用户信息平台',
            icon: 'el-icon-user',
            sList:[
              {
                id: 10,
                title: '修改密码',
                path: '/changepassword',
                icon: 'el-icon-lock',
              },
              {
                id: 11,
                title: '更新用户信息',
                path: '/infoupdate',
                icon: 'el-icon-edit-outline',
              },
            ],
          },
          {
            id: 1,
            title: '记录行动轨迹',
            icon: 'iconfont icon-jilu',
            sList:[
              {
                id: 12,
                title: '手动录入新地点信息',
                path: '/userinputaddress',
                icon: 'iconfont icon-shuru',
              },
              {
                id: 13,
                title: '扫描二维码录入地点信息',
                path: '/cam',
                icon: 'iconfont icon-saoma ',
              },
            ]
          },
          {
            id: 2,
            title: '疫情数据',
            icon: 'iconfont icon-shuju',
            sList:[
              {
                id: 14,
                title: '重点地区',
                path: '/userkeyroad',
                icon: 'iconfont icon-lujingguihua ',
              },
            ]
          },
        ],
      }
    },
    created() {
      this.$axios.post('/getuserbymail',{
        mail: this.$cookies.get('mail')
      })
      .then(successResponse => {
        //设置欢迎用户
        this.welcome = '欢迎' + ' ' + successResponse.data.fullName + ' ' + '登录！';
      })
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
  .welcomeLogin{
    padding-left: 600px;
    font-size: 20px;
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

