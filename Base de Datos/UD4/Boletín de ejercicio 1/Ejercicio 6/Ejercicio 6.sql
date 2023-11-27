/*
1. Selecciona el top 3 de pisos vendidos más caros en 
Sevilla a lo largo del año 2019 (puedes investigar el uso 
de LIMIT para hacerlo)
*/

SELECT *
FROM inmueble i
	JOIN tipo t ON (i.tipo_inmueble = t.id_tipo)
	JOIN operacion o USING (id_inmueble)
WHERE i.tipo_operacion = 'Venta'
	AND t.nombre = 'Piso'
	AND EXTRACT (year from fecha_operacion) = 2019
LIMIT 3;

/*
2. Selecciona el precio medio de los alquileres en Málaga 
en los meses de Julio y Agosto (da igual de qué año).
*/

SELECT ROUND (AVG (precio_final), 2)
FROM inmueble i 
	JOIN operacion USING (id_inmueble)
WHERE (EXTRACT (month from fecha_operacion) = 07
	OR EXTRACT (month from fecha_operacion) = 08)
	AND i.provincia = 'Málaga'
	AND i.tipo_operacion = 'Alquiler';
	
/*
3. Selecciona los inmuebles que se han vendido en Jaén y 
Córdoba en los últimos 3 meses del año 2019 o 2020.
*/

SELECT *
FROM inmueble i 
	JOIN operacion o USING (id_inmueble)
WHERE i.provincia IN ('Jaén', 'Córdoba')
	AND tipo_operacion = 'Venta'
	AND ((EXTRACT (year from fecha_operacion) = 2019)
		OR (EXTRACT (year from fecha_operacion) = 2020)
		AND (EXTRACT (month from fecha_operacion ) BETWEEN 10 AND 12));
		
/*
4. Selecciona el precio medio de las ventas de Parking en 
la provincia de Huelva para aquellas operaciones que se 
realizaran entre semana (de Lunes a Viernes).
*/

SELECT ROUND ( AVG (precio_final), 2)
FROM inmueble i 
	JOIN tipo t ON (t.id_tipo = i.tipo_inmueble)
	JOIN operacion o USING (id_inmueble)
WHERE t.nombre = 'Parking'
	AND i.tipo_operacion = 'Venta'
	AND i.provincia = 'Huelva'
	AND TO_CHAR  (fecha_operacion, 'ID') IN ('1', '2', '3', '4', '5');
	
	
/*
5. Selecciona aquellos pisos que han tardado en venderse entre 
3 y 6 meses en la provincia de Granada.
*/

SELECT *
FROM inmueble i
	JOIN tipo t ON (t.id_tipo = i.tipo_inmueble)
	JOIN operacion o USING (id_inmueble)
WHERE i.provincia = 'Granada'
	AND AGE (fecha_operacion, fecha_alta) BETWEEN '3 month'::interval
		AND '6 month'::interval;
		
		
/*
6. Diseña una consulta (incluyendo su solución) para la base 
de datos INMO que contenga los siguientes elementos.

La salida del select no será SELECT *

Debe realizar el JOIN de al menos 3 tablas.

Uno de los JOINs debe, obligatoriamente, ser un JOIN ON

Al menos una de las condiciones debe estar relacionada con fechas

Debe ordenar la salida por algún criterio.

*/

/*Selecciona el nombre de aquellas personas que hayan 
comprado una casa en la provincia de Málaga entre junio y agosto. 
Ordena la salida por precio final de forma descendente*/

SELECT c.nombre
FROM comprador c 
	JOIN operacion o USING (id_cliente)
	JOIN inmueble i USING (id_inmueble)
	JOIN tipo t ON (t.id_tipo = i.tipo_inmueble)
WHERE t.nombre = 'Casa'
	AND i.provincia = 'Málaga'
	AND EXTRACT (month from fecha_operacion) BETWEEN 06 AND 08
ORDER BY precio_final DESC;