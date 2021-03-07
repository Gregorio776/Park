package com.grq.park.mapper;

import com.grq.park.model.User;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import tk.mybatis.mapper.MyMapper;

public interface UserMapper extends MyMapper<User> {
    int updateBatch(List<User> list);

    int updateBatchSelective(List<User> list);

    int batchInsert(@Param("list") List<User> list);

    int insertOrUpdate(User record);

    int insertOrUpdateSelective(User record);
}