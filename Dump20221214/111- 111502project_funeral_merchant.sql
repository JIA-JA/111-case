-- MySQL dump 10.13  Distrib 8.0.26, for Win64 (x86_64)
--
-- Host: 140.131.114.242    Database: 111- 111502project
-- ------------------------------------------------------
-- Server version	8.0.31-0ubuntu0.20.04.2

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
-- Table structure for table `funeral_merchant`
--

DROP TABLE IF EXISTS `funeral_merchant`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `funeral_merchant` (
  `funeral_id` varchar(45) NOT NULL,
  `funeral_name` varchar(20) NOT NULL,
  `funeral_address` varchar(45) NOT NULL,
  `funeral_phonenum` varchar(20) NOT NULL,
  `funeral_ontime` varchar(20) NOT NULL,
  `funeral_url` varchar(10000) NOT NULL,
  `funeral_way` varchar(45) NOT NULL,
  `funeral_price` int DEFAULT NULL,
  PRIMARY KEY (`funeral_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `funeral_merchant`
--

LOCK TABLES `funeral_merchant` WRITE;
/*!40000 ALTER TABLE `funeral_merchant` DISABLE KEYS */;
INSERT INTO `funeral_merchant` VALUES ('F00001','翡翠森林寵物生命禮儀中山店','104台北市中山區新生北路一段45號','0800-522-020','全天24 小時營業','https://www.feerie.com.tw/','樹葬',6000),('F00002','宸豐生命事業中山店','104台北市中山區民權東路二段135巷29弄15號1樓','0987-747-884','全天24 小時營業','http://044000.tw/','火葬、樹葬',7000),('F00003','茸茸花園寵物生命禮儀中山店','104台北市中山區104林森北路96-7號','02-2564-1299','09:00–18:00','https://fluffy.tw/','火葬',4000),('F00004','汝果寵物生命會館台北北投店','112台北市北投區立德路121巷15-1號2樓','02-2895-1334	','全天24 小時營業','https://ifspirit.com/','火葬',7000),('F00005','宸豐生命事業內湖店','114台北市內湖區康寧路三段75巷196號','0978-192-798','全天24 小時營業','http://044000.tw/','火葬、樹葬',7000),('F00006','邱媽媽生命美學內湖店','114台北市內湖區文德路22巷114號1樓','0920-812-871','全天24 小時營業','https://www.chiumafuneral.com/','火葬、樹葬、海葬',5500),('F00007','萬里福田寵物城堡新北萬里店','207新北市萬里區大坪1-1號','0800-068-888','全天24 小時營業','http://www.petscastle.com.tw/','海葬',6000),('F00008','宸豐生命事業板橋店','220新北市板橋區光武街34號之一','0966-579-213','全天24 小時營業','http://044000.tw/','火葬',6000),('F00009','星城生命板橋店','220新北市板橋區新海路431巷17號1樓','0972-381-987','06:00–22:00','https://sites.google.com/view/patrickwang1983\n','火葬',3000),('F00010','星城生命汐止店','221新北市汐止區長江街61號1樓','0972-381-987','全天24 小時營業','https://sites.google.com/view/patrickwang1983','火葬',3000),('F00011','邱媽媽生命美學永和店','234新北市永和區永利路81巷30號1樓','0920-812-871','全天24 小時營業','https://www.chiumafuneral.com/','火葬、樹葬、海葬',5500),('F00012','邱媽媽生命美學土城店','236新北市土城區裕民路228號9號樓之一','0920-812-871','全天24 小時營業','https://www.chiumafuneral.com/','火葬、樹葬、海葬',5500),('F00013','宸豐生命事業樹林店','238新北市樹林區太順街62巷6弄1號5樓','0975-509-872','全天24 小時營業','http://044000.tw/','火葬',6000),('F00014','宸豐生命事業新北三重店','241新北市三重區長壽西街60號2樓','0987-747-884','全天24 小時營業','http://044000.tw/','火葬',6000),('F00015','宸豐生命事業泰山店','243新北市泰山區文化街1巷8號','0987-747-884','全天24 小時營業','http://044000.tw/','火葬',6000),('F00016','邱媽媽生命美學新北五股店','248新北市五股區新城六路251號','0933-133-252','全天24 小時營業','https://www.chiumafuneral.com/','火葬、樹葬、海葬',5500),('F00017','邱媽媽生命美學新竹東區店','300新竹市東區光復路一段268巷12號3號樓之3','0920-812-871','全天24 小時營業','https://www.chiumafuneral.com/','火葬、樹葬、海葬',5500),('F00018','星佑寵物天使園區新竹東區店','300新竹市東區光復路二段(新竹衛星站)','03-783-2888','08:00–02:00','http://www.douvis.com.tw/','火葬、樹葬',4000),('F00019','星佑寵物天使園區新竹竹北店','302新竹縣竹北市光明六路(竹北衛星站)','03-783-2888','08:00–02:00','http://www.douvis.com.tw/','火葬、樹葬',4000),('F00020','星佑寵物天使園區新竹湖口店','303新竹縣湖口鄉光華路(湖口衛星站)','03-783-2888','08:00–02:00','http://www.douvis.com.tw/','火葬、樹葬',4000),('F00021','星佑寵物天使園區新竹新豐店','304新竹縣新豐鄉濱海公路(新豐衛星站)','03-783-2888','08:00–02:00','http://www.douvis.com.tw/','火葬、樹葬',4000),('F00022','星佑寵物天使園區新竹關西店','306新竹縣關西鎮正義路(關西衛星站)','03-783-2888','08:00–02:00','http://www.douvis.com.tw/','火葬、樹葬',4000),('F00023','芯寶寵物樂園新竹寶山店','308新竹縣寶山鄉三峰路二段329號巷56號','03-529-3399','09:00–23:30','https://www.sinbao.com.tw/','海葬',8000),('F00024','星佑寵物天使園區新竹竹東店','310新竹縣竹東鎮中豐路三段(竹東衛星站)','03-783-2888','08:00–02:00','http://www.douvis.com.tw/','火葬、樹葬',4000),('F00025','邱媽媽生命美學中壢店','320桃園市中壢區龍岡路三段115巷65弄57號8樓','0920-812-871','全天24 小時營業','https://www.chiumafuneral.com/','火葬、樹葬、海葬',5500),('F00026','星城生命平鎮店','324桃園市平鎮區新富一街9號14樓','0972-381-987','全天24 小時營業','https://sites.google.com/view/patrickwang1983','火葬',3000),('F00027','邱媽媽生命美學桃園店','330桃園市桃園區樹林八街26之2號','0920-812-871','全天24 小時營業','https://www.chiumafuneral.com/','火葬、樹葬、海葬',5500),('F00028','宸豐生命事業龜山店','333桃園市龜山區文昌一街47巷28號','0981-014-019','全天24 小時營業','http://044000.tw/','火葬',6000),('F00029','宸豐生命事業八德店','334桃園市八德區山下街13號','0975-509-872','全天24 小時營業','http://044000.tw/','火葬',6000),('F00030','宸豐生命事業大溪店','335桃園市大溪區民權路9號','0926-019-472','全天24 小時營業','http://044000.tw/','火葬',6000),('F00031','星佑寵物天使園區苗栗三灣店','352苗栗縣三灣鄉銅鏡村坡頭背5之7號','0919-025-475','08:00–02:00','http://www.douvis.com.tw/','火葬、樹葬',4000),('F00032','詠憶寵物安樂園苗栗通霄店','357苗栗縣通霄鎮平安里102-58號','03-775-5858','09:00–22:30','http://www.yongyi99.com/','海葬',6000),('F00033','星佑寵物天使園區苗栗店','360苗栗縣苗栗市為公路(苗栗衛星站)','03-783-2888','08:00–02:00','http://www.douvis.com.tw/','火葬、樹葬',4000),('F00034','翡翠森林寵物生命禮儀台中北屯店','406台中市北屯區建和路二段296號','04-2436-5298','全天24 小時營業','http://www.feerie-tc.com/index.html?v=1','樹葬',6000),('F00035','誼馨園寵物莊園高雄鳳山店','824高雄市鳳山區華興街79號','07-721-6521','07:00–23:00','http://www.yi-xin-yuan.com/','海葬',6000),('F00036','菩提寵物樂園屏東鹽埔店','907屏東縣鹽埔鄉永樂路7-22號','0922-272-108','09:00–23:00','http://www.kc55888.com.tw/','海葬',6000);
/*!40000 ALTER TABLE `funeral_merchant` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2022-12-14 21:20:46
