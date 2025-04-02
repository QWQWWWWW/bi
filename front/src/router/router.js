import VueRouter from 'vue-router'

//引入组件
import Index from '../pages'
import Home from '../pages/home/home'
import Login from '../pages/login/login'
import Register from '../pages/register/register'
import Center from '../pages/center/center'
import Forum from '../pages/forum/list'
import ForumAdd from '../pages/forum/add'
import ForumDetail from '../pages/forum/detail'
import MyForumList from '../pages/forum/myForumList'
import Storeup from '../pages/storeup/list'
import News from '../pages/news/news-list'
import NewsDetail from '../pages/news/news-detail'
import payList from '../pages/pay'

import xueshengList from '../pages/xuesheng/list'
import xueshengDetail from '../pages/xuesheng/detail'
import xueshengAdd from '../pages/xuesheng/add'
import jiaoshiList from '../pages/jiaoshi/list'
import jiaoshiDetail from '../pages/jiaoshi/detail'
import jiaoshiAdd from '../pages/jiaoshi/add'
import kechengfenleiList from '../pages/kechengfenlei/list'
import kechengfenleiDetail from '../pages/kechengfenlei/detail'
import kechengfenleiAdd from '../pages/kechengfenlei/add'
import kechengxinxiList from '../pages/kechengxinxi/list'
import kechengxinxiDetail from '../pages/kechengxinxi/detail'
import kechengxinxiAdd from '../pages/kechengxinxi/add'
import xuankexinxiList from '../pages/xuankexinxi/list'
import xuankexinxiDetail from '../pages/xuankexinxi/detail'
import xuankexinxiAdd from '../pages/xuankexinxi/add'
import zuoyexinxiList from '../pages/zuoyexinxi/list'
import zuoyexinxiDetail from '../pages/zuoyexinxi/detail'
import zuoyexinxiAdd from '../pages/zuoyexinxi/add'
import tijiaozuoyeList from '../pages/tijiaozuoye/list'
import tijiaozuoyeDetail from '../pages/tijiaozuoye/detail'
import tijiaozuoyeAdd from '../pages/tijiaozuoye/add'
import zuoyechengjiList from '../pages/zuoyechengji/list'
import zuoyechengjiDetail from '../pages/zuoyechengji/detail'
import zuoyechengjiAdd from '../pages/zuoyechengji/add'
import xuexifenxiList from '../pages/xuexifenxi/list'
import xuexifenxiDetail from '../pages/xuexifenxi/detail'
import xuexifenxiAdd from '../pages/xuexifenxi/add'
import banjixinxiList from '../pages/banjixinxi/list'
import banjixinxiDetail from '../pages/banjixinxi/detail'
import banjixinxiAdd from '../pages/banjixinxi/add'
import ziyuanleixingList from '../pages/ziyuanleixing/list'
import ziyuanleixingDetail from '../pages/ziyuanleixing/detail'
import ziyuanleixingAdd from '../pages/ziyuanleixing/add'
import jiaoxueziyuanList from '../pages/jiaoxueziyuan/list'
import jiaoxueziyuanDetail from '../pages/jiaoxueziyuan/detail'
import jiaoxueziyuanAdd from '../pages/jiaoxueziyuan/add'
import newstypeList from '../pages/newstype/list'
import newstypeDetail from '../pages/newstype/detail'
import newstypeAdd from '../pages/newstype/add'
import aboutusList from '../pages/aboutus/list'
import aboutusDetail from '../pages/aboutus/detail'
import aboutusAdd from '../pages/aboutus/add'
import systemintroList from '../pages/systemintro/list'
import systemintroDetail from '../pages/systemintro/detail'
import systemintroAdd from '../pages/systemintro/add'

const originalPush = VueRouter.prototype.push
VueRouter.prototype.push = function push(location) {
	return originalPush.call(this, location).catch(err => err)
}

//配置路由
export default new VueRouter({
	routes:[
		{
      path: '/',
      redirect: '/index/home'
    },
		{
			path: '/index',
			component: Index,
			children:[
				{
					path: 'home',
					component: Home
				},
				{
					path: 'center',
					component: Center,
				},
				{
					path: 'pay',
					component: payList,
				},
				{
					path: 'forum',
					component: Forum
				},
				{
					path: 'forumAdd',
					component: ForumAdd
				},
				{
					path: 'forumDetail',
					component: ForumDetail
				},
				{
					path: 'myForumList',
					component: MyForumList
				},
				{
					path: 'storeup',
					component: Storeup
				},
				{
					path: 'news',
					component: News
				},
				{
					path: 'newsDetail',
					component: NewsDetail
				},
				{
					path: 'xuesheng',
					component: xueshengList
				},
				{
					path: 'xueshengDetail',
					component: xueshengDetail
				},
				{
					path: 'xueshengAdd',
					component: xueshengAdd
				},
				{
					path: 'jiaoshi',
					component: jiaoshiList
				},
				{
					path: 'jiaoshiDetail',
					component: jiaoshiDetail
				},
				{
					path: 'jiaoshiAdd',
					component: jiaoshiAdd
				},
				{
					path: 'kechengfenlei',
					component: kechengfenleiList
				},
				{
					path: 'kechengfenleiDetail',
					component: kechengfenleiDetail
				},
				{
					path: 'kechengfenleiAdd',
					component: kechengfenleiAdd
				},
				{
					path: 'kechengxinxi',
					component: kechengxinxiList
				},
				{
					path: 'kechengxinxiDetail',
					component: kechengxinxiDetail
				},
				{
					path: 'kechengxinxiAdd',
					component: kechengxinxiAdd
				},
				{
					path: 'xuankexinxi',
					component: xuankexinxiList
				},
				{
					path: 'xuankexinxiDetail',
					component: xuankexinxiDetail
				},
				{
					path: 'xuankexinxiAdd',
					component: xuankexinxiAdd
				},
				{
					path: 'zuoyexinxi',
					component: zuoyexinxiList
				},
				{
					path: 'zuoyexinxiDetail',
					component: zuoyexinxiDetail
				},
				{
					path: 'zuoyexinxiAdd',
					component: zuoyexinxiAdd
				},
				{
					path: 'tijiaozuoye',
					component: tijiaozuoyeList
				},
				{
					path: 'tijiaozuoyeDetail',
					component: tijiaozuoyeDetail
				},
				{
					path: 'tijiaozuoyeAdd',
					component: tijiaozuoyeAdd
				},
				{
					path: 'zuoyechengji',
					component: zuoyechengjiList
				},
				{
					path: 'zuoyechengjiDetail',
					component: zuoyechengjiDetail
				},
				{
					path: 'zuoyechengjiAdd',
					component: zuoyechengjiAdd
				},
				{
					path: 'xuexifenxi',
					component: xuexifenxiList
				},
				{
					path: 'xuexifenxiDetail',
					component: xuexifenxiDetail
				},
				{
					path: 'xuexifenxiAdd',
					component: xuexifenxiAdd
				},
				{
					path: 'banjixinxi',
					component: banjixinxiList
				},
				{
					path: 'banjixinxiDetail',
					component: banjixinxiDetail
				},
				{
					path: 'banjixinxiAdd',
					component: banjixinxiAdd
				},
				{
					path: 'ziyuanleixing',
					component: ziyuanleixingList
				},
				{
					path: 'ziyuanleixingDetail',
					component: ziyuanleixingDetail
				},
				{
					path: 'ziyuanleixingAdd',
					component: ziyuanleixingAdd
				},
				{
					path: 'jiaoxueziyuan',
					component: jiaoxueziyuanList
				},
				{
					path: 'jiaoxueziyuanDetail',
					component: jiaoxueziyuanDetail
				},
				{
					path: 'jiaoxueziyuanAdd',
					component: jiaoxueziyuanAdd
				},
				{
					path: 'newstype',
					component: newstypeList
				},
				{
					path: 'newstypeDetail',
					component: newstypeDetail
				},
				{
					path: 'newstypeAdd',
					component: newstypeAdd
				},
				{
					path: 'aboutus',
					component: aboutusList
				},
				{
					path: 'aboutusDetail',
					component: aboutusDetail
				},
				{
					path: 'aboutusAdd',
					component: aboutusAdd
				},
				{
					path: 'systemintro',
					component: systemintroList
				},
				{
					path: 'systemintroDetail',
					component: systemintroDetail
				},
				{
					path: 'systemintroAdd',
					component: systemintroAdd
				},
			]
		},
		{
			path: '/login',
			component: Login
		},
		{
			path: '/register',
			component: Register
		},
	]
})
