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
INSERT INTO `must_know_thehealth` VALUES ('健康檢查','現代人飼養伴侶動物的心態已與過往截然不同，主人已將他們當作小朋友一樣的寵愛，近年來，由於他們生活方式和飲食的改變，罹患慢性病這種文明病的比例也逐年增加，當動物罹患慢性病時，會造成免疫力下滑，使得感染傳染性疾病的機率增加2倍以上。\n \n我們常常在門診時，聽到飼主提出這樣的疑惑「我的寵物前幾天還好好的，怎麼只有幾天，就已經變這麼嚴重了？」\n \n其實，這一句話有很大的認知上落差，往往這一句話的真正意義是「寵物的主人一直“認為”寵物是OK 或 健康的！」，但事實上並非如此。\n \n寵物並不會說話來表達，一些小小的異常行為常被忽略掉了，甚至還聽過飼主的認知是「只要牠有吃東西，就表示健康，因為動物如果不吃東西，表示生病了」。\n \n其實，就算是人類醫學發達程度及生活品質之提昇至此，也常常發生當事人在極錯愕下被醫院告知病情，那麼一位聰明睿智的主人，怎可讓您的寵物在「被認為健康」的狀況下，失去了被醫療照護的權利呢？\n \n\n如何察覺家中寵物可能有潛在性的病痛呢？\n毛寶貝又不會說話，無法告訴你「牠痛在哪裡？」或「哪裡不舒服？」，甚至有些疾病的中，初期連動物本身也都不自覺，這就是問題所在！\n \n雖然，我們無法完全在第一時間即得知寵物病痛，但是事實上，我們其實有機會可以在「未至末期」或「嚴重臨床症狀」出現前即可得知病況的。\n \n愈早期發覺疾病，病情被治癒或者受到良好控制的機會就愈大；反之，若要到明顯臨床症狀都表現出來才要找醫生，大多都會很棘手，且常常是真正傷害到了身體的組織結構，花費將更大且疾病要被治癒的機會相對變小。\n \n說到這裡，就該來談談「定期檢查的重要性！」前面已有談到疾病初期常常「無特殊明顯症狀」，甚或「寵物本身亦不自覺」，所以，唯有「定期的健康檢查」才能在較早的時間發覺到疾病異常，畢竟「科學的儀器」是比「感覺」更準確客觀的。\n \n至於「多久需作一次檢查？」、「定期」應定在多久一期？試想一下，寵物每一年的老化程度，相等於人類5~7年的老化程度（常見問題｜如何換算犬貓的年齡？）。所以，帶毛寶作健康檢查，是不是就變成是應該且必須的呢？\n\n慈愛獸醫師建議\nheart 壯年寵物：每一年的一次 (相當人類每5到7年）\nheart 中老年寵物：每半年一次 (相當於中老年人每2到3年)\nheart 若曾罹患嚴重疾病之伴侶動物：每半年1次，以了解健康狀況、老化程度以及慢性病風險。\n \n\n有那些疾病在定期健康檢查中很重要呢？\n舉例來說、如：「心臟血絲蟲（心絲蟲）」或流行的艾利希體、萊姆病...等，這幾種傳染病的慢性疾病，在初期常無明顯症狀，往往被飼主忽略掉，等到出現呼吸不順、喘、咳嗽或發高燒不吃、貧血...等特殊症狀時，往往已經對「心血管系統」或「骨髓造血系統」造成了無法逆轉的傷害。\n \n另外，有心臟病的犬貓常見的「肺水腫」，是由於「左心病變、血壓變化」，導致「肺部流回左心房的血流受阻」，血液鬱積於肺，血漿經由毛細血管滲漏於肺泡中，使得肺泡蓄積液體而無法完成氣體交換，造成呼吸窘迫，最後動物會因呼吸困難而死亡。\n \n肺水腫發生是有徵兆的，「呼吸過快」、「喘」、「舌頭黏膜顏色蒼白」或「發紺」，動物因「呼吸困難」而呈現出「前腳撐起」、「引頸呼吸」的特殊姿勢，若有這些現象應立即就醫請醫師檢查並治療。雖然「小型犬心臟病的比例」較「大型犬」高出許多，但透過「定期追蹤」及「健康檢查」就能有效杜絕肺水腫這個致命的殺手。 \n \n另外，像是一些內科疾病如：「慢性腎衰竭」、「心臟血管的老化」，甚至一些泌尿系統疾病或結石...等，在發生的早、中期常無自覺，但確定是有問題了，只是外觀上看不出來，獸醫師可藉有適當之儀器設備檢測知道狀況，這些慢性疾病雖屬老化或器官退化而無法痊癒，不過若早一點發現多可以再讓這些寵物多出一些日子，而且可藉由一些方法或藥品改善其老病的生活品質，所以可知定期健康檢查的重要性質了。\n \n\n犬貓飲食、生活環境改變造成慢性病隱憂！\n根據我們慈愛的歷年內部統計，動物常見的前五大疾病通常出現在心肺、肝、腎、關節、牙齒等五個部位，其中又以「心血管系統」、「代謝系統」、「肌肉關節」為最大宗，除正常老化的情形之外，由於主人讓動物餐餐吃太好、過度餵食，導致動物體重直線上升，反而造成罹患慢性疾病的隱憂。\n\n \n\n而且有些疾病的中、初期症狀不明顯，有時他們自己也不自知，而當有明顯症狀出來，常常已傷害到身體的組織結構，導致發現時已出現嚴重併發症，甚至有致死的危險。面對動物慢性病問題，在此提醒飼主，臨床就診的動物中，近4成罹患慢性疾病，導致動物個體免疫力較差，而感染傳染性疾病的機率更增加2倍以上。\n\n \n\n \n當氣溫變化大時（如換季、或者是台灣農曆過年前後），更會加速伴侶動物感染傳染性疾病的風險，例如：在冬季診間中住院的伴侶動物數也增加近3成，其中又以犬瘟熱、支氣管炎、副流行性感冒為冬季前三大項常見疾病，病毒會藉由飛沫和接觸的方式進入到狗狗貓貓的上呼吸道，甚至還侵入中樞神經系統，造成毛寶貝出現發燒、咳嗽、嘔吐、抽搐導致全身麻痺...等嚴重症狀，飼主不可不慎！\n \n\n預防勝於治療\n飼主除應定期帶寵物接種疫苗，提升免疫力預防傳染病找上門，也需定期回診進行健檢，更需了解動物的老化程度、罹患慢性病的風險，才可提早預防，適當照護，改善動物的健康，使他們有更好、更健康和更長久的生活。\n \n此外，每月接種內外寄生蟲預防藥，也是必要的措施，當寵物外出時，總會因為好奇心在戶外環境中又舔又聞，此舉易感染傳染病或是寄生蟲，如：鉤端螺旋體...等致命病毒不僅使得伴侶動物面臨死亡風險，更為人畜共通疾病，而影響飼主健康。\n\n@台南總院'),('夏日須知','各位飼主是否也有認同，您在夏天比較易有腸胃不適的情形發生，同等道理，您的寵物在夏天更容易引發腸胃不適或甚至腸胃發炎等狀況。原因除了在潮溼溫熱氣候下食物易變質外，另外此季節適合細菌、病毐之繁殖與散播，此季亦常下雨，故氣溫、氣候多變化對您寵物腸胃道蠕動造成影響...等均是因素，不可不注意。\n \n一、傳染性腸胃炎\n以病毐（如冠狀病毐、小病毐等）為常見，另外細菌性、黴菌亦會引發腸胃不適或發炎，常見是連續性多次的嘔吐或下痢、甚至血痢等症狀，常經口進入感染，腐敗細菌滋生之食物或黴菌、病毐污染之食物或物件均可能造成。\n\n \n\n預防方法\n\n1. 定期施打疫苗以降低病毐性特定腸胃炎發生機率。\n2. 定時、定量餵食。\n3. 食器、環境保持清潔衛生。\n4. 避免接觸高機率傳染源；如流浪動物、草地、泥土地等。\n5. 避免人類食餘餵食您的寵物。\n \n二、飲食行為不良或腸胃不適\n常因過食、不定時定量餵食或吃了不適、不潔食物，吃了不易消化（過度油膩、太多調味料、太大塊或無法消化等）之食物所造成。因為寵物（尤其是狗）吃東西不像人，不可能細嚼慢嚥，一旦肚子餓或遇到喜歡、新奇的東西（不管是不是食物），一定一口急吞，所以其食物之篩選很重要了；食物選擇與餵食方式這個重要工作就落在主人身上了，若您做的好，您的寵物受腸胃不適所苦的機會就會因您的努力和小心降低了。常見的非傳染性腸胃不適有嘔吐（食後一段時間，少次或多次吐食物或胃酸等）、下痢或軟便等，嚴重時若腸胃阻塞或套疊，那就嚴重到須藉由外科來急救了。\n \n預防方法\n1. 定時、定量之餵食，最好是固定的食品，也不要餓太久。\n\n \n\n2. 給予食物若30分鐘內未吃完，最好就收掉\n\n   （尤其是罐頭、肉類、湯等溼性食物）。\n\n \n\n3. 儘量勿予人類食品，像端午節、中元普渡、中秋節前後\n\n    就常見到因吃了過量粽子、拜拜之貢品、烤肉等而造成胃腸不適的病例\n\n  （過多的肉骨頭、調味料、油膩食品等常造成其腸胃不適應）。 \n\n \n\n4. 避免其挑食等不好習慣。\n\n \n\n5. 為預防其腸胃因緊迫蠕動不正常，培養腸內正常菌叢及幫助消化，\n\n    可適度添加消化酵素或益生菌等，對其亦有幫助。\n\n \n\n \n其實狗貓等寵物就像小朋友一樣，選擇及自制能力均不如聰明的您，所以應該以對待小朋友的心情照顧牠們（4歲以下的小朋友）。幫牠們選擇適當的食品，飲食量及時間，及作預防保健。\n       \n人類食物（過度油膩、調味料或高鹽份、高碳酸等）均不適合您的寵物，長期的不適食物除了會對腸胃負擔外，也可能是造成腎臟、心臟疾病甚或皮膚病、腫瘤等之可能原因，不可不注意。\n       \n若您的寵物已有長期疾病（如皮膚過敏、老犬、腎臟病等）之問題，在此季節更應嚴守食物為醫療處方食品與專業醫師之建議。\n\n@ 台中醫院'),('寵物牙科','依據平均壽命延長，寶貝牙齒至少要用 10年以上  ( 等於 人類 70年左右\n\n \n\n■ 多數醫學研究證實：寵物約 2-3歲 時，就會開始出現牙齒疾病的症狀\n\n有 70~80% 的狗貓，會有 ◥牙齒黃黃 ◥嘴巴臭臭 ◥異常流口水 ◥牙齦紅腫流血\n\n \n\n■ 2019年 AAHA美國動物醫院協會 提供 狗貓口腔保健的指南\n \n\n 建議，根據「不同的生長階段」　◆ 貓咪、中小型犬：1歲    ◆ 大型犬：2歲　\n\n 進行，完整的預防計畫  ◆ 完整口腔檢查  ◆ 定期洗牙清潔拋光 \n\n    \n\n但，臨床上，我們常遇到...\n\n \n\n〃看起來不髒不用洗...  〃聽說麻醉有風險...\n\n \n\n〃醫師沒有特別說...  〃完全沒有聽過「洗牙」...\n\n \n\n所以接下來，我們要帶您全面了解 「齒科完整保健計劃」\n \n\n① 每日刷牙（順便觀察有沒有出現以下情況，如果有，請儘速帶寶貝看醫生唷！)\n\n     出血紅腫、牙垢、某個地方不讓你摸、斷齒掉牙、飄出口臭、異常流口水...等\n\n     \n\n② 定期口腔檢查\n\n　 由於寶貝的口腔狀況都不一樣，到院時醫師會先確認\n\n \n\n     A. 牙齒本體外觀、牙漬、牙垢 附著程度\n\n     B. 牙齦組織及周圍狀況\n\n \n\n    再來就是確認寶貝的口腔問題是否有 \n\n    ◥  牙菌斑 ◥ 牙齦炎 ◥  牙結石 ◥  牙周病\n\n    這些問題，通常會藉由「洗牙」來進行處理\n\n \n\n    當 病情嚴重時，會建議「拔掉鬆動或損傷的牙齒」\n\n    或其他專業治療(根管、補牙、矯正...等)\n\n \n\n③ 洗牙 (術前評估→全程記錄→定期追蹤)\n\n    為確保毛寶貝的安全，此階段會採用「全身麻醉」(一定存在風險)\n\n    但不這麼做會讓寶貝更危險（可能會因為疼痛而亂亂動)\n\n \n\n     麻醉前，醫師會先針對寶貝的身體狀況進行評估\n\n \n\n    洗牙過程中，也會全程監控寶貝的生理數值\n\n \n\n    透過麻醉的輔助下，獸醫師可以幫寶貝進行深度清潔，並進行完整的口腔檢查，\n\n    把平常無法處理的死角，一網打盡\n\n \n\n｜洗牙流程｜\n\n \n\n      A. 清除牙齒表面的牙菌斑、牙垢、牙結石\n\n      B. 深度清潔牙縫、牙齦、牙根，確認牙周囊袋狀況\n\n      C. 患牙周病者，需進行拋光打磨修平\n\n      D. 塗抹護齒隔離凝膠，降低牙菌斑及牙結石產生\n\n \n\nenlightened 洗牙後小提醒\n\n        ① 天天刷牙不偷懶    \n\n        ② 定期塗抹或餵食牙齒保健品\n\n        ③ 盡量減少軟性食物的餵食  \n\n        ④ 建議：每 半年～一年要複診，讓醫師進行驗收狀況\n\n@慈愛動物醫院'),('晶片須知','寵物晶片是什麼？為什麼防走失？\n飼主們通常想了解寵物晶片的運作系統究竟是什麼？亦會很擔心寵物晶片是否會影響寵物身體的健康？在這邊蝦編為大家簡單介紹寵物晶片到底是什麼，就讓我們一起看下去～\n\n寵物晶片就像是寵物的身分證一樣，現今很多飼主都會為寵物安裝寵物晶片，透過晶片的安裝可以在寵物走失時獲得最新一手的資訊，讓危機在最短的時間被解決。寵物晶片的植入技術是一種叫做無線射頻辨識（Radio Frequency Identification, RFID）的系統，RFID 的標籤將資訊存入後，透過電磁力供給能源，會以無線電波將資訊傳送到掃描器中。而大家熟知的悠遊卡、etag 就像是寵物晶片一樣，也是使用無線射頻辨識這個技術。在寵物體內並不會主動傳送資訊，僅會保存寵物的身分。倘若寵物走失了，僅需要照射 X 光便能知道牠體內是否有晶片，以及知道寵物的身分，進而找到該寵物的飼主，所需步驟非常簡單！\n\n寵物晶片會影響毛小孩的健康嗎？\n寵物晶片的膠囊大概就像米粒的大小而已，而膠囊外頭為生物相容玻璃包覆著，不僅無毒，對於大家毛小孩的身體更是無害，所以大家不用擔心在植入晶片的毛小孩會有過敏的狀況出現。\n\n也因為寵物晶片不會有任何的損害或是能源上的消耗，所以寵物晶片可以一直待在寵物體內，一直到過世都可以不用更換。\n\n寵物晶片的費用多少？\n寵物的晶片註冊費用分為兩塊，一為晶片植入費和寵物登記費，今天主要跟大家分享的是寵物的晶片植入費：基本上都會是在 300 元左右。登記費用就會依結紮和未結紮而有不同的費用。\n\n@蝦生活Tobie'),('疫苗須知','毛寶貝剛出生時，會從母乳中獲得\n\n「移行抗體」(可以幫助抵抗、防禦部分傳染病)\n\n\n不過「移行抗體」會隨著時間而逐漸減少↓\n此時會 ↑ 增加感染疾病的風險 ↑\n\n \n\n為了幫毛寶貝 ① 增加抵抗力 ↑ ② 降低傳染風險↓\n\n就需要------ >> 注射疫苗 <<\n\n \n\n雖然施打疫苗不等於100%完全預防疾病\n不過有施打疫苗就是給毛寶貝多一層保護++++\n\n \n\n因為部分傳染病，可能會有：迅速傳播、人畜共通、死亡率高…等問題\n如：犬小病毒(CPV-2)、犬瘟熱(CDV)、狂犬病(Rabies)、貓瘟(FP)、貓白血病FeLV….等\n\n \n\n-----你知道寶貝該施打那些疫苗呢？\n\n \n\n以下提供預防針小知識\n\n \n\n ｜2015年 wsava世界小動物獸醫協會的VGG疫苗指南研議小組\n    發表「犬貓疫苗注射指南」有提到\n\n \n\n    疫苗可分為\n\n\n    ①核心疫苗\n\n \n\n        －具必要性\n\n        　無論在任何情況、處於任何國家，所有的犬貓都應該接受注射的疫苗\n\n \n\n　　－可以保護犬貓免受嚴重、致死性的全球性疾病危害\n\n \n\n        ◥犬：犬瘟熱病毒、犬腺病毒、犬小病毒\n\n \n\n        ◥貓：貓瘟、貓皰疹病毒、貓卡西里病毒\n\n \n\n　　※ 特別注意：在狂犬病流行疫區，無論是否強制規範入法，都應該被視為核心疫苗\n\n \n\n    ②非核心疫苗\n\n \n\n　　－視情況性\n\n　　　動物單純因地理位置、環境或生活方式，\n\n           而有遭受特定病源感染之風險時，才需要注射的疫苗\n \n\n　　    如：犬副流行性感冒、萊姆病、鉤端螺旋體、\n\n           博德氏桿菌、貓白血病毒、貓愛滋病、貓披衣菌…等\n\n \n\n　　－依據個體情況在實際給予即可\n\n \n\n 另，依據同一劑疫苗，可對抗病毒的多寡，可分成以下2種\n\n \n\n　　① 多價疫苗 可對抗多種病毒\n\n \n\n    ◥犬：五合一、八合一、十合一\n\n \n\n    ◥貓：三合一、五合一\n\n \n\n② 單價疫苗 僅能對抗單一病毒\n\n \n\n    如：狂犬病、萊姆病、貓白血病…等\n\n \n\nenlightened 建議：進行預防注射前請和獸醫師討論諮詢\n\n \n\n醫師會依據寶貝的 ①年齡   ②品種   ③健康狀況  ④同伴數量   ⑤生活環境   ⑥社交狀況\n\n以及飼主的 $ 經 濟 考 量 $ 為寶貝量身打造最適合的預防計畫yes\n\n \n\nenlightened 最後小補充\n\n部分疫苗中的佐劑，可能會讓貓咪們引發「惡性腫瘤」\n\n慈愛體系有提供「無佐劑」疫苗，有需求可和獸醫師討論諮詢\n\n \n\n !! 千萬不可因擔心風險，而不幫寶貝施打 !!\n\n@慈愛動物醫院'),('秋冬須知','天氣冷颼颼，小心寵物打哈啾\n \n \n天氣變冷，要讓寵物在寒冷的時候體力佳，保暖與營養需並重護養，寵物才會有足夠的抵抗力。飼主應注意：\n \n1.不要讓牠們直接睡在冰冷的地面。\n \n2.帶寵物出去散步時,注意別淋雨或長時間踩在潮濕的地上。\n \n3.勤幫牠們梳毛,不僅有助衛生,血液循環,長出來的新毛也會健康。\n \n不會說話的寵物們一旦感冒相當麻煩，所以主人更應隨時注意牠們的身體健康，\n寵物感冒跟人一樣,會身體不好，懶洋洋沒力氣，食慾也會降低，\n甚至出現發燒或是流鼻水的症狀。這時一定要帶寵物去專業的動物醫院就診，\n及早對症下藥，降低感冒嚴重化的可能性唷！\n\n@慈愛動物醫院'),('防蟲須知','每到這個時節，天氣總是變得又悶又熱cool\n寶貝比平常更容易出現「啃」、「咬」、「搔」、「抓」\n\n \n\n除了常常抓個不停\n同時也會伴隨著出現「歪頭」、「甩耳」、「脾氣躁動」\n\n \n\n嚴重的話可能會發生...「局部脫毛」、「紅腫脫皮」、「發炎感染」\n\n這些狀況都有可能是「體外寄生蟲」在作怪\n\n \n\n現在，就讓我們一起來了解 3大常見體外寄生蟲\n\n \n\n❖ 跳蚤 \n\n根據統計數據，跳蚤一生可以產下數千個蚤卵\n\n一旦擁有合適的「溫度」及「濕度」\n\n就可讓「蚤卵」發育為「成蚤」（最快只需3週）\n\n \n\n犬貓的體溫略高於人類，較容易被跳蚤叮咬，產生 過敏性皮膚炎\n\n將造成「結痂丘疹」、「脫毛搔癢」、「紅斑感染」\n\n \n\n由於，跳蚤的行動迅速，我們很難用肉眼觀察到，但你可能會在寶貝身上看到的\n\n（一粒一粒黑黑的） 「跳蚤便便」泡水後會變成「淡紅色」\n\n \n\n千萬別小看跳蚤的行動力及繁殖力\n\n❍ 柔軟細毛 ❍ 地板夾層 \n\n❍ 角落邊邊 ❍ 草叢...等，都是他們的藏身之處\n\n \n\n❖ 壁蝨 \n\n吸血大王，尚未吸血前，只比跳蚤大一些些（吸血後會比吸血前膨脹10倍大）\n\n \n\n①不怕水  \n\n②不怕餓（2-3年不進食也不會陣亡）\n\n③超吸附（沒有吸飽血量絕不離開）\n\n \n\n最喜歡出沒在「草叢」跟「陰溼」處，狗狗和貓咪都會被他們盯上，互相感染\n\n \n\n大多是以傳染「血液疾病」為主，影響「紅血球」及「血小板」的運作功能進而引發「貧血」、「腎臟病」，造成「各項器官感染衰竭」\n\n \n\n✽特別注意\n\n當您發現壁蝨出沒時，請避免進行以下動作\n\n \n\n  1. 不要「直接拔除」→避免口器殘留，皮膚受損\n\n \n\n  2. 不要「用打火機燒」→避免燙傷\n\n \n\n  3. 不要「直接捏死」→避免蟲卵擴散              \n\n                           \n\n請直接帶至動物醫院讓專業獸醫師進行處置\n\n \n\n最後還有一類 ❖「疥癬蟲」\n\n常見於耳朵、前腳肘和腹部、後腳踝，臨床症狀：全身性感染(小膿皰)、劇烈搔癢\n\n包含：耳疥蟲、毛囊蟲...等\n\n \n\n耳疥蟲\n\n引起 [耳內騷癢感]，毛寶 [甩/歪頭]  頻率變高，耳道內有 [黑色蓄積分泌物]\n\n \n\n毛囊蟲\n\n主要寄生在 [毛囊] 及 [皮脂腺] 中，需透過 [顯微鏡] 才能看到，可分為 [局部性] 與 [全身性] 依病灶數量區分，尤其是 [免疫力低落] 的 [幼高齡犬貓] 更容易感染\n\n \n\nheart 衷心建議 要對抗這些體外寄生蟲一定要有耐心 !\n\n \n\n這是因為跳蚤、壁蝨不僅僅是「體外寄生蟲」\n\n同時也是 「傳播媒介」（血液寄生蟲 / 腸道寄生蟲 / 細菌...等）\n\n \n\n❖ 跳蚤 會傳播   \n\n▶︎ 血液寄生蟲：血巴東蟲 \n\n▶︎ 腸道寄生蟲：*絛蟲 \n\n▶︎ 細菌：*貓抓病 ...等嚴重疾病 \n\n \n\n❖ 壁蝨會傳播  \n\n▶︎ 血液寄生蟲：血巴東蟲、肝簇蟲、焦蟲、艾利希體\n\n▶︎ 細菌：*萊姆病 ...等\n\n（*表人畜共通傳染病、藍字表：終身性疾病，無法根治\n\n \n\n enlightened最後小補充 為了讓寶貝可以遠離蟲蟲，請跟著我們這樣做\n\n \n\n有空就幫寶貝檢查體表\n\n蟲蟲藏匿處：\n\n✓「耳朵」✓「指尖」✓「皮下」\n\n✓「腹部」✓「四肢交接處」✓「後頸仰角處」...等\n\n \n\n居家清潔   切記：請先把毛寶貝帶離現場避免中毒\n\n平日可用「吸塵器」輔助床具、地板的居家清潔，嚴重時建議可進行大規模的全面消毒\n\n \n\n定期找家庭獸醫師健檢\n\n藉此也能充分與獸醫師諮詢，為毛寶量身挑選最佳的除蟲配套方針\n\n@慈愛動物醫院'),('體重控制','現代的物質環境優渥，除了人們常有體重過重與肥胖之問題外，寵物也漸漸產生了此種問題；尤其是秋冬時節，更是脂肪屯積的好時機。人們常會在意自己身材之問題，但您亦應該要開始注意一下您的寶貝是否也發生了同樣的問題與隱憂了呢！\n \n一、如何判斷寵物超重或肥胖：\n\n有許多資料顯示，一般高於理想體重的15%以下稱之為「過重」；而超過理想體重15%以上就叫做「肥胖」了。但是犬貓品種繁多，實在很難去做一個很客觀的理想體重認定（因為大小體型亦不同）；故您可以做一下初步之自行判定。\n       \n一般的理想體型是不會致肋骨明顯而中腹腰乾扁（過瘦），正常應該是外觀上看不到肋骨（但用觸摸可感覺到肋骨）、有腰身（最後肋骨後有縮小下來）、脊骨及尾椎骨、腸骨脊均可明顯摸出，背部摸到的應是肌肉，而非鬆軟挎挎的（充滿肥油）；腹部、鼠蹊、頸下摸到的也應是薄薄一層皮下就到肌肉了。\n       \n一旦您的寵物摸不太到肋骨、脊骨和尾椎骨，沒有腰身，腹部、頸部路鬆軟挎挎的，背部一片平坦，看不到脊骨，走起路來感覺會晃，那就幾乎確定是過度肥胖了（當然仍須與懷孕或某些腹腔內腫脹或腹水作區別，此部份可能就須由專業醫師判定）；若已確定您的寵物過重或肥胖，您可能就要開始注意以下的問題了。\n \n二、造成肥胖的原因：\n\n所謂肥胖就是食物中含有能量，吃了食物後，能量進入身體以提供身體代謝，生理及活動所需，若進入之能量不足（長期饑餓或疾病），日常生活所須之能量就須由身體組織（如肌肉）消耗來補充不足，就造成消瘦，但有很多狀況往往是進入身體之能量多於日常所需，那就經過轉換成脂肪在各個地方（腹腔內、皮下）堆積起來，這本來是生理上一個很好的機制～儲存以備不時之須，但現代生活優渥，「不時之需」這個狀況要發生的機率很低，而身體儲存脂肪的能力又往往不會適時喊停，這就常常造成過重或肥胖了，另外，當然一些狀況如運動量不足，節育手術或內分泌問題（如低甲狀線功能症等）亦有可能造成肥胖。\n \n三、肥胖有哪些害處：\n大家都很清楚過度肥胖的人或動物夀命會較短，健康狀況也會較差，一旦生病，用藥的量（某些藥物）會較難精準，尤其是須麻醉時，風險較大，除了這些，再提供您一些資訊：\n\n \n\n1. 過度肥胖的動物會因物理因素，使局部骨關節之負載大於正常，\n    那當然就較易發生骨關節問題了（如退化、關節炎等）。\n \n2. 寵物的體力下降，免疫力較差，跟主人玩樂的意願降低。\n \n3. 容易發生心血管疾病（血脂肪過高）。\n\n \n\n4. 糖尿病也相對的增高發生之風險。\n\n \n\n5. 氣管塌陷發生的機率大增（其實大部份氣管塌陷多發生在老年肥胖動物）。\n\n \n\n6. 肝臟代謝也容易出問題。\n \n7. 一旦有受傷、傷口、骨折等，癒合也會較差、較慢。\n \n有那麼多害處，您能再不重視這個問題嗎？當然有關肥胖控制或減重改善的問題及處理方式，您最好跟您的專任獸醫師作細部研討（是否有內分泌或其他病因），但有一部份（很重要的一部份）是您可以為您的肥胖寵物注意到的事先預防方法：\n \n1.  慎選食物及餵食方式：\n一般可能還有些人認為，要減肥就少給它吃就好了，這是超殘忍的不正確觀念，尤其是肥胖動物，常是好吃一族，一下子減掉太多食物，任其處於饑餓痛苦中，是會讓它非常難適應的。而且減重若一下子減太多太快，反而容易造成健康問題（如肌肉消耗、脂肪肝等）。正常的減重模式是建議採漸進方式，每週理想大概減掉原來體重的2%左右（最好與您的醫師擬訂計劃），花一段時間慢慢減肥，到理想體重附近時也較不易再回肥或原來的肥胖狀況。\n \n食物的選擇採較高蛋白，纖維及合適礦物質、維生素、低脂肪及碳水化合成份為原則，因減肥是要減掉脂肪而不是肌肉（肌肉維持代謝須有蛋白質）脂肪及碳水化合物（也就是肥油或穀類澱粉）單位提供的能源遠高過蛋白質（精瘦肉），且蛋白質及纖維成份易提供動物飽足感，免於饑餓的痛苦；另須定量給予食物，建議少量多次（一天量分3～4次分次給予）；您可選擇市售的現成減肥乾狗糧或罐頭，比較方便且合適，至於量多少，可以請教您的獸醫師或參考原廠標示的建議量。\n \n2.  改善寵物行為：\n嚴禁給予其他零食或人類食物（或食餘）；因為這些正餐外的食物往往是過多能量（脂肪堆積的原因，尤其人類食物常因美味因素有著過多脂肪、碳水化合物（特別是薯條、薯片）及調味劑、鹽份等，這些對寵物健康都是有嚴重傷害的食物喔，您這時就須發揮人類偉大的理智，有點殘忍的拒絕您寵物對您的哀憐乞食。另外，若您不止一隻寵物，建議您在餵食時，一定要將肥胖減重寵物分開個別餵食，以免它有搶食、速食的動作。\n \n3.  合適的運動：\n游泳、散歩或慢跑均是很好的運動方式，但首先您要視別一下狀況。萬不可將貓或不會游泳的犬種丟入水中，那就太扯了，也不可在大熱天中午，硬牽著您的胖胖寶貝跑歩，那不中暑或喘倒了才怪呢。若您的寵物已有心肺問題存在，那也祇能作散歩等運動；過度運動可能導致心肺疾病發作等問題。貓則建議採室內予以玩具或逗貓棒讓其追逐天性達到運動目的。合適的運動最重要的是可以消耗過多能量，減少或避免脂肪堆積；另一方面也可以對生理代謝有幫助，而且對骨關節亦有助益（尤其是游泳水療SPA均不錯）。\n \n若您的寵物真有肥胖過重問題，請快與您的獸醫師研究一下，讓獸醫師、您、寵物三者一齊努力，按歩就班地脫去您寵物多餘的負擔。回復健康美囉。\n\n@ 黃彥勳 醫師');
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

-- Dump completed on 2022-04-15 16:18:38
