package com.grq.park.model;

import java.util.Date;
import javax.persistence.*;
import lombok.Data;

@Data
@Table(name = "`user`")
public class User {
    /**
     * ID
     */
    @Id
    @Column(name = "id")
    @GeneratedValue(generator = "JDBC")
    private Integer id;

    /**
     * 账号
     */
    @Column(name = "code")
    private String code;

    /**
     * 密码
     */
    @Column(name = "`password`")
    private String password;

    /**
     * 用户名
     */
    @Column(name = "`name`")
    private String name;

    /**
     * 头像
     */
    @Column(name = "icon")
    private String icon;

    /**
     * 邮箱
     */
    @Column(name = "email")
    private String email;

    /**
     * 创建时间
     */
    @Column(name = "create_time")
    private Date createTime;

    /**
     * 最后登录时间
     */
    @Column(name = "logintime")
    private Date logintime;
}