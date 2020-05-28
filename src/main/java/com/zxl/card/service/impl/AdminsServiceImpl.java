package com.zxl.card.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.zxl.card.entity.AdminsEntity;
import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import com.zxl.card.mapper.AdminsMapper;
import com.zxl.card.service.AdminsService;

import java.util.List;

/**
*
*/
@Service
public class AdminsServiceImpl implements AdminsService{

    @Resource
    private AdminsMapper adminsMapper;

    @Override
    public int addAdmins(AdminsEntity adminsEntity){
        return adminsMapper.insertSelective(adminsEntity);
    }

    @Override
    public int deleteAdmins(Integer aId) {
        return adminsMapper.deleteByPrimaryKey(aId);
    }

    @Override
    public int updateAdmins(AdminsEntity adminsEntity) {
        return adminsMapper.updateByPrimaryKeySelective(adminsEntity);
    }


    @Override
    public PageInfo<AdminsEntity> selectAdmins(AdminsEntity adminsEntity) {
        //初始化分页
        PageHelper.startPage(adminsEntity.getCurrentPage(),adminsEntity.getPageSize());
        List<AdminsEntity> list = adminsMapper.selectAdmins(adminsEntity);
        return new PageInfo<>(list);
    }

    @Override
    public AdminsEntity login(String aNumber, String aPassword) {
        return adminsMapper.login(aNumber,aPassword);
    }

}
