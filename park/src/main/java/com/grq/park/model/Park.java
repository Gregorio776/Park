package com.grq.park.model;

import java.math.BigDecimal;
import javax.persistence.*;
import lombok.Data;

@Data
@Table(name = "park")
public class Park {
    /**
     * ID
     */
    @Id
    @Column(name = "ID")
    @GeneratedValue(generator = "JDBC")
    private Integer id;

    /**
     * 名称
     */
    @Column(name = "`name`")
    private String name;

    /**
     * 地址
     */
    @Column(name = "address")
    private String address;

    /**
     * 经度
     */
    @Column(name = "longitude")
    private BigDecimal longitude;

    /**
     * 纬度
     */
    @Column(name = "latitude")
    private BigDecimal latitude;

    /**
     * 收费信息
     */
    @Column(name = " chargeInfo")
    private String chargeinfo;
}