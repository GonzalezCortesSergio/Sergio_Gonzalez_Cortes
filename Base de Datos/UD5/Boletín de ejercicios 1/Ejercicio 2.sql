/*
1. Seleccionar el número de pedidos atendidos por cada empleado, 
sí y sólo si dicho número está entre 100 y 150.
*/

SELECT e.first_name, e.last_name, COUNT (o.*)
FROM employees e
	JOIN orders o USING (employee_id)
GROUP BY e.first_name, e.last_name
HAVING COUNT (o.*) BETWEEN 100 AND 150;

/*
2. Seleccionar el nombre de las empresas que no han realizado 
ningún pedido.
*/

SELECT company_name
FROM shippers s
	LEFT JOIN orders o ON (o.ship_via = s.shipper_id)
WHERE order_id IS NULL;


/*
3. Seleccionar la categoría que tiene más productos diferentes 
solicitados en pedidos. Mostrar el nombre de la categoría y 
dicho número.
*/

SELECT category_name, COUNT (p.*) AS "numero_productos"
FROM categories c
	JOIN products p USING (category_id)
GROUP BY category_name
ORDER BY numero_productos DESC
LIMIT 1;

/*
4. Si suponemos que nuestro margen de beneficio con los productos 
es de un 25% (es decir, el 25% de su precio, son beneficios, y el 
75% son costes), calcular la cantidad de beneficio que hemos 
obtenido, agrupado por categoría y producto. Las cantidades deben 
redondearse a dos decimales.
*/



