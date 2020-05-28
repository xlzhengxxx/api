package com.zxl.card.controller;


import com.github.pagehelper.PageInfo;
import com.zxl.card.common.Result;
import com.zxl.card.entity.CardtypeEntity;
import com.zxl.card.service.CardtypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 *点卡种类管理控制器
 */
@RestController
@RequestMapping(value = "cardtype")
public class CaretypeController {

    @Autowired
    private CardtypeService cardtypeService;

    /**
     * 添加点卡种类信息
     * @param cardtypeEntity
     * @return
     */
    @RequestMapping(value = "/addCardtype")
    public Result addCardtype(@RequestBody CardtypeEntity cardtypeEntity){
        int i = cardtypeService.addCardtype(cardtypeEntity);
        if (i > 0){
            return Result.ok("添加点卡种类信息成功！");
        }
        return Result.error("添加点卡种类信息失败！");
    }

    /**
     * 删除点卡种类信息
     * @param tId
     * @return
     */
    @RequestMapping(value = "/deleteCardtype")
    public Result deleteCardtype(@RequestParam Integer tId){
        int i = cardtypeService.deleteCardtype(tId);
        if (i > 0){
            return Result.ok("删除点卡种类信息成功！");
        }
        return Result.error("删除点卡种类信息失败！");
    }

    /**
     * 修改点卡种类信息
     * @param cardtypeEntity
     * @return
     */
    @RequestMapping(value = "/updateCardtype")
    public Result updateCardtype(@RequestBody CardtypeEntity cardtypeEntity){
        int i = cardtypeService.updateCardtype(cardtypeEntity);
        if (i > 0){
            return Result.ok("修改点卡种类信息成功！");
        }
        return Result.error("修改点卡种类信息失败！");
    }

    /**
     * 查询满足条件的点卡种类信息
     * @param cardtypeEntity 点卡种类实体
     * @return
     */
    @RequestMapping(value = "/selectCardtype")
    public Result selectCardtype(CardtypeEntity cardtypeEntity){
        PageInfo<CardtypeEntity> pageInfo = cardtypeService.selectCardtype(cardtypeEntity);
        List<CardtypeEntity> list = pageInfo.getList();
        if (list.size() > 0 && list !=null){
            Map<String, Object> map = new HashMap<>();
            map.put("dataList",list);
            //获取总页数，总条数，当前页数
            map.put("pages",pageInfo.getPages());
            map.put("total",pageInfo.getTotal());
            map.put("pageNum",pageInfo.getPageNum());
            return Result.ok(map);
        }
        return Result.error("没有查询到满足条件的点卡种类信息！");
    }
}
