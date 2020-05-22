package com.zxl.card.entity;

import java.io.Serializable;
import javax.persistence.*;
import lombok.Data;

/**
* ${description}
*/
@Data
@Table(name = "mianzhi")
public class MianzhiEntity implements Serializable {
    /**
     * 点卡面值id
     */
    @Id
    @Column(name = "m_id")
    @GeneratedValue(generator = "JDBC")
    private Integer mId;

    /**
     * 点卡面值名称
     */
    @Column(name = "m_name")
    private String mName;

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