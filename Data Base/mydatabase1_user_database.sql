-- MySQL dump 10.13  Distrib 8.0.19, for Win64 (x86_64)
--
-- Host: localhost    Database: mydatabase1
-- ------------------------------------------------------
-- Server version	8.0.19

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
-- Table structure for table `user_database`
--

DROP TABLE IF EXISTS `user_database`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `user_database` (
  `id` varchar(45) NOT NULL,
  `username` varchar(45) NOT NULL,
  `password` varchar(45) NOT NULL,
  `user_type` varchar(45) NOT NULL,
  `email` varchar(45) NOT NULL,
  `mobile_number` varchar(45) NOT NULL,
  `confirmation` varchar(45) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `user_database`
--

LOCK TABLES `user_database` WRITE;
/*!40000 ALTER TABLE `user_database` DISABLE KEYS */;
INSERT INTO `user_database` VALUES ('','','','user','','','confirmed'),('1','amit','amit','admin','amitkvermaku@gmail.com','7398899744','confirmed'),('2','aman','aman','user','amankvermaku@gmail.com','1234567890','confirmed'),('3','root','root','user','userkvermaku@gmail.com','9876543210','confirmed'),('amiitshubham','amiit','shubham','user','aman95.jha@gmail.com','76876889','confirmed'),('fghfhgqwerty','fghfhg','qwerty','user','amitkvermaku@gmail.com','546546','confirmed'),('hygjhkljlkmk','','hygjhkljlkmk','user','aayush59486jha@gmail.com','','confirmed'),('jbjhklhgjjklk;/','jbjhkl','hgjjklk;/','user','aman95jha@gmail.com','0.7878789','confirmed'),('jgkjhkhkljhkljkljkjlghfhjkjjlk','jgkjhkhkljhkljkljkjl','ghfhjkjjlk','user','amanjha756@yahoo.com','766757868789','confirmed'),('shhhhhh3e325524ergsfg','shhhhhh','3e325524ergsfg','user','aayush59486jha@gmail.com','324345346346','confirmed'),('shubhammmjkhjhkljmkl','shubhammm','jkhjhkljmkl','user','aayush59486jha@gmail.com','877887879','confirmed');
/*!40000 ALTER TABLE `user_database` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2020-03-13  9:31:48
