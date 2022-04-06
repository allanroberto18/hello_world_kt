CREATE TABLE IF NOT EXISTS greetings (
    id INT NOT NULL AUTO_INCREMENT,
    first_name VARCHAR(50) NOT NULL,
    last_name VARCHAR(50) NOT NULL,
    primary key (id)
) Engine=INNODB;