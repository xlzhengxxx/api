package com.zxl.card.service.impl;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import com.zxl.card.mapper.OrdersMapper;
import com.zxl.card.service.OrdersService;
/**
* ${description}
*/
@Service
public class OrdersServiceImpl implements OrdersService{

    @Resource
    private OrdersMapper ordersMapper;

}
