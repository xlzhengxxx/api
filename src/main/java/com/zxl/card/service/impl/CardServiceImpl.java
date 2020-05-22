package com.zxl.card.service.impl;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import com.zxl.card.mapper.CardMapper;
import com.zxl.card.service.CardService;
/**
*${description}
*/
@Service
public class CardServiceImpl implements CardService{

    @Resource
    private CardMapper cardMapper;

}
