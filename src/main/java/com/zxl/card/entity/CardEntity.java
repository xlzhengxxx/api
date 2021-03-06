package com.zxl.card.entity;

import java.io.Serializable;
import javax.persistence.*;
import lombok.Data;

/**
*${description}
*/
@Data
@Table(name = "card")
public class CardEntity implements Serializable {
    /**
     * 点卡id
     */
    @Id
    @Column(name = "c_id")
    @GeneratedValue(generator = "JDBC")
    private Integer cId;

    /**
     * 点卡卡号
     */
    @Column(name = "c_number")
    private String cNumber;

    /**
     * 点卡密码
     */
    @Column(name = "c_password")
    private String cPassword;

    /**
     * 点卡种类
     */
    @Column(name = "c_type")
    private Integer cType;

    /**
     * 点卡面值id
     */
    @Column(name = "m_id")
    private Integer mId;

    /**
     * 点卡价格
     */
    @Column(name = "c_price")
    private Double cPrice;

    /**
     * 点卡状态
     */
    @Column(name="c_state")
    private Integer cState;

    @Column(name="t_name")
    private String tName;

    @Column(name="m_name")
    private String mName;

    @Column(name="t_img")
    private String tImg;
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