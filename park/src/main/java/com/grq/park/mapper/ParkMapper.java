package com.grq.park.mapper;

import com.grq.park.model.Park;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import tk.mybatis.mapper.MyMapper;

public interface ParkMapper extends MyMapper<Park> {
    int updateBatch(List<Park> list);

    int updateBatchSelective(List<Park> list);

    int batchInsert(@Param("list") List<Park> list);

    int insertOrUpdate(Park record);

    int insertOrUpdateSelective(Park record);
}