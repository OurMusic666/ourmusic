/*
Navicat MySQL Data Transfer

Source Server         : mysql
Source Server Version : 50027
Source Host           : localhost:3306
Source Database       : music

Target Server Type    : MYSQL
Target Server Version : 50027
File Encoding         : 65001

Date: 2018-08-29 14:25:55
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for album
-- ----------------------------
DROP TABLE IF EXISTS `album`;
CREATE TABLE `album` (
  `album_id` int(11) NOT NULL auto_increment,
  `album_name` varchar(50) NOT NULL,
  `singer_id` int(11) default NULL,
  PRIMARY KEY  (`album_id`),
  KEY `FK_Asingerid` (`singer_id`),
  CONSTRAINT `FK_Asingerid` FOREIGN KEY (`singer_id`) REFERENCES `singer` (`singer_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Table structure for music
-- ----------------------------
DROP TABLE IF EXISTS `music`;
CREATE TABLE `music` (
  `music_id` int(11) NOT NULL auto_increment,
  `music_name` varchar(50) NOT NULL,
  `singer_id` int(11) default NULL,
  `album_id` int(11) default NULL,
  `music_pic` varchar(255) default NULL,
  `music_url` varchar(255) default NULL,
  `music_lyr` varchar(80) default NULL,
  `music_isMember` int(11) default NULL,
  PRIMARY KEY  (`music_id`),
  KEY `FK_Msingerid` (`singer_id`),
  KEY `FK_Malbumid` (`album_id`),
  CONSTRAINT `FK_Msingerid` FOREIGN KEY (`singer_id`) REFERENCES `singer` (`singer_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Table structure for reply
-- ----------------------------
DROP TABLE IF EXISTS `reply`;
CREATE TABLE `reply` (
  `reply_id` int(11) NOT NULL auto_increment,
  `reply_desc` varchar(10000) NOT NULL,
  `reply_date` varchar(20) NOT NULL,
  `music_id` int(11) default NULL,
  `video_id` int(11) default NULL,
  `user_id` int(11) default NULL,
  PRIMARY KEY  (`reply_id`),
  KEY `FK_Ruserid` (`user_id`),
  KEY `FK_Rmusicid` (`music_id`),
  KEY `FK_Rvideoid` (`video_id`),
  CONSTRAINT `FK_Rmusicid` FOREIGN KEY (`music_id`) REFERENCES `music` (`music_id`),
  CONSTRAINT `FK_Ruserid` FOREIGN KEY (`user_id`) REFERENCES `user` (`user_id`),
  CONSTRAINT `FK_Rvideoid` FOREIGN KEY (`video_id`) REFERENCES `video` (`video_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Table structure for sheet
-- ----------------------------
DROP TABLE IF EXISTS `sheet`;
CREATE TABLE `sheet` (
  `sheet_id` int(11) NOT NULL,
  `sheet_name` varchar(255) NOT NULL,
  `user_id` int(11) NOT NULL,
  PRIMARY KEY  (`sheet_id`),
  KEY `FK_Suserid` (`user_id`),
  CONSTRAINT `FK_Suserid` FOREIGN KEY (`user_id`) REFERENCES `user` (`user_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Table structure for sheetmusic
-- ----------------------------
DROP TABLE IF EXISTS `sheetmusic`;
CREATE TABLE `sheetmusic` (
  `sheet_id` int(11) default NULL,
  `music_id` int(11) default NULL,
  KEY `FK_sheetid` (`sheet_id`),
  KEY `FK_music_id` (`music_id`),
  CONSTRAINT `FK_music_id` FOREIGN KEY (`music_id`) REFERENCES `music` (`music_id`),
  CONSTRAINT `FK_sheetid` FOREIGN KEY (`sheet_id`) REFERENCES `sheet` (`sheet_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Table structure for singer
-- ----------------------------
DROP TABLE IF EXISTS `singer`;
CREATE TABLE `singer` (
  `singer_id` int(11) NOT NULL auto_increment,
  `singer_name` varchar(20) default NULL,
  `singer_desc` varchar(200) default NULL,
  PRIMARY KEY  (`singer_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Table structure for user
-- ----------------------------
DROP TABLE IF EXISTS `user`;
CREATE TABLE `user` (
  `user_id` int(11) NOT NULL auto_increment,
  `user_name` varchar(30) NOT NULL,
  `user_pwd` varchar(35) NOT NULL,
  `user_email` varchar(20) NOT NULL,
  `user_isMember` int(11) default '0',
  PRIMARY KEY  (`user_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Table structure for usermusic
-- ----------------------------
DROP TABLE IF EXISTS `usermusic`;
CREATE TABLE `usermusic` (
  `user_id` int(11) default NULL,
  `music_id` int(11) default NULL,
  KEY `FK_Uuserid` (`user_id`),
  KEY `FK_Umusicid` (`music_id`),
  CONSTRAINT `FK_Umusicid` FOREIGN KEY (`music_id`) REFERENCES `music` (`music_id`),
  CONSTRAINT `FK_Uuserid` FOREIGN KEY (`user_id`) REFERENCES `user` (`user_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Table structure for video
-- ----------------------------
DROP TABLE IF EXISTS `video`;
CREATE TABLE `video` (
  `video_id` int(11) NOT NULL auto_increment,
  `video_name` varchar(50) NOT NULL,
  `singer_id` int(11) default NULL,
  PRIMARY KEY  (`video_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
