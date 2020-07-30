DROP TABLE IF EXISTS Customer;
 
CREATE TABLE Customer (
  id INT AUTO_INCREMENT  PRIMARY KEY,
  first_name VARCHAR(250) NOT NULL,
  last_name VARCHAR(250) NOT NULL
);
 
INSERT INTO Customer (id, first_name, last_name) VALUES
  (1, 'Santosh', 'Bandari'),
  (2, 'Lian', 'Sang'),
  (3, 'Maddy', 'Neelima');