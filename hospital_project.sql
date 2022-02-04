-- MySQL dump 10.13  Distrib 8.0.27, for Win64 (x86_64)
--
-- Host: localhost    Database: hospital_project
-- ------------------------------------------------------
-- Server version	8.0.27

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
-- Table structure for table `admin_login`
--

DROP TABLE IF EXISTS `admin_login`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `admin_login` (
  `admin_id` varchar(255) NOT NULL,
  `password` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`admin_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `admin_login`
--

LOCK TABLES `admin_login` WRITE;
/*!40000 ALTER TABLE `admin_login` DISABLE KEYS */;
INSERT INTO `admin_login` VALUES ('working','10514');
/*!40000 ALTER TABLE `admin_login` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `employee_details`
--

DROP TABLE IF EXISTS `employee_details`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `employee_details` (
  `employeedetailsid` varchar(255) NOT NULL,
  `email` varchar(255) DEFAULT NULL,
  `first_name` varchar(255) DEFAULT NULL,
  `last_name` varchar(255) DEFAULT NULL,
  `phone` varchar(255) DEFAULT NULL,
  `employee_id` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`employeedetailsid`),
  KEY `FKkbn584s5qglxg5eymgwoqev21` (`employee_id`),
  CONSTRAINT `FKkbn584s5qglxg5eymgwoqev21` FOREIGN KEY (`employee_id`) REFERENCES `employee_login` (`employee_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `employee_details`
--

LOCK TABLES `employee_details` WRITE;
/*!40000 ALTER TABLE `employee_details` DISABLE KEYS */;
/*!40000 ALTER TABLE `employee_details` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `employee_login`
--

DROP TABLE IF EXISTS `employee_login`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `employee_login` (
  `employee_id` varchar(255) NOT NULL,
  `password` varchar(255) DEFAULT NULL,
  `m_admin_admin_id` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`employee_id`),
  KEY `FKky6thlainbl3pphncpri8n2f0` (`m_admin_admin_id`),
  CONSTRAINT `FKky6thlainbl3pphncpri8n2f0` FOREIGN KEY (`m_admin_admin_id`) REFERENCES `admin_login` (`admin_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `employee_login`
--

LOCK TABLES `employee_login` WRITE;
/*!40000 ALTER TABLE `employee_login` DISABLE KEYS */;
/*!40000 ALTER TABLE `employee_login` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `patient_details`
--

DROP TABLE IF EXISTS `patient_details`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `patient_details` (
  `patient_details_id` varchar(255) NOT NULL,
  `age` int DEFAULT NULL,
  `bmi` varchar(255) DEFAULT NULL,
  `email` varchar(255) DEFAULT NULL,
  `emergency_contact` varchar(255) DEFAULT NULL,
  `first_name` varchar(255) DEFAULT NULL,
  `gender` char(1) DEFAULT NULL,
  `height` varchar(255) DEFAULT NULL,
  `insurance_provider` varchar(255) DEFAULT NULL,
  `last_name` varchar(255) DEFAULT NULL,
  `medical_conditions` varchar(255) DEFAULT NULL,
  `payment_method` varchar(255) DEFAULT NULL,
  `phone` varchar(255) DEFAULT NULL,
  `weight` int DEFAULT NULL,
  `patient_id` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`patient_details_id`),
  KEY `FK97patv3451emtbes8nkiqx0i4` (`patient_id`),
  CONSTRAINT `FK97patv3451emtbes8nkiqx0i4` FOREIGN KEY (`patient_id`) REFERENCES `patient_login` (`patient_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `patient_details`
--

LOCK TABLES `patient_details` WRITE;
/*!40000 ALTER TABLE `patient_details` DISABLE KEYS */;
/*!40000 ALTER TABLE `patient_details` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `patient_login`
--

DROP TABLE IF EXISTS `patient_login`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `patient_login` (
  `patient_id` varchar(255) NOT NULL,
  `password` varchar(255) DEFAULT NULL,
  `m_patient_employee_id` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`patient_id`),
  KEY `FKkhd8jfp0fntvxqfhdo11tglgn` (`m_patient_employee_id`),
  CONSTRAINT `FKkhd8jfp0fntvxqfhdo11tglgn` FOREIGN KEY (`m_patient_employee_id`) REFERENCES `employee_login` (`employee_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `patient_login`
--

LOCK TABLES `patient_login` WRITE;
/*!40000 ALTER TABLE `patient_login` DISABLE KEYS */;
/*!40000 ALTER TABLE `patient_login` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2022-02-02  1:47:07
