package com.grq.park.service;

import java.util.List;
import com.grq.park.model.Park;
public interface ParkService{


    int updateBatch(List<Park> list);

    int updateBatchSelective(List<Park> list);

    int batchInsert(List<Park> list);

    int insertOrUpdate(Park record);

    int insertOrUpdateSelective(Park record);

}
