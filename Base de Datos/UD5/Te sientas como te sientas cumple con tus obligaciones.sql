/*
1. Seleccionar el vuelo más largo (con mayor duración) de cada 
día de la semana. Debe aparecer el nombre del aeropuerto de 
salida, el de llegada, la fecha y hora de salida y llegada y la duración.
*/

SELECT origen.nombre, salida, TO_CHAR(salida, 'Day'), destino.nombre, llegada, age (llegada, salida)
FROM vuelo v
	JOIN aeropuerto origen ON (origen.id_aeropuerto = desde)
	JOIN aeropuerto destino ON (destino.id_aeropuerto = hasta)
WHERE age (llegada, salida) >= ALL(

	SELECT age (llegada, salida)
	FROM vuelo v2
	WHERE EXTRACT (isodow from v.salida)
			= EXTRACT (isodow from v2.salida)
	
)
ORDER BY EXTRACT (isodow from v.salida);


--Seleccionar la duración máxima por día
--de la semana de los vuelos.

--Si únicamente tenemos que mostrar unos datos agrupados, entonces
--haremos uso del group by. Mientras que si queremos mostrar datos
--relacionados a tablas habrá que hacer la correlación

SELECT TO_CHAR (salida, 'Day'), MAX (age (llegada, salida))
FROM vuelo
GROUP BY TO_CHAR (salida, 'Day');

/*
2. Seleccionar el cliente que más ha gastado en vuelos que salen 
del mismo aeropuerto. Debe aparecer el nombre del cliente, el nombre 
y la ciudad del aeropuerto y la cuantía de dinero que ha gastado.
*/

SELECT c.nombre, c.apellido1, c.apellido2, a.nombre, a.ciudad, SUM (precio * (1 - (COALESCE(descuento, 0) / 100)))
FROM vuelo v1 
	JOIN reserva USING (id_vuelo)
	JOIN cliente c USING (id_cliente)
	JOIN aeropuerto a ON (desde = id_aeropuerto)
GROUP BY c.nombre, c.apellido1, c.apellido2, a.nombre, a.ciudad,
v1.desde
HAVING SUM (precio * (1 - (COALESCE(descuento, 0) / 100))) >= ALL
(

	SELECT SUM (precio * (1 - (COALESCE (descuento, 0) / 100)))
	FROM vuelo v2
		JOIN reserva USING (id_vuelo)
	WHERE v1.desde = v2.desde
	GROUP BY id_cliente
);
