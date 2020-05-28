package com.zxl.card.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.zxl.card.entity.CardEntity;
import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import com.zxl.card.mapper.CardMapper;
import com.zxl.card.service.CardService;

import java.util.List;

/**
*$点卡管理事务层实现类
*/
@Service
public class CardServiceImpl implements CardService{

    @Resource
    private CardMapper cardMapper;

    @Override
    public int addCard(CardEntity cardEntity) {
        return cardMapper.insertSelective(cardEntity);
    }

    @Override
    public int deleteCard(Integer cId) {
        return cardMapper.deleteByPrimaryKey(cId);
    }

    @Override
    public int updateCard(CardEntity cardEntity) {
        return cardMapper.updateByPrimaryKeySelective(cardEntity);
    }

    @Override
    public PageInfo<CardEntity> selectCard(CardEntity cardEntity) {
        //初始化分页
        PageHelper.startPage(cardEntity.getCurrentPage(),cardEntity.getPageSize());
        List<CardEntity> list = cardMapper.selectCard(cardEntity);
        return new PageInfo<>(list);
    }

    @Override
    public PageInfo<CardEntity> selectCardUse(CardEntity cardEntity) {
        //初始化分页
        PageHelper.startPage(cardEntity.getCurrentPage(),cardEntity.getPageSize());
        List<CardEntity> list = cardMapper.selectCardUse(cardEntity);
        return new PageInfo<>(list);
    }
}
