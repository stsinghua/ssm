/*
Navicat MySQL Data Transfer

Source Server         : localhost
Source Server Version : 50726
Source Host           : localhost:3306
Source Database       : ssm_root

Target Server Type    : MYSQL
Target Server Version : 50726
File Encoding         : 65001

Date: 2019-08-13 01:06:13
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for tb_customer
-- ----------------------------
DROP TABLE IF EXISTS `tb_customer`;
CREATE TABLE `tb_customer` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(100) DEFAULT NULL,
  `telephone` varchar(100) DEFAULT NULL,
  `address` varchar(100) DEFAULT NULL,
  `remark` varchar(100) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=8 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of tb_customer
-- ----------------------------
INSERT INTO `tb_customer` VALUES ('1', '苹果', '13800138000', '北京', '测试');
INSERT INTO `tb_customer` VALUES ('2', '香蕉', '13800138000', '北京', '测试');
INSERT INTO `tb_customer` VALUES ('3', '芒果', '13800138000', '北京', '测试');
INSERT INTO `tb_customer` VALUES ('4', '西瓜', '13800138000', '北京', '测试');
INSERT INTO `tb_customer` VALUES ('5', '番茄', '13800138000', '北京', '测试');
INSERT INTO `tb_customer` VALUES ('6', '土豆', '13800138000', '北京', '测试');
INSERT INTO `tb_customer` VALUES ('7', '榴莲', '13800138001', '北京', '测试');
