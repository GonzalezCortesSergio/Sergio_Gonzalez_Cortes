/*
Seleccionar el producto de cada 
categoría del que más unidades
se han vendido.
Debe aparecer
Nombre categoría, nombre producto, nº total
de unidades
*/

SELECT category_name, product_name, SUM (quantity)
FROM categories c
	JOIN products p USING (category_id)
	JOIN order_details USING (product_id)
GROUP BY category_name, product_name
HAVING SUM (quantity) >= ALL (
					
				SELECT SUM (quantity)
				FROM categories c2
					JOIN products USING (category_id)
					JOIN order_details USING (product_id)
				WHERE c.category_name = c2.category_name
				GROUP BY category_name, product_name
					);