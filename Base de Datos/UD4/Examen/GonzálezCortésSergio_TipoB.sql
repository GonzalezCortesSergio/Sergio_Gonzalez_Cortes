
--1.

SELECT SUM (precio_final)
FROM inmueble i 
	JOIN operacion o USING (id_inmueble)
WHERE i.tipo_operacion = 'Alquiler'
	AND i.provincia IN ('Sevilla', 'Córdoba')
	AND (AGE (fecha_operacion, fecha_alta) = '3 month'::interval
		OR AGE (fecha_operacion, fecha_alta) = '4 month'::interval);
		
--2.

SELECT ROUND (AVG (precio_final), 2)
FROM inmueble i
	JOIN operacion o USING (id_inmueble)
WHERE (EXTRACT (month from fecha_operacion) = 06
		AND EXTRACT (day from fecha_operacion) BETWEEN 21 AND 30
	   	OR (EXTRACT (month from fecha_operacion) BETWEEN 07 AND 08)
	   	OR (EXTRACT (month from fecha_operacion) = 09
		   	AND EXTRACT (day from fecha_operacion) BETWEEN 1 AND 20))
	AND EXTRACT (isodow from fecha_operacion) IN (5, 6, 7);
	
	
	
--3.

SELECT DISTINCT v.nombre
FROM vendedor v
	JOIN operacion o USING (id_vendedor)
	JOIN inmueble i USING (id_inmueble)
	JOIN tipo t ON (t.id_tipo = i.tipo_inmueble)
WHERE i.tipo_operacion = 'Venta'
	AND i.provincia IN ('Sevilla', 'Huelva', 'Cádiz')
	AND t.nombre = 'Local'
	AND i.superficie > 100
	AND ((EXTRACT (month from fecha_operacion) = 5
		AND EXTRACT (isodow from fecha_operacion) = 4)
		 	OR
		 (EXTRACT (month from fecha_operacion) = 6
		 	AND EXTRACT (isodow from fecha_operacion) = 3));
			
			
--4.

SELECT c.*, v.*, o.*, t.*
FROM inmueble i
	JOIN tipo t ON (i.tipo_inmueble = t.id_tipo)
	JOIN operacion o USING (id_inmueble)
	JOIN vendedor v USING (id_vendedor)
	JOIN comprador c USING (id_cliente)
WHERE t.nombre NOT IN ('Local', 'Oficina')
	AND (TO_CHAR (i.fecha_alta, 'w') = '1'
		OR TO_CHAR (i.fecha_alta, 'w') = '3')
	AND (TO_CHAR (o.fecha_operacion, 'YYYY') LIKE '%0'
			OR
		TO_CHAR (o.fecha_operacion, 'YYYY') LIKE '%2'
			OR
		TO_CHAR (o.fecha_operacion, 'YYYY') LIKE '%4'
			OR
		TO_CHAR (o.fecha_operacion, 'YYYY') LIKE '%6'
			OR
		TO_CHAR (o.fecha_operacion, 'YYYY') LIKE '%8')
	AND AGE (o.fecha_operacion, i.fecha_alta) = '120 day'::interval
	AND i.tipo_operacion IN ('Alquiler', 'Venta');
	

--5.

SELECT i.*
FROM inmueble i 
	LEFT JOIN operacion o USING (id_inmueble)
WHERE o.id_inmueble IS NULL;
	