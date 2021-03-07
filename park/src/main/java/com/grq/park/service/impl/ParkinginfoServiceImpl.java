package com.grq.park.service.impl;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import java.util.List;
import com.grq.park.model.Parkinginfo;
import com.grq.park.mapper.ParkinginfoMapper;
import com.grq.park.service.ParkinginfoService;
@Service
public class ParkinginfoServiceImpl implements ParkinginfoService{

    @Resource
    private ParkinginfoMapper parkinginfoMapper;

    @Override
    public int updateBatch(List<Parkinginfo> list) {
        return parkinginfoMapper.updateBatch(list);
    }

    @Override
    public int updateBatchSelective(List<Parkinginfo> list) {
        return parkinginfoMapper.updateBatchSelective(list);
    }

    @Override
    public int batchInsert(List<Parkinginfo> list) {
        return parkinginfoMapper.batchInsert(list);
    }

    @Override
    public int insertOrUpdate(Parkinginfo record) {
        return parkinginfoMapper.insertOrUpdate(record);
    }

    @Override
    public int insertOrUpdateSelective(Parkinginfo record) {
        return parkinginfoMapper.insertOrUpdateSelective(record);
    }

}
