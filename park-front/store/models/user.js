import {login} from '@/api/user'
import { getToken, setToken, removeToken } from '@/common/auth'
const getDefaultState = () => {
  return {
    token: 'getToken()',
    name: '',
    avatar: '',
    id:0
  }
}

const state = getDefaultState()

const mutations = {
  RESET_STATE: (state) => {
    Object.assign(state, getDefaultState())
  },
  SET_TOKEN: (state, token) => {
    state.token = token
  },
  SET_NAME: (state, name) => {
    state.name = name
  },
  SET_AVATAR: (state, avatar) => {
    state.avatar = avatar
  },
  SET_ID: (state, id) => {
    state.id = id
  }
}

const actions = {
	login({ commit }, userInfo){
		const { username, password } = userInfo
		return new Promise((resolve, reject) => {
		      login({ username: username.trim(), password: password }).then(response => {
		        const { data } = response
		        commit('SET_TOKEN', data.token)
		        setToken(data.token)
		        resolve(data.token)
		      }).catch(error => {
		        reject(error)
		      })
		    })
	}
}


export default{
	namespaced: true,
	state,
	mutations,
	actions
}