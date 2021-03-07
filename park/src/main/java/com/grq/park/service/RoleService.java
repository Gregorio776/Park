package com.grq.park.service;

import java.util.List;
import com.grq.park.model.Role;
public interface RoleService{


    int updateBatch(List<Role> list);

    int updateBatchSelective(List<Role> list);

    int batchInsert(List<Role> list);

    int insertOrUpdate(Role record);

    int insertOrUpdateSelective(Role record);

}
