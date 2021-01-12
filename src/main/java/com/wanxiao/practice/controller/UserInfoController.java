package com.wanxiao.practice.controller;


import com.wanxiao.practice.exception.CustomerException;
import com.wanxiao.practice.model.returnjson.JsonResult;
import com.wanxiao.practice.model.user.UserInfo;
import com.wanxiao.practice.service.UserInfoService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * <p>
 * 用户基本信息表 前端控制器
 * </p>
 *
 * @author wanxiao
 * @since 2021-01-12
 */
@RestController
@RequestMapping("/app/userInfo/")
@Api(tags = "User-用户模块")
public class UserInfoController {

    @Autowired
    private UserInfoService userInfoService;


    @PostMapping("v1/listUserInfo")
    @ApiOperation(value = "查询用户列表", notes = "查询用户列表")
    public JsonResult<List<UserInfo>> listUserInfo(
            @ApiParam(value = "key", name = "搜索关键词")
            @RequestParam(value = "key", required = false)
                    String key)
            throws CustomerException {
        return userInfoService.listUserInfo(key);
    }


}
