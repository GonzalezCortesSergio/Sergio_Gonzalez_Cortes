/*
1. Seleccionar el número de pedidos atendidos por cada empleado, 
sí y sólo si dicho número está entre 100 y 150.
*/

SELECT e.first_name, e.last_name, COUNT (*)
FROM employees e
	JOIN orders o USING (employee_id)
GROUP BY e.first_name, e.last_name
HAVING COUNT (*) BETWEEN 100 AND 150;

/*
2. Seleccionar el nombre de las empresas que no han realizado 
ningún pedido.
*/

SELECT company_name
FROM customers c
	LEFT JOIN orders o USING (customer_id)
WHERE order_id IS NULL;


--Ahora hecho bien

SELECT company_name
FROM customers
WHERE customer_id NOT IN (
			SELECT DISTINCT customer_id
			FROM orders
			);


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

--Ahora hecho bien

-- Queda pendiente hacer la subconsulta en HAVING por si hay más de una categoría
-- con el mismo num. de productos diferentes.

SELECT category_name, COUNT (DISTINCT product_id) AS "numero_productos"
FROM categories
	JOIN products USING (category_id)
	JOIN order_details USING (product_id)
GROUP BY category_name
ORDER BY numero_productos DESC
LIMIT 1;


SELECT DISTINCT category_name
FROM categories, (
	SELECT COUNT (DISTINCT product_id) AS "cantidad"
	FROM categories JOIN products USING (category_id)
			JOIN order_details USING (product_id)
	GROUP BY category_name
	ORDER BY category_name) datos;



/*
4. Si suponemos que nuestro margen de beneficio con los productos 
es de un 25% (es decir, el 25% de su precio, son beneficios, y el 
75% son costes), calcular la cantidad de beneficio que hemos 
obtenido, agrupado por categoría y producto. Las cantidades deben 
redondearse a dos decimales.
*/


SELECT product_name, category_name
FROM products p
	JOIN categories c USING (category_id)
	JOIN (SELECT ROUND ((AVG (unit_price)), 2) media_precio
		  FROM products);
		  
		  
-- Ahora hecho bien

SELECT category_name, product_name, ROUND (SUM ((od.unit_price * quantity * (1 - discount))::numeric * 0.25), 2) AS "beneficio"
FROM order_details od
	JOIN products USING (product_id)
	JOIN categories USING (category_id)
GROUP BY category_name, product_name;


/*
5. Selecciona aquellos clientes (CUSTOMERS) para los que todos los 
envíos que ha recibido (sí, todos) los haya transportado (SHIPPERS) 
la empresa United Package.
*/

SELECT contact_name, COUNT (*)
FROM customers c
	JOIN orders o USING (customer_id)
	FULL JOIN shippers s ON (o.ship_via = s.shipper_id)
WHERE s.company_name = 'United Package'
GROUP BY contact_name;


-- Ahora hecho bien

SELECT DISTINCT c.company_name
FROM customers c 
	JOIN orders USING (customer_id)
	JOIN shippers ON (shipper_id = ship_via)
WHERE customer_id NOT IN (
							SELECT customer_id 
							FROM orders
								JOIN shippers ON (shipper_id = ship_via)
							WHERE shippers.company_name != 'United Package'
						);
