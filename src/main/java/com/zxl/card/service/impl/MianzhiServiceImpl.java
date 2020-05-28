package com.zxl.card.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.zxl.card.entity.MianzhiEntity;
import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import com.zxl.card.mapper.MianzhiMapper;
import com.zxl.card.service.MianzhiService;

import java.util.List;

/**
*面值管理事务层实现类
*/
@Service
public class MianzhiServiceImpl implements MianzhiService{

    @Resource
    private MianzhiMapper mianzhiMapper;

    @Override
    public int addMianzhi(MianzhiEntity mianzhiEntity) {
        return mianzhiMapper.insertSelective(mianzhiEntity);
    }

    @Override
    public int deleteMianzhi(Integer mId) {
        return mianzhiMapper.deleteByPrimaryKey(mId);
    }

    @Override
    public int updateMianzhi(MianzhiEntity mianzhiEntity) {
        return mianzhiMapper.updateByPrimaryKeySelective(mianzhiEntity);
    }

    @Override
    public PageInfo<MianzhiEntity> selectMianzhi(MianzhiEntity mianzhiEntity) {
        //初始化分页
        PageHelper.startPage(mianzhiEntity.getCurrentPage(),mianzhiEntity.getPageSize());
        List<MianzhiEntity> list = mianzhiMapper.selectMianzhi(mianzhiEntity);
        return new PageInfo<>(list);
    }
}
