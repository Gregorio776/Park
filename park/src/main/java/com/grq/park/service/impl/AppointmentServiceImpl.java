package com.grq.park.service.impl;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import java.util.List;
import com.grq.park.mapper.AppointmentMapper;
import com.grq.park.model.Appointment;
import com.grq.park.service.AppointmentService;
@Service
public class AppointmentServiceImpl implements AppointmentService{

    @Resource
    private AppointmentMapper appointmentMapper;

    @Override
    public int updateBatch(List<Appointment> list) {
        return appointmentMapper.updateBatch(list);
    }

    @Override
    public int updateBatchSelective(List<Appointment> list) {
        return appointmentMapper.updateBatchSelective(list);
    }

    @Override
    public int batchInsert(List<Appointment> list) {
        return appointmentMapper.batchInsert(list);
    }

    @Override
    public int insertOrUpdate(Appointment record) {
        return appointmentMapper.insertOrUpdate(record);
    }

    @Override
    public int insertOrUpdateSelective(Appointment record) {
        return appointmentMapper.insertOrUpdateSelective(record);
    }

}
