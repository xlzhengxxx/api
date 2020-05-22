package com.zxl.card.entity;

import java.io.Serializable;
import javax.persistence.*;
import lombok.Data;

/**
* ${description}

*/
@Data
@Table(name = "cardtype")
public class CardtypeEntity implements Serializable {
    /**
     * 点卡种类id
     */
    @Id
    @Column(name = "t_id")
    @GeneratedValue(generator = "JDBC")
    private Integer tId;

    /**
     * 点卡种类名称
     */
    @Column(name = "t_name")
    private String tName;

    /**
     * 点卡图片
     */
    @Column(name = "t_img")
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