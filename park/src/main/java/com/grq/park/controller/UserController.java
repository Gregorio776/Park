package com.grq.park.controller;

import com.grq.park.common.MsgCode;
import com.grq.park.common.ResponseResult;
import com.grq.park.model.User;
import com.grq.park.service.UserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("user")
public class UserController {
    private final Logger LOGGER = LoggerFactory.getLogger(UserController.class);
    @Autowired
    public UserService userService;

    @Value("${jwt.tokenHeader}")
    private String tokenHeader;
    @Value("${jwt.tokenHead}")
    private String tokenHead;

    @PostMapping("login")
    public ResponseResult<?> login(@RequestBody User user){

        String token = userService.login(user);
        if (token == null) {
            return new ResponseResult<>(MsgCode.PWD_OR_CODE_ERROR,"用户名或密码错误",null);
        }
        Map<String, String> tokenMap = new HashMap<>();
        tokenMap.put("token", token);
        tokenMap.put("tokenHead", tokenHead);
        LOGGER.info("登陆成功");


        // TODO 修改最后登录时间
        return new ResponseResult<>(MsgCode.SUCCESS,"登陆成功",tokenMap);
    }


}
