package com.grq.park.mapper;

import com.grq.park.model.Car;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import tk.mybatis.mapper.MyMapper;

public interface CarMapper extends MyMapper<Car> {
    int updateBatch(List<Car> list);

    int updateBatchSelective(List<Car> list);

    int batchInsert(@Param("list") List<Car> list);

    int insertOrUpdate(Car record);

    int insertOrUpdateSelective(Car record);
}