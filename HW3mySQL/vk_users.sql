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
-- Table structure for table `users`
--

DROP TABLE IF EXISTS `users`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `users` (
  `id` bigint unsigned NOT NULL AUTO_INCREMENT,
  `firstname` varchar(50) DEFAULT NULL,
  `lastname` varchar(50) DEFAULT NULL COMMENT 'Фамиль',
  `email` varchar(120) DEFAULT NULL,
  `phone` bigint DEFAULT NULL,
  PRIMARY KEY (`id`),
  UNIQUE KEY `email` (`email`),
  KEY `users_phone_idx` (`phone`),
  KEY `users_firstname_lastname_idx` (`firstname`,`lastname`)
) ENGINE=InnoDB AUTO_INCREMENT=101 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci COMMENT='юзеры';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `users`
--

LOCK TABLES `users` WRITE;
/*!40000 ALTER TABLE `users` DISABLE KEYS */;
INSERT INTO `users` VALUES (1,'Reuben','Nienow','arlo50@example.org',9374071116),(2,'Reuben','Nienow','terrence.cartwright@example.org',9127498182),(3,'Reuben','Windler','rupert55@example.org',9921090703),(4,'Reuben','West','rebekah29@example.net',9592139196),(5,'Frederick','Effertz','von.bridget@example.net',9909791725),(6,'Frederick','Medhurst','sstehr@example.net',9456642385),(7,'Frederick','Braun','itzel.beahan@example.com',9448906606),(8,'Frederick','Kilback','johnathan.wisozk@example.com',9290679311),(9,'Frederick','Orn','missouri87@example.org',9228624339),(10,'Jordyn','Jerde','edach@example.com',9443126821),(11,'Jordyn','McDermott','shaun.ferry@example.org',9840726982),(12,'Jordyn','Runolfsdottir','doug57@example.net',9260442904),(13,'Jordyn','Haag','lhoeger@example.net',9984574866),(14,'Jordyn','Stanton','tconsidine@example.org',9499932439),(15,'Jordyn','Wolff','effertz.laverna@example.org',9251665331),(16,'Lina','Macejkovic','smitham.demarcus@example.net',9762021357),(17,'Jerrell','Stanton','deja00@example.com',9191103792),(18,'Golden','Wisozk','frida19@example.com',9331565437),(19,'Elisa','Balistreri','romaine27@example.org',9372983850),(20,'Reed','Bogan','zhyatt@example.com',9924753974),(21,'Gwendolyn','McClure','zluettgen@example.net',9745046704),(22,'Luz','Bailey','tillman.iliana@example.org',9881942174),(23,'Alyce','Toy','russel.ewell@example.com',9754884857),(24,'Oma','Ortiz','jailyn.feest@example.com',9339073755),(25,'Valentine','Goldner','matteo.wiza@example.net',9803404650),(26,'Rasheed','Ebert','brenden32@example.net',9924275184),(27,'Misael','Lakin','benjamin.hilpert@example.com',9619165091),(28,'Shaun','Fritsch','wwiegand@example.org',9231898080),(29,'Katarina','Sipes','jenifer.gislason@example.net',9348426774),(30,'Newton','Koss','beatty.river@example.org',9574058915),(31,'Selmer','Quitzon','ztromp@example.net',9363178382),(32,'Margarete','Koepp','idell70@example.net',9743498718),(33,'Donavon','Bauch','michele.lakin@example.com',9229739697),(34,'Ashlynn','Cummerata','weber.tatyana@example.net',9710902090),(35,'Fletcher','Lang','mona94@example.com',9502246403),(36,'Amiya','Leuschke','mathilde.macejkovic@example.com',9461791942),(37,'Terrance','West','ebert.magnus@example.org',9381729082),(38,'Keara','Kiehn','audie.franecki@example.net',9796576345),(39,'Wyatt','Olson','jarvis92@example.org',9212459514),(40,'Paula','Shields','casey.bayer@example.org',9410763172),(41,'Ivah','Bernier','paris15@example.com',9283284370),(42,'Liza','Howe','hadley72@example.org',9926888657),(43,'Kevon','Gerhold','fhilll@example.com',9398761644),(44,'Hermina','Lubowitz','amalia.reichel@example.org',9213914905),(45,'Cara','Quigley','hailee.beier@example.net',9287811077),(46,'Kian','Weimann','tankunding@example.net',9168462586),(47,'Madelynn','Hahn','pleffler@example.org',9598242802),(48,'Hassie','Monahan','lowe.amelia@example.net',9765846197),(49,'Taryn','Kuvalis','aschneider@example.net',9533355262),(50,'Hollis','Padberg','cathryn40@example.net',9163727209),(51,'Henriette','Lindgren','allie.witting@example.com',9891313707),(52,'Keven','DuBuque','durward83@example.com',9613848114),(53,'Chaz','Yundt','stamm.bret@example.net',9763350438),(54,'Rosalee','Dickens','concepcion.conn@example.net',9675063949),(55,'Kip','Schoen','ibeer@example.com',9987381304),(56,'Louie','Spencer','tkessler@example.com',9938579943),(57,'Priscilla','Daniel','barrett12@example.com',9886578202),(58,'Dean','Satterfield','orin69@example.net',9160120629),(59,'Prudence','Shields','sleffler@example.net',9414604655),(60,'Elaina','Buckridge','bartell.einar@example.net',9916593682),(61,'Monserrat','O\'Conner','linda58@example.com',9519551625),(62,'Ramona','Davis','abbigail68@example.net',9484610686),(63,'Eldridge','Wilkinson','callie.wuckert@example.org',9532811737),(64,'Emanuel','Reinger','loyal.herzog@example.org',9659591995),(65,'Janis','Stamm','nils93@example.org',9905318598),(66,'Nannie','Streich','chelsea01@example.com',9412172452),(67,'Elva','Sawayn','modesta.haley@example.com',9803009959),(68,'Ava','Nolan','mmarvin@example.com',9428224970),(69,'Westley','Predovic','urunolfsdottir@example.net',9247233922),(70,'Antonina','Ferry','jamaal.farrell@example.com',9902477849),(71,'Jeffery','Lowe','noemie38@example.org',9803133328),(72,'Cesar','Schmitt','johnathan.waelchi@example.org',9330339588),(73,'Letha','Beatty','reynold.feil@example.net',9636262160),(74,'Benton','Rogahn','jbeer@example.net',9490216855),(75,'Braden','Shields','zemlak.foster@example.com',9114981748),(76,'Luther','Turcotte','zturner@example.com',9292137540),(77,'Patricia','Gleason','benny76@example.net',9148879590),(78,'Delta','Kerluke','terry.antone@example.org',9667864529),(79,'Thurman','Rutherford','isaiah.gerlach@example.net',9994148720),(80,'Willie','Fritsch','rolando45@example.org',9512440690),(81,'Letitia','Marks','bosco.sage@example.net',9546163253),(82,'Ada','Kuvalis','emmanuelle.hegmann@example.org',9251017068),(83,'Josie','Kunde','kaley.rolfson@example.net',9285157694),(84,'Harmony','Lesch','velda32@example.org',9627960545),(85,'Kelsie','Olson','xheidenreich@example.net',9548492646),(86,'Lucile','Rolfson','dbartell@example.net',9258387168),(87,'Celestino','Cruickshank','flavio.hammes@example.com',9686686728),(88,'Hayley','Vandervort','cartwright.seamus@example.com',9228109837),(89,'Royal','DuBuque','jswift@example.org',9295312277),(90,'Adrian','Mills','gail.lockman@example.net',9491584055),(91,'Roosevelt','Tromp','gutkowski.janiya@example.com',9910853104),(92,'Miguel','Watsica','hassan.kuphal@example.org',9824696112),(93,'Gregory','Jenkins','weimann.richard@example.com',9860971258),(94,'Kristina','Jast','jennifer27@example.com',9133161481),(95,'Ozella','Hauck','idickens@example.com',9773438197),(96,'Emmet','Hammes','qcremin@example.org',9694110645),(97,'Eleonore','Ward','antonietta.swift@example.com',9397815776),(98,'Lori','Koch','damaris34@example.net',9192291407),(99,'Sam','Kuphal','telly.miller@example.net',9917826312),(100,'Pearl','Prohaska','xeichmann@example.net',9136605713);
/*!40000 ALTER TABLE `users` ENABLE KEYS */;
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
