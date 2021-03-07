package com.grq.park.service;

import java.util.List;
import com.grq.park.model.Parkinginfo;
public interface ParkinginfoService{


    int updateBatch(List<Parkinginfo> list);

    int updateBatchSelective(List<Parkinginfo> list);

    int batchInsert(List<Parkinginfo> list);

    int insertOrUpdate(Parkinginfo record);

    int insertOrUpdateSelective(Parkinginfo record);

}
