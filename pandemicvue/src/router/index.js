import Vue from 'vue'
import VueRouter from 'vue-router'
import Login from '../components/Login'
import AdminHome from '../components/home/adminHome'
import UserHome from '../components/home/userHome'
import UserList from '../components/admin/UserList'
import InfoUpdate from '../components/user/infoUpdate'
import Register from '../components/Register.vue'
import ChangePassword from '../components/user/changePassword'
import AdminInputAddress from '../components/admin/AdminInputAddress'
import qrCodeTest from '../components/QRcodetest.vue'
import UserInputAddress from '../components/user/UserInputAddress'
import Cam from '../components/user/Cam'
import AddressList from "../components/admin/AddressList";

Vue.use(VueRouter)

  const routes = [
    {
      //默认路径
      path: "/",
      //转向login
      redirect: "/login"
    },
    {
      path: "/qrCodeTest",
      component: qrCodeTest
    },
    {
      //设置路径名和其对应的页面
      path: "/login",
      component: Login
    },
    {
      path: "/register",
      component: Register
    },
    {
      path: "/adminhome",
      component: AdminHome,
      redirect: "/userlist",
      children:[
        {
          path: "/userlist",
          component: UserList
        },
        {
          path: "/admininputaddress",
          component: AdminInputAddress
        },
        {
          path: "/addresslist",
          component: AddressList
        },
      ]
    },
    {
      path: "/userhome",
      component: UserHome,
      redirect: "/cam",
      children: [
        {
          path: "/changepassword",
          component: ChangePassword
        },
        {
          path: "/infoupdate",
          component: InfoUpdate
        },
        {
          path: "/userinputaddress",
          component: UserInputAddress
        },
        {
          path: "/cam",
          component: Cam
        },
      ]
    }
  ]

  const router = new VueRouter({
    mode: 'history',
    routes
  })


export default router

