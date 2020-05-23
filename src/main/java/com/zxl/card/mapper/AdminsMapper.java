package com.zxl.card.mapper;

import com.zxl.card.entity.AdminsEntity;
import tk.mybatis.mapper.common.Mapper;

import java.util.List;

/**
*管理员管理持久化层
*/
public interface AdminsMapper extends Mapper<AdminsEntity> {
    /**
     * 根据条件查询管理员信息
     * @param adminsEntity 管理员实体
     * @return
     */
    List<AdminsEntity> selectAdmins(AdminsEntity adminsEntity);
}