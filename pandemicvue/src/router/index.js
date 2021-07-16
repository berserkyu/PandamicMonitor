import Vue from 'vue'
import VueRouter from 'vue-router'
import Login from '../components/Login.vue'
import Home from '../components/home/Home.vue'
import HelloWorld from '../components/HelloWorld.vue'
import UserList from '../components/UserList.vue'
import InfoUpdate from '../components/infoUpdate.vue'
import Register from '../components/Register.vue'
import ChangePassword from '../components/changePassword.vue'
import AdminInputAddress from '../components/AdminInputAddress.vue'
import qrCodeTest from '../components/QRcodetest.vue'

Vue.use(VueRouter)

  const routes = [
    {
      //默认路径
      path: "/",
      //转向login
      redirect: "/login"
    },{
      path: "/qrCodeTest",
      component: qrCodeTest
    },
    {
      //设置路径名和其对应的页面
      path: "/login",
      component: Login
    },
    {
      path: "/home",
      component: Home,
      redirect: "/userlist",
      children:[
        {
          path: "/userlist",
          component: UserList
        },
        {
          path: "/changepassword",
          component: ChangePassword
        },
        {
          path: "/infoupdate",
          component: InfoUpdate
        },
        {
          path: "/admininputaddress",
          component: AdminInputAddress
        }
      ]
    },
    {
      path: "/userlist",
      component: UserList
    },
    {
      path: "/register",
      component: Register
    }
  ]

  const router = new VueRouter({
    mode: 'history',
    routes
  })


export default router

