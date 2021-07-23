// The Vue build version to load with the `import` command
// (runtime-only or standalone) has been set in webpack.base.conf with an alias.
import Vue from 'vue'
import VueCookies from 'vue-cookies'
import App from './App'
import router from './router'
import ElementUI from 'element-ui';
import 'element-ui/lib/theme-chalk/index.css'
import './assets/css/global.css'
import VueQRCodeComponent from 'vue-qrcode-component'
import VueQrcodeReader from "vue-qrcode-reader";
import './assets/font/iconfont.css'





Vue.use(VueCookies)
Vue.$cookies.config('7d')
Vue.$cookies.set('theme','default');
Vue.$cookies.set('hover-time','1s');

Vue.use(VueQrcodeReader);
Vue.component('qr-code', VueQRCodeComponent)
Vue.use(VueCookies)
Vue.$cookies.config('7d')
Vue.$cookies.set('theme','default');
Vue.$cookies.set('hover-time','1s');

const axios = require('axios')
Vue.prototype.$axios = axios
axios.defaults.baseURL = 'https://localhost:9000'

Vue.use(ElementUI)
Vue.config.productionTip = false

/* eslint-disable no-new */
new Vue({
  el: '#app',
  router,
  components: { App },
  template: '<App/>',
  render: h => h(App)
})
