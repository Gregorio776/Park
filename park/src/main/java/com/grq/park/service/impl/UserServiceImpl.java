package com.grq.park.service.impl;

import com.grq.park.component.OwnUserDetails;
import com.grq.park.mapper.PermissionMapper;
import com.grq.park.model.Permission;
import com.grq.park.utils.JwtTokenUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import java.util.List;
import com.grq.park.mapper.UserMapper;
import com.grq.park.model.User;
import com.grq.park.service.UserService;
import tk.mybatis.mapper.entity.Example;

@Service
public class UserServiceImpl implements UserService{
    private final Logger LOGGER= LoggerFactory.getLogger(UserServiceImpl.class);

    @Autowired
    private PasswordEncoder passwordEncoder;

    @Resource
    private UserMapper userMapper;

    @Autowired
    private JwtTokenUtil jwtTokenUtil;
    @Autowired
    private PermissionMapper permissionMapper;


    @Override
    public String login(User user) {
        String token = null;

        //密码需要客户端加密后传递
        try {
            UserDetails userDetails = loadUserByCode(user.getCode());
            if(!passwordEncoder.matches(user.getPassword(),userDetails.getPassword())){
                throw new BadCredentialsException("密码不正确");
            }
            if(!userDetails.isEnabled()){
                throw new BadCredentialsException("帐号已被禁用");
            }
            UsernamePasswordAuthenticationToken authentication = new UsernamePasswordAuthenticationToken(userDetails, null, userDetails.getAuthorities());
            SecurityContextHolder.getContext().setAuthentication(authentication);
            token = jwtTokenUtil.generateToken(userDetails);
//            updateLoginTimeByUsername(username);
//            insertLoginLog(username);
        } catch (AuthenticationException e) {
            LOGGER.warn("登录异常:{}", e.getMessage());
        }
        return token;
    }

    public UserDetails loadUserByCode(String code){
        User user = selectByCode(code);
        if(user!=null){
            List<Permission> permissionList = permissionMapper.getPermissionList(user.getId());
            return  new OwnUserDetails(user,permissionList);
        }

        throw new UsernameNotFoundException("用户名或密码错误");
    }

    @Override
    public User selectByCode(String code) {
        Example e = new Example(User.class);
        e.createCriteria().andEqualTo("code", code);
        return userMapper.selectOneByExample(e);
    }

    @Override
    public List<Permission> getPermissionList(Integer id) {
        return permissionMapper.getPermissionList(id);
    }

}
