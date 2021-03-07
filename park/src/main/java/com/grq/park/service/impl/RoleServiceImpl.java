package com.grq.park.service.impl;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import java.util.List;
import com.grq.park.model.Role;
import com.grq.park.mapper.RoleMapper;
import com.grq.park.service.RoleService;
@Service
public class RoleServiceImpl implements RoleService{

    @Resource
    private RoleMapper roleMapper;

    @Override
    public int updateBatch(List<Role> list) {
        return roleMapper.updateBatch(list);
    }

    @Override
    public int updateBatchSelective(List<Role> list) {
        return roleMapper.updateBatchSelective(list);
    }

    @Override
    public int batchInsert(List<Role> list) {
        return roleMapper.batchInsert(list);
    }

    @Override
    public int insertOrUpdate(Role record) {
        return roleMapper.insertOrUpdate(record);
    }

    @Override
    public int insertOrUpdateSelective(Role record) {
        return roleMapper.insertOrUpdateSelective(record);
    }

}
