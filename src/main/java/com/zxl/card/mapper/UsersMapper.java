package com.zxl.card.mapper;

import com.zxl.card.entity.UsersEntity;
import tk.mybatis.mapper.common.Mapper;

import java.util.List;

/**
* 用户管理持久化层
*/
public interface UsersMapper extends Mapper<UsersEntity> {

    /**
     * 根据条件查询用户信息
     * @param usersEntity 用户实体
     * @return
     */
    List<UsersEntity> selectUsers(UsersEntity usersEntity);

}