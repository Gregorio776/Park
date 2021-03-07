package com.grq.park.service;

import java.util.List;
import com.grq.park.model.ParkDoor;
public interface ParkDoorService{


    int updateBatch(List<ParkDoor> list);

    int updateBatchSelective(List<ParkDoor> list);

    int batchInsert(List<ParkDoor> list);

    int insertOrUpdate(ParkDoor record);

    int insertOrUpdateSelective(ParkDoor record);

}
