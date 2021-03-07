package com.grq.park.service;

import java.util.List;

import com.grq.park.model.Permission;
import com.grq.park.model.User;
public interface UserService{


    String login(User user);

    User selectByCode(String code);

    List<Permission> getPermissionList(Integer id);

}
