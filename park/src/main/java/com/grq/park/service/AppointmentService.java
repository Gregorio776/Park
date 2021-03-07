package com.grq.park.service;

import java.util.List;
import com.grq.park.model.Appointment;
public interface AppointmentService{


    int updateBatch(List<Appointment> list);

    int updateBatchSelective(List<Appointment> list);

    int batchInsert(List<Appointment> list);

    int insertOrUpdate(Appointment record);

    int insertOrUpdateSelective(Appointment record);

}
