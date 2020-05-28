package com.zxl.card.service;

import com.github.pagehelper.PageInfo;
import com.zxl.card.entity.CardtypeEntity;

/**
* 点卡种类管理事务层
*/
public interface CardtypeService{

    /**
     * 添加点卡种类
     * @param cardtypeEntity
     * @return
     */
    int addCardtype(CardtypeEntity cardtypeEntity);

    /**
     * 删除点卡种类
     * @param tId 点卡种类 id
     * @return
     */
    int deleteCardtype(Integer tId);

    /**
     * 修改点卡种类
     * @param cardtypeEntity 点卡种类实体
     * @return
     */
    int updateCardtype(CardtypeEntity cardtypeEntity);

    /**
     * 查询满足条件的点卡种类
     * @param cardtypeEntity 点卡种类实体
     * @return
     */
    PageInfo<CardtypeEntity> selectCardtype(CardtypeEntity cardtypeEntity);

}
