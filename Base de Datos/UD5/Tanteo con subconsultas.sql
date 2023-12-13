/*
Seleccionar la media de vuelos
que sale cada día, independientemente 
del aeropuerto del que salga el vuelo.

El resultado debe ser algo así como
Lunes, 4
Martes, 3.2
Miércoles, 7
...
*/

SELECT dia, AVG (cant)
FROM (
		SELECT TO_CHAR (salida, 'Day') AS "dia", salida::date, EXTRACT (isodow from salida) AS "dow", COUNT (*) AS "cant"
		FROM vuelo
		GROUP BY dia, salida::date, dow
	)
GROUP BY dia, dow
ORDER BY dow;

SELECT dia, AVG(cant)
FROM (
    SELECT TO_CHAR(salida, 'Day') as "dia",
           salida::date,
        EXTRACT(isodow from salida) as "ndia",
        COUNT(*) as "cant"
    FROM vuelo
    GROUP BY TO_CHAR(salida, 'Day'),
           salida::date,
        EXTRACT(isodow from salida)
    )
GROUP BY dia, ndia
ORDER BY ndia;