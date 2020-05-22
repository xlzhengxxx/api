package com.zxl.card.controller;


import com.github.pagehelper.PageInfo;
import com.zxl.card.common.Result;
import com.zxl.card.entity.CardEntity;
import com.zxl.card.service.CardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 *用户管理控制器
 */
@RestController
@RequestMapping(value = "card")
public class CardController {
    @Autowired
    private CardService cardService;

    /**
     * 添加点卡信息
     * @param cardEntity
     * @return
     */
    @RequestMapping(value = "/addCard")
    public Result addCard(@RequestBody CardEntity cardEntity){
        int i = cardService.addCard(cardEntity);
        if (i > 0){
            return Result.ok("添加用户信息成功！");
        }
        return Result.error("添加用户信息失败！");
    }

    /**
     * 删除点卡信息
     * @param cId
     * @return
     */
    @RequestMapping(value = "/deleteCard")
    public Result deleteCard(@RequestParam Integer cId){
        int i = cardService.deleteCard(cId);
        if (i > 0){
            return Result.ok("删除点卡信息成功！");
        }
        return Result.error("删除点卡信息失败！");
    }

    /**
     * 修改点卡信息
     * @param cardEntity
     * @return
     */
    @RequestMapping(value = "/updateCard")
    public Result updateCard(@RequestBody CardEntity cardEntity){
        int i = cardService.updateCard(cardEntity);
        if (i > 0){
            return Result.ok("修改点卡信息成功！");
        }
        return Result.error("修改点卡信息失败！");
    }

    /**
     * 查询满足条件的点卡信息
     * @param cardEntity 用户实体
     * @return
     */
    @RequestMapping(value = "/selectCard")
    public Result selectCard(CardEntity cardEntity){
        PageInfo<CardEntity> pageInfo = cardService.selectCard(cardEntity);
        List<CardEntity> list = pageInfo.getList();
        if (list.size() > 0 && list !=null){
            Map<String, Object> map = new HashMap<>();
            map.put("dataList",list);
            //获取总页数，总条数，当前页数
            map.put("pages",pageInfo.getPages());
            map.put("total",pageInfo.getTotal());
            map.put("pageNum",pageInfo.getPageNum());
            return Result.ok(map);
        }
        return Result.error("没有查询到满足条件的点卡信息！");
    }
}
