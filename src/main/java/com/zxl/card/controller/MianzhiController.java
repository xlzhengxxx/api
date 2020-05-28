package com.zxl.card.controller;


import com.github.pagehelper.PageInfo;
import com.zxl.card.common.Result;
import com.zxl.card.entity.MianzhiEntity;
import com.zxl.card.service.MianzhiService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 *面值管理控制器
 */
@RestController
@RequestMapping(value = "mianzhi")
public class MianzhiController {

    @Autowired
    private MianzhiService mianzhiService;

    /**
     * 添加面值
     * @param mianzhiEntity
     * @return
     */
    @RequestMapping(value = "/addMianzhi")
    public Result addUsers(@RequestBody MianzhiEntity mianzhiEntity){
        int i = mianzhiService.addMianzhi(mianzhiEntity);
        if (i > 0){
            return Result.ok("添加面值信息成功！");
        }
        return Result.error("添加面值信息失败！");
    }

    /**
     * 删除面值信息
     * @param mId
     * @return
     */
    @RequestMapping(value = "/deleteMianzhi")
    public Result deleteMianzhi(@RequestParam Integer mId){
        int i = mianzhiService.deleteMianzhi(mId);
        if (i > 0){
            return Result.ok("删除面值信息成功！");
        }
        return Result.error("删除面值信息失败！");
    }
    /**
     * 修改订单信息
     * @param mianzhiEntity
     * @return
     */
    @RequestMapping(value = "/updateMianzhi")
    public Result updateMianzhi(@RequestBody MianzhiEntity mianzhiEntity){
        int i = mianzhiService.updateMianzhi(mianzhiEntity);
        if (i > 0){
            return Result.ok("修改面值信息成功！");
        }
        return Result.error("修改面值信息失败！");
    }

    /**
     * 查询满足条件的面值信息
     * @param mianzhiEntity 面值实体
     * @return
     */
    @RequestMapping(value = "/selectMianzhi")
    public Result selectMianzhi(MianzhiEntity mianzhiEntity){
        PageInfo<MianzhiEntity> pageInfo = mianzhiService.selectMianzhi(mianzhiEntity);
        List<MianzhiEntity> list = pageInfo.getList();
        if (list.size() > 0 && list !=null){
            Map<String, Object> map = new HashMap<>();
            map.put("dataList",list);
            //获取总页数，总条数，当前页数
            map.put("pages",pageInfo.getPages());
            map.put("total",pageInfo.getTotal());
            map.put("pageNum",pageInfo.getPageNum());
            return Result.ok(map);
        }
        return Result.error("没有查询到满足条件的面值信息！");
    }

}
