package com.zxl.card.controller;

import com.github.pagehelper.PageInfo;
import com.zxl.card.common.Result;
import com.zxl.card.entity.UsersEntity;
import com.zxl.card.service.UsersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 *用户管理控制器
 */
@RestController
@RequestMapping(value = "users")
public class UsersController {

    @Autowired
    private UsersService usersService;

    /**
     * 添加用户信息
     * @param usersEntity
     * @return
     */
    @RequestMapping(value = "/addUsers")
    public Result addUsers(@RequestBody UsersEntity usersEntity){
        usersEntity.setUDate(new Date());
        int i = usersService.addUsers(usersEntity);
        if (i > 0){
            return Result.ok("添加用户信息成功！");
        }
        return Result.error("添加用户信息失败！");
    }

    /**
     * 删除用户信息
     * @param uId
     * @return
     */
    @RequestMapping(value = "/deleteUsers")
    public Result deleteUsers(@RequestParam Integer uId){
        int i = usersService.deleteUsers(uId);
        if (i > 0){
            return Result.ok("删除用户信息成功！");
        }
        return Result.error("删除用户信息失败！");
    }

    /**
     * 修改用户信息
     * @param usersEntity
     * @return
     */
    @RequestMapping(value = "/updateUsers")
    public Result updateUsers(@RequestBody UsersEntity usersEntity){
        int i = usersService.updateUsers(usersEntity);
        if (i > 0){
            return Result.ok("修改用户信息成功！");
        }
        return Result.error("修改用户信息失败！");
    }

    /**
     * 查询满足条件的用户信息
     * @param usersEntity 用户实体
     * @return
     */
    @RequestMapping(value = "/selectUsers")
    public Result selectUsers(UsersEntity usersEntity){
        PageInfo<UsersEntity> pageInfo = usersService.selectUsers(usersEntity);
        List<UsersEntity> list = pageInfo.getList();
        if (list.size() > 0 && list !=null){
            Map<String, Object> map = new HashMap<>();
            map.put("dataList",list);
            //获取总页数，总条数，当前页数
            map.put("pages",pageInfo.getPages());
            map.put("total",pageInfo.getTotal());
            map.put("pageNum",pageInfo.getPageNum());
            return Result.ok(map);
        }
        return Result.error("没有查询到满足条件的用户信息！");
    }

}
