package com.zxl.card.service;

import com.github.pagehelper.PageInfo;
import com.zxl.card.entity.UsersEntity;

/**
* 用户管理事务层
*/
public interface UsersService{

    /**
     * 添加用户
     * @param usersEntity
     * @return
     */
    int addUsers(UsersEntity usersEntity);

    /**
     * 删除用户信息
     * @param uId 用户 id
     * @return
     */
    int deleteUsers(Integer uId);

    /**
     * 修改用户信息
     * @param usersEntity 用户实体
     * @return
     */
    int updateUsers(UsersEntity usersEntity);

    /**
     * 查询满足条件的用户信息
     * @param usersEntity 用户实体
     * @return
     */
    PageInfo<UsersEntity> selectUsers(UsersEntity usersEntity);

}
