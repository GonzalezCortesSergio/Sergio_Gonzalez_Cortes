SELECT *
FROM aeropuerto a1 JOIN vuelo ON (a1.id_aeropuerto = desde)
		JOIN aeropuerto a2 ON (a2.id_aeropuerto = hasta)		
WHERE a1.ciudad = 'Madrid'
	AND a2.ciudad = 'Sevilla';