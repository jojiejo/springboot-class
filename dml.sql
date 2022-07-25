/* INSERT RECORDS */

INSERT INTO operators(name) VALUES('XL');
INSERT INTO operators(name) VALUES('Telkomsel');
INSERT INTO operators(name) VALUES('3');
INSERT INTO operators(name) VALUES('IM3');
INSERT INTO operators(name) VALUES('Axis');

INSERT INTO product_types(name) VALUES('Pulsa');
INSERT INTO product_types(name) VALUES('Kartu Prabayar');
INSERT INTO product_types(name) VALUES('Kartu Pascabayar');

INSERT INTO products(code, name, product_type_id, operator_id, price) VALUES('P001', 'Pulsa 3 10000', 1, 3, 12000);
INSERT INTO products(code, name, product_type_id, operator_id, price) VALUES('P002', 'Pulsa 3 20000', 1, 3, 22000);
INSERT INTO products(code, name, product_type_id, operator_id, price) VALUES('P003', 'Kartu Prabayar XL Isi 10000', 2, 1, 12000);
INSERT INTO products(code, name, product_type_id, operator_id, price) VALUES('P004', 'Kartu Prabayar XL Isi 20000', 2, 1, 22000);
INSERT INTO products(code, name, product_type_id, operator_id, price) VALUES('P005', 'Kartu Prabayar XL Isi 30000', 2, 1, 32000);
INSERT INTO products(code, name, product_type_id, operator_id, price) VALUES('P006', 'Kartu Pascabayar IM3 Isi 10000', 3, 4, 13000);
INSERT INTO products(code, name, product_type_id, operator_id, price) VALUES('P007', 'Kartu Pascabayar IM3 Isi 20000', 3, 4, 23000);
INSERT INTO products(code, name, product_type_id, operator_id, price) VALUES('P008', 'Kartu Pascabayar IM3 Isi 30000', 3, 4, 33000);

INSERT INTO product_descriptions(product_id, description) VALUES(1, 'Hanya Pulsa 3 10000');
INSERT INTO product_descriptions(product_id, description) VALUES(2, 'Hanya Pulsa 3 20000');
INSERT INTO product_descriptions(product_id, description) VALUES(3, 'Kartu Prabayar XL + Pulsa 10000');
INSERT INTO product_descriptions(product_id, description) VALUES(4, 'Kartu Prabayar XL + Pulsa 20000');
INSERT INTO product_descriptions(product_id, description) VALUES(5, 'Kartu Prabayar XL + Pulsa 20000');
INSERT INTO product_descriptions(product_id, description) VALUES(6, 'Kartu Pascabayar IM3 + Pulsa 20000');
INSERT INTO product_descriptions(product_id, description) VALUES(7, 'Kartu Pascabayar IM3 + Pulsa 20000');
INSERT INTO product_descriptions(product_id, description) VALUES(8, 'Kartu Pascabayar IM3 + Pulsa 20000');

INSERT INTO payment_methods(name) VALUES('Cash');
INSERT INTO payment_methods(name) VALUES('OVO');
INSERT INTO payment_methods(name) VALUES('Go-pay');

INSERT INTO customers(name, address, date_of_birth, gender, status) VALUES('Djodi Ramadhan', 'Jl. XXX Jakarta', '1993-03-17', 'Male', 'Single');
INSERT INTO customers(name, address, date_of_birth, gender, status) VALUES('Wendy Grace', 'Jl. YYY Jakarta', '1991-05-01', 'Female', 'Single');
INSERT INTO customers(name, address, date_of_birth, gender, status) VALUES('Luqman Alfarisi', 'Jl. ZZZ Jakarta', '1994-11-02', 'Male', 'Married');
INSERT INTO customers(name, address, date_of_birth, gender, status) VALUES('Citra Widya', 'Jl. AAA Jakarta', '1993-23-09', 'Female', 'Single');
INSERT INTO customers(name, address, date_of_birth, gender, status) VALUES('Salamah Farida', 'Jl. ZZZ Jakarta', '1995-22-09', 'Female', 'Married');

INSERT INTO transactions(customer_id, payment_method_id, status, total_quantity, total_price) VALUES(1, 1, 'Paid', 3, 37000);
INSERT INTO transactions(customer_id, payment_method_id, status, total_quantity, total_price) VALUES(1, 2, 'Paid', 3, 66000);
INSERT INTO transactions(customer_id, payment_method_id, status, total_quantity, total_price) VALUES(1, 1, 'Paid', 3, 36000);
INSERT INTO transactions(customer_id, payment_method_id, status, total_quantity, total_price) VALUES(2, 3, 'Paid', 3, 66000);
INSERT INTO transactions(customer_id, payment_method_id, status, total_quantity, total_price) VALUES(2, 2, 'Paid', 4, 108000);
INSERT INTO transactions(customer_id, payment_method_id, status, total_quantity, total_price) VALUES(2, 1, 'Paid', 3, 39000);
INSERT INTO transactions(customer_id, payment_method_id, status, total_quantity, total_price) VALUES(3, 1, 'Paid', 3, 69000);
INSERT INTO transactions(customer_id, payment_method_id, status, total_quantity, total_price) VALUES(3, 2, 'Paid', 3, 99000);
INSERT INTO transactions(customer_id, payment_method_id, status, total_quantity, total_price) VALUES(3, 2, 'Paid', 3, 36000);
INSERT INTO transactions(customer_id, payment_method_id, status, total_quantity, total_price) VALUES(4, 3, 'Paid', 3, 66000);
INSERT INTO transactions(customer_id, payment_method_id, status, total_quantity, total_price) VALUES(4, 3, 'Paid', 3, 66000);
INSERT INTO transactions(customer_id, payment_method_id, status, total_quantity, total_price) VALUES(4, 1, 'Paid', 3, 66000);
INSERT INTO transactions(customer_id, payment_method_id, status, total_quantity, total_price) VALUES(5, 1, 'Paid', 3, 69000);
INSERT INTO transactions(customer_id, payment_method_id, status, total_quantity, total_price) VALUES(5, 2, 'Paid', 3, 69000);
INSERT INTO transactions(customer_id, payment_method_id, status, total_quantity, total_price) VALUES(5, 3, 'Paid', 3, 66000);

INSERT INTO transaction_details(transaction_id, product_id, quantity, price) VALUES(1, 1, 1, 12000);
INSERT INTO transaction_details(transaction_id, product_id, quantity, price) VALUES(1, 3, 1, 12000);
INSERT INTO transaction_details(transaction_id, product_id, quantity, price) VALUES(1, 6, 1, 13000);
INSERT INTO transaction_details(transaction_id, product_id, quantity, price) VALUES(2, 3, 1, 12000);
INSERT INTO transaction_details(transaction_id, product_id, quantity, price) VALUES(2, 4, 1, 22000);
INSERT INTO transaction_details(transaction_id, product_id, quantity, price) VALUES(2, 5, 1, 32000);
INSERT INTO transaction_details(transaction_id, product_id, quantity, price) VALUES(3, 1, 1, 12000);
INSERT INTO transaction_details(transaction_id, product_id, quantity, price) VALUES(3, 3, 2, 24000);
INSERT INTO transaction_details(transaction_id, product_id, quantity, price) VALUES(4, 1, 3, 66000);
INSERT INTO transaction_details(transaction_id, product_id, quantity, price) VALUES(5, 5, 2, 64000);
INSERT INTO transaction_details(transaction_id, product_id, quantity, price) VALUES(5, 2, 1, 22000);
INSERT INTO transaction_details(transaction_id, product_id, quantity, price) VALUES(5, 4, 2, 22000);
INSERT INTO transaction_details(transaction_id, product_id, quantity, price) VALUES(6, 6, 2, 26000);
INSERT INTO transaction_details(transaction_id, product_id, quantity, price) VALUES(6, 7, 1, 23000);
INSERT INTO transaction_details(transaction_id, product_id, quantity, price) VALUES(7, 6, 1, 13000);
INSERT INTO transaction_details(transaction_id, product_id, quantity, price) VALUES(7, 7, 1, 23000);
INSERT INTO transaction_details(transaction_id, product_id, quantity, price) VALUES(7, 8, 1, 33000);
INSERT INTO transaction_details(transaction_id, product_id, quantity, price) VALUES(8, 8, 3, 99000);
INSERT INTO transaction_details(transaction_id, product_id, quantity, price) VALUES(9, 1, 1, 12000);
INSERT INTO transaction_details(transaction_id, product_id, quantity, price) VALUES(9, 3, 2, 24000);
INSERT INTO transaction_details(transaction_id, product_id, quantity, price) VALUES(10, 1, 1, 12000);
INSERT INTO transaction_details(transaction_id, product_id, quantity, price) VALUES(10, 2, 1, 12000);
INSERT INTO transaction_details(transaction_id, product_id, quantity, price) VALUES(10, 5, 1, 32000);
INSERT INTO transaction_details(transaction_id, product_id, quantity, price) VALUES(11, 1, 1, 12000);
INSERT INTO transaction_details(transaction_id, product_id, quantity, price) VALUES(11, 2, 1, 12000);
INSERT INTO transaction_details(transaction_id, product_id, quantity, price) VALUES(11, 1, 1, 12000);
INSERT INTO transaction_details(transaction_id, product_id, quantity, price) VALUES(12, 4, 3, 66000);
INSERT INTO transaction_details(transaction_id, product_id, quantity, price) VALUES(13, 6, 1, 13000);
INSERT INTO transaction_details(transaction_id, product_id, quantity, price) VALUES(13, 7, 1, 23000);
INSERT INTO transaction_details(transaction_id, product_id, quantity, price) VALUES(13, 8, 1, 33000);
INSERT INTO transaction_details(transaction_id, product_id, quantity, price) VALUES(14, 6, 1, 13000);
INSERT INTO transaction_details(transaction_id, product_id, quantity, price) VALUES(14, 7, 1, 23000);
INSERT INTO transaction_details(transaction_id, product_id, quantity, price) VALUES(14, 8, 1, 33000);
INSERT INTO transaction_details(transaction_id, product_id, quantity, price) VALUES(15, 3, 1, 12000);
INSERT INTO transaction_details(transaction_id, product_id, quantity, price) VALUES(15, 4, 1, 22000);
INSERT INTO transaction_details(transaction_id, product_id, quantity, price) VALUES(15, 5, 1, 32000);

/* SELECT */

/* Menampilkan gender customer dengan gender laki-laki */
SELECT * FROM customers WHERE gender = 'Male';

/* Menampilkan produk dengan id 3 */
SELECT * FROM products WHERE id = 3;

/* Menampilkan data pelanggan yang dibuat 7 hari ke belakang dan mengandung 'a' pada namanya */
SELECT * FROM customers WHERE name LIKE '%a%' and created_at >= DATE(NOW() - INTERVAL 7 DAY);

/* Tampilkan pelanggan sesuai abjad nama */
SELECT * FROM customers ORDER BY name ASC;

/* Tampilkan 5 data produk */
SELECT * FROM products LIMIT 5;

/* Ubah data product_id = 1, dengan nama product dummy */
UPDATE products SET name = 'product dummy' WHERE product_id = 1;

/* Ubah data product_id = 1 di data produk, dengan nama product dummy */
UPDATE products SET name = 'product dummy' WHERE product_id = 1;

/* Ubah data quantity = 3 di data transaction detail, yang product id-nya 1 */
UPDATE transaction_details SET quantity = 3 WHERE product_id = 1;

/* Delete product yang product id-nya 1 */
DELETE products WHERE product_id = 1;

/* Delete product yang product type_id-nya 1 */
DELETE products WHERE product_type_id = 1;

/* Delete product yang product type_id-nya 1 */
DELETE products WHERE product_type_id = 1;

/* Gabungkan data transaksi dari user 1 & user 2 */
SELECT * FROM transaction_details AS td
INNER JOIN transactions AS t ON (td.transaction_id = t.id)
WHERE t.customer_id IN (1, 2);

/* Tampilkan jumlah harga transaksi user 1 */
SELECT SUM(total_price) FROM transactions
GROUP BY user_id
HAVING user_id = 1;

/* Tampilkan total transaksi dengan product type = 2 */
SELECT SUM(price) FROM transaction_details AS td
INNER JOIN products AS p ON (p.id = td.product_id)
GROUP BY p.product_type_id
HAVING p.product_type_id = 2;

/* Tampilkan semua field table product & field name product_type yang saling berhubungan */
SELECT p.id, p.code, p.name, p.price, p.operator_id, p.product_type_id, pt.name AS product_type_name FROM products AS p
INNER JOIN product_types AS pt ON (p.product_type_id = pt.id)

/* Buat function setelah data transaksi dihapus transaction detail juga terhapus */
CREATE TRIGGER after_transaction_details_deleted
AFTER DELETE
ON transaction_details FOR EACH ROW
DELETE transactions WHERE transaction_id =  transaction_details.transaction_id;

/* Buat function setelah data detil transaksi terhapus total_qty pada table transaksi terupdate */
CREATE TRIGGER after_transaction_details_deleted_update_quantity
AFTER DELETE
ON transaction_details FOR EACH ROW
UPDATE transactions SET total_quantity = total_quantity - transaction_details.quantity 
WHERE transaction_id =  transaction_details.transaction_id;

/* Tampilkan data product yang tidak pernah ada pada table transaction_details dengan sub query*/
SELECT * FROM products
WHERE id NOT IN (
    SELECT DISTINCT product_id FROM transaction_details
);