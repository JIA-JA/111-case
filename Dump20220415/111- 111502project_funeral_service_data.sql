-- MySQL dump 10.13  Distrib 8.0.28, for Win64 (x86_64)
--
-- Host: 140.131.114.242    Database: 111- 111502project
-- ------------------------------------------------------
-- Server version	8.0.28-0ubuntu0.20.04.3

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
-- Table structure for table `funeral_service_data`
--

DROP TABLE IF EXISTS `funeral_service_data`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `funeral_service_data` (
  `funeral_name_address_phonenum_opening_url` varchar(200) NOT NULL,
  PRIMARY KEY (`funeral_name_address_phonenum_opening_url`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `funeral_service_data`
--

LOCK TABLES `funeral_service_data` WRITE;
/*!40000 ALTER TABLE `funeral_service_data` DISABLE KEYS */;
INSERT INTO `funeral_service_data` VALUES ('邱媽媽生命美學\n114台北市內湖區文德路22巷114號1樓\n0920-812-871\n全天24 小時營業\nhttps://www.chiumafuneral.com/\n'),('邱媽媽生命美學\n234新北市永和區永利路81巷30號1樓\n0920-812-871\n全天24 小時營業\nhttps://www.chiumafuneral.com/\n'),('邱媽媽生命美學\n236新北市土城區裕民路228號9號樓之一\n0920-812-871\n全天24 小時營業\nhttps://www.chiumafuneral.com/\n'),('邱媽媽生命美學\n320桃園市中壢區龍岡路三段115巷65弄57號8樓\n0920-812-871\n全天24 小時營業\nhttps://www.chiumafuneral.com/\n'),('邱媽媽生命美學\n330桃園市桃園區樹林八街26之2號\n0920-812-871\n全天24 小時營業\nhttps://www.chiumafuneral.com/\n');
/*!40000 ALTER TABLE `funeral_service_data` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2022-04-15 16:18:43
