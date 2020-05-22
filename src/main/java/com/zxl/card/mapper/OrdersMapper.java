package com.zxl.card.mapper;

import com.zxl.card.entity.OrdersEntity;
import tk.mybatis.mapper.common.Mapper;

import java.util.List;

/**
* 订单管理持久化层
*/
public interface OrdersMapper extends Mapper<OrdersEntity> {

    /**
     * 根据条件查询用户信息
     * @param ordersEntity 用户实体
     * @return
     */
    List<OrdersEntity> selectOrders(OrdersEntity ordersEntity);
}