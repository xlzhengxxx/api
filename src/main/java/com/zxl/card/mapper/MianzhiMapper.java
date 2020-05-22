package com.zxl.card.mapper;

import com.zxl.card.entity.MianzhiEntity;
import tk.mybatis.mapper.common.Mapper;

import java.util.List;

/**
* 面值管理持久化层
*/
public interface MianzhiMapper extends Mapper<MianzhiEntity> {

    /**
     * 根据条件查询点卡面值信息
     * @param mianzhiEntity 点卡面值实体
     * @return
     */
    List<MianzhiEntity> selectMianzhi(MianzhiEntity mianzhiEntity);
}