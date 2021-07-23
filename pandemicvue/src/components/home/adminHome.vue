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
                 default-active="/userlist">

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
  export default {
    name: 'Home',
    data(){
      return{
        welcome:'欢迎管理员登录！',
        menuList:[
          {
            id: 0,
            title: '管理员权限',
            icon: 'iconfont icon-guanliyuan ',
            sList:[
              {
                id: 10,
                title: '用户列表',
                path: '/userlist',
                icon: 'iconfont icon-yonghuliebiao',
              },
              {
                id: 11,
                title: '录入新地点信息',
                path: '/admininputaddress',
                icon: 'iconfont icon-dengji',
              },
              {
                id: 12,
                title: '地点信息列表',
                path: '/addresslist',
                icon: 'iconfont icon-liebiao1',
              },
            ],
          },
          {
            id: 1,
            title: '调查人员平台',
            icon: 'iconfont icon-UI_icon_zhongdianrenbidui',
            sList: [
              {
                id: 13,
                title: '与被调查人员路径相交用户',
                icon: 'iconfont icon-xiangjiao',
                path: '/userintersectionlist',
              },
              {
                id: 14,
                title: '查询重点地区',
                path: '/adminkeyroad',
                icon: 'iconfont icon-zhongdiandiqu',
              },
            ]
          }
        ],
      }
    },
    created() {
      this.$axios.post('/getuserbymail',{
        mail: this.$cookies.get('mail')
      })
        .then(successResponse => {
          //设置欢迎用户
          this.welcome = '欢迎' + ' ' + successResponse.data.fullName + ' ' + '管理员/调查人员登录！';
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
    padding-left: 500px;
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

