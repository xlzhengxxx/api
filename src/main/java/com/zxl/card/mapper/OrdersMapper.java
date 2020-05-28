package com.zxl.card.mapper;

import com.zxl.card.entity.OrdersEntity;
import tk.mybatis.mapper.common.Mapper;

import java.util.List;

/**
* 订单管理持久化层
*/
public interface OrdersMapper extends Mapper<OrdersEntity> {

    /**
     * 根据条件查询订单信息
     * @param ordersEntity 订单实体
     * @return
     */
    List<OrdersEntity> selectOrders(OrdersEntity ordersEntity);

    int selectWeekOrders();
    int selectTodayOrders();
    int selectHistoryOrders();
    /**
     * 根据条件查询订单信息
     * @param ordersEntity 订单实体
     * @return
     */
    List<OrdersEntity> selectPriceSum(OrdersEntity ordersEntity);
}