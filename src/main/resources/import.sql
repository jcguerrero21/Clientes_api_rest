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


/*Crar algunos usuarios y roles*/
INSERT INTO usuarios (username, password, enabled, nombre, apellido, email) VALUES ('jcguerrero','$2a$10$cmtDxUCX3PmztXwqFYSTh.qwKww4pRJzqd.v8gjsiPiAnwHqdjxnq',1, 'Juan Carlos', 'Guerrero Moyano', 'jotaceguerrerom21@gmail.com') ;
INSERT INTO usuarios (username, password, enabled, nombre, apellido, email) VALUES ('admin','$2a$10$LstpxRlDCAkArzPDHvSVFex7lPIpbITGpP2R9HdJVPeLknDzPhRde',1, 'Administrador', 'Administrador', 'administrador@gmail.com');

INSERT INTO roles (nombre) VALUES ('ROLE_USER');
INSERT INTO roles (nombre) VALUES ('ROLE_ADMIN');

INSERT INTO usuarios_roles (usuario_id, role_id) VALUES (1,1);
INSERT INTO usuarios_roles (usuario_id, role_id) VALUES (2,2);
INSERT INTO usuarios_roles (usuario_id, role_id) VALUES (2,1);

/*Populate tabla productos*/
INSERT INTO productos (nombre, precio, create_at) VALUES('Panasonic Pantall LCD', 259990, NOW());
INSERT INTO productos (nombre, precio, create_at) VALUES('Canon EOS 1300D', 130000, NOW());
INSERT INTO productos (nombre, precio, create_at) VALUES('Apple iPhone X', 459990, NOW());
INSERT INTO productos (nombre, precio, create_at) VALUES('HP Notebook', 1159990, NOW());
INSERT INTO productos (nombre, precio, create_at) VALUES('XIAOMI Scooter', 159990, NOW());
INSERT INTO productos (nombre, precio, create_at) VALUES('Armario G�rkenhansen', 59990, NOW());

/* Creamos algunas facturas */
INSERT INTO facturas (descripcion, observacion, cliente_id, create_at) VALUES('Facturs equipos de oficina', null, 1, NOW());
INSERT INTO facturas_items (cantidad, producto_id, factura_id) VALUES(1, 1, 1);
INSERT INTO facturas_items (cantidad, producto_id, factura_id) VALUES(2, 1, 1);
INSERT INTO facturas_items (cantidad, producto_id, factura_id) VALUES(1, 1, 1);
INSERT INTO facturas_items (cantidad, producto_id, factura_id) VALUES(1, 1, 1);

INSERT INTO facturas (descripcion, observacion, cliente_id, create_at) VALUES('Facturs 2', null, 1, NOW());
INSERT INTO facturas_items (cantidad, producto_id, factura_id) VALUES(1, 1, 2);
INSERT INTO facturas_items (cantidad, producto_id, factura_id) VALUES(2, 1, 2);
INSERT INTO facturas_items (cantidad, producto_id, factura_id) VALUES(1, 1, 2);
INSERT INTO facturas_items (cantidad, producto_id, factura_id) VALUES(1, 1, 2);



