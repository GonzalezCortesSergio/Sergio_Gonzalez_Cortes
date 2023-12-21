/*
1. Selecciona, agrupando por vendedor, el precio final 
medio de pisos y casas que se han vendido en cada provincia.
Debe aparecer el nombre del vendedor, la provincia y el 
precio medio
*/

SELECT v.nombre, i.provincia, ROUND (AVG (precio_final), 2) AS "precio_medio"
FROM vendedor v
	JOIN operacion o USING (id_vendedor)
	JOIN inmueble i USING (id_inmueble)
	JOIN tipo t ON (id_tipo = tipo_inmueble)
WHERE t.nombre IN ('Piso', 'Casa')
	AND tipo_operacion = 'Venta'
GROUP BY v.nombre, i.provincia;

/*
2. Seleccionar la suma del precio final, agrupado por provincia,
de aquellos locales donde su precio sea superior al producto del
número de metros cuadrados de ese local por el precio medio del 
metro cuadrado de los locales de esa provincia.
*/
WITH producto_metro_cuadrado AS (
	SELECT (precio * superficie) AS "precio_metro_cuadrado"
	FROM inmueble
), precio_medio AS (
	SELECT AVG (precio_metro_cuadrado) AS "precio_medio_metro"
	FROM producto_metro_cuadrado
)
SELECT i.provincia, SUM (precio_final)
FROM inmueble i
	JOIN operacion o USING (id_inmueble)
	JOIN tipo t ON (id_tipo = tipo_inmueble)
WHERE t.nombre = 'Local'
	AND i.precio > (
		SELECT precio_medio_metro
		FROM precio_medio
	)
GROUP BY i.provincia;



--Ahora bien hecho 

SELECT provincia, SUM (precio_final)
FROM inmueble i1
	JOIN operacion USING (id_inmueble)
	JOIN tipo ON (tipo_inmueble = id_tipo)
WHERE tipo.nombre = 'Local'
	AND (precio_final / superficie) > (
		SELECT AVG (precio_final / superficie)
		FROM inmueble i2
			JOIN operacion USING (id_inmueble)
			JOIN tipo ON (tipo_inmueble = id_tipo)
		WHERE tipo.nombre = 'Local'
			AND i1.provincia = i2.provincia
			AND i1.tipo_operacion = i2.tipo_operacion
	)
GROUP BY provincia;

--Otra versión menos optimizada

SELECT provincia, SUM (precio_final)
FROM inmueble i1
	JOIN operacion USING (id_inmueble)
	JOIN tipo ON (tipo_inmueble = id_tipo)
WHERE tipo.nombre = 'Local'
	AND precio_final > (
		SELECT AVG (precio_final / superficie) * (
			SELECT superficie
			FROM inmueble i3
			WHERE i3.id_inmueble = i1.id_inmueble
		)
		FROM inmueble i2
			JOIN operacion USING (id_inmueble)
			JOIN tipo ON (tipo_inmueble = id_tipo)
		WHERE tipo.nombre = 'Local'
			AND i1.provincia = i2.provincia
			AND i1.tipo_operacion = i2.tipo_operacion
	)
GROUP BY provincia;

/*
3. Selecciona la media de pisos vendidos al día que se han 
vendido en cada provincia. Es decir, debes calcular primero 
el número de pisos que se han vendido cada día de la semana 
en cada provincia, y después, sobre eso, calcular la media 
por provincia.
*/

WITH num_pisos_por_provincia AS (
	SELECT TO_CHAR (fecha_operacion, 'Day') AS "dia", provincia, COUNT (*) AS "num_pisos"
	FROM operacion
		JOIN inmueble USING (id_inmueble)
		JOIN tipo t ON (tipo_inmueble = id_tipo)
	WHERE t.nombre = 'Piso'
		AND tipo_operacion = 'Venta'
	GROUP BY TO_CHAR (fecha_operacion, 'Day'), provincia
)
--Ojo cuidado, que te has equivocado tomando en cuenta los días y no deberías (fua pareado)
SELECT provincia, ROUND (AVG (num_pisos), 2) AS "media_num_pisos"
	FROM num_pisos_por_provincia
	GROUP BY provincia;
	
/*
4. Selecciona el cliente que ha comprado más barato cada tipo de 
inmueble (casa, piso, local, …). Debe aparecer el nombre del cliente, 
la provincia del inmueble, la fecha de operación, el precio final y
el nombre del tipo de inmueble. ¿Te ves capaz de modificar la consulta 
para que en lugar de que salga el más barato, salgan los 3 más baratos?
*/

SELECT c.nombre, provincia, fecha_operacion, precio_final, t.nombre
FROM inmueble
	JOIN tipo t ON (id_tipo = tipo_inmueble)
	JOIN operacion o1 USING (id_inmueble)
	JOIN comprador c USING (id_cliente)
WHERE tipo_operacion = 'Venta'
ORDER BY precio_final
LIMIT 3;

--Ahora bien hecho

SELECT c.nombre, provincia, fecha_operacion, precio_final, t.nombre
FROM comprador c
	JOIN operacion USING (id_cliente)
	JOIN inmueble i1 USING (id_inmueble)
	JOIN tipo t ON (t.id_tipo = tipo_inmueble)
WHERE tipo_operacion = 'Venta'
	AND precio_final <= ALL (
		SELECT precio_final
		FROM inmueble i2
			JOIN operacion USING (id_inmueble)
		WHERE tipo_operacion = 'Venta'
			AND i2.tipo_inmueble = i1.tipo_inmueble
);

--Segunda pregunta del apartado

SELECT c.nombre, provincia, fecha_operacion, precio_final, t.nombre
FROM comprador c
	JOIN operacion USING (id_cliente)
	JOIN inmueble i1 USING (id_inmueble)
	JOIN tipo t ON (t.id_tipo = tipo_inmueble)
WHERE tipo_operacion = 'Venta'
	AND precio_final <=  (
		SELECT precio_final
		FROM inmueble i2
			JOIN operacion USING (id_inmueble)
		WHERE tipo_operacion = 'Venta'
			AND i2.tipo_inmueble = i1.tipo_inmueble
		ORDER BY precio_final
		LIMIT 1 OFFSET 2
)
ORDER BY provincia, precio_final;

/*
5. De entre todos los clientes que han comprado un piso en Sevilla, 
selecciona a los que no han realizado ninguna compra en fin de semana.
*/

SELECT *
FROM comprador c
	JOIN operacion USING (id_cliente)
	JOIN inmueble USING (id_inmueble)
	JOIN tipo t ON (id_tipo = tipo_inmueble)
WHERE t.nombre = 'Piso'
	AND tipo_operacion = 'Venta'
	AND provincia = 'Sevilla'
	AND EXTRACT (isodow from fecha_operacion) NOT IN (
		SELECT EXTRACT (isodow from fecha_operacion)
		FROM operacion
		WHERE EXTRACT (isodow from fecha_operacion) BETWEEN 5 AND 7
	);
	
/*
6. El responsable de la inmobiliaria quiere saber el rendimiento de 
operaciones de alquiler que realiza cada vendedor durante los días 
de la semana (de lunes a sábado). Se debe mostrar el nombre del 
vendedor, el % del número de operaciones de alquiler que ha realizado 
en ese día de la semana ese vendedor y el precio medio por metro 
cuadrado de las operaciones de alquiler que ha realizado ese vendedor 
en ese día de la semana.
*/
	
SELECT nombre, EXTRACT (isodow from fecha_operacion), ROUND ((COUNT (*)::numeric / 
(
	SELECT COUNT (*)
	FROM inmueble 
		JOIN operacion o2 USING (id_inmueble)
	WHERE tipo_operacion = 'Alquiler'
		AND o1.id_vendedor = o2.id_vendedor
	
) * 100) , 2), ROUND (AVG (precio_final / superficie), 2)
FROM vendedor v
	JOIN operacion o1 USING (id_vendedor)
	JOIN inmueble USING (id_inmueble)
WHERE tipo_operacion = 'Alquiler'
	AND EXTRACT (isodow from fecha_operacion) != 7
GROUP BY nombre, o1.id_vendedor, EXTRACT (isodow from fecha_operacion);