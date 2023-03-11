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
-- Table structure for table `friend_requests`
--

DROP TABLE IF EXISTS `friend_requests`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `friend_requests` (
  `initiator_user_id` bigint unsigned NOT NULL,
  `target_user_id` bigint unsigned NOT NULL,
  `status` enum('requested','approved','unfriended','declined') DEFAULT NULL,
  `requested_at` datetime DEFAULT CURRENT_TIMESTAMP,
  `confirmed_at` datetime DEFAULT NULL,
  PRIMARY KEY (`initiator_user_id`,`target_user_id`),
  KEY `initiator_user_id` (`initiator_user_id`),
  KEY `target_user_id` (`target_user_id`),
  CONSTRAINT `friend_requests_ibfk_1` FOREIGN KEY (`initiator_user_id`) REFERENCES `users` (`id`),
  CONSTRAINT `friend_requests_ibfk_2` FOREIGN KEY (`target_user_id`) REFERENCES `users` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `friend_requests`
--

LOCK TABLES `friend_requests` WRITE;
/*!40000 ALTER TABLE `friend_requests` DISABLE KEYS */;
INSERT INTO `friend_requests` VALUES (1,2,'requested','1987-10-10 07:33:23','1983-01-18 01:56:05'),(1,3,'approved','2015-02-07 01:53:07','2015-09-14 16:17:12'),(1,10,'approved','1970-08-21 06:40:37','2003-12-29 23:20:55'),(4,1,'approved','1983-04-08 15:57:26','1976-12-28 23:54:58'),(5,2,'unfriended','1976-03-03 18:22:00','1996-12-03 11:29:04'),(6,3,'unfriended','2008-12-06 17:07:59','2015-11-01 08:03:23'),(7,1,'requested','1989-10-26 06:20:23','2001-08-05 16:01:03'),(8,6,'unfriended','1987-12-30 01:50:03','2001-07-09 07:39:50'),(9,7,'requested','2003-12-27 22:52:09','1998-04-18 04:41:46'),(10,11,'declined','1970-05-08 00:32:15','2007-03-22 21:08:16'),(11,14,'approved','1988-05-02 10:55:41','1985-02-09 05:04:27'),(12,11,'unfriended','1975-07-25 20:11:02','1993-06-30 12:51:09'),(13,33,'declined','2000-06-24 13:17:54','1982-04-16 16:12:48'),(14,24,'declined','2007-12-09 17:17:48','1991-05-31 12:38:33'),(15,35,'unfriended','2016-07-21 20:48:02','1982-10-06 14:54:41'),(16,36,'requested','1992-10-04 04:16:38','2001-01-24 13:54:16'),(17,37,'approved','1984-11-20 10:33:06','2018-10-07 19:43:11'),(18,38,'approved','1992-07-31 16:34:16','2008-08-03 10:13:44'),(19,39,'requested','1993-06-18 14:21:32','1976-01-16 15:57:24'),(20,30,'declined','2007-03-22 18:13:14','2010-01-06 00:06:18'),(21,31,'requested','2015-09-17 12:10:37','1986-06-30 22:29:41'),(22,32,'approved','2004-09-21 23:23:19','2003-01-27 16:11:05'),(23,33,'requested','1972-04-26 20:13:41','1991-01-03 06:58:39'),(24,34,'unfriended','2017-08-08 05:38:20','2007-09-27 03:07:27'),(25,35,'approved','2001-01-16 08:07:31','1995-04-25 06:23:27'),(26,36,'declined','2004-07-31 10:12:37','2001-06-28 18:49:10'),(27,37,'declined','2004-11-01 19:13:46','1978-05-16 19:08:26'),(28,38,'requested','1989-07-10 17:02:49','2007-03-16 20:42:05'),(29,39,'unfriended','1984-08-12 11:38:13','1971-07-07 10:40:59'),(30,10,'unfriended','1997-03-01 23:22:31','1974-08-30 23:16:26'),(31,11,'approved','2003-02-19 05:45:39','2015-02-04 15:26:16'),(32,12,'declined','2017-01-08 12:24:37','2019-02-23 04:25:58'),(33,13,'requested','2018-08-15 10:50:34','1984-08-24 14:00:01'),(34,14,'unfriended','1988-06-12 03:29:45','1998-11-28 12:07:32'),(35,15,'unfriended','1988-01-30 09:10:41','2004-06-02 14:04:53'),(36,16,'declined','1993-03-10 12:19:15','2007-05-17 03:24:16'),(37,17,'requested','1999-06-21 09:26:23','2011-08-28 05:29:49'),(38,18,'requested','1977-03-14 20:26:41','1975-09-03 17:01:54'),(39,19,'approved','2017-09-08 20:11:20','1989-12-10 18:38:58'),(40,10,'approved','2001-08-16 04:34:33','1999-01-01 14:33:52'),(41,11,'unfriended','1982-07-18 15:48:44','1989-10-14 05:48:07'),(42,12,'requested','1973-10-29 10:38:00','1973-11-02 18:26:40'),(43,13,'requested','1979-12-17 11:27:04','2004-09-28 04:54:42'),(44,14,'approved','2013-10-01 07:28:04','2006-12-12 05:43:06'),(45,15,'requested','2011-07-27 12:46:23','1988-05-07 21:59:11'),(46,16,'declined','1999-11-13 00:33:38','2016-05-02 19:19:15'),(47,17,'approved','1980-03-02 03:50:22','2010-09-22 18:58:47'),(48,18,'requested','2003-11-15 23:04:36','1991-08-05 16:56:51'),(49,19,'approved','2006-03-24 23:01:39','2010-08-04 15:00:32'),(50,10,'approved','2008-07-18 00:34:41','2016-12-25 03:18:49'),(51,11,'approved','2001-10-14 18:49:19','2012-06-08 01:36:28'),(52,12,'requested','2000-06-08 04:08:36','2010-10-12 10:27:39'),(53,13,'approved','1972-07-01 10:35:33','1972-03-03 01:26:27'),(54,14,'declined','2007-07-24 20:49:26','2014-03-10 04:56:59'),(55,15,'approved','1981-09-25 09:50:15','1991-04-22 04:24:22'),(56,16,'approved','2015-03-08 22:23:52','1996-02-08 09:41:57'),(57,17,'declined','2012-07-18 20:25:26','2008-06-10 16:46:01');
/*!40000 ALTER TABLE `friend_requests` ENABLE KEYS */;
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
