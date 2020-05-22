package com.zxl.card.entity;

import java.io.Serializable;
import javax.persistence.*;
import lombok.Data;

/**
* ${description}

*/
@Data
@Table(name = "users")
public class UsersEntity implements Serializable {
    /**
     * 用户id
     */
    @Id
    @Column(name = "u_id")
    @GeneratedValue(generator = "JDBC")
    private Integer uId;

    /**
     * 用户账号
     */
    @Column(name = "u_number")
    private String uNumber;

    /**
     * 用户昵称
     */
    @Column(name = "u_name")
    private String uName;

    /**
     * 用户密码
     */
    @Column(name = "u_password")
    private String uPassword;

    /**
     * 用户邮箱
     */
    @Column(name = "u_email")
    private String uEmail;

    /**
     * 用户电话
     */
    @Column(name = "u_phone")
    private String uPhone;

    /**
     * 用户状态:1为正常，2为禁用
     */
    @Column(name = "u_state")
    private Integer uState;

    /**
     * 每页条数
     */
    private Integer pageSize;

    /**
     * 当前页
     */
    private Integer currentPage;

    private static final long serialVersionUID = 1L;
}