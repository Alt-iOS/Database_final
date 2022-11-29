-- MariaDB dump 10.19  Distrib 10.4.21-MariaDB, for osx10.10 (x86_64)
--
-- Host: localhost    Database: Ferreteria
-- ------------------------------------------------------
-- Server version	10.4.21-MariaDB

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `Direcccion`
--

DROP TABLE IF EXISTS `Direcccion`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `Direcccion` (
  `CodigoP` int(5) NOT NULL,
  `Calle` varchar(100) COLLATE utf8mb4_spanish2_ci NOT NULL,
  `Ciudad` varchar(100) COLLATE utf8mb4_spanish2_ci NOT NULL,
  PRIMARY KEY (`CodigoP`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_spanish2_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `Direcccion`
--

LOCK TABLES `Direcccion` WRITE;
/*!40000 ALTER TABLE `Direcccion` DISABLE KEYS */;
INSERT INTO `Direcccion` VALUES (11846,'Mitchell','Uppsala'),(12595,'Reinke','Derhachi'),(15038,'Upham','Banjar Delodrurung'),(17304,'Lindbergh','Bulgan'),(26733,'Forest Dale','Vale Covo'),(28408,'Pennsylvania','Hāgere Selam'),(31945,'Ruskin','Kousséri'),(32338,'Hayes','Paris La Défense'),(32659,'Thierer','Māymay'),(33420,'Graedel','Krutinka'),(36101,'Glendale','Haocun'),(39722,'Bunker Hill','Shardara'),(40812,'Crest Line','Petaling Jaya'),(42459,'Acker','Placencia'),(44012,'Jenifer','Palykavichy Pyershyya'),(46714,'Welch','Tengger'),(49774,'Glacier Hill','Handa'),(51965,'Northwestern','Muruy'),(51975,'Texas','Jingtou'),(59814,'Warbler','Naji'),(60412,'Dixon','Azinhal'),(60427,'Hoard','Mendeleyevsk'),(61625,'Fairfield','Dasuhe'),(63426,'Fairfield','Oropós'),(66424,'Lakewood','Phra Khanong'),(71122,'Norway Maple','Canindé'),(72195,'Fieldstone','Šentjur'),(74053,'Di Loreto','Ivanivka'),(77258,'Kim','Xiangdian'),(79772,'Roxbury','Ruteng'),(81075,'Magdeline','Papakura'),(83409,'Southridge','Grenoble'),(89289,'Springs','Rawang'),(89513,'Blue Bill Park','Araguari'),(90383,'Kropf','Balucawi'),(95405,'Carioca','Dalumangcob'),(97516,'Butternut','Kalebun'),(97609,'Magdeline','Roissy Charles-de-Gaulle'),(97879,'La Follette','Al Mazra‘ah ash Sharqīyah'),(97926,'7th','Irshava');
/*!40000 ALTER TABLE `Direcccion` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `Ventas`
--

DROP TABLE IF EXISTS `Ventas`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `Ventas` (
  `id_venta` bigint(20) NOT NULL AUTO_INCREMENT,
  `modelo_producto` varchar(100) CHARACTER SET utf8mb4 COLLATE utf8mb4_spanish2_ci NOT NULL,
  `id_empleado` varchar(18) CHARACTER SET utf8mb4 COLLATE utf8mb4_spanish2_ci NOT NULL,
  `id_cliente` bigint(20) NOT NULL,
  `id_envio` bigint(20) DEFAULT NULL,
  `id_sucursal` bigint(20) NOT NULL,
  `cantidad` int(11) NOT NULL,
  PRIMARY KEY (`id_venta`),
  KEY `Ventas_FK` (`id_cliente`),
  KEY `Ventas_FK_1` (`modelo_producto`),
  KEY `Ventas_FK_2` (`id_sucursal`),
  KEY `Ventas_FK_3` (`id_empleado`),
  KEY `Ventas_FK_4` (`id_envio`),
  CONSTRAINT `Ventas_FK` FOREIGN KEY (`id_cliente`) REFERENCES `clientes` (`id_cliente`) ON DELETE CASCADE ON UPDATE CASCADE,
  CONSTRAINT `Ventas_FK_1` FOREIGN KEY (`modelo_producto`) REFERENCES `productos` (`modelo_producto`) ON DELETE CASCADE ON UPDATE CASCADE,
  CONSTRAINT `Ventas_FK_2` FOREIGN KEY (`id_sucursal`) REFERENCES `sucursales` (`id_sucursal`) ON DELETE CASCADE ON UPDATE CASCADE,
  CONSTRAINT `Ventas_FK_3` FOREIGN KEY (`id_empleado`) REFERENCES `empleados` (`CURP`) ON DELETE CASCADE ON UPDATE CASCADE,
  CONSTRAINT `Ventas_FK_4` FOREIGN KEY (`id_envio`) REFERENCES `envios` (`id_envio`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB AUTO_INCREMENT=28 DEFAULT CHARSET=utf8mb4;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `Ventas`
--

LOCK TABLES `Ventas` WRITE;
/*!40000 ALTER TABLE `Ventas` DISABLE KEYS */;
INSERT INTO `Ventas` VALUES (1,'0547cqc840','0XRH2PUL1FQXC3Z5I1',1,5,1,1),(2,'1894ebr778','CY63P1832F3CQOXWDU',5,NULL,2,3),(3,'486kof6857','5BEAUYO756R3ZY7BR6',9,4,3,5),(4,'615ira6405','A64J41LK39C1XOV3ZY',6,12,1,7),(5,'615ira6405','A64J41LK39C1XOV3ZY',17,11,3,8),(6,'0547cqc840','7U32NRLVBRA27F3LIY',5,12,3,9),(7,'486kof6857','A64J41LK39C1XOV3ZY',8,10,2,5),(8,'0547cqc840','7U32NRLVBRA27F3LIY',5,NULL,1,7),(9,'615ira6405','9XRKABJ38XEND6LRX8',10,4,2,3),(10,'0547cqc840','CY63P1832F3CQOXWDU',2,8,3,2),(11,'0547cqc840','7U32NRLVBRA27F3LIY',5,8,2,5),(12,'2738awe080','FZ2SCA5VSB4AYP8SUT',15,7,3,4),(13,'0884uab783','CIDM2ZCY0E33GOEY95',6,12,1,4),(14,'700vwd5614','CY63P1832F3CQOXWDU',2,7,3,8),(15,'700vwd5614','CIDM2ZCY0E33GOEY95',5,10,3,2),(16,'0547cqc840','A64J41LK39C1XOV3ZY',18,4,1,5),(17,'615ira6405','7U32NRLVBRA27F3LIY',17,18,2,9),(18,'5900iyy439','CY63P1832F3CQOXWDU',15,15,1,6),(19,'0547cqc840','CY63P1832F3CQOXWDU',14,4,1,4),(20,'615ira6405','EX8BI203CX0F0BHLHL',5,11,1,5);
/*!40000 ALTER TABLE `Ventas` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `clientes`
--

DROP TABLE IF EXISTS `clientes`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `clientes` (
  `id_cliente` bigint(20) NOT NULL AUTO_INCREMENT,
  `nombre` varchar(15) COLLATE utf8mb4_spanish2_ci NOT NULL,
  `apellido_p` varchar(15) COLLATE utf8mb4_spanish2_ci NOT NULL,
  `celular` bigint(10) NOT NULL,
  `correo` varchar(30) COLLATE utf8mb4_spanish2_ci NOT NULL,
  PRIMARY KEY (`id_cliente`)
) ENGINE=InnoDB AUTO_INCREMENT=22 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_spanish2_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `clientes`
--

LOCK TABLES `clientes` WRITE;
/*!40000 ALTER TABLE `clientes` DISABLE KEYS */;
INSERT INTO `clientes` VALUES (1,'Toinette','Sissland',4187861896,'tsissland0@cafepress.com'),(2,'Brandie','Lorain',8023438742,'ajdfhoadhf@gmail.com'),(3,'Shanda','Wiles',2022523640,'swiles2@sina.com.cn'),(4,'Loree','Crannage',3137073047,'lcrannage3@over-blog.com'),(5,'Aurea','Lorain',1466304518,'alorain4@xinhuanet.com'),(6,'Brandie','Syres',2155337443,'bsyres5@buzzfeed.com'),(7,'Albie','Curmi',4787414448,'acurmi6@mysql.com'),(8,'Carolina','Mathias',5681785576,'cmathias7@sphinn.com'),(9,'Eimile','Kee',9779870605,'ekee8@mtv.com'),(10,'Alice','Caseley',8382976500,'acaseley9@utexas.edu'),(11,'Erik','Lanmeid',9342651764,'elanmeida@army.mil'),(12,'Free','McKissack',3898991845,'fmckissackb@xinhuanet.com'),(13,'Sheela','Hallward',5182439757,'shallwardc@mozilla.com'),(14,'Aurelia','Raw',9586011302,'arawd@biblegateway.com'),(15,'Joyann','Di Dello',3306232625,'jdidelloe@aboutads.info'),(16,'Kelsi','McGarel',4102653877,'kmcgarelf@examiner.com'),(17,'Blondelle','Heikkinen',1584262849,'bheikkineng@51.la'),(18,'Jamie','Dutteridge',4745152381,'jdutteridgeh@qq.com'),(19,'Tamar','Beaushaw',4815525497,'tbeaushawi@moonfruit.com'),(20,'Judith','Brabbins',7637486490,'jbrabbinsj@rambler.ru'),(21,'qw','qwe',9999999999,'asd');
/*!40000 ALTER TABLE `clientes` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `empleados`
--

DROP TABLE IF EXISTS `empleados`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `empleados` (
  `CURP` varchar(18) COLLATE utf8mb4_spanish2_ci NOT NULL,
  `nombre` varchar(15) COLLATE utf8mb4_spanish2_ci NOT NULL,
  `apellido_p` varchar(15) COLLATE utf8mb4_spanish2_ci NOT NULL,
  `celular` bigint(10) NOT NULL,
  `correo` varchar(30) COLLATE utf8mb4_spanish2_ci NOT NULL,
  `id_posicion` int(2) NOT NULL,
  PRIMARY KEY (`CURP`),
  KEY `empleados_FK` (`id_posicion`),
  CONSTRAINT `empleados_FK` FOREIGN KEY (`id_posicion`) REFERENCES `posicion` (`id_posicion`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_spanish2_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `empleados`
--

LOCK TABLES `empleados` WRITE;
/*!40000 ALTER TABLE `empleados` DISABLE KEYS */;
INSERT INTO `empleados` VALUES ('0XRH2PUL1FQXC3Z5I1','Kasper','Gonsalvez',9992212973,'kgonsalvez1@answers.com',1),('5BEAUYO756R3ZY7BR6','Beltran','Flode',9992828402,'bflode3@miitbeian.gov.cn',2),('7U32NRLVBRA27F3LIY','Carmen','Bearns',9998668074,'cbearns2@spotify.com',3),('9XRKABJ38XEND6LRX8','Stacy','Franscioni',9994399527,'sfranscionif@whitehouse.gov',2),('A64J41LK39C1XOV3ZY','Sheila','Darter',9995458481,'sdarter9@go.com',2),('CIDM2ZCY0E33GOEY95','Katalin','Hatley',9998830923,'khatley8@illinois.edu',3),('CY63P1832F3CQOXWDU','Keslie','Hane',9994404084,'khane7@amazon.com',1),('ES2WY7ST85N14NBN4X','Bing','McTurk',9992872177,'bmcturki@google.es',3),('EX8BI203CX0F0BHLHL','Lem','Cabrara',9998033418,'lcabrara5@jalbum.net',2),('FZ2SCA5VSB4AYP8SUT','Renaud','Kempe',9990453317,'rkempeb@apple.com',3),('GO74IO89VY1LGIUZ2T','Buckie','Cozens',9992173101,'bcozensg@tripod.com',2),('I7PJBPKOF3FNCG9WTC','Cash','De Moreno',9999158423,'cdemorenod@phoca.cz',1),('IIOAHXNIDAXS17GFBZ','Eveline','List',9994381252,'eliste@icq.com',2),('LJ96WK6MIGUFD6AFPZ','Dena','Wiggett',9995921423,'dwiggett6@a8.net',2),('P1OM447S1I4YIUGBAR','Mireille','Prynne',9997962360,'mprynnej@nhs.uk',3),('QKYAPYBQYCDIJV2PMB','Uriah','Hoggan',9992512780,'uhogganh@google.es',2),('QLCGA7N745EJ3JAO1S','Thomasin','Adolphine',9993737562,'tadolphinec@prlog.org',3),('YCAA8AIJLU2GXZ42SL','Engracia','Finey',9995287819,'efiney0@tamu.edu',2),('YMS2LH9CY5EON6KQBB','Fania','Downgate',9990324358,'fdowngate4@google.it',2),('ZHKGLS0ZCVYCIDUE8M','Fancie','Heinssen',9992172953,'fheinssena@studiopress.com',2);
/*!40000 ALTER TABLE `empleados` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `envios`
--

DROP TABLE IF EXISTS `envios`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `envios` (
  `id_envio` int(10) NOT NULL AUTO_INCREMENT,
  `placa_vehiculos` varchar(20) COLLATE utf8mb4_spanish2_ci NOT NULL,
  `fecha_entrega` date NOT NULL,
  `CURP_conductores` varchar(18) COLLATE utf8mb4_spanish2_ci NOT NULL,
  `CodigoP` int(5) NOT NULL,
  PRIMARY KEY (`id_envio`),
  KEY `envios_FK` (`placa_vehiculos`),
  KEY `envios_FK_1` (`CURP_conductores`),
  KEY `envios_FK_2` (`CodigoP`),
  CONSTRAINT `envios_FK` FOREIGN KEY (`placa_vehiculos`) REFERENCES `vehiculos` (`placas`) ON DELETE CASCADE ON UPDATE CASCADE,
  CONSTRAINT `envios_FK_1` FOREIGN KEY (`CURP_conductores`) REFERENCES `empleados` (`CURP`) ON DELETE CASCADE ON UPDATE CASCADE,
  CONSTRAINT `envios_FK_2` FOREIGN KEY (`CodigoP`) REFERENCES `Direcccion` (`CodigoP`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB AUTO_INCREMENT=23 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_spanish2_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `envios`
--

LOCK TABLES `envios` WRITE;
/*!40000 ALTER TABLE `envios` DISABLE KEYS */;
INSERT INTO `envios` VALUES (1,'1D7RB1CP6AS786737','2021-04-17','7U32NRLVBRA27F3LIY',71122),(2,'1FMJU1G56AE675770','2021-05-02','CIDM2ZCY0E33GOEY95',72195),(3,'1FTSW2B53AE150519','2021-05-05','ES2WY7ST85N14NBN4X',90383),(4,'1G6AA5RXXE0200103','2021-06-11','FZ2SCA5VSB4AYP8SUT',49774),(5,'1G6DK5EY0B0287742','2022-06-17','P1OM447S1I4YIUGBAR',51975),(6,'1D7RB1CP6AS786737','2021-06-28','QLCGA7N745EJ3JAO1S',95405),(7,'1FMJU1G56AE675770','2022-07-12','7U32NRLVBRA27F3LIY',77258),(8,'1FTSW2B53AE150519','2021-07-28','CIDM2ZCY0E33GOEY95',15038),(9,'1G6AA5RXXE0200103','2021-09-03','ES2WY7ST85N14NBN4X',83409),(10,'1G6DK5EY0B0287742','2021-10-06','FZ2SCA5VSB4AYP8SUT',79772),(11,'1D7RB1CP6AS786737','2021-11-08','P1OM447S1I4YIUGBAR',81075),(12,'1FMJU1G56AE675770','2021-12-02','QLCGA7N745EJ3JAO1S',97879),(13,'1FTSW2B53AE150519','2021-12-12','P1OM447S1I4YIUGBAR',39722),(14,'1G6AA5RXXE0200103','2021-12-15','FZ2SCA5VSB4AYP8SUT',66424),(15,'1G6DK5EY0B0287742','2021-12-02','ES2WY7ST85N14NBN4X',33420),(16,'1D7RB1CP6AS786737','2022-01-05','P1OM447S1I4YIUGBAR',74053),(17,'1FMJU1G56AE675770','2022-02-06','7U32NRLVBRA27F3LIY',60412),(18,'1FTSW2B53AE150519','2022-03-12','ES2WY7ST85N14NBN4X',33420),(19,'1G6AA5RXXE0200103','2022-04-01','QLCGA7N745EJ3JAO1S',79772),(20,'1G6DK5EY0B0287742','2022-05-12','7U32NRLVBRA27F3LIY',81075),(21,'1G6AA5RXXE0200103','2022-05-21','CIDM2ZCY0E33GOEY95',60427),(22,'1G6DK5EY0B0287742','2022-05-22','FZ2SCA5VSB4AYP8SUT',79772);
/*!40000 ALTER TABLE `envios` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `posicion`
--

DROP TABLE IF EXISTS `posicion`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `posicion` (
  `id_posicion` int(2) NOT NULL AUTO_INCREMENT,
  `Nombre_posicion` varchar(20) COLLATE utf8mb4_spanish2_ci NOT NULL,
  `salario` int(5) NOT NULL,
  PRIMARY KEY (`id_posicion`)
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_spanish2_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `posicion`
--

LOCK TABLES `posicion` WRITE;
/*!40000 ALTER TABLE `posicion` DISABLE KEYS */;
INSERT INTO `posicion` VALUES (1,'Gerente',8000),(2,'Vendedor',7000),(3,'Conductor',6000),(4,'we',32);
/*!40000 ALTER TABLE `posicion` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `productos`
--

DROP TABLE IF EXISTS `productos`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `productos` (
  `modelo_producto` varchar(100) COLLATE utf8mb4_spanish2_ci NOT NULL,
  `id_proveedor` bigint(20) NOT NULL,
  `descripcion` text COLLATE utf8mb4_spanish2_ci NOT NULL,
  `inventario` int(4) NOT NULL,
  PRIMARY KEY (`modelo_producto`),
  KEY `productos_FK` (`id_proveedor`),
  CONSTRAINT `productos_FK` FOREIGN KEY (`id_proveedor`) REFERENCES `proveedores` (`id_proveedor`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_spanish2_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `productos`
--

LOCK TABLES `productos` WRITE;
/*!40000 ALTER TABLE `productos` DISABLE KEYS */;
INSERT INTO `productos` VALUES ('0547cqc840',5,'MALLA',98),('0884uab783',1,'PALA',35),('1894ebr778',6,'LAMINA DE HIERRO',97),('1994omc928',2,'Escaleras',35),('2738awe080',3,'MARTILLO',70),('417gvs0442',1,'Cadena galvanizado',26),('4366wxg145',9,'PVC',95),('486kof6857',3,'Pinza corte diagonal',86),('5195vij865',7,'PICO',46),('5625ida902',6,'Pinza',87),('5697wxa411',3,'Llave inglesa',56),('5900iyy439',9,'Llave combinada corta',30),('615ira6405',1,'Esmeriladora',69),('6391cwk497',7,'Cinta metrica',75),('6919ecf058',2,'DESARTONILLADOR',12),('700vwd5614',3,'Rectificadora',87),('7459ejw544',3,'Pintura mate azul',94),('8645awy012',1,'CEMENTO',10),('9031bnx312',4,'CLAVOS DE 3/4',23),('9509yfw659',1,'Cerrucho',64);
/*!40000 ALTER TABLE `productos` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `proveedores`
--

DROP TABLE IF EXISTS `proveedores`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `proveedores` (
  `id_proveedor` bigint(20) NOT NULL AUTO_INCREMENT,
  `nombre` text COLLATE utf8mb4_spanish2_ci NOT NULL,
  `telefono` bigint(10) NOT NULL,
  `correo` varchar(30) COLLATE utf8mb4_spanish2_ci NOT NULL,
  PRIMARY KEY (`id_proveedor`)
) ENGINE=InnoDB AUTO_INCREMENT=23 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_spanish2_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `proveedores`
--

LOCK TABLES `proveedores` WRITE;
/*!40000 ALTER TABLE `proveedores` DISABLE KEYS */;
INSERT INTO `proveedores` VALUES (1,'Satterfield and Sons',7435414026,'lgreser0@chicagotribune.com'),(2,'Hudson-Lynch',3617220902,'kmardoll1@github.com'),(3,'Glover Inc',6025195579,'tetheredge2@npr.org'),(4,'Bergnaum and Sons',7227000379,'mjeannet3@1688.com'),(5,'Herman, Kiehn and Wiegand',1544487696,'kivons4@imdb.com'),(6,'Hoppe Inc',6294734119,'ogauch5@dot.gov'),(7,'Jacobson-Rolfson',7689352471,'dbarrowcliff6@sfgate.com'),(8,'Rau, Shields and Casper',4308816444,'cstibbs7@shutterfly.com'),(9,'Cormier Group',4449652303,'vtreversh8@bluehost.com'),(10,'Dibbert, Herman and Witting',9778655079,'dquaintance9@home.pl'),(11,'Runolfsson, Feeney and Zieme',7789321818,'gtripeta@delicious.com'),(12,'White-Walker',1644171150,'plangstoneb@techcrunch.com'),(13,'Jaskolski, Pacocha and Dibbert',8214978531,'tgrocockc@technorati.com'),(14,'Mohr-Ruecker',4358390031,'ddevennied@timesonline.co.uk'),(15,'Schmitt-Leannon',1433143272,'wsavillee@gov.uk'),(16,'Gislason Group',6227801536,'gdoutchf@quantcast.com'),(17,'Hills-Marks',3458061151,'cfiellerg@tuttocitta.it'),(18,'Mante Group',4446899760,'lcrinionh@opera.com'),(19,'Macejkovic, Kertzmann and Marks',7779608693,'bcocksoni@earthlink.net'),(20,'Paucek-Gleason',9772024587,'cwoehlerj@parallels.com');
/*!40000 ALTER TABLE `proveedores` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `sucursales`
--

DROP TABLE IF EXISTS `sucursales`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `sucursales` (
  `id_sucursal` int(10) NOT NULL AUTO_INCREMENT,
  `telefono` bigint(10) NOT NULL,
  `correo_sucursal` varchar(30) COLLATE utf8mb4_spanish2_ci NOT NULL,
  `CodigoP` int(5) NOT NULL,
  PRIMARY KEY (`id_sucursal`),
  KEY `sucursales_FK` (`CodigoP`),
  CONSTRAINT `sucursales_FK` FOREIGN KEY (`CodigoP`) REFERENCES `Direcccion` (`CodigoP`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_spanish2_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `sucursales`
--

LOCK TABLES `sucursales` WRITE;
/*!40000 ALTER TABLE `sucursales` DISABLE KEYS */;
INSERT INTO `sucursales` VALUES (1,2318179901,'cbealton0@tuttocitta.it',95405),(2,2385831040,'brobet1@elegantthemes.com',89513),(3,9801738768,'criccio2@ovh.net',72195);
/*!40000 ALTER TABLE `sucursales` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `vehiculos`
--

DROP TABLE IF EXISTS `vehiculos`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `vehiculos` (
  `placas` varchar(20) COLLATE utf8mb4_spanish2_ci NOT NULL,
  `modelo_vehiculo` varchar(100) COLLATE utf8mb4_spanish2_ci NOT NULL,
  `marca` varchar(100) COLLATE utf8mb4_spanish2_ci NOT NULL,
  `año` int(4) NOT NULL,
  PRIMARY KEY (`placas`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_spanish2_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `vehiculos`
--

LOCK TABLES `vehiculos` WRITE;
/*!40000 ALTER TABLE `vehiculos` DISABLE KEYS */;
INSERT INTO `vehiculos` VALUES ('1D7RB1CP6AS786737','1626','Hino',2022),('1FMJU1G56AE675770','Heavy Haul','Volvo',2020),('1FTSW2B53AE150519','T680','Kenworth',2021),('1G6AA5RXXE0200103','114SD','Freightliner',2020),('1G6DK5EY0B0287742','Cascada','Freightliner',2018);
/*!40000 ALTER TABLE `vehiculos` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Dumping events for database 'Ferreteria'
--

--
-- Dumping routines for database 'Ferreteria'
--
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2022-11-29 12:26:40
