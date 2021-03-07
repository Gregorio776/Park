package com.grq.park.service.impl;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import java.util.List;
import com.grq.park.model.Park;
import com.grq.park.mapper.ParkMapper;
import com.grq.park.service.ParkService;
@Service
public class ParkServiceImpl implements ParkService{

    @Resource
    private ParkMapper parkMapper;

    @Override
    public int updateBatch(List<Park> list) {
        return parkMapper.updateBatch(list);
    }

    @Override
    public int updateBatchSelective(List<Park> list) {
        return parkMapper.updateBatchSelective(list);
    }

    @Override
    public int batchInsert(List<Park> list) {
        return parkMapper.batchInsert(list);
    }

    @Override
    public int insertOrUpdate(Park record) {
        return parkMapper.insertOrUpdate(record);
    }

    @Override
    public int insertOrUpdateSelective(Park record) {
        return parkMapper.insertOrUpdateSelective(record);
    }

}
