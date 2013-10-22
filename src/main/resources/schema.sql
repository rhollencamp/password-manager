CREATE TABLE account (
	uid INTEGER GENERATED BY DEFAULT AS IDENTITY(START WITH 1, INCREMENT BY 1),
	user_name VARCHAR(255) NOT NULL,
	password CHAR(60) NOT NULL,
	secret_key CHAR(44) NOT NULL,
	secret_key_salt CHAR(12) NOT NULL,
	secret_key_iv CHAR(24) NOT NULL,
	version INTEGER NOT NULL,
	PRIMARY KEY (uid)
);

CREATE TABLE secret (
	uid INTEGER GENERATED BY DEFAULT AS IDENTITY(START WITH 1, INCREMENT BY 1),
	account_uid INTEGER NOT NULL,
	encrypted_title VARCHAR(512) NOT NULL,
	encrypted_metadata VARCHAR(512),
	encrypted_password VARCHAR(512) NOT NULL,
	iv CHAR(24) NOT NULL,
	version INTEGER NOT NULL,
	PRIMARY KEY (uid),
	FOREIGN KEY (account_uid) REFERENCES account (uid)
);
