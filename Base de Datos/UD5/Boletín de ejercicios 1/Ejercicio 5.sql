/*
1. Selecciona la media, agrupada por nombre de aeropuerto de salida, 
del % de ocupación de los vuelos. PISTA: tendrás que incluir una
subconsulta dentro de otra y, en la interior, usar una subconsulta 
en el select :S (o bien usar WITH)
*/

--Todo mal
SELECT origen.nombre, AVG ((
	SELECT COUNT (c.*)
	FROM vuelo v
		JOIN aeropuerto origen ON (origen.id_aeropuerto = desde)
		JOIN reserva USING (id_vuelo)
		JOIN cliente c USING (id_cliente)
	GROUP BY salida
))
FROM vuelo v
	JOIN aeropuerto origen ON (origen.id_aeropuerto = desde)
	JOIN reserva USING (id_vuelo)
	JOIN cliente USING (id_cliente)
GROUP BY origen.nombre;

--Ahora bien hecho

SELECT ciudad, ROUND (AVG (prc), 2) AS "media_ocupacion"
FROM (
SELECT a.ciudad AS "ciudad", id_vuelo, max_pasajeros, COUNT (*), ((COUNT (*) / max_pasajeros::numeric) * 100) AS "prc"
FROM vuelo 
	JOIN avion  USING (id_avion)
	JOIN aeropuerto a ON (desde = id_aeropuerto)
	JOIN reserva USING (id_vuelo)
GROUP BY a.ciudad, id_vuelo, max_pasajeros
)
GROUP BY ciudad;

--Ahora con WITH

WITH personas_por_vuelo AS (
	SElECT id_vuelo, id_avion, desde, COUNT (*) AS "ocupacion"
	FROM vuelo
		JOIN reserva USING (id_vuelo)
	GROUP BY id_vuelo, id_avion, desde
), porcentaje_ocupacion AS (
	SELECT id_vuelo, desde, (ocupacion / max_pasajeros::numeric) * 100 AS "porcentaje"
	FROM personas_por_vuelo 
		JOIN avion USING (id_avion)
)
SELECT ciudad, ROUND (AVG (porcentaje), 2)
FROM porcentaje_ocupacion
	JOIN aeropuerto ON (id_aeropuerto = desde)
GROUP BY ciudad

/*
2. Selecciona el tráfico de pasajeros (es decir, personas 
que han llegado en un vuelo o personas que han salido en 
un vuelo) agrupado por mes (independiente del año) y 
aeropuerto. 
*/

--Todo mal

SELECT origen.nombre, num_pasajeros_salida, destino.nombre, num_pasajeros_llegada

FROM (
	
SELECT salida, COUNT (c.*) AS "num_pasajeros_salida"
FROM vuelo 
	JOIN aeropuerto origen ON (origen.id_aeropuerto = desde)
	JOIN reserva USING (id_vuelo)
	JOIN cliente c USING (id_cliente)
GROUP BY salida
UNION 
SELECT llegada, COUNT (c.*) AS "num_pasajeros_llegada"
FROM vuelo
	JOIN aeropuerto destino ON (destino.id_aeropuerto = hasta)
	JOIN reserva USING (id_vuelo)
	JOIN cliente c USING (id_cliente)
GROUP BY llegada
) t;

--Ahora bien

SELECT ciudad, SUM (trafico)
FROM (
SELECT ciudad, COUNT (*) AS "trafico"
FROM reserva
	JOIN vuelo USING (id_vuelo)
	JOIN aeropuerto ON (hasta = id_aeropuerto)
GROUP BY ciudad, EXTRACT (month from llegada::date)
UNION
SELECT ciudad, COUNT (*) AS "trafico"
FROM reserva
	JOIN vuelo USING (id_vuelo)
	JOIN aeropuerto ON (desde = id_aeropuerto)
GROUP BY ciudad, EXTRACT (month from salida::date)
)
GROUP BY ciudad;

/*
3. Suponiendo que el 30% del precio de cada billete son 
beneficios (y el 70% son gastos), ¿cuál es el trayecto 
que más rendimiento económico da? Es decir, ¿en qué trayecto 
estamos ganando más dinero? ¿Y con el que menos? Lo puedes 
hacer en consultas diferentes usando WITH
*/
WITH rendimiento_por_trayecto AS (
	SELECT s.ciudad, ll.ciudad, 
		ROUND (0.3 * SUM (precio * (1 - (COALESCE (descuento, 0) / 100.0))), 2) AS "rendimiento"
	FROM vuelo
		JOIN reserva USING (id_vuelo)
		JOIN aeropuerto s ON (desde = s.id_aeropuerto)
		JOIN aeropuerto ll ON (hasta = ll.id_aeropuerto)
	GROUP BY s.ciudad, ll.ciudad
), rendimiento_maximo AS (
	SELECT MAX (rendimiento) AS "maximo"
	FROM rendimiento_por_trayecto
)
SELECT *
FROM rendimiento_por_trayecto
WHERE rendimiento = (
	SELECT maximo
	FROM rendimiento_maximo
);

--También selecciona el que tenga el menor rendimiento

WITH rendimiento_por_trayecto AS (
	SELECT s.ciudad, ll.ciudad, 
		ROUND (0.3 * SUM (precio * (1 - (COALESCE (descuento, 0) / 100.0))), 2) AS "rendimiento"
	FROM vuelo
		JOIN reserva USING (id_vuelo)
		JOIN aeropuerto s ON (desde = s.id_aeropuerto)
		JOIN aeropuerto ll ON (hasta = ll.id_aeropuerto)
	GROUP BY s.ciudad, ll.ciudad
), rendimiento_maximo AS (
	SELECT MAX (rendimiento) AS "maximo"
	FROM rendimiento_por_trayecto
), rendimiento_minimo AS (
	SELECT MIN (rendimiento) AS "minimo"
	FROM rendimiento_por_trayecto
)
SELECT *, 'Max'
FROM rendimiento_por_trayecto
WHERE rendimiento = (
	SELECT maximo
	FROM rendimiento_maximo
)
UNION
	
SELECT *, 'Min'
FROM rendimiento_por_trayecto
WHERE rendimiento = (
	SELECT minimo
	FROM rendimiento_minimo

);

/*
4. Seleccionar el nombre y apellidos de los clientes que
no han hecho ninguna reserva para un vuelo que salga en 
el tercer trimestre desde Sevilla.
*/

SELECT DISTINCT c.nombre, c.apellido1, c.apellido2
FROM cliente c
	JOIN reserva r USING (id_cliente)
WHERE id_cliente NOT IN (
	SELECT id_cliente
	FROM reserva
		JOIN vuelo USING (id_vuelo)
		JOIN aeropuerto ON (desde = id_aeropuerto)
	WHERE EXTRACT (quarter from salida::date) = 3
		AND ciudad = 'Sevilla'
);

/*
5. Selecciona el nombre y apellidos de aquellos clientes cuyo 
gasto en reservas de vuelos con origen en España (Sevilla, 
Málaga, Madrid, Bilbao y Barcelona) ha sido superior a la 
media total de gasto de vuelos con origen fuera de España.
*/

SELECT c.nombre, c.apellido1, c.apellido2
FROM cliente c
	JOIN reserva r USING  (id_cliente)
	JOIN vuelo v USING (id_vuelo)
	JOIN aeropuerto origen ON (origen.id_aeropuerto = v.desde)
WHERE v.precio > (
	SELECT AVG (v.precio)
	FROM vuelo v
		JOIN aeropuerto origen ON (origen.id_aeropuerto = desde)
	WHERE origen.ciudad NOT IN ('Sevilla', 'Málaga', 'Madrid', 'Bilbao', 'Barcelona')
)
	AND origen.ciudad IN ('Sevilla', 'Málaga', 'Madrid', 'Bilbao', 'Barcelona');