package com.zxl.card.service.impl;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import com.zxl.card.mapper.MianzhiMapper;
import com.zxl.card.service.MianzhiService;
/**
*${description}
*/
@Service
public class MianzhiServiceImpl implements MianzhiService{

    @Resource
    private MianzhiMapper mianzhiMapper;

}
