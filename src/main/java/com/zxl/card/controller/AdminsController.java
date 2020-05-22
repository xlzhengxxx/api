package com.zxl.card.controller;


import com.github.pagehelper.PageInfo;
import com.zxl.card.common.Result;
import com.zxl.card.entity.AdminsEntity;
import com.zxl.card.service.AdminsService;
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
@RequestMapping(value = "admins")
public class AdminsController {

    @Autowired
    private AdminsService adminsService;

    /**
     * 添加管理员信息
     * @param adminsEntity
     * @return
     */
    @RequestMapping(value = "/addAdmins")
    public Result addAdmins(@RequestBody AdminsEntity adminsEntity){
        int i = adminsService.addAdmins(adminsEntity);
        if (i > 0){
            return Result.ok("添加管理员成功！");
        }
        return Result.error("添加管理员失败！");
    }

    /**
     * 删除用户信息
     * @param aId
     * @return
     */
    @RequestMapping(value = "/deleteAdmins")
    public Result deleteUsers(@RequestParam Integer aId){
        int i = adminsService.deleteAdmins(aId);
        if (i > 0){
            return Result.ok("删除管理员信息成功！");
        }
        return Result.error("删除管理员信息失败！");
    }
    /**
     * 修改用户信息
     * @param adminsEntity
     * @return
     */
    @RequestMapping(value = "/updateUsers")
    public Result updateUsers(@RequestBody AdminsEntity adminsEntity){
        int i = adminsService.updateAdmins(adminsEntity);
        if (i > 0){
            return Result.ok("修改管理员信息成功！");
        }
        return Result.error("修改管理员信息失败！");
    }

    /**
     * 查询满足条件的管理员信息
     * @param adminsEntity 管理员实体
     * @return
     */
    @RequestMapping(value = "/selectAdmins")
    public Result selectAdmins(AdminsEntity adminsEntity){
        PageInfo<AdminsEntity> pageInfo = adminsService.selectAdmins(adminsEntity);
        List<AdminsEntity> list = pageInfo.getList();
        if (list.size() > 0 && list !=null){
            Map<String, Object> map = new HashMap<>();
            map.put("dataList",list);
            //获取总页数，总条数，当前页数
            map.put("pages",pageInfo.getPages());
            map.put("total",pageInfo.getTotal());
            map.put("pageNum",pageInfo.getPageNum());
            return Result.ok(map);
        }
        return Result.error("没有查询到满足条件的管理员信息！");
    }

}
