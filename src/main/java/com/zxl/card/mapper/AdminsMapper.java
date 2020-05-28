package com.zxl.card.mapper;

import com.zxl.card.entity.AdminsEntity;
import org.springframework.stereotype.Service;
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

    /**
     * 根据条件查询管理员信息
     * @param aNumber 管理员账号
     * @param aPassword 管理员密码
     * @return
     */
    AdminsEntity login(String aNumber,String aPassword);

}