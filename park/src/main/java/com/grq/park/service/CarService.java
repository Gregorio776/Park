package com.grq.park.service;

import java.util.List;
import com.grq.park.model.Car;
public interface CarService{


    int updateBatch(List<Car> list);

    int updateBatchSelective(List<Car> list);

    int batchInsert(List<Car> list);

    int insertOrUpdate(Car record);

    int insertOrUpdateSelective(Car record);

}
