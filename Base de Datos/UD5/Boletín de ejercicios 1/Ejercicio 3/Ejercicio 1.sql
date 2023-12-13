/*
1. Seleccionar los 3 aeropuertos que menos tráfico de llegada 
(menos personas llegando a ellos en un vuelo) han registrado 
en un mes de Enero, Febrero o Marzo
*/

SELECT nombre, ciudad, COUNT (*) AS "num_vuelos"
FROM aeropuerto a
	JOIN vuelo ON(id_aeropuerto = hasta)
WHERE EXTRACT (month from llegada::date) IN (1, 2, 3)
GROUP BY nombre, ciudad
ORDER BY num_vuelos ASC
LIMIT 3;
