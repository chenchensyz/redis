webpackJsonp([1],{"7Y1+":function(e,n){},NHnr:function(e,n,o){"use strict";Object.defineProperty(n,"__esModule",{value:!0});var t=o("7+uW"),r={name:"App",created:function(){this.$axios.get("/appInfo").then(function(e){console.log(e)})}},s={render:function(){var e=this.$createElement,n=this._self._c||e;return n("div",{attrs:{id:"app"}},[n("router-view")],1)},staticRenderFns:[]};var a=o("VU/8")(r,s,!1,function(e){o("7Y1+")},null,null).exports,l=o("/ocq"),i=o("mvHQ"),u=o.n(i),p={render:function(){var e=this.$createElement;return(this._self._c||e)("div",[this._v("\n    页面头部\n")])},staticRenderFns:[]},c=o("VU/8")({name:"BlogHeader"},p,!1,null,null,null).exports,d={render:function(){var e=this.$createElement;return(this._self._c||e)("div",[this._v("\n    页面尾部\n")])},staticRenderFns:[]},v=o("VU/8")({name:"BlogFooter"},d,!1,null,null,null).exports,m={name:"BlogLogin",components:{blogHeader:c,blogFooter:v},data:function(){return{loginInfoVo:{username:"",password:""},responseResult:[]}},methods:{login:function(){var e=this;this.$axios.post("/login",{username:this.loginInfoVo.username,password:this.loginInfoVo.password}).then(function(n){e.responseResult=u()(n.data),200===n.data.code&&e.$router.replace({path:"/index"})}).catch(function(e){})}}},g={render:function(){var e=this,n=e.$createElement,o=e._self._c||n;return o("div",[o("blog-header"),e._v(" "),o("hr"),e._v(" "),o("div",[e._v("\n    用户名:"),o("input",{directives:[{name:"model",rawName:"v-model",value:e.loginInfoVo.username,expression:"loginInfoVo.username"}],attrs:{type:"text",placeholder:"请输入用户名"},domProps:{value:e.loginInfoVo.username},on:{input:function(n){n.target.composing||e.$set(e.loginInfoVo,"username",n.target.value)}}}),e._v(" "),o("br"),e._v("\n    密码："),o("input",{directives:[{name:"model",rawName:"v-model",value:e.loginInfoVo.password,expression:"loginInfoVo.password"}],attrs:{type:"password",placeholder:"请输入密码"},domProps:{value:e.loginInfoVo.password},on:{input:function(n){n.target.composing||e.$set(e.loginInfoVo,"password",n.target.value)}}}),e._v(" "),o("br"),e._v(" "),o("button",{on:{click:e.login}},[e._v("登录")]),e._v(" "),o("br"),e._v("\n    登录验证情况："),o("textarea",{directives:[{name:"model",rawName:"v-model",value:e.responseResult,expression:"responseResult"}],attrs:{cols:"30",rows:"10"},domProps:{value:e.responseResult},on:{input:function(n){n.target.composing||(e.responseResult=n.target.value)}}})]),e._v(" "),o("hr"),e._v(" "),o("blog-footer")],1)},staticRenderFns:[]},f=o("VU/8")(m,g,!1,null,null,null).exports,h={name:"BlogIndex",components:{blogHeader:c,blogFooter:v}},_={render:function(){var e=this.$createElement,n=this._self._c||e;return n("div",[n("blog-header"),this._v(" "),n("hr"),this._v(" "),n("div",[this._v("\n    这是首页，嘻嘻嘻。\n  ")]),this._v(" "),n("hr"),this._v(" "),n("blog-footer")],1)},staticRenderFns:[]},x=o("VU/8")(h,_,!1,null,null,null).exports;t.a.use(l.a);var w=new l.a({routes:[{path:"/",redirect:"/login"},{path:"/index",name:"BlogIndex",component:x},{path:"/manage",redirect:"/login"},{path:"/login",name:"BlogLogin",component:f}]}),V=o("mtWM");V.defaults.headers.common.token="f4c902c9ae5a2a9d8f84868ad064e706",t.a.prototype.$axios=V,t.a.config.productionTip=!1,new t.a({el:"#app",router:w,components:{App:a},template:"<App/>"})}},["NHnr"]);
//# sourceMappingURL=app.b0c1909d33eb888faa1e.js.map