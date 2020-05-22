package com.zxl.card.mapper;

import com.zxl.card.entity.AdminsEntity;
import tk.mybatis.mapper.common.Mapper;

import java.util.List;

/**
*
*/
public interface AdminsMapper extends Mapper<AdminsEntity> {
    /**
     * 根据条件查询用户信息
     * @param usersEntity 用户实体
     * @return
     */
    List<AdminsEntity> selectAdmins(AdminsEntity usersEntity);
}