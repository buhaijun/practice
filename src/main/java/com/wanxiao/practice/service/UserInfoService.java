package com.wanxiao.practice.service;

import com.wanxiao.practice.exception.CustomerException;
import com.wanxiao.practice.model.returnjson.JsonResult;
import com.wanxiao.practice.model.user.UserInfo;

import java.util.List;

/**
 * <p>
 * 用户基本信息表 服务类
 * </p>
 *
 * @author wanxiao
 * @since 2021-01-12
 */
public interface UserInfoService {

    /**
     * 获取用户列表接口
     *
     * @param key 搜索关键词
     * @return
     * @throws CustomerException
     */
    JsonResult<List<UserInfo>> listUserInfo(String key) throws CustomerException;

}
