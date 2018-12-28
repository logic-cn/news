/*
Navicat MySQL Data Transfer

Source Server         : call
Source Server Version : 50610
Source Host           : localhost:3306
Source Database       : news

Target Server Type    : MYSQL
Target Server Version : 50610
File Encoding         : 65001

Date: 2018-12-28 21:10:58
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for `admin`
-- ----------------------------
DROP TABLE IF EXISTS `admin`;
CREATE TABLE `admin` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `username` varchar(255) DEFAULT NULL,
  `password` varchar(255) DEFAULT NULL,
  `state` int(11) DEFAULT '1',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of admin
-- ----------------------------
INSERT INTO `admin` VALUES ('1', 'admin', 'admin', '1');
INSERT INTO `admin` VALUES ('2', '123', '123', '1');
INSERT INTO `admin` VALUES ('3', 'wangwu', '123', '1');

-- ----------------------------
-- Table structure for `category`
-- ----------------------------
DROP TABLE IF EXISTS `category`;
CREATE TABLE `category` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(255) DEFAULT NULL,
  `state` int(11) DEFAULT '1',
  `create_date` date DEFAULT NULL,
  `update_date` date DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=11 DEFAULT CHARSET=utf8mb4;

-- ----------------------------
-- Records of category
-- ----------------------------
INSERT INTO `category` VALUES ('1', '时政', '1', '2018-12-20', '2018-12-20');
INSERT INTO `category` VALUES ('2', '国际', '1', '2018-12-06', '2018-12-06');
INSERT INTO `category` VALUES ('3', '军事', '1', '2018-12-04', '2018-12-04');
INSERT INTO `category` VALUES ('4', '公益', '1', '2018-12-04', '2018-12-04');
INSERT INTO `category` VALUES ('5', '汽车', '1', '2018-12-12', '2018-12-12');
INSERT INTO `category` VALUES ('6', '房产', '1', '2018-12-12', '2018-12-12');
INSERT INTO `category` VALUES ('7', '教育', '1', '2018-12-13', '2018-12-13');
INSERT INTO `category` VALUES ('8', '时尚', '1', '2018-12-13', '2018-12-13');
INSERT INTO `category` VALUES ('9', '科技', '1', '2018-12-20', '2018-12-20');
INSERT INTO `category` VALUES ('10', '娱乐', '1', '2018-12-13', '2018-12-13');

-- ----------------------------
-- Table structure for `news`
-- ----------------------------
DROP TABLE IF EXISTS `news`;
CREATE TABLE `news` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `category_id` int(11) NOT NULL,
  `title` varchar(255) DEFAULT NULL,
  `content` varchar(255) DEFAULT NULL,
  `state` int(11) DEFAULT '1',
  `create_date` date DEFAULT NULL,
  `update_date` date DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `category_id` (`category_id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of news
-- ----------------------------
INSERT INTO `news` VALUES ('1', '2', '习近平就印度尼西亚', '习近平就印度尼西亚巽他海峡海啸灾害向印尼总统致慰问电', '1', '2018-12-24', '2018-12-24');

-- ----------------------------
-- Table structure for `user`
-- ----------------------------
DROP TABLE IF EXISTS `user`;
CREATE TABLE `user` (
  `user_id` int(11) NOT NULL AUTO_INCREMENT,
  `user_name` varchar(255) DEFAULT NULL,
  `password` varchar(255) DEFAULT NULL,
  `email` varchar(255) DEFAULT NULL,
  `state` int(11) DEFAULT '1',
  `create_date` date DEFAULT NULL,
  PRIMARY KEY (`user_id`)
) ENGINE=InnoDB AUTO_INCREMENT=7 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of user
-- ----------------------------
INSERT INTO `user` VALUES ('1', 'admin', 'admin', '114425@qq.com', '1', '2018-12-23');
INSERT INTO `user` VALUES ('2', '111', '11', '1144@qq.com', '1', '2018-12-23');
INSERT INTO `user` VALUES ('3', '222', '222', '1144@qq.com', '1', '2018-12-23');
INSERT INTO `user` VALUES ('4', 'zxc', 'zxc', 'zxc@qq.com', '1', '2018-12-25');
INSERT INTO `user` VALUES ('5', 'oopp', 'oop', 'oop@qq.com', '1', '2018-12-25');
INSERT INTO `user` VALUES ('6', 'lisi', 'lisi', 'lisi@qq.com', '1', '2018-12-28');
