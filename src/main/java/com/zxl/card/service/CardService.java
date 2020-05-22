package com.zxl.card.service;

import com.github.pagehelper.PageInfo;
import com.zxl.card.entity.CardEntity;

/**
*点卡管理事务层
*/
public interface CardService{

    /**
     * 添加用户
     * @param cardEntity
     * @return
     */
    int addCard(CardEntity cardEntity);

    /**
     * 删除用户信息
     * @param cId 点卡 id
     * @return
     */
    int deleteCard(Integer cId);

    /**
     * 修改用户信息
     * @param cardEntity 用户实体
     * @return
     */
    int updateCard(CardEntity cardEntity);

    /**
     * 查询满足条件的用户信息
     * @param cardEntity 用户实体
     * @return
     */
    PageInfo<CardEntity> selectCard(CardEntity cardEntity);
}
