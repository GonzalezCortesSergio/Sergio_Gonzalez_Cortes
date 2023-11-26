/*
3. Selecciona el nombre del comprador, el nombre del vendedor, 
la provincia y la fecha de operación de las viviendas (casa y 
piso) alquiladas en el tercer trimestre de año en las provincias
de Huelva, Sevilla y Almería. Ordena la salida por fecha de 
operación descendentemente. 
*/

SELECT c.nombre, v.nombre, i.provincia, fecha_operacion
FROM inmueble i
	JOIN tipo t ON (i.tipo_inmueble = t.id_tipo)
	JOIN operacion o USING (id_inmueble)
	JOIN vendedor v USING (id_vendedor)
	JOIN comprador c USING (id_cliente)
WHERE t.nombre IN ('Casa', 'Piso')
	AND EXTRACT (month from fecha_operacion)
		BETWEEN 07 AND 09 
	AND i.provincia IN ('Huelva', 'Sevilla', 'Almería')
ORDER BY fecha_operacion DESC;

/*
4. Modifica la consulta anterior para que las viviendas que 
fueran vendidas en un plazo de entre 35 y 45 días desde que 
se dieron de alta en la inmobiliaria.
*/

SELECT c.nombre, v.nombre, i.provincia, fecha_operacion
FROM inmueble i
	JOIN tipo t ON (i.tipo_inmueble = t.id_tipo)
	JOIN operacion o USING (id_inmueble)
	JOIN vendedor v USING (id_vendedor)
	JOIN comprador c USING (id_cliente)
WHERE t.nombre IN ('Casa', 'Piso')
	AND EXTRACT (month from fecha_operacion)
		BETWEEN 07 AND 09 
	AND i.provincia IN ('Huelva', 'Sevilla', 'Almería')
	AND AGE (fecha_alta, fecha_operacion)
		BETWEEN '35 day'::interval
			AND '45 day'::interval
ORDER BY fecha_operacion DESC;


/*
5. Calcula el precio máximo y precio mínimo por metro cuadrado 
de venta de inmuebles que no sean viviendas (no sean Piso o 
Casa) en provincias que contengan una n (mayúscula o minúscula)
, siempre que los inmuebles se hayan vendido en un mes que 
escrito de forma completa en inglés tenga entre 5 y 7 
caracteres.
*/

SELECT ROUND (MAX (precio / superficie), 2) AS "maximo_precio_metro_cuadrado", ROUND (MIN (precio / superficie), 2) AS "minimo_precio_metro_cuadrado"
FROM inmueble i 
	JOIN tipo t ON (t.id_tipo = i.tipo_inmueble)
	JOIN operacion o USING (id_inmueble)
WHERE i.provincia ILIKE '%n%'
	AND NOT t.nombre IN ('Piso', 'Casa')
	AND (TO_CHAR (fecha_operacion, 'FMMonth') LIKE '_____'
		 	OR TO_CHAR (fecha_operacion, 'FMMonth') LIKE '______'
		 	OR TO_CHAR (fecha_operacion, 'FMMonth') LIKE '_______');