package com.zxl.card.entity;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.*;
import lombok.Data;

/**
* ${description}
*/
@Data
@Table(name = "orders")
public class OrdersEntity implements Serializable {
    /**
     * 订单id
     */
    @Id
    @Column(name = "o_id")
    @GeneratedValue(generator = "JDBC")
    private Integer oId;

    /**
     * 订单日期
     */
    @Column(name = "o_date")
    private Date oDate;

    /**
     * 点卡种类id
     */
    @Column(name = "t_id")
    private Integer tId;

    /**
     * 用户id
     */
    @Column(name = "u_id")
    private Integer uId;

    /**
     * 点卡面值id
     */
    @Column(name = "m_id")
    private Integer mId;

    /**
     * 订单金额
     */
    @Column(name = "o_price")
    private String oPrice;

    /**
     * 点卡id
     */
    @Column(name = "c_id")
    private Integer cId;

    /**
     * 订单状态：1为未付款，2为已付款，3为已发货，4为已完成
     */
    @Column(name = "o_state")
    private Integer oState;

    private static final long serialVersionUID = 1L;
}