package com.grq.park.mapper;

import com.grq.park.model.Appointment;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import tk.mybatis.mapper.MyMapper;

public interface AppointmentMapper extends MyMapper<Appointment> {
    int updateBatch(List<Appointment> list);

    int updateBatchSelective(List<Appointment> list);

    int batchInsert(@Param("list") List<Appointment> list);

    int insertOrUpdate(Appointment record);

    int insertOrUpdateSelective(Appointment record);
}