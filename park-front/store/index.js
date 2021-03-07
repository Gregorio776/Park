import Vue from 'vue'
import Vuex from 'vuex'
Vue.use(Vuex)

import getters from './getters.js'
import user from './models/user.js'

const store = new Vuex.Store({
	modules:{
		user
	},
	getters
})

export default store
