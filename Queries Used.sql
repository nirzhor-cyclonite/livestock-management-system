

SELECT * FROM ADMIN WHERE Username = 'malihachy'

--Owner Query
SELECT * FROM Caretaker WHERE FarmId IS NULL

UPDATE Caretaker SET FarmId=1002 WHERE CaretakerId = 3002


UPDATE Farms SET Location = 'Beribadh' where farmId = 1001

SELECT farmid FROM FARMs where ownerId = 5003

SELECT * FROM Farms WHERE OwnerId = 5003

INSERT INTO Farms(OwnerId) VALUES (5003)

INSERT INTO Farms (OwnerId, Location) VALUES (5004, 'birulia')

INSERT INTO Farms (OwnerId, Location) VALUES (5004, 'chittagong')

SELECT * FROM Caretaker WHERE FarmId IN (SELECT FarmId FROM FARMS WHERE OwnerId = 5003)

--Caretaker Query
SELECT * FROM Animal WHERE FarmId = 1001

SELECT * FROM Animal WHERE FarmId = 1001 AND AnimalType ='COW'
SELECT * FROM Animal WHERE FarmId = 1001 AND AnimalType ='GOAT'
SELECT * FROM Animal WHERE FarmId = 1001 AND AnimalType ='SHEEP'

--INSERT INTO Animal VALUES()

SELECT AnimalType, COUNT(AnimalId) AS 'Number' FROM Animal WHERE FarmId = 1001 GROUP BY AnimalType

UPDATE FARMS SET Cows = 2 WHERE farmId = 1001
UPDATE FARMS SET goats = 1 WHERE farmId = 1001
UPDATE FARMS SET sheep = 1 where farmId = 1001



SELECT * FROM Owner
SELECT * FROM FARMS
select * from Caretaker
ALTER TABLE FARMS ADD Location varchar(100)
SELECT * FROM Admin
SELECT * FROM DistrictLivestockOfficer
select Username from admin full join Caretaker on admin.token=Caretaker.Token where Email='maliha.mahjabin@gmai.com'
update admin set Password=160204052 where Username='tun'
delete from admin where Username='sujoy'
DELETE FROM DistrictLivestockOfficer WHERE Token='311489'
SELECT * FROM ANIMAL
SELECT * FROM Animal WHERE FarmId = 1001