use mydb;

CREATE TABLE coupon(
	id INT AUTO_INCREMENT,
	code VARCHAR(20),
	discount decimal(8,3),
	exp_date VARCHAR(100),
	PRIMARY KEY(id)
);

SELECT * FROM coupon u ; 