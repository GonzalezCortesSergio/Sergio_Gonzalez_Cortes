/*
1. Seleccionar el COMPANY_NAME y CONTACT_NAME de aquellos 
CUSTOMERS que hayan hecho pedidos (ORDERS).
*/

SELECT DISTINCT company_name, contact_name
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
WHERE EXTRACT (decade from shipped_date) = 199
	AND s.company_name IN ('Federal Shipping', 'United Package');
	
/*
3. Seleccionar el nombre de aquellos productos que han sido 
solicitados en algún pedido.
*/

SELECT DISTINCT (product_name) 
FROM products p
	JOIN order_details od USING (product_id);
	/*JOIN orders o USING (order_id) ESTE SOBRA, NI SE TE OCURRA VOLVER A HACERLO */

/*
4. Seleccionar la suma de los importes "cobrados" en todos 
los pedidos realizados en el año 96.
*/

SELECT SUM ((unit_price * (1 - discount) * quantity))
FROM orders o
	JOIN order_details od USING (order_id)
WHERE EXTRACT (year from order_date) = 1996 /*NO VUELVAS A PONER EL NÚMERO EN FORMATO CHAR SI UTILIZAS EXTRACT*/;

/*
5. Seleccionar el nombre de contacto del cliente y el del 
empleado para aquellos clientes y empleados que han participado 
en pedidos donde la diferencia entre la fecha de envío y la fecha 
de requisito sea menos de 20 días.
*/

SELECT DISTINCT c.contact_name, e.first_name, e.last_name
FROM customers c
	JOIN orders o USING (customer_id)
	JOIN employees e USING (employee_id)
WHERE age(required_date, shipped_date) BETWEEN
	-('19 day'::interval) AND ('19 day'::interval);
--WHERE ABS(required_date - shipped_date) < 20;
--WHERE age (required_date, shipped_date) BETWEEN
--	-('20 day'::interval) AND ('20 day'::interval);