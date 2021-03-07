package com.grq.park.service.impl;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import com.grq.park.mapper.PermissionMapper;
import java.util.List;
import com.grq.park.model.Permission;
import com.grq.park.service.PermissionService;
@Service
public class PermissionServiceImpl implements PermissionService{

    @Resource
    private PermissionMapper permissionMapper;


}
