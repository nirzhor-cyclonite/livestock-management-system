CREATE DATABASE Livestock
USE Livestock

CREATE TABLE Admin(
	Username varchar(30) UNIQUE NOT NULL,
	Password varchar(64) NOT NULL,
	UserType varchar(10) NOT NULL,
	Token int IDENTITY(310472,1) PRIMARY KEY
)
CREATE TABLE Owner(
	OwnerId int IDENTITY(5001,1) PRIMARY KEY,
	Token int FOREIGN KEY REFERENCES Admin(Token),
	Name varchar(50) NOT NULL,
	Address varchar(100) NOT NULL,
	ContactNo varchar(11) NOT NULL CHECK (ContactNo LIKE ('01%'))
)

CREATE TABLE Farms(
	FarmId int IDENTITY(1001,1) PRIMARY KEY,
	OwnerId int FOREIGN KEY REFERENCES Owner(OwnerId),
	Cows int NULL,
	Sheep int NULL,
	Goats int NULL,
	GroupNo int NULL,
	Rating int NULL CHECK(Rating<11)
);


CREATE TABLE DistrictLivestockOfficer(
	ContactNo varchar(11) PRIMARY KEY CHECK (ContactNo LIKE ('01%')),
	Token int FOREIGN KEY REFERENCES Admin(Token),
	Name varchar(50) NOT NULL,
	Address varchar(100)
);

SELECT MAX(Token) FROM Admin

CREATE TABLE Doctor(
	DoctorId int IDENTITY(9001,1) PRIMARY KEY,
	Name varchar(50) NOT NULL,
	ContactNo varchar(11) NOT NULL CHECK (ContactNo LIKE ('01%')),
	Qualification varchar(100) NULL,
	AssignedGroup int NULL,
	Experties varchar(20)
);

CREATE TABLE Caretaker(
	CaretakerId int IDENTITY(3001,1) PRIMARY KEY,
	Name varchar(50) NOT NULL,
	ContactNo varchar(11) NOT NULL CHECK (ContactNo LIKE ('01%')),
	Email varchar(50) NOT NULL,
	Address varchar(50) NOT NULL,
	FarmId int FOREIGN KEY REFERENCES Farms(FarmId),
	Token int FOREIGN KEY REFERENCES  Admin(Token)
)


CREATE TABLE Animal(
	AnimalId int IDENTITY(10001,1) PRIMARY KEY,
	FarmId int FOREIGN KEY REFERENCES Farms(FarmId),
	AnimalType varchar(25),
	Age int NOT NULL,
	RequiredMedicine varchar(100) NULL,
	FoodAmount decimal(10,2) NULL,
	Gender varchar(7) NOT NULL,
	Weight int NULL
);

SELECT * FROM Farms;
SELECT * FROM Admin;
SELECT * FROM Animal;
SELECT * FROM Caretaker
SELECT * FROM Owner