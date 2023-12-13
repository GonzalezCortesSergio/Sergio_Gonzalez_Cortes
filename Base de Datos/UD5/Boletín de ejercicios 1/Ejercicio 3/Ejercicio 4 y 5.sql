/*
4. Selecciona el origen y el destino de los 10 vuelos 
con una duración menor. Debes realizarlo usando subconsultas.
*/

SELECT salida.nombre AS "aeropuerto_salida", salida.ciudad AS "ciudad_salida", 
llegada.nombre AS "aeropuerto_llegada", llegada.ciudad AS "ciudad_llegada"
FROM vuelo
	JOIN aeropuerto salida ON (salida.id_aeropuerto = desde)
	JOIN aeropuerto llegada ON (llegada.id_aeropuerto = hasta)
WHERE id_vuelo IN (

	SELECT id_vuelo
	FROM vuelo
	ORDER BY llegada - salida
	LIMIT 10

);


/*
5. Selecciona el importe que la aerolínea de la base de datos 
de vuelos ha ingresado por cada uno de los vuelos que se han 
realizado en fin de semana (es decir, que han salido entre 
viernes y domingo) en los meses de Julio y Agosto (da igual el año).
*/

SELECT SUM (precio)
FROM (

	SELECT id_vuelo, precio
	FROM vuelo 
	WHERE EXTRACT (isodow from salida:: date) IN (5, 6, 7)
		AND EXTRACT (month from salida::date) IN (7, 8)
	

)