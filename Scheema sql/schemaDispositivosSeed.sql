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
  `id_dispositivo` int NOT NULL AUTO_INCREMENT,
  `estado` int DEFAULT NULL,
  `nombre` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id_dispositivo`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `dispositivo`
--

LOCK TABLES `dispositivo` WRITE;
/*!40000 ALTER TABLE `dispositivo` DISABLE KEYS */;
INSERT INTO `dispositivo` VALUES (1,1,'estacionamiento inteligente'),(2,1,'aspersor inteligente'),(3,1,'luces automaticas'),(4,1,'recolector inteligente');
/*!40000 ALTER TABLE `dispositivo` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `evento`
--

DROP TABLE IF EXISTS `evento`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `evento` (
  `id_evento` int NOT NULL AUTO_INCREMENT,
  `descripcion` varchar(255) DEFAULT NULL,
  `estado` int DEFAULT NULL,
  `fecha_hora` datetime(6) DEFAULT NULL,
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
INSERT INTO `evento` VALUES (1,'encendido',1,'2023-06-01 10:30:00.000000','estacionamiento 1'),(2,'apagado',0,'2023-06-01 11:30:00.000000','estacionamiento 1'),(3,'encendido',1,'2023-06-02 20:00:00.000000','estacionamiento 1'),(4,'apagado',0,'2023-06-03 09:00:00.000000','estacionamiento 1'),(5,'encendido',1,'2023-06-05 05:45:00.000000','estacionamiento 1'),(6,'encendido',1,'2023-06-01 14:30:00.000000','estacionamiento 2'),(7,'apagado',0,'2023-06-01 15:30:00.000000','estacionamiento 2'),(8,'encendido',1,'2023-06-02 16:00:00.000000','estacionamiento 2'),(9,'apagado',0,'2023-06-03 17:00:00.000000','estacionamiento 2'),(10,'encendido',1,'2023-06-05 18:45:00.000000','estacionamiento 2'),(11,'encendido',1,'2023-06-01 02:30:00.000000','estacionamiento 3'),(12,'apagado',0,'2023-06-01 03:30:00.000000','estacionamiento 3'),(13,'encendido',1,'2023-06-02 04:00:00.000000','estacionamiento 3'),(14,'apagado',0,'2023-06-03 05:00:00.000000','estacionamiento 3'),(15,'encendido',1,'2023-06-05 06:45:00.000000','estacionamiento 3'),(16,'encendido',1,'2023-06-01 10:30:00.000000','aspersor 1'),(17,'apagado',0,'2023-06-01 11:30:00.000000','aspersor 1'),(18,'encendido',1,'2023-06-02 20:00:00.000000','aspersor 1'),(19,'apagado',0,'2023-06-03 09:00:00.000000','aspersor 1'),(20,'encendido',1,'2023-06-05 05:45:00.000000','aspersor 1'),(21,'encendido',1,'2023-06-01 14:30:00.000000','aspersor 2'),(22,'apagado',0,'2023-06-01 15:30:00.000000','aspersor 2'),(23,'encendido',1,'2023-06-02 16:00:00.000000','aspersor 2'),(24,'apagado',0,'2023-06-03 17:00:00.000000','aspersor 2'),(25,'encendido',1,'2023-06-05 18:45:00.000000','aspersor 2'),(26,'encendido',1,'2023-06-01 02:30:00.000000','aspersor 3'),(27,'apagado',0,'2023-06-01 03:30:00.000000','aspersor 3'),(28,'encendido',1,'2023-06-02 04:00:00.000000','aspersor 3'),(29,'apagado',0,'2023-06-03 05:00:00.000000','aspersor 3'),(30,'encendido',1,'2023-06-05 06:45:00.000000','aspersor 3'),(31,'encendido',1,'2023-06-01 10:30:00.000000','luces 1'),(32,'apagado',0,'2023-06-01 11:30:00.000000','luces 1'),(33,'encendido',1,'2023-06-02 20:00:00.000000','luces 1'),(34,'apagado',0,'2023-06-03 09:00:00.000000','luces 1'),(35,'encendido',1,'2023-06-05 05:45:00.000000','luces 1'),(36,'encendido',1,'2023-06-01 14:30:00.000000','luces 2'),(37,'apagado',0,'2023-06-01 15:30:00.000000','luces 2'),(38,'encendido',1,'2023-06-02 16:00:00.000000','luces 2'),(39,'apagado',0,'2023-06-03 17:00:00.000000','luces 2'),(40,'encendido',1,'2023-06-05 18:45:00.000000','luces 2'),(41,'encendido',1,'2023-06-01 02:30:00.000000','luces 3'),(42,'apagado',0,'2023-06-01 03:30:00.000000','luces 3'),(43,'encendido',1,'2023-06-02 04:00:00.000000','luces 3'),(44,'apagado',0,'2023-06-03 05:00:00.000000','luces 3'),(45,'encendido',1,'2023-06-05 06:45:00.000000','luces 3'),(46,'encendido',1,'2023-06-01 10:30:00.000000','recolector 1'),(47,'apagado',0,'2023-06-01 11:30:00.000000','recolector 1'),(48,'encendidor',1,'2023-06-02 20:00:00.000000','recolector 1'),(49,'apagado',0,'2023-06-03 09:00:00.000000','recolector 1'),(50,'encendido',1,'2023-06-05 05:45:00.000000','recolector 1'),(51,'encendido',1,'2023-06-01 14:30:00.000000','recolector 2'),(52,'apagado',0,'2023-06-01 15:30:00.000000','recolector 2'),(53,'encendido',1,'2023-06-02 16:00:00.000000','recolector 2'),(54,'apagado',0,'2023-06-03 17:00:00.000000','recolector 2'),(55,'encendido',1,'2023-06-05 18:45:00.000000','recolector 2'),(56,'encendido',1,'2023-06-01 02:30:00.000000','recolector 3'),(57,'encendido',0,'2023-06-01 03:30:00.000000','recolector 3'),(58,'encendido',1,'2023-06-02 04:00:00.000000','recolector 3'),(59,'encendido',0,'2023-06-03 05:00:00.000000','recolector 3'),(60,'encendido',1,'2023-06-05 06:45:00.000000','recolector 3');
/*!40000 ALTER TABLE `evento` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `unidad`
--

DROP TABLE IF EXISTS `unidad`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `unidad` (
  `id_unidad` varchar(255) NOT NULL,
  `estado` int DEFAULT NULL,
  `dispositivo` int DEFAULT NULL,
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
INSERT INTO `unidad` VALUES ('aspersor 1',1,2),('aspersor 2',1,2),('aspersor 3',1,2),('estacionamiento 1',1,1),('estacionamiento 2',1,1),('estacionamiento 3',1,1),('luces 1',1,3),('luces 2',1,3),('luces 3',1,3),('recolector 1',1,4),('recolector 2',1,4),('recolector 3',1,4);
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

-- Dump completed on 2023-06-24  0:16:31
