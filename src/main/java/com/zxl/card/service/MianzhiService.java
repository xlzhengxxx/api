package com.zxl.card.service;

import com.github.pagehelper.PageInfo;
import com.zxl.card.entity.MianzhiEntity;

/**
 * 面值管理事务层
 */
public interface MianzhiService{

    /**
     * 添加面值
     * @param mianzhiEntity
     * @return
     */
    int addMianzhi(MianzhiEntity mianzhiEntity);

    /**
     * 删除面值
     * @param mId 面值 id
     * @return
     */
    int deleteMianzhi(Integer mId);


    /**
     * 查询满足条件的用户信息
     * @param mianzhiEntity 用户实体
     * @return
     */
    PageInfo<MianzhiEntity> selectMianzhi(MianzhiEntity mianzhiEntity);

}
