import Vue from 'vue'
import VueRouter from 'vue-router'
import Login from '../components/Login.vue'
import Home from '../components/home/home.vue'
import HelloWorld from '../components/HelloWorld.vue'

Vue.use(VueRouter)

  const routes = [
    {
      path: "/",
      redirect: "/login"
    },
    {
      path: "/login",
      component: Login
    },
    {
      path: "/home",
      component: Home
    },
    {
      path: "/helloworld",
      component: HelloWorld
    }
  ]

  const router = new VueRouter({
    routes
  })


export default router

