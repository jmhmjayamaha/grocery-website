--Insert data to product table

INSERT INTO `grocery_website_db`.`product`(`product_id`,`in_stock`,`name`,`price`)VALUES(1,true,'File cover',15.00);
INSERT INTO `grocery_website_db`.`product`(`product_id`,`in_stock`,`name`,`price`)VALUES(2,true,'Pen',12.00);
INSERT INTO `grocery_website_db`.`product`(`product_id`,`in_stock`,`name`,`price`)VALUES(3,true,'Pen Drive',2500.00);
INSERT INTO `grocery_website_db`.`product`(`product_id`,`in_stock`,`name`,`price`)VALUES(4,true,'Purse',150.00);
INSERT INTO `grocery_website_db`.`product`(`product_id`,`in_stock`,`name`,`price`)VALUES(5,true,'Headset',550.00);
INSERT INTO `grocery_website_db`.`product`(`product_id`,`in_stock`,`name`,`price`)VALUES(6,true,'Magazine',100.50);
INSERT INTO `grocery_website_db`.`product`(`product_id`,`in_stock`,`name`,`price`)VALUES(7,true,'Monitor',9900.50);
INSERT INTO `grocery_website_db`.`product`(`product_id`,`in_stock`,`name`,`price`)VALUES(8,true,'Printer',3500.00);
INSERT INTO `grocery_website_db`.`product`(`product_id`,`in_stock`,`name`,`price`)VALUES(9,true,'Radio',1200.00);

--Insert data to Customer table

INSERT INTO `grocery_website_db`.`customer`(`id`,`address`,`name`,`tel_no`)VALUES(1,'warakapola','Harshana','0774231747');

-- comment 

INSERT INTO `grocery_website_db`.`comment`(`id`,`comment`)VALUES(1, 'good product'); 
INSERT INTO `grocery_website_db`.`comment`(`id`,`comment`)VALUES(2, 'out of stock');

-- product_comment

INSERT INTO `grocery_website_db`.`product_comment`(`product_id`,`comment_id`)VALUES(1,1);
INSERT INTO `grocery_website_db`.`product_comment`(`product_id`,`comment_id`)VALUES(1,2);