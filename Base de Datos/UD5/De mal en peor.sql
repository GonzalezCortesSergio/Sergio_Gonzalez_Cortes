/*
Seleccionar el nombre, apellidos y número de vuelos por aeropuerto de 
salida, para el cliente que más vuelos de salida ha usado en cada aeropuerto.
*/

SELECT nombre, apellido1, apellido2, COUNT (desde) AS "numero_vuelos"
FROM vuelo
		JOIN reserva USING (id_vuelo)
		JOIN cliente  USING (id_cliente)
GROUP BY nombre, apellido1, apellido2
HAVING COUNT (desde) >= ALL (
	SELECT COUNT (desde) AS "numero_vuelos"
	FROM vuelo
		JOIN reserva USING (id_vuelo)
		JOIN cliente  USING (id_cliente)
	GROUP BY id_cliente
);


--Ahora bien

SELECT c.nombre, apellido1, apellido2, a.ciudad, COUNT (*) AS "cantidad"
FROM cliente c
		JOIN reserva USING (id_cliente)
		JOIN vuelo v1  USING (id_vuelo)
		JOIN aeropuerto a ON (desde = id_aeropuerto)
GROUP BY c.nombre, apellido1, apellido2, a.ciudad, desde
HAVING COUNT (*) >= ALL (
	SELECT COUNT (*) 
	FROM vuelo v2
		JOIN reserva USING (id_vuelo)
	WHERE v1.desde = v2.desde
	GROUP BY id_cliente
);