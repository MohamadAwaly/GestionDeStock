-- phpMyAdmin SQL Dump
-- version 4.9.2
-- https://www.phpmyadmin.net/
--
-- Hôte : 127.0.0.1:3308
-- Généré le :  lun. 24 mai 2021 à 18:04
-- Version du serveur :  8.0.18
-- Version de PHP :  7.3.12

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de données :  `stockmanagement`
--

-- --------------------------------------------------------

--
-- Structure de la table `address`
--

DROP TABLE IF EXISTS `address`;
CREATE TABLE IF NOT EXISTS `address` (
  `ID_Adress` int(11) NOT NULL AUTO_INCREMENT,
  `ID_City` int(11) NOT NULL,
  `street` varchar(255) NOT NULL,
  `number` int(11) NOT NULL,
  `box` int(11) DEFAULT NULL,
  PRIMARY KEY (`ID_Adress`),
  KEY `ID_City` (`ID_City`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- --------------------------------------------------------

--
-- Structure de la table `adress_users`
--

DROP TABLE IF EXISTS `adress_users`;
CREATE TABLE IF NOT EXISTS `adress_users` (
  `ID_Adress` int(11) NOT NULL,
  `ID_User` int(11) NOT NULL,
  `typeAdress` enum('Private','Professional','billing','') NOT NULL,
  KEY `ID_Adress` (`ID_Adress`),
  KEY `ID_User` (`ID_User`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- --------------------------------------------------------

--
-- Structure de la table `batchs`
--

DROP TABLE IF EXISTS `batchs`;
CREATE TABLE IF NOT EXISTS `batchs` (
  `ID_Batch` int(11) NOT NULL AUTO_INCREMENT,
  `ID_Products` int(11) NOT NULL,
  `Quantity` int(11) NOT NULL,
  `uniPrice` int(11) NOT NULL,
  `numberBatch` int(11) NOT NULL,
  PRIMARY KEY (`ID_Batch`),
  KEY `ID_Products` (`ID_Products`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- --------------------------------------------------------

--
-- Structure de la table `brands`
--

DROP TABLE IF EXISTS `brands`;
CREATE TABLE IF NOT EXISTS `brands` (
  `ID_Brand` int(11) NOT NULL AUTO_INCREMENT,
  `brand` varchar(60) NOT NULL,
  PRIMARY KEY (`ID_Brand`),
  UNIQUE KEY `brand` (`brand`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- --------------------------------------------------------

--
-- Structure de la table `categories`
--

DROP TABLE IF EXISTS `categories`;
CREATE TABLE IF NOT EXISTS `categories` (
  `ID_Categorie` int(11) NOT NULL AUTO_INCREMENT,
  `category` varchar(60) NOT NULL,
  PRIMARY KEY (`ID_Categorie`),
  UNIQUE KEY `category` (`category`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- --------------------------------------------------------

--
-- Structure de la table `cities`
--

DROP TABLE IF EXISTS `cities`;
CREATE TABLE IF NOT EXISTS `cities` (
  `ID_City` int(11) NOT NULL AUTO_INCREMENT,
  `ID_Country` int(11) NOT NULL,
  `citie` varchar(60) NOT NULL,
  `postalCode` int(11) NOT NULL,
  PRIMARY KEY (`ID_City`),
  KEY `ID_Country` (`ID_Country`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- --------------------------------------------------------

--
-- Structure de la table `commandsuppliers`
--

DROP TABLE IF EXISTS `commandsuppliers`;
CREATE TABLE IF NOT EXISTS `commandsuppliers` (
  `ID_CommandSuppliers` int(11) NOT NULL AUTO_INCREMENT,
  `ID_Supplier` int(11) NOT NULL,
  `ID_User` int(11) NOT NULL,
  `orderDate` date NOT NULL,
  PRIMARY KEY (`ID_CommandSuppliers`),
  KEY `ID_User` (`ID_User`),
  KEY `ID_Supplier` (`ID_Supplier`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- --------------------------------------------------------

--
-- Structure de la table `commandsuppliers_batchs`
--

DROP TABLE IF EXISTS `commandsuppliers_batchs`;
CREATE TABLE IF NOT EXISTS `commandsuppliers_batchs` (
  `ID_CommandSupplier` int(11) NOT NULL,
  `ID_Batch` int(11) NOT NULL,
  `costPrice` int(11) NOT NULL,
  `lotQuantity` int(11) NOT NULL,
  KEY `ID_Batch` (`ID_Batch`),
  KEY `ID_CommandSupplier` (`ID_CommandSupplier`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- --------------------------------------------------------

--
-- Structure de la table `countries`
--

DROP TABLE IF EXISTS `countries`;
CREATE TABLE IF NOT EXISTS `countries` (
  `ID_Country` int(11) NOT NULL AUTO_INCREMENT,
  `Country` varchar(60) NOT NULL,
  PRIMARY KEY (`ID_Country`),
  UNIQUE KEY `Country` (`Country`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- --------------------------------------------------------

--
-- Structure de la table `documents`
--

DROP TABLE IF EXISTS `documents`;
CREATE TABLE IF NOT EXISTS `documents` (
  `ID_Document` int(11) NOT NULL AUTO_INCREMENT,
  `ID_DocumentType` int(11) NOT NULL,
  `Numero` int(11) NOT NULL,
  `DateDocument` date NOT NULL,
  PRIMARY KEY (`ID_Document`),
  KEY `ID_DocumentType` (`ID_DocumentType`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- --------------------------------------------------------

--
-- Structure de la table `documenttypes`
--

DROP TABLE IF EXISTS `documenttypes`;
CREATE TABLE IF NOT EXISTS `documenttypes` (
  `ID_TypeDocument` int(11) NOT NULL AUTO_INCREMENT,
  `documentType` varchar(60) NOT NULL,
  PRIMARY KEY (`ID_TypeDocument`),
  UNIQUE KEY `documentType` (`documentType`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- --------------------------------------------------------

--
-- Structure de la table `orders`
--

DROP TABLE IF EXISTS `orders`;
CREATE TABLE IF NOT EXISTS `orders` (
  `ID_Order` int(11) NOT NULL AUTO_INCREMENT,
  `Id_User` int(11) NOT NULL,
  `reduction` int(11) DEFAULT NULL,
  `dateORder` date NOT NULL,
  `payed` tinyint(1) DEFAULT NULL,
  `payementDate` date DEFAULT NULL,
  `deliver` tinyint(1) DEFAULT NULL,
  `deliverDate` date DEFAULT NULL,
  `modeOfPayement` enum('Cash','','','') DEFAULT NULL,
  PRIMARY KEY (`ID_Order`),
  KEY `Id_User` (`Id_User`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- --------------------------------------------------------

--
-- Structure de la table `orders_docuements`
--

DROP TABLE IF EXISTS `orders_docuements`;
CREATE TABLE IF NOT EXISTS `orders_docuements` (
  `ID_Order` int(11) NOT NULL,
  `ID_Document` int(11) NOT NULL,
  KEY `ID_Document` (`ID_Document`),
  KEY `ID_Order` (`ID_Order`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- --------------------------------------------------------

--
-- Structure de la table `orders_products`
--

DROP TABLE IF EXISTS `orders_products`;
CREATE TABLE IF NOT EXISTS `orders_products` (
  `ID_Order` int(11) NOT NULL,
  `ID_Product` int(11) NOT NULL,
  `qteUnits` int(11) NOT NULL,
  `unitPrice` int(11) NOT NULL,
  `deliver` tinyint(1) DEFAULT NULL,
  KEY `ID_Order` (`ID_Order`),
  KEY `ID_Product` (`ID_Product`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- --------------------------------------------------------

--
-- Structure de la table `products`
--

DROP TABLE IF EXISTS `products`;
CREATE TABLE IF NOT EXISTS `products` (
  `ID_Product` int(11) NOT NULL AUTO_INCREMENT,
  `ID_Brand` int(11) NOT NULL,
  `code` varchar(255) NOT NULL,
  `designation` varchar(255) NOT NULL,
  `quantityTotal` int(11) NOT NULL,
  `unitCostPrice` int(11) NOT NULL,
  `margin` int(11) NOT NULL,
  `length` int(11) NOT NULL,
  `width` int(11) NOT NULL,
  `height` int(11) NOT NULL,
  PRIMARY KEY (`ID_Product`),
  KEY `ID_Brand` (`ID_Brand`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- --------------------------------------------------------

--
-- Structure de la table `products_categories`
--

DROP TABLE IF EXISTS `products_categories`;
CREATE TABLE IF NOT EXISTS `products_categories` (
  `ID_Product` int(11) NOT NULL,
  `ID_Category` int(11) NOT NULL,
  KEY `ID_Product` (`ID_Product`),
  KEY `ID_Category` (`ID_Category`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- --------------------------------------------------------

--
-- Structure de la table `roles`
--

DROP TABLE IF EXISTS `roles`;
CREATE TABLE IF NOT EXISTS `roles` (
  `ID_Role` int(11) NOT NULL AUTO_INCREMENT,
  `role` varchar(60) NOT NULL,
  PRIMARY KEY (`ID_Role`),
  UNIQUE KEY `role` (`role`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- --------------------------------------------------------

--
-- Structure de la table `suppliers`
--

DROP TABLE IF EXISTS `suppliers`;
CREATE TABLE IF NOT EXISTS `suppliers` (
  `ID_Supplier` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(60) NOT NULL,
  PRIMARY KEY (`ID_Supplier`),
  UNIQUE KEY `name` (`name`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- --------------------------------------------------------

--
-- Structure de la table `users`
--

DROP TABLE IF EXISTS `users`;
CREATE TABLE IF NOT EXISTS `users` (
  `ID_User` int(11) NOT NULL AUTO_INCREMENT,
  `ID_Role` int(11) NOT NULL,
  `lastName` varchar(60) NOT NULL,
  `firstName` varchar(60) NOT NULL,
  `dayOfBirth` date DEFAULT NULL,
  `inscriptionDate` date NOT NULL,
  `VAT` varchar(20) DEFAULT NULL,
  `mail` varchar(255) DEFAULT NULL,
  `password` varchar(255) NOT NULL,
  `login` varchar(60) NOT NULL,
  PRIMARY KEY (`ID_User`),
  UNIQUE KEY `VAT` (`VAT`),
  KEY `ID_Role` (`ID_Role`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Contraintes pour les tables déchargées
--

--
-- Contraintes pour la table `address`
--
ALTER TABLE `address`
  ADD CONSTRAINT `address_ibfk_1` FOREIGN KEY (`ID_City`) REFERENCES `cities` (`ID_City`) ON DELETE RESTRICT ON UPDATE RESTRICT;

--
-- Contraintes pour la table `adress_users`
--
ALTER TABLE `adress_users`
  ADD CONSTRAINT `adress_users_ibfk_1` FOREIGN KEY (`ID_Adress`) REFERENCES `address` (`ID_Adress`) ON DELETE RESTRICT ON UPDATE RESTRICT,
  ADD CONSTRAINT `adress_users_ibfk_2` FOREIGN KEY (`ID_User`) REFERENCES `users` (`ID_User`) ON DELETE RESTRICT ON UPDATE RESTRICT;

--
-- Contraintes pour la table `batchs`
--
ALTER TABLE `batchs`
  ADD CONSTRAINT `batchs_ibfk_1` FOREIGN KEY (`ID_Products`) REFERENCES `products` (`ID_Product`) ON DELETE RESTRICT ON UPDATE RESTRICT;

--
-- Contraintes pour la table `cities`
--
ALTER TABLE `cities`
  ADD CONSTRAINT `cities_ibfk_1` FOREIGN KEY (`ID_Country`) REFERENCES `countries` (`ID_Country`) ON DELETE RESTRICT ON UPDATE RESTRICT;

--
-- Contraintes pour la table `commandsuppliers`
--
ALTER TABLE `commandsuppliers`
  ADD CONSTRAINT `commandsuppliers_ibfk_1` FOREIGN KEY (`ID_User`) REFERENCES `users` (`ID_User`) ON DELETE RESTRICT ON UPDATE RESTRICT,
  ADD CONSTRAINT `commandsuppliers_ibfk_2` FOREIGN KEY (`ID_Supplier`) REFERENCES `suppliers` (`ID_Supplier`) ON DELETE RESTRICT ON UPDATE RESTRICT;

--
-- Contraintes pour la table `commandsuppliers_batchs`
--
ALTER TABLE `commandsuppliers_batchs`
  ADD CONSTRAINT `commandsuppliers_batchs_ibfk_1` FOREIGN KEY (`ID_Batch`) REFERENCES `batchs` (`ID_Batch`) ON DELETE RESTRICT ON UPDATE RESTRICT,
  ADD CONSTRAINT `commandsuppliers_batchs_ibfk_2` FOREIGN KEY (`ID_CommandSupplier`) REFERENCES `commandsuppliers` (`ID_CommandSuppliers`) ON DELETE RESTRICT ON UPDATE RESTRICT;

--
-- Contraintes pour la table `documents`
--
ALTER TABLE `documents`
  ADD CONSTRAINT `documents_ibfk_1` FOREIGN KEY (`ID_DocumentType`) REFERENCES `documenttypes` (`ID_TypeDocument`) ON DELETE RESTRICT ON UPDATE RESTRICT;

--
-- Contraintes pour la table `orders`
--
ALTER TABLE `orders`
  ADD CONSTRAINT `orders_ibfk_1` FOREIGN KEY (`Id_User`) REFERENCES `users` (`ID_User`) ON DELETE RESTRICT ON UPDATE RESTRICT;

--
-- Contraintes pour la table `orders_docuements`
--
ALTER TABLE `orders_docuements`
  ADD CONSTRAINT `orders_docuements_ibfk_1` FOREIGN KEY (`ID_Document`) REFERENCES `documents` (`ID_Document`) ON DELETE RESTRICT ON UPDATE RESTRICT,
  ADD CONSTRAINT `orders_docuements_ibfk_2` FOREIGN KEY (`ID_Order`) REFERENCES `orders` (`ID_Order`) ON DELETE RESTRICT ON UPDATE RESTRICT;

--
-- Contraintes pour la table `orders_products`
--
ALTER TABLE `orders_products`
  ADD CONSTRAINT `orders_products_ibfk_1` FOREIGN KEY (`ID_Order`) REFERENCES `orders` (`ID_Order`) ON DELETE RESTRICT ON UPDATE RESTRICT,
  ADD CONSTRAINT `orders_products_ibfk_2` FOREIGN KEY (`ID_Product`) REFERENCES `products` (`ID_Product`) ON DELETE RESTRICT ON UPDATE RESTRICT;

--
-- Contraintes pour la table `products`
--
ALTER TABLE `products`
  ADD CONSTRAINT `products_ibfk_1` FOREIGN KEY (`ID_Brand`) REFERENCES `brands` (`ID_Brand`) ON DELETE RESTRICT ON UPDATE RESTRICT;

--
-- Contraintes pour la table `products_categories`
--
ALTER TABLE `products_categories`
  ADD CONSTRAINT `products_categories_ibfk_1` FOREIGN KEY (`ID_Product`) REFERENCES `products` (`ID_Product`) ON DELETE RESTRICT ON UPDATE RESTRICT,
  ADD CONSTRAINT `products_categories_ibfk_2` FOREIGN KEY (`ID_Category`) REFERENCES `categories` (`ID_Categorie`) ON DELETE RESTRICT ON UPDATE RESTRICT;

--
-- Contraintes pour la table `users`
--
ALTER TABLE `users`
  ADD CONSTRAINT `users_ibfk_1` FOREIGN KEY (`ID_Role`) REFERENCES `roles` (`ID_Role`) ON DELETE RESTRICT ON UPDATE RESTRICT;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
