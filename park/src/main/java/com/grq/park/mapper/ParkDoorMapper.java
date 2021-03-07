package com.grq.park.mapper;

import com.grq.park.model.ParkDoor;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import tk.mybatis.mapper.MyMapper;

public interface ParkDoorMapper extends MyMapper<ParkDoor> {
    int updateBatch(List<ParkDoor> list);

    int updateBatchSelective(List<ParkDoor> list);

    int batchInsert(@Param("list") List<ParkDoor> list);

    int insertOrUpdate(ParkDoor record);

    int insertOrUpdateSelective(ParkDoor record);
}