/*
Seleccionar, para cada estación meterorológica,
la fecha en la que ha tenido una temperatura_máxima
menor.
Debe aparecer la provincia, el nombre de la estación
la fecha y la temperatura_máxima
*/

SELECT provincia, estacion, fecha, temperatura_maxima
FROM climatologia c
WHERE temperatura_maxima <= ANY (
						SELECT temperatura_maxima
						FROM climatologia c2
						WHERE c.estacion = c2.estacion
							)