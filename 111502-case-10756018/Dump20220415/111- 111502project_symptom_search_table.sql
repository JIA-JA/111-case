-- MySQL dump 10.13  Distrib 8.0.26, for Win64 (x86_64)
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
-- Table structure for table `symptom_search_table`
--

DROP TABLE IF EXISTS `symptom_search_table`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `symptom_search_table` (
  `sympton_name` varchar(20) NOT NULL,
  `symptom_describe` varchar(2000) NOT NULL,
  PRIMARY KEY (`sympton_name`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `symptom_search_table`
--

LOCK TABLES `symptom_search_table` WRITE;
/*!40000 ALTER TABLE `symptom_search_table` DISABLE KEYS */;
INSERT INTO `symptom_search_table` VALUES ('心絲蟲症','心絲蟲寄生於右心室及肺動脈引起功能衰竭，症狀為精神不振、呼吸困難、咳血、身體機能降低、充血性心衰竭，嚴重者會產生心血管疾病最終死亡。預防:1.幼犬6個月大後每半年定期健檢，適時給予投藥做預防或治療。2.外出時盡量避免長時間讓犬隻停留於蚊子眾多的水溝、池塘、草叢等環境，減少被病媒蚊叮咬的機會；留意家中環境清潔衛生、定期清空容器積水、疏通水管、安裝紗門等，減少病媒蚊孳生。'),('慢性腎衰竭','腎功能減弱使犬隻無法順利代謝血液中的廢物，產生食慾降低、口渴、頻尿或少尿、毛粗糙、倦怠、嘔吐等症狀。預防:1.不要讓寵物吃到會中毒的食物，例如葡萄、巧克力等，並確保寵物有清潔的飲用水；也要注意別讓寵物暴露在有毒物質的環境下，例如殺蟲劑、蚊香、消毒藥水等含有除蟲菊配方的化學物質。2.常常幫狗刷洗牙齒，牙齒疾病也是慢性腎衰竭最常見的原因之一。因此保持寵物良好的口腔健康非常重要。3.年度的血液和尿液生化健康檢查以及超音波檢測，及早發現防止腎衰竭。老齡犬應每年檢查一次血液、尿液以及超音波檢查，並監測寵物的食慾、飲水量和精神狀態等。'),('毛囊蟲症','若犬隻虛弱或免疫不全時，毛囊蟲就會大量繁殖，侵佔毛囊導致禿毛，多好發於臉部和嘴角；若再受到細菌感染，會遍及全身，甚至惡化成毛囊炎和膿皮症，形成頑固皮膚炎，並發出惡臭。預防:1.毛囊蟲症被懷疑和遺傳有關，故曾病發的犬隻不建議繁殖。2.提高犬隻免疫功能可降低毛囊蟲感染之風險。3.使用預防寄生蟲感染的外用滴劑。'),('犬傳染性支氣管炎','當你的寶貝症狀為劇烈乾咳、反胃，嚴重者會嗜睡、發燒、食慾不振及肺炎，甚至死亡。病症一般持續10~20天，劇烈運動與興奮會使病情惡化。預防:1.避免犬隻與其他狗接觸，尤其是年輕的小狗。2.疫苗接種。3.以胸背袋取代頸圈，減少壓迫喉嚨及氣管引起患犬咳嗽。'),('犬傳染性肝炎','當你的寶貝症狀為厭食、精神不振、發燒嘔吐、下痢和軟便，病情嚴重者會明顯腹痛和扁桃腺腫大，有些會在發病後12～24小時呈現藍眼症：眼睛結膜炎、分泌物增加，並有角膜水腫及混濁。預防:注射犬傳染性肝炎疫苗，幼犬若在12週齡以前注射疫苗，則需在14~15週齡時補強一次，方能獲得1年以上的免疫力。為維持其免疫性，成犬應每年補強注射一次。'),('犬冠狀病毒腸炎','當你的寶貝症狀為間歇性嘔吐、下痢、厭食、輕微發燒、抑鬱、排便惡臭並為淡橘色，甚至為含黏膜和血液之噴射樣痢，偶爾可見呼吸道症狀。預防:犬冠狀病毒最容易和犬小病毒複合感染，造成高達89%的死亡率，所以最好能同時注射犬冠狀病毒及犬小病毒疫苗，則能同時預防犬冠狀病毒和犬小病毒出血性腸炎複合症。'),('犬副流行性感冒','症狀輕微而不明顯，一般常見乾性、刺耳的咳嗽持續約2~6天，伴隨數天的輕微發燒、黏液性鼻分泌物、咽喉炎與扁桃性腺炎。預防:注射副流行性感冒疫苗。'),('犬小病毒性腸炎','初期有發燒、食慾不振等類似感冒的症狀，接著會持續性嘔吐下痢，腸管黏膜受損出血而拉出帶血惡臭的排泄物，若未及時送醫會脫水休克死亡。預防:於6～8週齡注射第一劑疫苗，之後每2～4週重複注射一劑，直到滿16週齡；於6月齡或1歲齡時補強注射一劑，之後每三年一次。'),('犬疥癬蟲症','當你的寶貝患部會出現脫毛、結痂、劇癢，常因搔癢而引發細菌感染致化膿、惡臭等情形。預防:避免和病原接觸，家犬須和來歷不明的寵物，尤其是街頭的流浪貓狗保持距離，避免直接接觸。'),('犬瘟熱','當你的寶貝症狀為發燒、無食慾、精神不振、眼屎多、流鼻涕、咳嗽、肝炎、下痢、血便等，後期則會出現抽筋、麻痺、行動失調等精神症狀。預防:注射犬瘟熱疫苗，可在幼犬6週大時，開始施打含犬瘟熱疫苗的幼犬第一劑預防針。接著再追加二劑，以後每年補強。'),('狂犬病','當你的寶貝症狀主要是行為異常，瞳孔初期放大、下巴下垂、流口水，最後行動失調、麻痺、抽筋進而死亡。預防:注射狂犬病預防疫苗，健康犬隻年齡約4~5個月時注射一劑不活化疫苗，之後依疫苗效能每隔半年到一年施打一次。'),('鉤端螺旋體症','分為兩種，黃疸型和出血型。黃疸型主要感染腎臟，引發間質性腎炎，約有15%病例引起嚴重肝損壞，產生黃疸:出血型有高燒、厭食、眼屎多、腸胃肝腎受損相關的症狀，有70%病例出現黃疸和黏膜出血。預防:1.犬隻10周大時給予第一劑預防針，之後3～4周追加一次；滿周歲後每年施打一針。2.避免狗隻於溪澗玩耍或飲用溪水，接近水道時用狗繩牽引狗隻，與狗隻散步時應自備食用水供狗隻飲用。');
/*!40000 ALTER TABLE `symptom_search_table` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2022-04-15 13:57:29
