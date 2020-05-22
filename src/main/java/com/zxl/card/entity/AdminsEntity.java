package com.zxl.card.entity;

import java.io.Serializable;
import javax.persistence.*;
import lombok.Data;

/**
*${description}
*/
@Data
@Table(name = "admins")
public class AdminsEntity implements Serializable {
    /**
     * 管理员id
     */
    @Id
    @Column(name = "a_id")
    @GeneratedValue(generator = "JDBC")
    private Integer aId;

    /**
     * 管理员账号
     */
    @Column(name = "a_number")
    private String aNumber;

    /**
     * 管理员昵称
     */
    @Column(name = "a_name")
    private String aName;

    /**
     * 管理员密码
     */
    @Column(name = "a_password")
    private String aPassword;

    /**
     * 管理员邮箱
     */
    @Column(name = "a_email")
    private String aEmail;

    private static final long serialVersionUID = 1L;
}