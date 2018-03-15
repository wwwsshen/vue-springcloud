// The Vue build version to load with the `import` command
// (runtime-only or standalone) has been set in webpack.base.conf with an alias.
import Vue from 'vue'
import App from './App'
import router from './router'
import {store} from './store'
import ElementUI, {Message} from 'element-ui'
import * as filters from './tools/filter'
import 'element-ui/lib/theme-chalk/index.css'
import './assets/styles/index.scss'

Vue.use(ElementUI, {
  size: 'medium', // set element-ui default size
})
Vue.prototype.$message = Message;

/** 注册管道 */
Object.keys(filters).forEach(key => {
  Vue.filter(key, filters[key])
})

Vue.config.productionTip = false // 生产提示关闭
Vue.prototype.router = router

/** 初始定位到登陆界面，如果没有登陆则无法跳转 */
// router.beforeEach((to, from, next) => {
//   let user = !!sessionStorage.getItem('auth.isLogin')
//   if (!user && to.path !== '/login') {
//     next({path: '/login'})
//   } else {
//     next()
//   }
// })

new Vue({
  el: '#app',
  router,
  store,
  template: '<App/>',
  components: {App}
})
