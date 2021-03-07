package com.grq.park.mapper;

import com.grq.park.model.Parkinginfo;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import tk.mybatis.mapper.MyMapper;

public interface ParkinginfoMapper extends MyMapper<Parkinginfo> {
    int updateBatch(List<Parkinginfo> list);

    int updateBatchSelective(List<Parkinginfo> list);

    int batchInsert(@Param("list") List<Parkinginfo> list);

    int insertOrUpdate(Parkinginfo record);

    int insertOrUpdateSelective(Parkinginfo record);
}