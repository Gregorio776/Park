package com.grq.park.model;

import java.util.Date;
import javax.persistence.*;
import lombok.Data;

@Data
@Table(name = "parkinginfo")
public class Parkinginfo {
    /**
     * ID
     */
    @Id
    @Column(name = "id")
    @GeneratedValue(generator = "JDBC")
    private Integer id;

    /**
     * 停车场ID
     */
    @Column(name = "pid")
    private Integer pid;

    /**
     * 进口
     */
    @Column(name = "enter_door_id")
    private Integer enterDoorId;

    /**
     * 车辆
     */
    @Column(name = "car_id")
    private Integer carId;

    /**
     * 进入时间;
     */
    @Column(name = "enter_time")
    private Date enterTime;
}