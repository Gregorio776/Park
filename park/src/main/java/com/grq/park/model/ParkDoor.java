package com.grq.park.model;

import javax.persistence.*;
import lombok.Data;

@Data
@Table(name = "park_door")
public class ParkDoor {
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
     * 出入口：0进，1出
     */
    @Column(name = "doorway")
    private Integer doorway;
}