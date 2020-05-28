package com.zxl.card.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.zxl.card.entity.OrdersEntity;
import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import com.zxl.card.mapper.OrdersMapper;
import com.zxl.card.service.OrdersService;

import java.util.List;

/**
* 订单管理事务层实现类
*/
@Service
public class OrdersServiceImpl implements OrdersService{

    @Resource
    private OrdersMapper ordersMapper;

    @Override
    public int addOrders(OrdersEntity ordersEntity) {
        return ordersMapper.insertSelective(ordersEntity);
    }

    @Override
    public int deleteOrders(Integer oId) {
        return ordersMapper.deleteByPrimaryKey(oId);
    }

    @Override
    public int updateOrders(OrdersEntity ordersEntity) {
        return ordersMapper.updateByPrimaryKeySelective(ordersEntity);
    }

    @Override
    public PageInfo<OrdersEntity> selectOrders(OrdersEntity ordersEntity) {
        //初始化分页
        PageHelper.startPage(ordersEntity.getCurrentPage(),ordersEntity.getPageSize());
        List<OrdersEntity> list = ordersMapper.selectOrders(ordersEntity);
        return new PageInfo<>(list);
    }

    @Override
    public int selectWeekOrders() {
        return ordersMapper.selectWeekOrders();
    }

    @Override
    public int selectTodayOrders() {
        return ordersMapper.selectTodayOrders();
    }

    @Override
    public int selectHistoryOrders() {
        return ordersMapper.selectHistoryOrders();
    }

    @Override
    public List<OrdersEntity> selectPriceSum(OrdersEntity ordersEntity) {
        return ordersMapper.selectOrders(ordersEntity);

    }
}
