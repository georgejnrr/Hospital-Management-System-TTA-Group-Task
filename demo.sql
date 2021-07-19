CREATE TABLE `myitem` (
  `itemid` int NOT NULL AUTO_INCREMENT,
  `itemName` varchar(45) DEFAULT NULL,
  `qty` int DEFAULT NULL,
  `price` double DEFAULT NULL,
  PRIMARY KEY (`itemid`)
) ;

CREATE TABLE `myorder` (
  `itemName` varchar(50) DEFAULT NULL,
  `itemid` int DEFAULT NULL,
  `price` double DEFAULT NULL
);
