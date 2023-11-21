/*
1. Seleccionar el COMPANY_NAME y CONTACT_NAME de aquellos 
CUSTOMERS que hayan hecho pedidos (ORDERS).
*/

SELECT DISTINCT (company_name, contact_name)
FROM customers c
	JOIN orders o USING (customer_id);
	
/*
2. Seleccionar el número de pedidos que hemos enviado en 
la década de los 90 con las empresas Federal Shipping o 
United Package.
*/

SELECT COUNT (*)
FROM orders o 
	JOIN shippers s ON (s.shipper_id = o.ship_via)
WHERE EXTRACT (year from shipped_date) BETWEEN 1990 AND 1999
	AND s.company_name IN ('Federal Shipping', 'United Package');
	
/*
3. Seleccionar el nombre de aquellos productos que han sido 
solicitados en algún pedido.
*/

SELECT DISTINCT (product_name) 
FROM products p
	JOIN order_details od USING (product_id)
	JOIN orders o USING (order_id);

/*
4. Seleccionar la suma de los importes "cobrados" en todos 
los pedidos realizados en el año 96.
*/

SELECT SUM (unit_price)
FROM orders o
	JOIN order_details od USING (order_id)
WHERE EXTRACT (year from order_date) = '1996';

/*
5. Seleccionar el nombre de contacto del cliente y el del 
empleado para aquellos clientes y empleados que han participado 
en pedidos donde la diferencia entre la fecha de envío y la fecha 
de requisito sea menos de 20 días.
*/

SELECT c.contact_name, e.first_name, e.last_name
FROM customers c
	JOIN orders o USING (customer_id)
	JOIN employees e USING (employee_id)
WHERE o.shipped_date < order_date + '20 days'::interval; 
