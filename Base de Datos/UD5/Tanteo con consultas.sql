SELECT *
FROM reserva
WHERE EXTRACT (year from fecha_reserva) = 2024
ORDER BY fecha_reserva DESC
LIMIT 50 OFFSET 4*50;

SELECT COUNT (COALESCE (descuento, 0))
FROM vuelo;


SELECT AVG (descuento), AVG (COALESCE (descuento, 0))
FROM vuelo;


SELECT COUNT (DISTINCT descuento)
FROM vuelo;

SELECT COUNT (descuento) - COUNT (DISTINCT (descuento))
FROM vuelo;



SELECT COALESCE (descuento, 0) , COUNT (*)
FROM vuelo 
GROUP BY COALESCE (descuento, 0)
/*Por ahora añadiremos en el group by las funciones
del select que no sean de agregación (hay que añadir TODO, incluído
el COALESCE).*/
ORDER BY COUNT (*) DESC;


SELECT ciudad, COUNT (*)
FROM vuelo
	JOIN aeropuerto ON (desde = id_aeropuerto)
GROUP BY ciudad;


SELECT origen.ciudad, destino.ciudad, COUNT (*)
FROM vuelo
	JOIN aeropuerto origen ON (desde = origen.id_aeropuerto)
	JOIN aeropuerto destino ON (hasta = destino.id_aeropuerto)
GROUP BY origen.ciudad, destino.ciudad
ORDER BY origen.ciudad;


SELECT origen.ciudad, destino.ciudad, COUNT (*)
FROM vuelo
	JOIN aeropuerto origen ON (desde = origen.id_aeropuerto)
	JOIN aeropuerto destino ON (hasta = destino.id_aeropuerto)
WHERE origen.ciudad = 'Sevilla'
GROUP BY origen.ciudad, destino.ciudad
ORDER BY origen.ciudad;


/*
¿Cuántas personas han viajado en cada trayecto?
Si hay más de un vuelo por trayecto, el total de
todos los vuelos 
*/

SELECT origen.ciudad, destino.ciudad, COUNT (*)
FROM vuelo
	JOIN aeropuerto origen ON (desde = origen.id_aeropuerto)
	JOIN aeropuerto destino ON (hasta = destino.id_aeropuerto)
	JOIN reserva USING (id_vuelo)
GROUP BY origen.ciudad, destino.ciudad;

