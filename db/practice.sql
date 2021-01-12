/*
 Navicat Premium Data Transfer

 Source Server         : localhost
 Source Server Type    : MySQL
 Source Server Version : 80021
 Source Host           : localhost:3306
 Source Schema         : practice

 Target Server Type    : MySQL
 Target Server Version : 80021
 File Encoding         : 65001

 Date: 12/01/2021 15:02:24
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for user_info
-- ----------------------------
DROP TABLE IF EXISTS `user_info`;
CREATE TABLE `user_info` (
  `id` varchar(32) NOT NULL COMMENT '主键uuid',
  `number` varchar(32) NOT NULL COMMENT '编号',
  `user_name` varchar(100) NOT NULL COMMENT '用户名',
  `user_phone` varchar(12) NOT NULL COMMENT '手机号',
  `address` varchar(255) DEFAULT NULL COMMENT '用户地址',
  `introduce` varchar(100) DEFAULT NULL COMMENT '用户简介',
  `head_url` varchar(500) DEFAULT NULL COMMENT '用户头像',
  `is_del` int NOT NULL DEFAULT '1' COMMENT '用户账号状态:1 正常 2 冻结 3删除',
  `user_email` varchar(500) DEFAULT NULL COMMENT '用户邮箱',
  `password` varchar(500) NOT NULL COMMENT '用户密码',
  `create_time` datetime NOT NULL COMMENT '创建时间',
  `login_time` datetime DEFAULT NULL COMMENT '最近登录时间',
  `wx_open_id` varchar(500) DEFAULT NULL COMMENT '微信openid',
  PRIMARY KEY (`id`),
  KEY `phone` (`user_phone`) USING BTREE,
  KEY `name` (`user_name`) USING BTREE,
  KEY `password` (`password`) USING BTREE,
  KEY `isDel` (`is_del`) USING BTREE,
  KEY `wxOpenId` (`wx_open_id`) USING BTREE
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='用户基本信息表';

SET FOREIGN_KEY_CHECKS = 1;
