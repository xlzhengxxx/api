package com.zxl.card.mapper;

import com.zxl.card.entity.CardtypeEntity;
import tk.mybatis.mapper.common.Mapper;

import java.util.List;

/**
* 点卡管理持久化层
*/
public interface CardtypeMapper extends Mapper<CardtypeEntity> {
    /**
     * 根据条件查询点卡种类信息
     * @param cardtypeEntity 点卡种类实体
     * @return
     */
    List<CardtypeEntity> selectCardtype(CardtypeEntity cardtypeEntity);
}