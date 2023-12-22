--1.

SELECT *
FROM inmueble
WHERE precio > (
	SELECT AVG (precio)
	FROM inmueble
	WHERE tipo_operacion = 'Alquiler'
)
	AND id_inmueble NOT IN (
		SELECT id_inmueble
		FROM inmueble
			JOIN operacion USING (id_inmueble)
		WHERE tipo_operacion = 'Alquiler'
	)
	AND tipo_operacion = 'Alquiler';
	
--2.

SELECT EXTRACT (year from fecha_operacion) AS "anio", EXTRACT (month from fecha_operacion) AS "mes",
ROUND (AVG (precio), 2) AS "precio_medio", ROUND (AVG (precio / superficie), 2) AS "precio_medio_superficie"
FROM inmueble
	JOIN operacion USING (id_inmueble)
WHERE tipo_operacion = 'Venta'
GROUP BY anio, mes;

--3.

SELECT *
FROM vendedor v
WHERE id_vendedor IN (
	SELECT id_vendedor
	FROM vendedor 
		JOIN operacion USING (id_vendedor)
		JOIN inmueble USING (id_inmueble)
	WHERE tipo_operacion = 'Venta'
		AND provincia IN ('Málaga', 'Sevilla')
);

--4.

SELECT nombre, COUNT (*), SUM (precio_final) AS "suma_total_precios"
FROM vendedor
	JOIN operacion USING (id_vendedor)
	JOIN inmueble USING (id_inmueble)
WHERE tipo_operacion = 'Venta'
GROUP BY nombre
ORDER BY suma_total_precios
LIMIT 3;

--5.
	
SELECT provincia, nombre, SUM (precio_final) AS "total_gastado", COUNT (*) AS "num_operaciones"
FROM comprador 
		JOIN operacion USING (id_cliente)
		JOIN inmueble USING (id_inmueble)
GROUP BY provincia, nombre
HAVING SUM(precio_final) >= ALL (
	
	SELECT  SUM (precio_final)
	FROM comprador
		JOIN operacion USING (id_cliente)
		JOIN inmueble USING (id_inmueble)
	GROUP BY provincia, nombre
	ORDER BY SUM (precio_final) DESC
);