/*Populate tabla clientes*/
INSERT INTO regiones (id, nombre) VALUES (1, 'Sudamérica');
INSERT INTO regiones (id, nombre) VALUES (2, 'Centroamérica');
INSERT INTO regiones (id, nombre) VALUES (3, 'Norteamérica');
INSERT INTO regiones (id, nombre) VALUES (4, 'Europa');
INSERT INTO regiones (id, nombre) VALUES (5, 'Asia');
INSERT INTO regiones (id, nombre) VALUES (6, 'Africa');
INSERT INTO regiones (id, nombre) VALUES (7, 'Oceanía');
INSERT INTO regiones (id, nombre) VALUES (8, 'Antártida');

INSERT INTO clientes (region_id,nombre,apellido, email,create_at) values (4, 'Carlos', 'Moyano', 'CarlosMoyano@jc.com', '2017-12-29');
INSERT INTO clientes (region_id,nombre,apellido, email,create_at) values (4, 'Juan', 'Guerrero', 'juanGuerrero@jc.com', '2017-12-29');
INSERT INTO clientes (region_id,nombre,apellido, email, create_at) VALUES(2, 'Andrés', 'Guzmán', 'profesor@bolsadeideas.com', '2018-01-01');
INSERT INTO clientes (region_id,nombre,apellido, email, create_at) VALUES(3, 'Mr. John', 'Doe', 'john.doe@gmail.com', '2018-01-02');
INSERT INTO clientes (region_id,nombre,apellido, email, create_at) VALUES(4, 'Linus', 'Torvalds', 'linus.torvalds@gmail.com', '2018-01-03');
INSERT INTO clientes (region_id,nombre,apellido, email, create_at) VALUES(1, 'Rasmus', 'Lerdorf', 'rasmus.lerdorf@gmail.com', '2018-01-04');
INSERT INTO clientes (region_id,nombre,apellido, email, create_at) VALUES(6, 'Erich', 'Gamma', 'erich.gamma@gmail.com', '2018-02-01');
INSERT INTO clientes (region_id,nombre,apellido, email, create_at) VALUES(8, 'Richard', 'Helm', 'richard.helm@gmail.com', '2018-02-10');
INSERT INTO clientes (region_id,nombre,apellido, email, create_at) VALUES(7, 'Ralph', 'Johnson', 'ralph.johnson@gmail.com', '2018-02-18');
INSERT INTO clientes (region_id,nombre,apellido, email, create_at) VALUES(7, 'John', 'Vlissides', 'john.vlissides@gmail.com', '2018-02-28');
INSERT INTO clientes (region_id,nombre,apellido, email, create_at) VALUES(7, 'Dr. James', 'Gosling', 'james.gosling@gmail.com', '2018-03-03');
INSERT INTO clientes (region_id,nombre,apellido, email, create_at) VALUES(5, 'Magma', 'Lee', 'magma.lee@gmail.com', '2018-03-04');
INSERT INTO clientes (region_id,nombre,apellido, email, create_at) VALUES(5, 'Tornado', 'Roe', 'tornado.roe@gmail.com', '2018-03-05');
INSERT INTO clientes (region_id,nombre,apellido, email, create_at) VALUES(5, 'Jade', 'Doe', 'jane.doe@gmail.com', '2018-03-06');