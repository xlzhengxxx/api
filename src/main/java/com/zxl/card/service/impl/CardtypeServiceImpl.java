package com.zxl.card.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.zxl.card.entity.CardtypeEntity;
import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import com.zxl.card.mapper.CardtypeMapper;
import com.zxl.card.service.CardtypeService;

import java.util.List;

/**
* 点卡种类管理事务层实现类
*/
@Service
public class CardtypeServiceImpl implements CardtypeService{

    @Resource
    private CardtypeMapper cardtypeMapper;

    @Override
    public int addCardtype(CardtypeEntity cardtypeEntity) {
        return cardtypeMapper.insertSelective(cardtypeEntity);
    }

    @Override
    public int deleteCardtype(Integer tId) {
        return cardtypeMapper.deleteByPrimaryKey(tId);
    }

    @Override
    public int updateCardtype(CardtypeEntity cardtypeEntity) {
        return cardtypeMapper.updateByPrimaryKeySelective(cardtypeEntity);
    }

    @Override
    public PageInfo<CardtypeEntity> selectCardtype(CardtypeEntity cardtypeEntity) {
        //初始化分页
        PageHelper.startPage(cardtypeEntity.getCurrentPage(),cardtypeEntity.getPageSize());
        List<CardtypeEntity> list = cardtypeMapper.selectCardtype(cardtypeEntity);
        return new PageInfo<>(list);
    }
}
