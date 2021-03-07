package com.grq.park.mapper;

import com.grq.park.model.Permission;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import tk.mybatis.mapper.MyMapper;

public interface PermissionMapper extends MyMapper<Permission> {
    List<Permission> getPermissionList(Integer id);
}