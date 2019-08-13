/*
Navicat MySQL Data Transfer

Source Server         : jia-dev
Source Server Version : 50622
Source Host           : localhost:3306
Source Database       : test

Target Server Type    : MYSQL
Target Server Version : 50622
File Encoding         : 65001

Date: 2019-08-13 21:37:50
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for user
-- ----------------------------
DROP TABLE IF EXISTS `user`;
CREATE TABLE `user` (
  `id` varchar(11) NOT NULL,
  `name` varchar(20) DEFAULT NULL,
  `address` varchar(50) DEFAULT NULL,
  `age` int(3) DEFAULT NULL,
  `create_time` datetime DEFAULT NULL,
  `update_time` datetime DEFAULT NULL,
  `status` int(1) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of user
-- ----------------------------
INSERT INTO `user` VALUES ('1', '张三', '路边', '12', '2019-08-13 20:55:49', '2019-08-13 20:55:51', '1');
INSERT INTO `user` VALUES ('2', '李四', '天桥', '13', '2019-08-13 20:55:55', '2019-08-13 20:55:59', '1');
INSERT INTO `user` VALUES ('3', '王五', '家里', '14', '2019-08-13 21:19:50', '2019-08-13 21:19:50', '1');
