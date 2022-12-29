CREATE DATABASE IF NOT EXISTS IRLPG_APP;

USE IRLPG_APP;

CREATE TABLE IF NOT EXISTS user (
    id int NOT NULL AUTO_INCREMENT,
    name VARCHAR(255) NOT NULL,
    password VARCHAR(255) NOT NULL,
    email VARCHAR(255) NOT NULL,
    PRIMARY KEY(id)
);

INSERT INTO user(name, password, email) VALUES ("David", "password", "david@mail.com");
INSERT INTO user(name, password, email) VALUES ("Jens", "password1234", "jens@mail.com");
INSERT INTO user(name, password, email) VALUES ("Lea", "leo", "lea@mail.com");

CREATE TABLE IF NOT EXISTS stat (
    id int NOT NULL AUTO_INCREMENT,
    name VARCHAR(255) NOT NULL,
    PRIMARY KEY(id)
);

INSERT INTO stat(name) VALUE ("strength");
INSERT INTO stat(name) VALUE ("wisdom");
INSERT INTO stat(name) VALUE ("dexterity");
INSERT INTO stat(name) VALUE ("intelligence");
INSERT INTO stat(name) VALUE ("charisma");
INSERT INTO stat(name) VALUE ("constitution");