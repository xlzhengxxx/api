package com.zxl.card.mapper;

import com.zxl.card.entity.CardEntity;
import tk.mybatis.mapper.common.Mapper;

import java.util.List;

/**
* 点卡管理持久化层
*/
public interface CardMapper extends Mapper<CardEntity> {

    /**
     * 根据条件查询用户信息
     * @param cardEntity 用户实体
     * @return
     */
    List<CardEntity> selectCard(CardEntity cardEntity);
}