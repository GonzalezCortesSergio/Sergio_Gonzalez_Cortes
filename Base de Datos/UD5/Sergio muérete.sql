/*
Seleccionar el nombre, apellidos y gasto total de aquellos 
clientes que gastaron menos que la media de gasto por cliente
*/
--Este está mal
SELECT c.nombre, c.apellido1, c.apellido2, v1.precio
FROM cliente c
	JOIN reserva r USING (id_cliente)
	JOIN vuelo v1 USING (id_vuelo)
WHERE v1.precio <= (
	SELECT AVG (v2.precio)
	FROM cliente
		JOIN reserva USING (id_cliente)
		JOIN vuelo v2 USING (id_vuelo)
	WHERE v1.id_vuelo = v2.id_vuelo
);

--Este está bien, y se ha usado WITH
WITH gasto_por_cliente AS(
	SELECT nombre, apellido1, apellido2, SUM (precio * 1 - (COALESCE (descuento, 0) / 100.0)) AS "gasto"
	FROM vuelo JOIN reserva USING (id_vuelo)
		JOIN cliente USING (id_cliente)
	GROUP BY nombre, apellido1, apellido2
), media_gasto_por_cliente AS(
	SELECT AVG (gasto) AS "media"
	FROM gasto_por_cliente
)
SELECT *
FROM gasto_por_cliente
WHERE gasto < (
	SELECT media
	FROM media_gasto_por_cliente
);
