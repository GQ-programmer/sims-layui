/*
SQLyog Ultimate v12.09 (64 bit)
MySQL - 5.7.35-log : Database - sims
*********************************************************************
*/

/*!40101 SET NAMES utf8 */;

/*!40101 SET SQL_MODE=''*/;

/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;
CREATE DATABASE /*!32312 IF NOT EXISTS*/`sims` /*!40100 DEFAULT CHARACTER SET utf8 */;

USE `sims`;

/*Table structure for table `s_admin` */

DROP TABLE IF EXISTS `s_admin`;

CREATE TABLE `s_admin` (
  `aid` int(11) NOT NULL AUTO_INCREMENT,
  `username` varchar(50) DEFAULT NULL,
  `password` varchar(50) DEFAULT NULL,
  `sex` varchar(10) DEFAULT NULL,
  `tel` varchar(50) DEFAULT NULL,
  `name` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`aid`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8;

/*Data for the table `s_admin` */

insert  into `s_admin`(`aid`,`username`,`password`,`sex`,`tel`,`name`) values (1,'201942308837','123456','男','17633820414','张高强'),(2,'小仙女','123456','女','12345678910','ZXX');

/*Table structure for table `s_class` */

DROP TABLE IF EXISTS `s_class`;

CREATE TABLE `s_class` (
  `c_id` int(11) NOT NULL AUTO_INCREMENT,
  `c_classId` varchar(50) DEFAULT NULL,
  `c_className` varchar(50) DEFAULT NULL,
  `c_counsellor` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`c_id`)
) ENGINE=InnoDB AUTO_INCREMENT=11 DEFAULT CHARSET=utf8;

/*Data for the table `s_class` */

insert  into `s_class`(`c_id`,`c_classId`,`c_className`,`c_counsellor`) values (1,'2019001','19软件工程1班','乔圣宸'),(2,'2019002','19软件工程2班','乔圣宸'),(3,'2019003','19软件工程3班','乔圣宸'),(4,'2019004','19软件工程4班','乔圣宸'),(8,'2019005','19软件工程5班','乔圣宸');

/*Table structure for table `s_classgrade` */

DROP TABLE IF EXISTS `s_classgrade`;

CREATE TABLE `s_classgrade` (
  `cg_id` int(11) NOT NULL AUTO_INCREMENT,
  `c_classId` varchar(50) DEFAULT NULL,
  `c_className` varchar(50) DEFAULT NULL,
  `class_grade` int(11) DEFAULT NULL,
  `update_time` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`cg_id`)
) ENGINE=InnoDB AUTO_INCREMENT=13 DEFAULT CHARSET=utf8;

/*Data for the table `s_classgrade` */

insert  into `s_classgrade`(`cg_id`,`c_classId`,`c_className`,`class_grade`,`update_time`) values (1,'2019002','19软件工程2班',8,'2022-06-21 18:30:45秒 星期二'),(8,'2019001','19软件工程1班',8,'2022-06-21 18:30:45秒 星期二'),(10,'2019003','19软件工程3班',8,'2022-06-21 18:31:35秒 星期二'),(11,'2019004','19软件工程4班',8,'2022-06-21 18:31:40秒 星期二'),(12,'2019005','19软件工程5班',9,'2022-06-21 18:31:50秒 星期二');

/*Table structure for table `s_dormgrade` */

DROP TABLE IF EXISTS `s_dormgrade`;

CREATE TABLE `s_dormgrade` (
  `dg_id` int(11) NOT NULL AUTO_INCREMENT,
  `d_dormbuilding` varchar(50) DEFAULT NULL,
  `d_dormitoryid` varchar(50) DEFAULT NULL,
  `dorm_grade` int(11) DEFAULT NULL,
  `update_time` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`dg_id`)
) ENGINE=InnoDB AUTO_INCREMENT=7 DEFAULT CHARSET=utf8;

/*Data for the table `s_dormgrade` */

insert  into `s_dormgrade`(`dg_id`,`d_dormbuilding`,`d_dormitoryid`,`dorm_grade`,`update_time`) values (1,'南6','210',9,'2022-06-21 16:14:57秒 星期二'),(2,'南20','410',8,'2022-06-21 16:14:54秒 星期二'),(4,'南6','211',9,'2022-06-21 18:32:12秒 星期二'),(5,'南6','212',7,'2022-06-21 18:32:18秒 星期二'),(6,'南6','213',8,'2022-06-21 18:32:51秒 星期二');

/*Table structure for table `s_dormitory` */

DROP TABLE IF EXISTS `s_dormitory`;

CREATE TABLE `s_dormitory` (
  `d_id` int(11) NOT NULL AUTO_INCREMENT,
  `d_dormbuilding` varchar(50) DEFAULT NULL,
  `d_dormitoryid` varchar(50) DEFAULT NULL,
  `d_bedtotal` int(11) DEFAULT NULL,
  `d_bed` int(11) DEFAULT NULL,
  `d_dormitoryhead` varchar(50) DEFAULT NULL,
  `d_phone` varchar(50) DEFAULT NULL,
  `d_dormitorycategory` varchar(5) DEFAULT NULL,
  PRIMARY KEY (`d_id`)
) ENGINE=InnoDB AUTO_INCREMENT=8 DEFAULT CHARSET=utf8;

/*Data for the table `s_dormitory` */

insert  into `s_dormitory`(`d_id`,`d_dormbuilding`,`d_dormitoryid`,`d_bedtotal`,`d_bed`,`d_dormitoryhead`,`d_phone`,`d_dormitorycategory`) values (1,'南6','210',8,8,'张玉东','12345678910','男寝'),(2,'南6','212',8,8,'张xx','12345678910','男寝'),(3,'南6','208',8,6,'李xx','12345678910','男寝'),(4,'南6','211',8,8,'陈xx','12345678910','男寝'),(6,'南20','410',6,6,'张XX','12345678910','女寝'),(7,'南6','209',8,8,'','5752727','男寝');

/*Table structure for table `s_dormrepair` */

DROP TABLE IF EXISTS `s_dormrepair`;

CREATE TABLE `s_dormrepair` (
  `r_id` int(11) NOT NULL AUTO_INCREMENT,
  `d_dormbuilding` varchar(50) DEFAULT NULL,
  `d_dormitoryid` varchar(50) DEFAULT NULL,
  `r_name` varchar(50) DEFAULT NULL,
  `r_reason` varchar(100) DEFAULT NULL,
  `repair_time` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`r_id`)
) ENGINE=InnoDB AUTO_INCREMENT=8 DEFAULT CHARSET=utf8;

/*Data for the table `s_dormrepair` */

insert  into `s_dormrepair`(`r_id`,`d_dormbuilding`,`d_dormitoryid`,`r_name`,`r_reason`,`repair_time`) values (2,'南20','211','张三','水管',NULL),(3,'南6','213','张三','水管',NULL),(5,'南6','212','李四','水管',NULL),(6,'南6','214','王二','空调',NULL),(7,'南6','215','李四','水管',NULL);

/*Table structure for table `s_log` */

DROP TABLE IF EXISTS `s_log`;

CREATE TABLE `s_log` (
  `l_id` int(11) NOT NULL AUTO_INCREMENT,
  `username` varchar(50) DEFAULT NULL,
  `name` varchar(10) DEFAULT NULL,
  `sex` varchar(10) DEFAULT NULL,
  `tel` varchar(50) DEFAULT NULL,
  `login_time` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`l_id`)
) ENGINE=InnoDB AUTO_INCREMENT=10 DEFAULT CHARSET=utf8;

/*Data for the table `s_log` */

insert  into `s_log`(`l_id`,`username`,`name`,`sex`,`tel`,`login_time`) values (3,'201942308837','张高强','男','17633820414','2022-06-22 00:05:35秒 星期三'),(4,'201942308837','张高强','男','17633820414','2022-06-22 00:06:14秒 星期三'),(5,'201942308837','张高强','男','17633820414','2022-06-22 00:11:58秒 星期三'),(6,'201942308837','张高强','男','17633820414','2022-06-22 00:15:01秒 星期三'),(7,'小仙女','ZXX','女','12345678910','2022-06-22 00:16:35秒 星期三'),(8,'201942308837','张高强','男','17633820414','2022-06-22 11:36:58秒 星期三'),(9,'201942308837','张高强','男','17633820414','2022-06-22 16:07:00秒 星期三');

/*Table structure for table `s_stu` */

DROP TABLE IF EXISTS `s_stu`;

CREATE TABLE `s_stu` (
  `sid` varchar(100) NOT NULL,
  `sname` varchar(50) DEFAULT NULL,
  `sex` varchar(50) DEFAULT NULL,
  `birthday` varchar(50) DEFAULT NULL,
  `address` varchar(50) DEFAULT NULL,
  `tel` varchar(100) DEFAULT NULL,
  `cname` varchar(100) DEFAULT NULL,
  `dname` varchar(100) DEFAULT NULL,
  PRIMARY KEY (`sid`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `s_stu` */

insert  into `s_stu`(`sid`,`sname`,`sex`,`birthday`,`address`,`tel`,`cname`,`dname`) values ('201156489791','范文斌','男','2000','焦作','12345678910','19软件工程2班','南6#104'),('201156489792','陈俊卓','男','20001','洛阳','12345678910','19软件工程2班','南6#104'),('201156489798','陈俊卓','男','','洛阳','12345678910','19软件工程2班','南6#104');

/*Table structure for table `s_visitor` */

DROP TABLE IF EXISTS `s_visitor`;

CREATE TABLE `s_visitor` (
  `v_id` int(11) NOT NULL AUTO_INCREMENT,
  `v_name` varchar(10) DEFAULT NULL,
  `v_phone` varchar(20) DEFAULT NULL,
  `v_dormbuilding` varchar(20) DEFAULT NULL,
  `v_dormitoryid` varchar(10) DEFAULT NULL,
  `create_time` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`v_id`)
) ENGINE=InnoDB AUTO_INCREMENT=8 DEFAULT CHARSET=utf8;

/*Data for the table `s_visitor` */

insert  into `s_visitor`(`v_id`,`v_name`,`v_phone`,`v_dormbuilding`,`v_dormitoryid`,`create_time`) values (1,'张三','12345678910','南6','210',NULL),(2,'李四','12345678910','南6','510',NULL),(7,'王五','12345678910','南6','211','2022-06-21 21:25:16秒 星期二');

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;
