SELECT EXTRACT (month from salida) AS "mes", EXTRACT (day from salida) AS "dia",  COUNT (*)
FROM vuelo
GROUP BY mes, dia
ORDER BY mes, dia;


SELECT TO_CHAR (salida, 'DD-MM') AS "dia_mes", COUNT (*)
FROM vuelo
GROUP BY dia_mes
ORDER BY dia_mes;

SELECT EXTRACT (isodow from salida) AS "dsemana", COUNT (*)
FROM vuelo
GROUP BY dsemana
ORDER BY dsemana;


/*Cuenta los días de la semana que han salido los 6 primeros meses del año*/

SELECT EXTRACT (isodow from salida) AS "semana", COUNT (*)
FROM vuelo
WHERE EXTRACT (month from salida) BETWEEN 1 AND 6
GROUP BY semana
ORDER BY semana;

/*Variante*/

SELECT TO_CHAR (salida, 'dy') AS "semana", COUNT(*)
FROM vuelo
WHERE TO_CHAR (salida, 'Q') IN ('1', '2')
GROUP BY semana, TO_CHAR (salida, 'ID')
ORDER BY TO_CHAR (salida, 'ID')

