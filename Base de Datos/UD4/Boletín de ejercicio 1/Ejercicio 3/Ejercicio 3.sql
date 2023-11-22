/*
1: Selecciona los datos del inmueble sobre el que 
se ha realizado una operación un lunes de febrero o un 
viernes de marzo, que tenga más de 200 metros cuadrados 
y donde el nombre del vendedor contenga una A mayúscula 
o minúscula.
*/

SELECT i.*
FROM inmueble i
	JOIN operacion o USING (id_inmueble)
	JOIN vendedor v USING (id_vendedor)
WHERE i.superficie > 200
	AND v.nombre ILIKE '%a%'
	AND ((TO_CHAR (fecha_operacion, 'ID') = '1'
	AND TO_CHAR (fecha_operacion, 'MM') = '02')
	OR (TO_CHAR(fecha_operacion, 'ID') = '5'
	AND TO_CHAR (fecha_operacion, 'MM') = '03'));
	
	
/*
2: Selecciona el precio medio por metro cuadrado de 
los alquileres de viviendas en los meses de marzo y 
abril de cualquier año para las provincias costeras
de Andalucía.
*/

SELECT ROUND (AVG (precio / superficie), 2) AS "precio_medio"
FROM inmueble i
	JOIN tipo t ON (i.tipo_inmueble = t.id_tipo)
WHERE EXTRACT(month from fecha_alta) IN (3,4)
	AND tipo_operacion = 'Alquiler'
	AND t.nombre IN ('Casa', 'Piso')
	AND i.provincia IN ('Huelva', 'Cádiz', 'Málaga', 'Granada', 'Almería');
					  
/*
3: ¿Cuál es la media del porcentaje de diferencia 
entre el precio inicial (en la tabla inmueble) y 
el precio final (en la tabla operación) para 
aquellas operaciones de alquiler realizadas en 
enero de cualquier año, donde el tipo del inmueble 
es Oficina, Local o Suelo?
*/

SELECT ROUND (AVG((ABS (precio - precio_final) / precio * 100)), 2)
FROM inmueble i
	JOIN operacion o ON  (o.id_inmueble = i.id_inmueble)
	JOIN tipo t ON (t.id_tipo = i.tipo_inmueble)
WHERE EXTRACT (month from fecha_operacion) = 1
	AND tipo_operacion = 'Alquiler'
	AND t.nombre IN ('Oficina', 'Local', 'Suelo');
	
/*
4: Seleccionar el nombre de aquellos compradores de 
Casa o Piso en las provincias de Jaén o Córdoba, donde 
el precio final de inmueble esté entre 150.000 y 200.000€, 
para aquellos inmuebles que han tardado entre 3 y 4 meses 
en venderse.
*/

SELECT c.nombre
FROM comprador c
	JOIN operacion o USING (id_cliente)
	JOIN inmueble i USING (id_inmueble)
	JOIN tipo t ON (i.tipo_inmueble = t.id_tipo)
WHERE t.nombre IN ('Casa', 'Piso')
	AND i.provincia IN ('Jaén', 'Córdoba')
	AND tipo_operacion = 'Venta'
	AND precio_final BETWEEN 150000 AND 200000
	/*AND AGE (fecha_operacion, fecha_alta) 
		BETWEEN '3 mon'::interval AND '4 mon'::interval;*/
	AND fecha_operacion BETWEEN
		fecha_alta + '3 mon'::interval AND
		fecha_alta + '4 mon'::interval;
	
/*
5: Selecciona la media del precio inicial (en la tabla 
inmueble), del precio final (en la tabla operación) y de 
la diferencia en porcentaje entre ellas de aquellas viviendas
(Casa o Piso) en alquiler que tengan menos de 100 metros 
cuadrados y que hayan tardado un año o más en alquilarse.
*/

SELECT AVG (precio), AVG (precio_final), 
	ROUND(((AVG (precio) - AVG (precio_final)) / AVG(precio))* 100, 2)
FROM inmueble i
	JOIN operacion o USING (id_inmueble)
	JOIN tipo t ON (t.id_tipo = i.tipo_inmueble)
WHERE i.superficie < 100
	AND t.nombre IN ('Casa', 'Piso')
	AND tipo_operacion = 'Alquiler'
	AND fecha_operacion >= fecha_alta + '1 month'::interval;
	
/*Cambiamos de 1 año a 1 mes la condición para que aparezca
un resultado que no sea nulo*/

/*
6. Selecciona el alquiler de vivienda (Casa o Piso) más caro 
realizado en Julio o Agosto de cualquier año en la provincia 
de Huelva.
*/

SELECT MAX (precio_final)
FROM inmueble i JOIN tipo t ON (t.id_tipo = i.tipo_inmueble)
	JOIN operacion o USING (id_inmueble)
WHERE nombre IN ('Casa', 'Piso')
	AND TO_CHAR (fecha_operacion, 'MM') IN ('07', '08')
	AND tipo_operacion = 'Alquiler'
	AND provincia = 'Huelva';
