package com.zxl.card.mapper;

import com.zxl.card.entity.CardtypeEntity;
import tk.mybatis.mapper.common.Mapper;

import java.util.List;

/**
* 点卡管理持久化层
*/
public interface CardtypeMapper extends Mapper<CardtypeEntity> {
    /**
     * 根据条件查询用户信息
     * @param cardtypeEntity 用户实体
     * @return
     */
    List<CardtypeEntity> selectCardtype(CardtypeEntity cardtypeEntity);
}