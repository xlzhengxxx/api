package com.zxl.card.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.zxl.card.entity.UsersEntity;
import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import com.zxl.card.mapper.UsersMapper;
import com.zxl.card.service.UsersService;

import java.util.List;

/**
*用户管理事务层实现类
*/
@Service
public class UsersServiceImpl implements UsersService{

    @Resource
    private UsersMapper usersMapper;

    @Override
    public int addUsers(UsersEntity usersEntity) {
        return usersMapper.insertSelective(usersEntity);
    }

    @Override
    public int deleteUsers(Integer uId) {
        return usersMapper.deleteByPrimaryKey(uId);
    }

    @Override
    public int updateUsers(UsersEntity usersEntity) {
        return usersMapper.updateByPrimaryKeySelective(usersEntity);
    }

    @Override
    public PageInfo<UsersEntity> selectUsers(UsersEntity usersEntity) {
        //初始化分页
        PageHelper.startPage(usersEntity.getCurrentPage(),usersEntity.getPageSize());
        List<UsersEntity> list = usersMapper.selectUsers(usersEntity);
        return new PageInfo<>(list);
    }
}
