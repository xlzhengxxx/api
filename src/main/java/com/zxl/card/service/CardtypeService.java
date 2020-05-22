package com.zxl.card.service;

import com.github.pagehelper.PageInfo;
import com.zxl.card.entity.CardtypeEntity;

/**
* 点卡种类管理事务层
*/
public interface CardtypeService{

    /**
     * 添加用户
     * @param cardtypeEntity
     * @return
     */
    int addCardtype(CardtypeEntity cardtypeEntity);

    /**
     * 删除用户信息
     * @param tId 点卡种类 id
     * @return
     */
    int deleteCardtype(Integer tId);

    /**
     * 修改用户信息
     * @param cardtypeEntity 用户实体
     * @return
     */
    int updateCardtype(CardtypeEntity cardtypeEntity);

    /**
     * 查询满足条件的用户信息
     * @param cardtypeEntity 用户实体
     * @return
     */
    PageInfo<CardtypeEntity> selectCardtype(CardtypeEntity cardtypeEntity);

}
