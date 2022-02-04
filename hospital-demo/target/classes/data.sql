CREATE TABLE user
(
  username varchar(30) NOT NULL,
  employeeId int NOT NULL ,
  password varchar(128) DEFAULT NULL,
 employeeEmail varchar(100) DEFAULT NULL,
 PRIMARY KEY (employeeId)
);