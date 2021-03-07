<template>
	<view>
		<u
	</view>
</template>

<script>
	export default {
		data() {
			return {
				title: 'Hello'
			}
		},
		onLoad() {
			const loginInfo={
				username:'admin',
				password:'admin'
			}
			
			this.$store.dispatch('user/login', loginInfo).then((data) => {
						console.log(data);
			          }).catch((err) => {
			            console.log(err);
			          })
		},
		methods: {
	
		}
	}
</script>

<style>
</style>
