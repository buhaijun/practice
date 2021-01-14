package com.wanxiao.practice.service.impl;

import com.baomidou.dynamic.datasource.annotation.DS;
import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.oracle.jrockit.jfr.ValueDefinition;
import com.wanxiao.practice.exception.CustomerException;
import com.wanxiao.practice.mapper.UserInfoMapper;
import com.wanxiao.practice.model.returnjson.JsonResult;
import com.wanxiao.practice.model.user.UserInfo;
import com.wanxiao.practice.service.UserInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * <p>
 * 用户基本信息表 服务实现类
 * </p>
 *
 * @author wanxiao
 * @since 2021-01-12
 */
@Service
@DS("master")
public class UserInfoServiceImpl implements UserInfoService {


    @Autowired
    private UserInfoMapper userInfoMapper;

    /**
     * @param key 搜索关键词
     * @return
     * @throws CustomerException
     */
    @Override
    public JsonResult<List<UserInfo>> listUserInfo(String key) throws CustomerException {
        LambdaQueryWrapper<UserInfo> userInfoLambdaQueryWrapper = new LambdaQueryWrapper<>();
        List<UserInfo> userInfos = userInfoMapper.selectList(userInfoLambdaQueryWrapper);
        return JsonResult.success(userInfos);
    }
}
