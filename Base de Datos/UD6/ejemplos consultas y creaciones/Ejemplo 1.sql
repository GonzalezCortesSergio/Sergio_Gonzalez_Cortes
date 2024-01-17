DROP TABLE producto;
CREATE TABLE producto (
 num_producto SERIAL,
 nombre TEXT,
 precio NUMERIC,
 CONSTRAINT pk_productos PRIMARY KEY (num_producto)
);

INSERT INTO producto (nombre, precio) VALUES 
('Queso', 9.99),
('Altramuces', 2.31),
('Pepinillos', 3.49);

/*

*/

SELECT *
FROM producto;

ALTER SEQUENCE producto_num_producto_seq
RESTART WITH 1000;

UPDATE producto
SET precio = 79.9
WHERE num_producto = 1;

ALTER TABLE producto
ADD COLUMN disponible	BOOLEAN;

UPDATE producto
SET disponible = true;

UPDATE producto
SET nombre = 'iPhone 3 2 GB RAM, 8GB almacenamiento',
precio = 69.9
WHERE num_producto = 1;

SELECT *
FROM producto;

/*
Actualizar el precio de los productos que valgan
más de 150 euros para descontarles un 10%
*/

UPDATE producto
SET precio = precio * 0.9
WHERE precio >= 150;

UPDATE producto
SET precio = ROUND (precio - (precio * (20.0 / 100.0)), 2)
WHERE precio = (
	SELECT MAX (precio)
	FROM producto
);

DELETE FROM producto 
WHERE num_producto = 1;

UPDATE producto
SET disponible = null
WHERE num_producto = 2;