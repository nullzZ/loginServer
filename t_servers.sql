/*
Navicat MySQL Data Transfer

Source Server         : 本地
Source Server Version : 50711
Source Host           : localhost:3306
Source Database       : login_server

Target Server Type    : MYSQL
Target Server Version : 50711
File Encoding         : 65001

Date: 2016-09-20 16:07:32
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
  PRIMARY KEY (`uid`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8;
