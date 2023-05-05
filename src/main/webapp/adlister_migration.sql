USE adlister_db;
DROP TABLE IF EXISTS users;
CREATE TABLE users (
                       id int UNSIGNED NOT NULL AUTO_INCREMENT,
                       username VARCHAR(15) NOT NULL,
                       email VARCHAR(30) NOT NULL,
                       password VARCHAR(30) NOT NULL,
                       PRIMARY KEY (id)
);
DROP TABLE IF EXISTS ads;
CREATE TABLE ads (
                     id int UNSIGNED NOT NULL AUTO_INCREMENT,
                     user_id int UNSIGNED NOT NULL,
                     title VARCHAR(30),
                     description VARCHAR(200),
                     CONSTRAINT fk_user FOREIGN KEY (user_id) REFERENCES users(id),
                     PRIMARY KEY (id)

);

SHOW DATABASES;
SHOW TABLES;
