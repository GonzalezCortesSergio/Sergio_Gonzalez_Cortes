/*
1. Selecciona la media, agrupada por nombre de aeropuerto de salida, 
del % de ocupación de los vuelos. PISTA: tendrás que incluir una
subconsulta dentro de otra y, en la interior, usar una subconsulta 
en el select :S (o bien usar WITH)
*/

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


/*
2. Selecciona el tráfico de pasajeros (es decir, personas 
que han llegado en un vuelo o personas que han salido en 
un vuelo) agrupado por mes (independiente del año) y 
aeropuerto. 
*/

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


/*
3. Suponiendo que el 30% del precio de cada billete son 
beneficios (y el 70% son gastos), ¿cuál es el trayecto 
que más rendimiento económico da? Es decir, ¿en qué trayecto 
estamos ganando más dinero? ¿Y con el que menos? Lo puedes 
hacer en consultas diferentes usando WITH
*/



/*
4. Seleccionar el nombre y apellidos de los clientes que
no han hecho ninguna reserva para un vuelo que salga en 
el tercer trimestre desde Sevilla.
*/

SELECT c.nombre, c.apellido1, c.apellido2
FROM cliente c
	JOIN reserva r USING (id_cliente)
WHERE r.id_vuelo NOT IN (
	SELECT id_vuelo
	FROM vuelo
		JOIN aeropuerto origen ON (origen.id_aeropuerto = desde)
	WHERE EXTRACT (quarter from salida::date) = 3
		AND origen.ciudad = 'Sevilla'
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