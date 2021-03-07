package com.grq.park.service.impl;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import java.util.List;
import com.grq.park.mapper.CarMapper;
import com.grq.park.model.Car;
import com.grq.park.service.CarService;
@Service
public class CarServiceImpl implements CarService{

    @Resource
    private CarMapper carMapper;

    @Override
    public int updateBatch(List<Car> list) {
        return carMapper.updateBatch(list);
    }

    @Override
    public int updateBatchSelective(List<Car> list) {
        return carMapper.updateBatchSelective(list);
    }

    @Override
    public int batchInsert(List<Car> list) {
        return carMapper.batchInsert(list);
    }

    @Override
    public int insertOrUpdate(Car record) {
        return carMapper.insertOrUpdate(record);
    }

    @Override
    public int insertOrUpdateSelective(Car record) {
        return carMapper.insertOrUpdateSelective(record);
    }

}
