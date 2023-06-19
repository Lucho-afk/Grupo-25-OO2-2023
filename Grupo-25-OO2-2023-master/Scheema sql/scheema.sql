CREATE DATABASE  IF NOT EXISTS `dispositivos` /*!40100 DEFAULT CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci */ /*!80016 DEFAULT ENCRYPTION='N' */;
USE `dispositivos`;
-- MySQL dump 10.13  Distrib 8.0.32, for Win64 (x86_64)
--
-- Host: localhost    Database: dispositivos
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
-- Table structure for table `dispositivo`
--

DROP TABLE IF EXISTS `dispositivo`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `dispositivo` (
  `estado` int DEFAULT NULL,
  `id_dispositivo` int NOT NULL AUTO_INCREMENT,
  `nombre` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id_dispositivo`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `dispositivo`
--

LOCK TABLES `dispositivo` WRITE;
/*!40000 ALTER TABLE `dispositivo` DISABLE KEYS */;
INSERT INTO `dispositivo` VALUES (1,1,'estacionamiento inteligente'),(1,2,'aspersor inteligente'),(1,3,'luces automaticas'),(1,4,'recolector inteligente');
/*!40000 ALTER TABLE `dispositivo` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `evento`
--

DROP TABLE IF EXISTS `evento`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `evento` (
  `estado` int DEFAULT NULL,
  `id_evento` int NOT NULL AUTO_INCREMENT,
  `fecha_hora` datetime(6) DEFAULT NULL,
  `descripcion` varchar(255) DEFAULT NULL,
  `unidad` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id_evento`),
  KEY `FK9f5yfpcimrj4ybyrqx3i17cfk` (`unidad`),
  CONSTRAINT `FK9f5yfpcimrj4ybyrqx3i17cfk` FOREIGN KEY (`unidad`) REFERENCES `unidad` (`id_unidad`)
) ENGINE=InnoDB AUTO_INCREMENT=61 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `evento`
--

LOCK TABLES `evento` WRITE;
/*!40000 ALTER TABLE `evento` DISABLE KEYS */;
INSERT INTO `evento` VALUES (1,1,'2023-06-01 10:30:00.000000','se ocupa lugar','estacionamiento 1'),(0,2,'2023-06-01 11:30:00.000000','se libera lugar','estacionamiento 1'),(1,3,'2023-06-02 20:00:00.000000','se ocupa lugar','estacionamiento 1'),(0,4,'2023-06-03 09:00:00.000000','se libera lugar','estacionamiento 1'),(1,5,'2023-06-05 05:45:00.000000','se ocupa lugar','estacionamiento 1'),(1,6,'2023-06-01 14:30:00.000000','se ocupa lugar','estacionamiento 2'),(0,7,'2023-06-01 15:30:00.000000','se libera lugar','estacionamiento 2'),(1,8,'2023-06-02 16:00:00.000000','se ocupa lugar','estacionamiento 2'),(0,9,'2023-06-03 17:00:00.000000','se libera lugar','estacionamiento 2'),(1,10,'2023-06-05 18:45:00.000000','se ocupa lugar','estacionamiento 2'),(1,11,'2023-06-01 02:30:00.000000','se ocupa lugar','estacionamiento 3'),(0,12,'2023-06-01 03:30:00.000000','se libera lugar','estacionamiento 3'),(1,13,'2023-06-02 04:00:00.000000','se ocupa lugar','estacionamiento 3'),(0,14,'2023-06-03 05:00:00.000000','se libera lugar','estacionamiento 3'),(1,15,'2023-06-05 06:45:00.000000','se ocupa lugar','estacionamiento 3'),(1,16,'2023-06-01 10:30:00.000000','encendido','aspersor 1'),(0,17,'2023-06-01 11:30:00.000000','apagado','aspersor 1'),(1,18,'2023-06-02 20:00:00.000000','encendido','aspersor 1'),(0,19,'2023-06-03 09:00:00.000000','apagado','aspersor 1'),(1,20,'2023-06-05 05:45:00.000000','encendido','aspersor 1'),(1,21,'2023-06-01 14:30:00.000000','encendido','aspersor 2'),(0,22,'2023-06-01 15:30:00.000000','apagado','aspersor 2'),(1,23,'2023-06-02 16:00:00.000000','encendido','aspersor 2'),(0,24,'2023-06-03 17:00:00.000000','apagado','aspersor 2'),(1,25,'2023-06-05 18:45:00.000000','encendido','aspersor 2'),(1,26,'2023-06-01 02:30:00.000000','encendido','aspersor 3'),(0,27,'2023-06-01 03:30:00.000000','apagado','aspersor 3'),(1,28,'2023-06-02 04:00:00.000000','encendido','aspersor 3'),(0,29,'2023-06-03 05:00:00.000000','apagado','aspersor 3'),(1,30,'2023-06-05 06:45:00.000000','encendido','aspersor 3'),(1,31,'2023-06-01 10:30:00.000000','encendido','luces 1'),(0,32,'2023-06-01 11:30:00.000000','apagado','luces 1'),(1,33,'2023-06-02 20:00:00.000000','encendido','luces 1'),(0,34,'2023-06-03 09:00:00.000000','apagado','luces 1'),(1,35,'2023-06-05 05:45:00.000000','encendido','luces 1'),(1,36,'2023-06-01 14:30:00.000000','encendido','luces 2'),(0,37,'2023-06-01 15:30:00.000000','apagado','luces 2'),(1,38,'2023-06-02 16:00:00.000000','encendido','luces 2'),(0,39,'2023-06-03 17:00:00.000000','apagado','luces 2'),(1,40,'2023-06-05 18:45:00.000000','encendido','luces 2'),(1,41,'2023-06-01 02:30:00.000000','encendido','luces 3'),(0,42,'2023-06-01 03:30:00.000000','apagado','luces 3'),(1,43,'2023-06-02 04:00:00.000000','encendido','luces 3'),(0,44,'2023-06-03 05:00:00.000000','apagado','luces 3'),(1,45,'2023-06-05 06:45:00.000000','encendido','luces 3'),(1,46,'2023-06-01 10:30:00.000000','encendido','recolector 1'),(0,47,'2023-06-01 11:30:00.000000','apagado','recolector 1'),(1,48,'2023-06-02 20:00:00.000000','encendidor','recolector 1'),(0,49,'2023-06-03 09:00:00.000000','apagado','recolector 1'),(1,50,'2023-06-05 05:45:00.000000','encendido','recolector 1'),(1,51,'2023-06-01 14:30:00.000000','encendido','recolector 2'),(0,52,'2023-06-01 15:30:00.000000','apagado','recolector 2'),(1,53,'2023-06-02 16:00:00.000000','encendido','recolector 2'),(0,54,'2023-06-03 17:00:00.000000','apagado','recolector 2'),(1,55,'2023-06-05 18:45:00.000000','encendido','recolector 2'),(1,56,'2023-06-01 02:30:00.000000','encendido','recolector 3'),(0,57,'2023-06-01 03:30:00.000000','apagado','recolector 3'),(1,58,'2023-06-02 04:00:00.000000','encendido','recolector 3'),(0,59,'2023-06-03 05:00:00.000000','apagado','recolector 3'),(1,60,'2023-06-05 06:45:00.000000','encendido','recolector 3');
/*!40000 ALTER TABLE `evento` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `unidad`
--

DROP TABLE IF EXISTS `unidad`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `unidad` (
  `dispositivo` int DEFAULT NULL,
  `estado` int DEFAULT NULL,
  `id_unidad` varchar(255) NOT NULL,
  PRIMARY KEY (`id_unidad`),
  KEY `FK4egqspfq869gkb23bxsftoy6b` (`dispositivo`),
  CONSTRAINT `FK4egqspfq869gkb23bxsftoy6b` FOREIGN KEY (`dispositivo`) REFERENCES `dispositivo` (`id_dispositivo`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `unidad`
--

LOCK TABLES `unidad` WRITE;
/*!40000 ALTER TABLE `unidad` DISABLE KEYS */;
INSERT INTO `unidad` VALUES (2,1,'aspersor 1'),(2,1,'aspersor 2'),(2,1,'aspersor 3'),(1,1,'estacionamiento 1'),(1,1,'estacionamiento 2'),(1,1,'estacionamiento 3'),(3,1,'luces 1'),(3,1,'luces 2'),(3,1,'luces 3'),(4,1,'recolector 1'),(4,1,'recolector 2'),(4,1,'recolector 3');
/*!40000 ALTER TABLE `unidad` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2023-06-17 19:19:29

