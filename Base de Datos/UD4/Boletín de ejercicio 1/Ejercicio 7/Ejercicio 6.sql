/*
6. ¿Cuál es el descuento medio obtenido
en vuelos donde el origen sea España y el 
destino fuera de España, siempre que estos
vuelos no se hayan realizado en fin de semana
(contaremos como fin de semana los Viernes a 
partir de las 15:00)?
*/

SELECT ROUND (AVG (COALESCE (descuento, 0)), 2)
FROM vuelo v 
	JOIN aeropuerto o ON (v.desde = o.id_aeropuerto)
	JOIN aeropuerto d ON (v.hasta = d.id_aeropuerto)
WHERE o.ciudad IN ('Sevilla', 'Madrid', 'Málaga', 'Barcelona', 'Bilbao')
	AND d.ciudad NOT IN ('Sevilla', 'Madrid', 'Málaga', 'Barcelona', 'Bilbao')
	AND (EXTRACT (isodow from salida)
		BETWEEN 1 AND 4
		OR (EXTRACT (isodow from salida) = 5
		   AND
		   EXTRACT (hour from salida) < 15));