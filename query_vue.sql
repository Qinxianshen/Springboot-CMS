/*
Navicat MySQL Data Transfer

Source Server         : qin
Source Server Version : 80018
Source Host           : localhost:3306
Source Database       : query_vue

Target Server Type    : MYSQL
Target Server Version : 80018
File Encoding         : 65001

Date: 2019-12-26 18:02:33
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for chartdefinition
-- ----------------------------
DROP TABLE IF EXISTS `chartdefinition`;
CREATE TABLE `chartdefinition` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(32) DEFAULT NULL,
  `chartType` varchar(32) DEFAULT NULL,
  `dimisionType` varchar(32) DEFAULT NULL,
  `frequence` varchar(32) DEFAULT NULL,
  `datasouceName` varchar(32) DEFAULT NULL,
  `status` int(11) DEFAULT NULL,
  `createTime` varchar(255) DEFAULT NULL,
  `updateTime` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

-- ----------------------------
-- Records of chartdefinition
-- ----------------------------
INSERT INTO `chartdefinition` VALUES ('1', '测试', '柱状图', '枚举', '日', '数据源', '0', '2019-11-13T06:39:26.000+0000', '2019-11-13T06:39:26.000+0000');
INSERT INTO `chartdefinition` VALUES ('2', '测试2', '柱状图', '枚举', '日', '数据源', '0', '2019-11-13T06:39:26.000+0000', '2019-11-13T06:39:26.000+0000');

-- ----------------------------
-- Table structure for datadictionary
-- ----------------------------
DROP TABLE IF EXISTS `datadictionary`;
CREATE TABLE `datadictionary` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `dictionaryNum` varchar(32) DEFAULT NULL,
  `dictionaryName` varchar(32) DEFAULT NULL,
  `dictionaryType` varchar(32) DEFAULT NULL,
  `fatherNode` varchar(32) DEFAULT NULL,
  `sqlKey` varchar(32) DEFAULT NULL,
  `status` int(11) DEFAULT NULL,
  `datasouce` int(11) DEFAULT NULL,
  `createTime` varchar(255) DEFAULT NULL,
  `updateTime` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

-- ----------------------------
-- Records of datadictionary
-- ----------------------------
INSERT INTO `datadictionary` VALUES ('1', '规则列表测试', '规则列表', '字典定义', '1', '暂无', '0', '3', '2019-11-13T06:39:26.000+0000', '2019-11-13T06:39:26.000+0000');
INSERT INTO `datadictionary` VALUES ('2', '规则列表测试2', '规则列表', '字典定义', '1', '暂无', '0', '3', '2019-11-13T06:39:26.000+0000', '2019-11-13T06:39:26.000+0000');

-- ----------------------------
-- Table structure for datasouce
-- ----------------------------
DROP TABLE IF EXISTS `datasouce`;
CREATE TABLE `datasouce` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `datasouceName` varchar(32) DEFAULT NULL,
  `datasouceType` varchar(32) DEFAULT NULL,
  `LinkedUrl` varchar(255) DEFAULT NULL,
  `database` varchar(255) DEFAULT NULL,
  `createTime` varchar(255) DEFAULT NULL,
  `updateTime` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

-- ----------------------------
-- Records of datasouce
-- ----------------------------
INSERT INTO `datasouce` VALUES ('1', '数据源', 'oracle', 'jdbc:oracle:thin:undefined', 'RULE_ENGINE_DEV2', '2019-11-13 14:35:06', '2019-11-13 09:56:04');
INSERT INTO `datasouce` VALUES ('2', '数据源2', 'oracle', 'jdbc:oracle:thin:undefined', 'RULE_ENGINE_DEV2', '2019-11-13 14:35:06', '2019-11-13 09:56:04');

-- ----------------------------
-- Table structure for echart
-- ----------------------------
DROP TABLE IF EXISTS `echart`;
CREATE TABLE `echart` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `datatime` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci DEFAULT NULL,
  `data1` int(11) DEFAULT NULL,
  `data2` int(11) DEFAULT NULL,
  `data3` int(11) DEFAULT NULL,
  `data4` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=14 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

-- ----------------------------
-- Records of echart
-- ----------------------------
INSERT INTO `echart` VALUES ('1', '2019-12-1', '524', '321', '103', '785');
INSERT INTO `echart` VALUES ('2', '2019-12-2', '652', '425', '163', '845');
INSERT INTO `echart` VALUES ('3', '2019-12-3', '696', '486', '204', '862');
INSERT INTO `echart` VALUES ('4', '2019-12-4', '741', '521', '247', '897');
INSERT INTO `echart` VALUES ('5', '2019-12-5', '789', '563', '286', '923');
INSERT INTO `echart` VALUES ('6', '2019-12-6', '796', '620', '320', '965');
INSERT INTO `echart` VALUES ('7', '2019-12-7', '812', '426', '568', '852');
INSERT INTO `echart` VALUES ('8', '2019-12-8', '635', '523', '685', '756');
INSERT INTO `echart` VALUES ('9', '2019-12-9', '562', '432', '585', '852');
INSERT INTO `echart` VALUES ('10', '2019-12-10', '585', '452', '748', '952');
INSERT INTO `echart` VALUES ('11', '2019-12-11', '745', '582', '965', '456');
INSERT INTO `echart` VALUES ('12', '2019-12-12', '854', '652', '1052', '321');

-- ----------------------------
-- Table structure for querydefination
-- ----------------------------
DROP TABLE IF EXISTS `querydefination`;
CREATE TABLE `querydefination` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `definationName` varchar(32) DEFAULT NULL,
  `queryNum` varchar(32) DEFAULT NULL,
  `datasouceName` varchar(32) DEFAULT NULL,
  `status` int(11) DEFAULT NULL,
  `pageSize` int(11) DEFAULT NULL,
  `createTime` varchar(255) DEFAULT NULL,
  `updateTime` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

-- ----------------------------
-- Records of querydefination
-- ----------------------------
INSERT INTO `querydefination` VALUES ('1', 'ruleList', '规则定义表', '数据源', '0', '10', '2019-11-13 14:35:06', '2019-11-13 14:35:06');
INSERT INTO `querydefination` VALUES ('2', 'ruleList2', '规则定义表', '数据源', '0', '10', '2019-11-13 14:35:06', '2019-11-13 14:35:06');
