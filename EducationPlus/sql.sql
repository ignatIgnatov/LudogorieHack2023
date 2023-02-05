CREATE TABLE `events` (
`id` INT PRIMARY KEY AUTO_INCREMENT,
`type` VARCHAR(50));

INSERT INTO `events` (`type`)
VALUES ('Music'), ('Films'), ('Theater'), ('Football'), ('Tennis'), ('Surfing'), ('Travelling'), ('Photography');

CREATE TABLE `persons` (
`id` INT PRIMARY KEY AUTO_INCREMENT,
`username_id` INT,
`password` VARCHAR(8) NOT NULL,
`first_name` VARCHAR(25) NOT NULL,
`last_name` VARCHAR(25) NOT NULL,
`age` INT NOT NULL,
`gender` VARCHAR(10),
`town` VARCHAR(25),
`status` VARCHAR(25),
`education` VARCHAR(25),
`picture` LONGBLOB,
`event_id` INT
);

CREATE TABLE `persons_events` (
`person_id` INT,
`event_id` INT,
CONSTRAINT `pk_persons_events`
PRIMARY KEY (`person_id`, `event_id`),
CONSTRAINT `fk_persons_events_persons`
FOREIGN KEY (`person_id`)
REFERENCES `persons`(`id`),
CONSTRAINT `fk_events_persons`
FOREIGN KEY (`event_id`)
REFERENCES `events`(`id`)
);

CREATE TABLE `companies` (
`id` INT PRIMARY KEY AUTO_INCREMENT,
`username_id` INT,
`password` VARCHAR(8) NOT NULL,
`name` VARCHAR(50) NOT NULL,
`town` VARCHAR(25),
`event_id` INT,
`description` VARCHAR(255));

CREATE TABLE `companies_events` (
`company_id` INT,
`event_id` INT,
CONSTRAINT `pk_company_events`
PRIMARY KEY (`company_id`, `event_id`),
CONSTRAINT `fk_company_events_company`
FOREIGN KEY (`company_id`)
REFERENCES `companies`(`id`),
CONSTRAINT `fk_events_companies`
FOREIGN KEY (`event_id`)
REFERENCES `events`(`id`)
);

CREATE TABLE `username` (
`id` INT PRIMARY KEY AUTO_INCREMENT,
`username` VARCHAR(25));

CREATE TABLE `username_person` (
`person_id` INT,
`username_id` INT,
CONSTRAINT `pk_username_person`
PRIMARY KEY (`person_id`, `username_id`),
CONSTRAINT `fk_person_username`
FOREIGN KEY (`person_id`)
REFERENCES `persons`(`id`),
CONSTRAINT `fk_username_person`
FOREIGN KEY (`username_id`)
REFERENCES `username`(`id`));








