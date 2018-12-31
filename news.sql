/*
Navicat MySQL Data Transfer

Source Server         : call
Source Server Version : 50610
Source Host           : localhost:3306
Source Database       : news

Target Server Type    : MYSQL
Target Server Version : 50610
File Encoding         : 65001

Date: 2018-12-31 16:45:26
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
) ENGINE=InnoDB AUTO_INCREMENT=31 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of news
-- ----------------------------
INSERT INTO `news` VALUES ('1', '2', '习近平就印度尼西亚', '习近平就印度尼西亚巽他海峡海啸灾害向印尼总统致慰问电', '1', '2018-12-24', '2018-12-24');
INSERT INTO `news` VALUES ('2', '5', '红旗首款纯电动SUV', '红旗E-HS3正式下线，定位于红旗品牌旗下入门级电动SUV产品。', '1', '2018-12-28', '2018-12-28');
INSERT INTO `news` VALUES ('3', '5', '大众全新速腾消息', '一汽-大众全新速腾将于2019年3月份正式上市。', '1', '2018-12-28', '2018-12-28');
INSERT INTO `news` VALUES ('4', '2', '岁末年初 牢', '锐意进取', '1', '2018-12-28', '2018-12-28');
INSERT INTO `news` VALUES ('6', '8', '“热”就一个字！上海记者亲身体验“权健火疗”', '“热”就一', '1', '2018-12-28', '2018-12-28');
INSERT INTO `news` VALUES ('7', '8', '吴昕对阔腿疯不怕漏风吗？', '大冬天的就不怕漏风吗？', '1', '2018-12-28', '2018-12-28');
INSERT INTO `news` VALUES ('9', '9', '创业犯错样本，ofo的2018 | 搜狐科技年终盘点', '创业犯错样本，ofo的2018 | 搜狐科技年终盘点', '1', '2018-12-28', '2018-12-28');
INSERT INTO `news` VALUES ('18', '1', '再也不用“刹一脚”！川渝、苏鲁之间正式取消省界收费站', '取卡、抬杆，刹车减速、交卡、付钱、抬杆——这套流程，只要跑过高速公路的人都再熟悉不过。而且，只要你没有使用ETC，凡经过一道省界，就必须做一套这样的动作。而对于车流量大的地区而言，收费站的确是高速公路最大的常规堵点', '1', '2018-12-29', '2018-12-29');
INSERT INTO `news` VALUES ('19', '4', '圈养大熊猫“琴心”“小核桃”放归大自然', '圈养大熊猫“琴心”“小核桃”放归大自然', '1', '2018-12-29', '2018-12-29');
INSERT INTO `news` VALUES ('20', '4', '四川质量技术监督学校获赠500万 用以支持贫困学子', '四川质量技术监督学校获赠500万 用以支持贫困学子', '1', '2018-12-29', '2018-12-29');
INSERT INTO `news` VALUES ('21', '4', '益童计划', '“益童计划”是凤凰网公益专项基金旗下针对困境儿童成长过程中的医疗救助、教育发展、心理健康、生活水平等方面进行救护和帮助的公益项目', '1', '2018-12-29', '2018-12-29');
INSERT INTO `news` VALUES ('22', '1', '十八届三中全会五周年了', '间过得真快，一眨眼，离十八届三中全会召开已经过去了5年。这次被称为全面深化改革总部署、总动员的重要会议，搭起了“四梁八柱”，为今后的改革做了顶层设计。', '1', '2018-12-29', '2018-12-29');
INSERT INTO `news` VALUES ('23', '1', '旅客带榴莲坐高铁被拒 现场锯开吃光', '旅客带榴莲坐高铁被拒 现场锯开吃光', '1', '2018-12-29', '2018-12-29');
INSERT INTO `news` VALUES ('24', '3', ' 中国无人机大显身手，全面夺下中东市场，美国看后感叹已失败', '\r\n中国无人机大显身手，全面夺下中东市场，美国看后感叹已失败', '1', '2018-12-31', '2018-12-31');
INSERT INTO `news` VALUES ('25', '6', '看到中国房产泡沫的未来', '2018年的最后一天，我从这个城市，看到中国房产泡沫的未来！', '1', '2018-12-31', '2018-12-31');
INSERT INTO `news` VALUES ('26', '7', '高招艺考分数线不低于二本线70%或75%', '高校艺术类专业考试分为省级统考和校考。近年来，省级统考的范围在探索扩展。\r\n\r\n《要求》指出，2019年高校美术学类和设计学类专业一般不组织校考;2020年起，使用省级统考成绩，不再组织校考。', '1', '2018-12-31', '2018-12-31');
INSERT INTO `news` VALUES ('27', '1', '辩证唯物主义是中国共产党人的世界观和方法论', '新华社北京12月31日电 新改版的《求是》杂志2019年第1期将发表中共中央总书记、国家主席、中央军委主席习近平的重要文章《辩证唯物主义是中国共产党人的世界观和方法论》。', '1', '2018-12-31', '2018-12-31');
INSERT INTO `news` VALUES ('28', '1', '玩转农业新科技 农民职业大变身 今年三农有点“潮”', '今年的6月21日，我国新增设了一个节日——中国农民丰收节，规定自2018年起，将每年的秋分日设立为“中国农民丰收节”。', '1', '2018-12-31', '2018-12-31');
INSERT INTO `news` VALUES ('29', '6', '房地产暴利时代远去：不过度悲观 亦无须过度乐观', '2019年，在落实长效机制的基础上，短期调控力度依然从严，针对需求端限购不会放松，但针对首套房支持性政策或将强化，针对改善型需求限制政策有望出现松动，总体依然会体现”房住不炒“，即在打击炒房的同时更注重对刚需人群的保障。', '1', '2018-12-31', '2018-12-31');
INSERT INTO `news` VALUES ('30', '1', '2019年，你有哪些小目标和大理想？', '转眼间，2018年将划上句点。过去的这一年，你都有哪些收获？面对即将到来的2019年，你又有哪些新的期许呢？跟随国际在线记者的镜头，走上街头听一听中外朋友2018年的幸福感和获得感以及他们对2019年的美好愿望吧！', '1', '2018-12-31', '2018-12-31');

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
) ENGINE=InnoDB AUTO_INCREMENT=11 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of user
-- ----------------------------
INSERT INTO `user` VALUES ('1', 'admin', 'admin', '114425@qq.com', '1', '2018-12-23');
INSERT INTO `user` VALUES ('2', '111', '11', '1144@qq.com', '1', '2018-12-23');
INSERT INTO `user` VALUES ('3', '222', '222', '1144@qq.com', '1', '2018-12-23');
INSERT INTO `user` VALUES ('4', 'zxc', 'zxc', 'zxc@qq.com', '1', '2018-12-25');
INSERT INTO `user` VALUES ('5', 'oopp', 'oop', 'oop@qq.com', '1', '2018-12-25');
INSERT INTO `user` VALUES ('6', 'lisi', 'lisi', 'lisi@qq.com', '1', '2018-12-28');
INSERT INTO `user` VALUES ('10', 'wangwu', 'wangwu', 'wangwu@163.com', '1', '2018-12-31');
