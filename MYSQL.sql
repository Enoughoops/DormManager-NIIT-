/*
SQLyog 企业版 - MySQL GUI v8.14 
MySQL - 6.0.11-alpha-community : Database - db_dorm
*********************************************************************
*/


/*!40101 SET NAMES utf8 */;

/*!40101 SET SQL_MODE=''*/;

/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;
CREATE DATABASE `db_dorm` ;

USE `db_dorm`;

/*管理员表 */

DROP TABLE IF EXISTS `t_admin`;

CREATE TABLE `t_admin` (
  `adminId` int(11) NOT NULL AUTO_INCREMENT,
  `userName` varchar(20) DEFAULT NULL,
  `password` varchar(20) DEFAULT NULL,
  `name` varchar(20) DEFAULT NULL,
  `sex` varchar(10) DEFAULT NULL,
  `tel` varchar(20) DEFAULT NULL,
  PRIMARY KEY (`adminId`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8;

/*插入管理员信息*/

insert  into `t_admin`(`adminId`,`userName`,`password`,`name`,`sex`,`tel`) values (1,'admin','zxc','Enough','男','123');

/*宿舍信息表*/

DROP TABLE IF EXISTS `t_dorm`;

CREATE TABLE `t_dorm` (
  `dormId` int(11) NOT NULL AUTO_INCREMENT,
  `dormBuildId` int(11) DEFAULT NULL,
  `dormName` varchar(20) DEFAULT NULL,
  `dormType` varchar(20) DEFAULT NULL,
  `dormNumber` int(11) DEFAULT NULL,
  `dormTel` varchar(20) DEFAULT NULL,
  PRIMARY KEY (`dormId`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8;


insert  into `t_dorm`(`dormId`,`dormBuildId`,`dormName`,`dormType`,`dormNumber`,`dormTel`) values (1,1,'401','6',1,'123');
insert  into `t_dorm`(`dormId`,`dormBuildId`,`dormName`,`dormType`,`dormNumber`,`dormTel`) values (2,1,'401','8',2,'123');
/*宿舍楼信息表 */

DROP TABLE IF EXISTS `t_dormbuild`;

CREATE TABLE `t_dormbuild` (
  `dormBuildId` int(11) NOT NULL AUTO_INCREMENT,
  `dormBuildName` varchar(20) DEFAULT NULL,
  `dormBuildDetail` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`dormBuildId`)
) ENGINE=InnoDB AUTO_INCREMENT=9 DEFAULT CHARSET=utf8;

/*Data for the table `t_dormbuild` */

insert  into `t_dormbuild`(`dormBuildId`,`dormBuildName`,`dormBuildDetail`) values (1,'汇园1','女生宿舍'),(2,'汇园2','这是2栋'),(3,'汇园3','');

/*舍长表 */

DROP TABLE IF EXISTS `t_dormmanager`;

CREATE TABLE `t_dormmanager` (
  `dormManId` int(11) NOT NULL AUTO_INCREMENT,
  `userName` varchar(20) DEFAULT NULL,
  `password` varchar(20) DEFAULT NULL,
  `dormBuildId` int(11) DEFAULT NULL,
  `name` varchar(20) DEFAULT NULL,
  `sex` varchar(20) DEFAULT NULL,
  `tel` varchar(20) DEFAULT NULL,
  PRIMARY KEY (`dormManId`)
) ENGINE=InnoDB AUTO_INCREMENT=10 DEFAULT CHARSET=utf8;

/*插入舍长表的数据` */

insert  into `t_dormmanager`(`dormManId`,`userName`,`password`,`dormBuildId`,`name`,`sex`,`tel`) values (1,'enough','zxc',411,'王驾臣','男','123');








/*学生表 */
DROP TABLE IF EXISTS `t_student`;

CREATE TABLE `t_student` (
  `studentId` int(11) NOT NULL AUTO_INCREMENT,
  `stuNum` varchar(20) DEFAULT NULL,
  `password` varchar(20) DEFAULT NULL,
  `name` varchar(20) DEFAULT NULL,
  `dormBuildId` int(11) DEFAULT NULL,
  `dormName` varchar(11) DEFAULT NULL,
  `sex` varchar(10) DEFAULT NULL,
  `tel` varchar(15) DEFAULT NULL,
  `class` varchar(15) DEFAULT NULL,
  PRIMARY KEY (`studentId`)
) ENGINE=InnoDB AUTO_INCREMENT=32 DEFAULT CHARSET=utf8;

/*学生表 */

insert  into `t_student`(`studentId`,`stuNum`,`password`,`name`,`dormBuildId`,`dormName`,`sex`,`tel`) values (1,'201340704341','zxc','Enough',4,'11','男','110','J01'),(2,'201340704341','123','Ravi',5,'11','男','123','J02');

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;
