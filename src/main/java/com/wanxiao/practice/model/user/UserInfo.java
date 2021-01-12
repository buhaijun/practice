package com.wanxiao.practice.model.user;

import com.baomidou.mybatisplus.annotation.TableName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

import java.io.Serializable;
import java.time.LocalDateTime;

/**
 * <p>
 * 用户基本信息表
 * </p>
 *
 * @author wanxiao
 * @since 2021-01-12
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@TableName("user_info")
@ApiModel(value = "userInfo对象", description = "用户基本信息表")
public class UserInfo implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "主键uuid")
    private String id;

    @ApiModelProperty(value = "编号")
    private String number;

    @ApiModelProperty(value = "用户名")
    private String userName;

    @ApiModelProperty(value = "手机号")
    private String userPhone;

    @ApiModelProperty(value = "用户地址")
    private String address;

    @ApiModelProperty(value = "用户简介")
    private String introduce;

    @ApiModelProperty(value = "用户头像")
    private String headUrl;

    @ApiModelProperty(value = "用户账号状态:1 正常 2 冻结 3删除")
    private Integer isDel;

    @ApiModelProperty(value = "用户邮箱")
    private String userEmail;

    @ApiModelProperty(value = "用户密码")
    private String password;

    @ApiModelProperty(value = "创建时间")
    private LocalDateTime createTime;

    @ApiModelProperty(value = "最近登录时间")
    private LocalDateTime loginTime;

    @ApiModelProperty(value = "微信openid")
    private String wxOpenId;


}
