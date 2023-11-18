/*
1: Selecciona los datos del inmueble sobre el que 
se ha realizado una operación un lunes de febrero o un 
viernes de marzo, que tenga más de 200 metros cuadrados 
y donde el nombre del vendedor contenga una A mayúscula 
o minúscula.
*/

SELECT *
FROM inmueble i
	JOIN operacion o USING (id_inmueble)
	JOIN vendedor v USING (id_vendedor)
WHERE i.superficie = 200
	AND v.nombre ILIKE '%a%';
	
	
/*
2: Selecciona el precio medio por metro cuadrado de 
los alquileres de viviendas en los meses de marzo y 
abril de cualquier año para las provincias costeras
de Andalucía.
*/

SELECT ROUND (AVG (precio), 2) AS "precio_medio"
FROM inmueble i
WHERE (fecha_alta::text LIKE '%-03-%'
	OR fecha_alta::text LIKE '%-04-%')
	AND provincia IN ('Huelva', 'Cádiz', 'Málaga', 
					  'Granada', 'Almería');
					  
/*
3: ¿Cuál es la media del porcentaje de diferencia 
entre el precio inicial (en la tabla inmueble) y 
el precio final (en la tabla operación) para 
aquellas operaciones de alquiler realizadas en 
enero de cualquier año, donde el tipo del inmueble 
es Oficina, Local o Suelo?
*/

SELECT ROUND ((precio_final / precio) * 100, 2) AS "media_diferencia"
FROM inmueble i
	JOIN operacion o ON  (o.id_inmueble = i.id_inmueble)
	JOIN tipo t ON (t.id_tipo = i.tipo_inmueble)
WHERE fecha_operacion::text LIKE '%-01-%'
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
	JOIN