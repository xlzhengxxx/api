package com.zxl.card.service.impl;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import com.zxl.card.mapper.CardtypeMapper;
import com.zxl.card.service.CardtypeService;
/**
* ${description}
*/
@Service
public class CardtypeServiceImpl implements CardtypeService{

    @Resource
    private CardtypeMapper cardtypeMapper;

}
