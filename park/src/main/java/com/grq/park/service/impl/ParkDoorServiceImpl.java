package com.grq.park.service.impl;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import java.util.List;
import com.grq.park.model.ParkDoor;
import com.grq.park.mapper.ParkDoorMapper;
import com.grq.park.service.ParkDoorService;
@Service
public class ParkDoorServiceImpl implements ParkDoorService{

    @Resource
    private ParkDoorMapper parkDoorMapper;

    @Override
    public int updateBatch(List<ParkDoor> list) {
        return parkDoorMapper.updateBatch(list);
    }

    @Override
    public int updateBatchSelective(List<ParkDoor> list) {
        return parkDoorMapper.updateBatchSelective(list);
    }

    @Override
    public int batchInsert(List<ParkDoor> list) {
        return parkDoorMapper.batchInsert(list);
    }

    @Override
    public int insertOrUpdate(ParkDoor record) {
        return parkDoorMapper.insertOrUpdate(record);
    }

    @Override
    public int insertOrUpdateSelective(ParkDoor record) {
        return parkDoorMapper.insertOrUpdateSelective(record);
    }

}
