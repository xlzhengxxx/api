package com.zxl.card.service;

import com.github.pagehelper.PageInfo;
import com.zxl.card.entity.OrdersEntity;

/**
* 订单管理事务层
*/
public interface OrdersService{

    /**
     * 添加订单
     * @param ordersEntity
     * @return
     */
    int addOrders(OrdersEntity ordersEntity);

    /**
     * 删除订单信息
     * @param oId 订单 id
     * @return
     */
    int deleteOrders(Integer oId);

    /**
     * 修改用户信息
     * @param ordersEntity 用户实体
     * @return
     */
    int updateOrders(OrdersEntity ordersEntity);

    /**
     * 查询满足条件的订单信息
     * @param ordersEntity 订单实体
     * @return
     */
    PageInfo<OrdersEntity> selectOrders(OrdersEntity ordersEntity);
}
