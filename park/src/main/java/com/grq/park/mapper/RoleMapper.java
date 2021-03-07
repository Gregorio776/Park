package com.grq.park.mapper;

import com.grq.park.model.Role;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import tk.mybatis.mapper.MyMapper;

public interface RoleMapper extends MyMapper<Role> {
    int updateBatch(List<Role> list);

    int updateBatchSelective(List<Role> list);

    int batchInsert(@Param("list") List<Role> list);

    int insertOrUpdate(Role record);

    int insertOrUpdateSelective(Role record);
}