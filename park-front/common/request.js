import config from '../config.js'
import {getToken} from './auth.js'


// const request = (url = '', data = {}, method = 'GET', header = {}) => {
// 	if(url!=='/user/login'){
// 			header['Authorization'] = 'Bearer ' + getToken()
// 	}
//     return new Promise((resolve, reject) => {
//         uni.request({
//             method: method,
//             url: config.baseUrl + url,
//             data: data,
//             header: header,
//             dataType: 'json',
// 			success:(res)=>{
// 				console.log("request success");
// 				resolve(res.data);
// 			},
// 			fail:(err)=>{
// 				console.log('request failed',err);
// 				reject(err)
// 			}
//         })
//     });
// }

const request = (data) => {
	
	const header={}
	if(data.url!=='/user/login'){
			header['Authorization'] = 'Bearer ' + getToken()
	}
	data.header =header
    return new Promise((resolve, reject) => {
        uni.request({
            method: data.method,
            url: config.baseUrl + data.url,
            data: data.data,
            header: data.	header,
            dataType: 'json',
			success:(res)=>{
				resolve(res.data);
			},
			fail:(err)=>{
				console.log('request failed',err);
				reject(err)
			}
        })
    });
}



export default request