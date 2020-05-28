package com.zxl.card.service;

import com.github.pagehelper.PageInfo;
import com.zxl.card.entity.CardEntity;

import java.util.List;

/**
*点卡管理事务层
*/
public interface CardService{

    /**
     *
     * @param cardEntity
     * @return
     */
    int addCard(CardEntity cardEntity);

    /**
     *
     * @param cId 点卡 id
     * @return
     */
    int deleteCard(Integer cId);

    /**
     *
     * @param cardEntity
     * @return
     */
    int updateCard(CardEntity cardEntity);

    /**
     *
     * @param cardEntity
     * @return
     */
    PageInfo<CardEntity> selectCard(CardEntity cardEntity);

    /**
     * 根据条件查询点卡信息
     * @param cardEntity 点卡实体
     * @return
     */
   PageInfo<CardEntity> selectCardUse(CardEntity cardEntity);
}
