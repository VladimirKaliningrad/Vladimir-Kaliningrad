-- MySQL dump 10.13  Distrib 8.0.32, for Win64 (x86_64)
--
-- Host: localhost    Database: vk
-- ------------------------------------------------------
-- Server version	8.0.32

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!50503 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `profiles`
--

DROP TABLE IF EXISTS `profiles`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `profiles` (
  `user_id` bigint unsigned NOT NULL,
  `gender` char(1) DEFAULT NULL,
  `birthday` date DEFAULT NULL,
  `photo_id` bigint unsigned DEFAULT NULL,
  `created_at` datetime DEFAULT CURRENT_TIMESTAMP,
  `hometown` varchar(100) DEFAULT NULL,
  UNIQUE KEY `user_id` (`user_id`),
  KEY `photo_id` (`photo_id`),
  CONSTRAINT `profiles_ibfk_1` FOREIGN KEY (`user_id`) REFERENCES `users` (`id`) ON DELETE RESTRICT ON UPDATE CASCADE,
  CONSTRAINT `profiles_ibfk_2` FOREIGN KEY (`photo_id`) REFERENCES `media` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `profiles`
--

LOCK TABLES `profiles` WRITE;
/*!40000 ALTER TABLE `profiles` DISABLE KEYS */;
INSERT INTO `profiles` VALUES (1,'f','1976-11-08',1,'1970-01-18 03:54:01','Adriannaport'),(2,'f','2011-12-20',2,'1994-11-06 23:56:10','North Nettieton'),(3,'m','1994-06-15',3,'1975-11-27 02:27:11','Padbergtown'),(4,'f','1979-11-07',4,'1994-04-12 04:31:49','Port Rupertville'),(5,'f','1976-04-19',5,'1976-07-05 02:25:30','Spencerfort'),(6,'f','1983-09-07',6,'1981-06-20 15:54:43','South Woodrowmouth'),(7,'m','2014-07-31',7,'1997-06-21 07:52:05','South Jeffereyshire'),(8,'f','1975-03-26',8,'2008-08-18 18:23:25','Howeside'),(9,'f','1982-11-01',9,'2014-09-29 01:22:26','Loweborough'),(10,'m','1977-05-14',10,'1980-03-17 18:17:45','New Nellaside'),(11,'m','1988-10-28',11,'2011-08-22 08:31:06','New Skylar'),(12,'f','1994-02-07',12,'2015-08-04 16:34:50','South Dameontown'),(13,'f','1998-08-08',13,'1978-02-12 03:14:55','North Terencemouth'),(14,'f','1973-11-16',14,'2015-03-13 03:01:16','West Wilfordshire'),(15,'m','1979-08-20',15,'1983-08-13 03:48:56','North Xavier'),(16,'m','1997-03-17',16,'1989-09-08 23:17:00','Port Kayton'),(17,'m','2015-02-25',17,'1992-10-29 05:38:24','New Odie'),(18,'f','2011-04-05',18,'1981-08-22 06:53:53','South Newton'),(19,'f','1981-01-24',19,'1975-08-17 04:48:38','Port Jovanyview'),(20,'f','2010-03-12',20,'2008-02-11 09:39:28','Port Adolfoville'),(21,'f','1971-02-01',21,'1972-09-21 21:31:09','Kleinbury'),(22,'f','2000-08-30',22,'1977-03-15 13:44:30','South Ciara'),(23,'f','1991-08-17',23,'1991-10-15 01:01:05','Magdalenahaven'),(24,'m','2008-08-26',24,'2016-06-23 23:04:39','Port Jettchester'),(25,'f','2005-03-19',25,'2002-11-21 22:26:09','West Juneview'),(26,'m','1970-03-17',26,'1995-06-07 00:37:46','South Jose'),(27,'m','2011-01-12',27,'1992-03-18 22:28:05','Christinahaven'),(28,'m','2000-01-22',28,'2003-06-16 16:15:57','Lednerstad'),(29,'f','1988-02-16',29,'1988-02-09 12:47:21','Lisandrofort'),(30,'m','1977-08-16',30,'1977-03-09 23:28:37','Sethfort'),(31,'f','1978-11-28',31,'2008-01-31 16:16:06','Tessieport'),(32,'f','2004-02-06',32,'1995-11-19 13:46:21','Lake Reilly'),(33,'f','2000-05-07',33,'1991-11-21 16:14:32','East Rosalinda'),(34,'f','1988-11-22',34,'2008-08-17 22:20:26','Lake Henderson'),(35,'f','2008-08-28',35,'1991-07-07 07:37:17','Melanyport'),(36,'m','2004-02-05',36,'1973-11-04 03:21:50','Bryanaland'),(37,'m','2012-01-21',37,'2014-11-25 14:47:51','South Lorenstad'),(38,'f','1999-10-17',38,'1990-04-29 04:32:11','Rocioport'),(39,'f','1991-02-16',39,'1976-09-18 06:18:30','New Petra'),(40,'m','1993-08-26',40,'1976-10-03 19:24:42','Wizabury'),(41,'m','2005-07-31',41,'1997-04-11 10:03:16','Port Elton'),(42,'m','2000-01-08',42,'1971-02-20 18:14:51','New Hannahchester'),(43,'f','1996-01-09',43,'1999-05-18 06:05:39','North Deion'),(44,'f','1976-02-16',44,'1997-09-01 08:44:31','Lake Johnpaulport'),(45,'f','2018-10-20',45,'1995-04-02 18:37:27','East Ivybury'),(46,'m','1981-03-05',46,'1978-01-04 19:53:38','West Zula'),(47,'m','1973-06-27',47,'1992-08-24 13:18:15','Medatown'),(48,'f','1974-11-15',48,'1992-12-01 00:54:49','Medhursthaven'),(49,'f','1987-11-04',49,'1973-10-23 18:53:51','Kileyton'),(50,'m','1971-05-09',50,'1974-01-17 03:57:15','East Electaland'),(51,'m','1985-01-12',51,'1998-06-20 11:06:11','Isabellaland'),(52,'m','1989-06-05',52,'1986-09-23 20:01:28','Lake Houston'),(53,'f','2010-12-11',53,'2002-08-02 09:00:39','Lake Mohammad'),(54,'m','1975-05-29',54,'1973-09-21 12:52:05','Odessaside'),(55,'m','1996-06-27',55,'1974-07-07 05:47:32','West Jordy'),(56,'m','1976-08-28',56,'1994-10-13 21:37:38','Laceybury'),(57,'f','2016-05-22',57,'2007-10-31 21:36:34','Port Zelmastad'),(58,'f','1999-10-10',58,'2003-06-03 17:27:10','Vivienberg'),(59,'m','2008-12-12',59,'2015-11-19 11:12:16','West Sibyl'),(60,'m','1999-09-14',60,'1981-02-06 04:05:26','Antwantown'),(61,'m','2005-02-09',61,'1972-07-02 08:34:26','New Nonaview'),(62,'f','1993-07-09',62,'1996-12-19 03:17:29','Hilarioland'),(63,'f','2012-04-04',63,'1978-12-23 11:06:08','South Skylarmouth'),(64,'f','2005-10-07',64,'2010-10-31 01:21:49','West Bernadine'),(65,'f','1992-11-02',65,'1971-10-15 06:36:08','New Kacie'),(66,'m','2009-10-12',66,'1993-10-20 16:49:29','New Doylefort'),(67,'f','1982-08-16',67,'1990-01-23 22:14:55','West Kellihaven'),(68,'f','2006-05-13',68,'1997-04-29 02:49:42','East Ottis'),(69,'m','2003-09-20',69,'1987-02-12 08:27:11','Busterfort'),(70,'f','2011-09-09',70,'2017-05-04 11:35:24','Kassandrachester'),(71,'f','1979-10-23',71,'1993-10-23 12:37:59','North Estelle'),(72,'f','1978-07-10',72,'1990-09-16 18:57:43','Sonyachester'),(73,'m','1993-07-13',73,'1992-08-10 05:04:44','West Mozelle'),(74,'m','1977-12-04',74,'2009-09-19 18:30:49','South Kayleeton'),(75,'f','1981-08-27',75,'1974-12-15 01:52:32','Port Abdul'),(76,'f','1998-02-10',76,'2012-05-22 12:05:10','Lake Kellyland'),(77,'m','1973-10-17',77,'1984-06-22 12:10:24','West Alice'),(78,'f','2018-10-25',78,'1994-03-02 05:14:12','New Danykaberg'),(79,'m','1990-06-28',79,'2010-03-06 20:16:13','Port Nickolaschester'),(80,'m','2006-10-08',80,'2007-10-20 17:07:41','South Marleeburgh'),(81,'m','1972-02-09',81,'2012-02-18 04:33:04','South Elizabethside'),(82,'f','1971-09-28',82,'1979-09-10 00:00:36','Volkmanberg'),(83,'m','1987-11-02',83,'1994-02-03 03:15:34','South Bernita'),(84,'f','2019-03-20',84,'1979-09-08 02:29:57','Rennerfort'),(85,'m','2013-06-30',85,'2003-12-31 09:46:13','New Dagmar'),(86,'f','1974-12-29',86,'1978-05-13 16:58:53','West Cade'),(87,'f','2006-04-20',87,'2006-10-20 00:25:45','New Alycia'),(88,'f','1995-12-10',88,'2000-04-28 19:55:37','Hermanmouth'),(89,'f','1972-05-13',89,'2010-09-05 17:54:37','East Aliyah'),(90,'m','2006-08-02',90,'2007-10-11 03:49:30','Majorland'),(91,'f','1988-11-18',91,'2000-05-01 02:03:19','Sydneeport'),(92,'f','1983-07-24',92,'1977-10-20 00:24:36','Trinityland'),(93,'m','2015-04-16',93,'2003-01-06 17:49:50','South Noeliaton'),(94,'f','2016-09-20',94,'1990-07-07 06:28:12','South Kirstin'),(95,'m','1980-10-15',95,'1974-09-15 21:30:36','West Coryville'),(96,'m','1984-10-02',96,'1972-05-04 20:10:50','Hettingerside'),(97,'f','1971-12-10',97,'2005-07-14 15:03:46','Dooleyland'),(98,'f','2005-09-07',98,'1990-04-06 05:48:14','Lockmantown'),(99,'f','1996-10-09',99,'1981-09-24 02:19:44','Lake Lora'),(100,'f','1990-02-11',100,'1974-08-23 15:31:47','Port Mable');
/*!40000 ALTER TABLE `profiles` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2023-03-11 22:50:36
