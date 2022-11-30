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
-- Table structure for table `must_know_thehealth`
--

DROP TABLE IF EXISTS `must_know_thehealth`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `must_know_thehealth` (
  `must_know_name` varchar(20) NOT NULL,
  `must_know_describe` varchar(5000) NOT NULL,
  PRIMARY KEY (`must_know_name`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `must_know_thehealth`
--

LOCK TABLES `must_know_thehealth` WRITE;
/*!40000 ALTER TABLE `must_know_thehealth` DISABLE KEYS */;
INSERT INTO `must_know_thehealth` VALUES ('疫苗須知','毛寶貝剛出生時，會從母乳中獲得「移行抗體」(可以幫助抵抗、防禦部分傳染病)不過「移行抗體」會隨著時間而逐漸減少↓此時會 ↑ 增加感染疾病的風險 ↑為了幫毛寶貝 ① 增加抵抗力 ↑ ② 降低傳染風險↓就需要------ >> 注射疫苗 <<雖然施打疫苗不等於100%完全預防疾病。不過有施打疫苗就是給毛寶貝多一層保護++++因為部分傳染病，可能會有：迅速傳播、人畜共通、死亡率高…等問題如：犬小病毒(CPV-2)、犬瘟熱(CDV)、狂犬病(Rabies)、貓瘟(FP)、貓白血病FeLV….等-----你知道寶貝該施打那些疫苗呢？以下提供預防針小知識2015年 wsava世界小動物獸醫協會的VGG疫苗指南研議小組發表「犬貓疫苗注射指南」有提到疫苗可分為①核心疫苗－具必要性無論在任何情況、處於任何國家，所有的犬貓都應該接受注射的疫苗－可以保護犬貓免受嚴重、致死性的全球性疾病危害◥犬：犬瘟熱病毒、犬腺病毒、犬小病毒◥貓：貓瘟、貓皰疹病毒、貓卡西里病毒※ 特別注意：在狂犬病流行疫區，無論是否強制規範入法，都應該被視為核心疫苗②非核心疫苗－視情況性動物單純因地理位置、環境或生活方式，而有遭受特定病源感染之風險時，才需要注射的疫苗。如：犬副流行性感冒、萊姆病、鉤端螺旋體、博德氏桿菌、貓白血病毒、貓愛滋病、貓披衣菌…等－依據個體情況在實際給予即可另，依據同一劑疫苗，可對抗病毒的多寡，可分成以下2種:① 多價疫苗 可對抗多種病毒◥犬：五合一、八合一、十合一◥貓：三合一、五合一② 單價疫苗 僅能對抗單一病毒。如：狂犬病、萊姆病、貓白血病…等，建議：進行預防注射前請和獸醫師討論諮詢醫師會依據寶貝的①年齡②品種③健康狀況④同伴數量⑤生活環境⑥社交狀況以及飼主的$經濟考量$為寶貝量身打造最適合的預防計畫，最後小補充部分疫苗中的佐劑，可能會讓貓咪們引發「惡性腫瘤」慈愛體系有提供「無佐劑」疫苗，有需求可和獸醫師討論諮詢!!千萬不可因擔心風險，而不幫寶貝施打!!'),('防蟲須知','每到這個時節，天氣總是變得又悶又熱，寶貝比平常更容易出現「啃」、「咬」、「搔」、「抓」，除了常常抓個不停同時也會伴隨著出現「歪頭」、「甩耳」、「脾氣躁動」，嚴重的話可能會發生...「局部脫毛」、「紅腫脫皮」、「發炎感染」，這些狀況都有可能是「體外寄生蟲」在作怪。現在，就讓我們一起來了解 3大常見體外寄生蟲①跳蚤，根據統計數據，跳蚤一生可以產下數千個蚤卵一旦擁有合適的「溫度」及「濕度」就可讓「蚤卵」發育為「成蚤」（最快只需3週）犬貓的體溫略高於人類，較容易被跳蚤叮咬，產生 過敏性皮膚炎，將造成「結痂丘疹」、「脫毛搔癢」、「紅斑感染」由於，跳蚤的行動迅速，我們很難用肉眼觀察到，但你可能會在寶貝身上看到的（一粒一粒黑黑的） 「跳蚤便便」泡水後會變成「淡紅色」千萬別小看跳蚤的行動力及繁殖力1.柔軟細毛2.地板夾層3.角落邊邊4.草叢...等，都是他們的藏身之處②壁蝨，吸血大王，尚未吸血前，只比跳蚤大一些些（吸血後會比吸血前膨脹10倍大）1.不怕水2.不怕餓（2-3年不進食也不會陣亡）3.超吸附（沒有吸飽血量絕不離開）最喜歡出沒在「草叢」跟「陰溼」處，狗狗和貓咪都會被他們盯上，互相感染，大多是以傳染「血液疾病」為主，影響「紅血球」及「血小板」的運作功能進而引發「貧血」、「腎臟病」，造成「各項器官感染衰竭」✽特別注意，當您發現壁蝨出沒時，請避免進行以下動作1.不要「直接拔除」→避免口器殘留，皮膚受損2.不要「用打火機燒」→避免燙傷3.不要「直接捏死」→避免蟲卵擴散，請直接帶至動物醫院讓專業獸醫師進行處置，最後還有一類 ③「疥癬蟲」常見於耳朵、前腳肘和腹部、後腳踝，臨床症狀：全身性感染(小膿皰)、劇烈搔癢，包含：耳疥蟲、毛囊蟲...等④耳疥蟲，引起 [耳內騷癢感]，毛寶 [甩/歪頭]  頻率變高，耳道內有 [黑色蓄積分泌物]⑤毛囊蟲，主要寄生在 [毛囊] 及 [皮脂腺] 中，需透過 [顯微鏡] 才能看到，可分為 [局部性] 與 [全身性] 依病灶數量區分，尤其是 [免疫力低落] 的 [幼高齡犬貓] 更容易感染，衷心建議 要對抗這些體外寄生蟲一定要有耐心 !這是因為跳蚤、壁蝨不僅僅是「體外寄生蟲」同時也是 「傳播媒介」（血液寄生蟲 / 腸道寄生蟲 / 細菌...等）❖跳蚤，會傳播▶︎血液寄生蟲：血巴東蟲▶︎腸道寄生蟲：*絛蟲▶︎細菌：*貓抓病..等嚴重疾病❖壁蝨會傳播▶︎血液寄生蟲：血巴東蟲、肝簇蟲、焦蟲、艾利希體▶︎細菌：*萊姆病 ...等（*表人畜共通傳染病、藍字表：終身性疾病，無法根治，最後小補充 為了讓寶貝可以遠離蟲蟲，請跟著我們這樣做有空就幫寶貝檢查體表蟲蟲藏匿處：✓「耳朵」✓「指尖」✓「皮下」✓「腹部」✓「四肢交接處」✓「後頸仰角處」...等，居家清潔，切記：請先把毛寶貝帶離現場避免中毒平日可用「吸塵器」輔助床具、地板的居家清潔，嚴重時建議可進行大規模的全面消毒定期找家庭獸醫師健檢，藉此也能充分與獸醫師諮詢，為毛寶量身挑選最佳的除蟲配套方針。');
/*!40000 ALTER TABLE `must_know_thehealth` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2022-04-15 13:57:13
