package com.grq.park.model;

import javax.persistence.*;
import lombok.Data;

@Data
@Table(name = "car")
public class Car {
    /**
     * ID
     */
    @Id
    @Column(name = "id")
    @GeneratedValue(generator = "JDBC")
    private Integer id;

    /**
     * 车牌号
     */
    @Column(name = "plate")
    private String plate;

    /**
     * 车辆信息
     */
    @Column(name = "info")
    private String info;

    /**
     * 车辆类型：0：小型汽车
     */
    @Column(name = "`type`")
    private Integer type;
}