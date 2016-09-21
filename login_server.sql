/*
Navicat MySQL Data Transfer

Source Server         : 本地
Source Server Version : 50711
Source Host           : localhost:3306
Source Database       : login_server

Target Server Type    : MYSQL
Target Server Version : 50711
File Encoding         : 65001

Date: 2016-09-21 14:36:46
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for t_servers
-- ----------------------------
DROP TABLE IF EXISTS `t_servers`;
CREATE TABLE `t_servers` (
  `uid` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(100) DEFAULT '',
  `channelId` varchar(100) DEFAULT '',
  `serverId` varchar(100) DEFAULT NULL,
  `host` varchar(100) DEFAULT '',
  `port` int(11) DEFAULT NULL,
  `createDate` timestamp NULL DEFAULT CURRENT_TIMESTAMP,
  PRIMARY KEY (`uid`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Table structure for t_users
-- ----------------------------
DROP TABLE IF EXISTS `t_users`;
CREATE TABLE `t_users` (
  `userId` bigint(20) NOT NULL DEFAULT '0' COMMENT '服务器生成的唯一ID',
  `sdkCannel` int(11) NOT NULL DEFAULT '0' COMMENT 'SDK的ID',
  `sdk_uid` varchar(50) NOT NULL DEFAULT '' COMMENT 'SDK给的uid',
  `channel` varchar(50) NOT NULL COMMENT 'SDK下的渠道ID',
  `lastServerId` varchar(50) DEFAULT '0' COMMENT '最后服务器',
  `loginTimestamp` datetime DEFAULT NULL COMMENT '最后登录时间',
  `createTime` datetime DEFAULT NULL COMMENT '创建时间',
  `device` varchar(100) DEFAULT '' COMMENT '设备ios还是android',
  `deviceVersion` varchar(100) DEFAULT '' COMMENT '设备系统版本号',
  `loginIP` varchar(100) DEFAULT '' COMMENT '登陆IP地址',
  PRIMARY KEY (`userId`),
  KEY `cdc` (`sdkCannel`,`sdk_uid`,`channel`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
