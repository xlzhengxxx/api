package com.zxl.card.service.impl;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import com.zxl.card.mapper.AdminsMapper;
import com.zxl.card.service.AdminsService;
/**
*
*/
@Service
public class AdminsServiceImpl implements AdminsService{

    @Resource
    private AdminsMapper adminsMapper;

}
