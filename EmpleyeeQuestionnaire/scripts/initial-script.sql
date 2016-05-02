---creates the schema
CREATE SCHEMA `equestionnaire` ;

---create user table
CREATE TABLE equestionnaire.User
(
	id int,
	lastName varchar(255),
	firstName varchar(255),
	username varchar(255),
	password varchar(255)
);
