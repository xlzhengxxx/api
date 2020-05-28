package com.zxl.card.service;

import com.github.pagehelper.PageInfo;
import com.zxl.card.entity.AdminsEntity;

/**
*管理员管理事务层
*/
public interface AdminsService{
    /**
     * 添加管理员
     * @param adminsEntity
     * @return
     */

    int addAdmins(AdminsEntity adminsEntity);

    /**
     * 删除管理员
     * @param aId 管理员 id
     * @return
     */
    int deleteAdmins(Integer aId);

    /**
     * 修改管理员
     * @param adminsEntity
     * @return
     */
    int updateAdmins(AdminsEntity adminsEntity);

    /**
     * 查询满足条件的用户信息
     * @param adminsEntity 用户实体
     * @return
     */
    PageInfo<AdminsEntity> selectAdmins(AdminsEntity adminsEntity);

    /**
     * 根据条件查询管理员信息
     * @param aNumber 管理员账号
     * @param aPassword 管理员密码
     * @return
     */
    AdminsEntity login(String aNumber,String aPassword);

}
