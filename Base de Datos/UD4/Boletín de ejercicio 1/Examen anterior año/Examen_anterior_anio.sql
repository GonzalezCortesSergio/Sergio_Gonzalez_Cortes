/*
Seleccionar el nombre y los dos apellidos de aquellos clientes que reservaron 
un vuelo que salió en el mes de Septiembre de 2022 con exactamente un mes de antelación 
(despreciando la hora), y que tengan nombre compuesto. La salida del nombre no debe ser 
totalmente en mayúsculas, sino con la primera letra de cada palabra en mayúsculas, y el resto 
en minúsculas. Por ejemplo: Luis Miguel López Magaña (puede que las Ñ aparezcan en mayúsculas).
*/

SELECT INITCAP (c.nombre), INITCAP(c.apellido1), INITCAP(c.apellido2)
FROM cliente c 
	JOIN reserva r USING (id_cliente)
	JOIN vuelo v USING (id_vuelo)
WHERE (EXTRACT (month from v.salida) = 09
	   AND EXTRACT (year from v.salida) = 2023)
	   AND AGE (v.salida::date, r.fecha_reserva::date) = '1 month'::interval
	AND c.nombre ILIKE '% %';
	
	
/*
Seleccionar el nombre y los dos apellidos de aquellos clientes que reservaron un vuelo
que salió en un miércoles con una antelación de 35 días (despreciando la hora),
y que su segundo apellido tenga exactamente 4 letras. La salida del nombre no debe ser 
totalmente en mayúsculas, sino con la primera letra de cada palabra en mayúsculas, y el resto 
en minúsculas. Por ejemplo: Luis Miguel López Magaña (puede que las Ñ aparezcan en mayúsculas).
*/

SELECT INITCAP (c.nombre), INITCAP(c.apellido1), INITCAP(c.apellido2)
FROM cliente c 
	JOIN reserva r USING (id_cliente)
	JOIN vuelo v USING (id_vuelo)
WHERE EXTRACT (isodow from v.salida) = 3
	   AND AGE (v.salida::date, r.fecha_reserva::date) = '35 day'::interval
	AND c.apellido2 ILIKE '____';

