package com.grq.park.model;

import java.util.Date;
import javax.persistence.*;
import lombok.Data;

@Data
@Table(name = "appointment")
public class Appointment {
    /**
     * id
     */
    @Id
    @Column(name = "ID")
    @GeneratedValue(generator = "JDBC")
    private Integer id;

    /**
     * 停车场
     */
    @Column(name = "pid")
    private Integer pid;

    /**
     * 用户
     */
    @Column(name = "`uid`")
    private Integer uid;

    /**
     * 车
     */
    @Column(name = "car_id")
    private Integer carId;

    /**
     * 预约时间
     */
    @Column(name = "`time`")
    private Date time;

    /**
     * 状态：0
     */
    @Column(name = "`status`")
    private Integer status;
}