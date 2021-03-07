import request from '../common/request.js'

// export function login(data) {
// 	return request(
// 		'/user/login',
// 		data,
// 		'post'
// 	)
// }
export function login(data) {
	return request({
		url:'/user/login',
		data:data,
		method:'POST'
	})
}