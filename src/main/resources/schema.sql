CREATE TABLE OPENJPA_SEQUENCE_TABLE(
	ID INTEGER NOT NULL,
	SEQUENCE_VALUE INTEGER DEFAULT NULL,
	PRIMARY KEY (ID)
);

CREATE TABLE ACCOUNT (
	UID INTEGER NOT NULL,
	USER_NAME VARCHAR(255) NOT NULL,
	PASSWORD CHAR(60) NOT NULL,
	PRIMARY KEY (UID)
);
