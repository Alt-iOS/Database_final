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
) ENGINE=InnoDB AUTO_INCREMENT=22 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_spanish2_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

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
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_spanish2_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

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

-- Dump completed on 2022-05-16  6:54:19
