USE PandamicMonitor;

CREATE TABLE location(
	locId BIGINT PRIMARY KEY,
    locName VARCHAR(20),
    longitude DECIMAL(10,7),
    latitude DECIMAL(10,7)
);

CREATE TABLE person(
	idno VARCHAR(18) PRIMARY KEY,
    mail VARCHAR(40),
    birthDay DATE,
    fullname VARCHAR(10),
    phoneno VARCHAR(15),
    address VARCHAR(50),
    age INT,
    gender CHAR(1)
);

CREATE TABLE loginInfo(
	mail VARCHAR(40) PRIMARY KEY references person(mail),
    pword VARCHAR(15)
);

CREATE TABLE visit(
	locId BIGINT references location(locId),
    idno varchar(40) references person(locId),
    timeArrived time ,
    PRIMARY KEY(locID,idno,timeArrived)
);

