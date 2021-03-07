<template>
	<view class="content">
		<image class="logo" src="/static/logo.png"></image>
		<view class="text-area">
			<text class="title">{{title}}</text>
		</view>
	</view>
</template>

<script>
	import {login} from '../../api/user.js'
	import {setToken,getToken} from '../../common/auth.js'
	export default {
		data() {
			return {
				title: 'Hello'
			}
		},
		onLoad() {
			// const loginInfo={
			// 	username:'admin',
			// 	password:'admin'
			// }
			
			// this.$store.dispatch('user/login', loginInfo).then((data) => {
			// 			console.log(data);
			//           }).catch((err) => {
			//             console.log(err);
			//           })
		},
		methods: {

		}
	}
</script>

<style>
	.content {
		display: flex;
		flex-direction: column;
		align-items: center;
		justify-content: center;
	}

	.logo {
		height: 200rpx;
		width: 200rpx;
		margin-top: 200rpx;
		margin-left: auto;
		margin-right: auto;
		margin-bottom: 50rpx;
	}

	.text-area {
		display: flex;
		justify-content: center;
	}

	.title {
		font-size: 36rpx;
		color: #8f8f94;
	}
</style>
