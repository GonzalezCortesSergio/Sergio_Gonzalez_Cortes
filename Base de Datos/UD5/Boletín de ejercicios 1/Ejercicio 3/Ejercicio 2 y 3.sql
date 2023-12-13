/*
2. Selecciona los clientes que han comprado casas en Almería, 
siendo el precio final mayor que el precio medio de las casas 
vendidas en Almería.
*/

SELECT c.*
FROM inmueble i
	JOIN tipo t ON (id_tipo = tipo_inmueble)
	JOIN operacion o USING (id_inmueble)
	JOIN comprador c USING (id_cliente)
WHERE t.nombre = 'Casa'
	AND tipo_operacion = 'Venta'
	AND provincia = 'Almería'
	AND precio_final > ALL (
	
		SELECT AVG (precio)
		FROM inmueble
		WHERE provincia = 'Almería'
	);
	
/*
3. Selecciona de todos los vendedores a aquellos que solo 
vendieron inmuebles de tipo Parking
*/

SELECT DISTINCT v.*
FROM vendedor v
	JOIN operacion USING (id_vendedor)
	JOIN inmueble USING (id_inmueble)
WHERE tipo_inmueble IN (
	
	SELECT id_tipo
	FROM tipo
	WHERE nombre = 'Parking'
)