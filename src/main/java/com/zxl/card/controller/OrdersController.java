package com.zxl.card.controller;


import com.github.pagehelper.PageInfo;
import com.zxl.card.common.Result;
import com.zxl.card.entity.OrdersEntity;
import com.zxl.card.service.OrdersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 *订单管理控制器
 */
@RestController
@RequestMapping(value = "orders")
public class OrdersController {

    @Autowired
    private OrdersService ordersService;

    /**
     * 添加订单信息
     * @param ordersEntity
     * @return
     */
    @RequestMapping(value = "/addOrders")
    public Result addCard(@RequestBody OrdersEntity ordersEntity){
        int i = ordersService.addOrders(ordersEntity);
        if (i > 0){
            return Result.ok("添加订单信息成功！");
        }
        return Result.error("添加订单信息失败！");
    }

    /**
     * 删除点卡种类信息
     * @param oId
     * @return
     */
    @RequestMapping(value = "/deleteOrders")
    public Result deleteCard(@RequestParam Integer oId){
        int i = ordersService.deleteOrders(oId);
        if (i > 0){
            return Result.ok("删除订单信息成功！");
        }
        return Result.error("删除订单信息失败！");
    }

    /**
     * 修改订单信息
     * @param ordersEntity
     * @return
     */
    @RequestMapping(value = "/updateOrders")
    public Result updateCard(@RequestBody OrdersEntity ordersEntity){
        int i = ordersService.updateOrders(ordersEntity);
        if (i > 0){
            return Result.ok("修改订单信息成功！");
        }
        return Result.error("修改订单信息失败！");
    }

    /**
     * 查询满足条件的订单信息
     * @param ordersEntity 订单实体
     * @return
     */
    @RequestMapping(value = "/selectOrders")
    public Result selectCard(OrdersEntity ordersEntity){
        PageInfo<OrdersEntity> pageInfo = ordersService.selectOrders(ordersEntity);
        List<OrdersEntity> list = pageInfo.getList();
        if (list.size() > 0 && list !=null){
            Map<String, Object> map = new HashMap<>();
            map.put("dataList",list);
            //获取总页数，总条数，当前页数
            map.put("pages",pageInfo.getPages());
            map.put("total",pageInfo.getTotal());
            map.put("pageNum",pageInfo.getPageNum());
            return Result.ok(map);
        }
        return Result.error("没有查询到满足条件的订单信息！");
    }

    /**
     * 查询满足条件的订单信息
     * @return
     */
    @RequestMapping(value = "/selectWeekOrders")
    public Result selectWeekOrders(){
        int i1 = ordersService.selectWeekOrders();
        int i2 = ordersService.selectTodayOrders();
        int i3 = ordersService.selectHistoryOrders();
        Map<String, Object> map = new HashMap<>();
        map.put("i1",i1);
        map.put("i2",i2);
        map.put("i3",i3);
        return Result.ok(map);
    }

    /**
     * 查询满足条件的订单信息
     * @param ordersEntity 订单实体
     * @return
     */
    @RequestMapping(value = "/selectPriceSum")
    public Result selectPriceSum(OrdersEntity ordersEntity){
        List<OrdersEntity> list= ordersService.selectPriceSum(ordersEntity);
        Map<String, Object> map = new HashMap<>();
        map.put("tname",list);
        return Result.ok(map);
    }

}
