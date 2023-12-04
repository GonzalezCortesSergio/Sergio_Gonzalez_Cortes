/*
1. Seleccionar el salario máximo de cada departamento, 
mostrando el nombre del departamento y dicha cantidad.
*/

SELECT department_name, MAX (salary) AS "maximo"
FROM departments d
	JOIN employees e USING (department_id)
GROUP BY department_name;

--Jugueteo

SELECT COALESCE (department_name, 'Er jefe de to esto'), MAX (salary) AS "maximo"
FROM departments d
	RIGHT JOIN employees e USING (department_id)
GROUP BY department_name
ORDER BY maximo DESC
LIMIT 1;

/*
2. Seleccionar el salario mínimo de cada departamento, 
para aquellos departamentos cuyo salario mínimo sea menor
que 5000$.
*/

SELECT department_name, MIN (salary) AS "minimo"
FROM departments d
	JOIN employees e USING (department_id)
GROUP BY department_name
HAVING MIN (salary) < 5000;


/*
3. Seleccionar el número de empleados que trabajan en cada 
oficina, mostrando el STREET_ADDRESS y dicho número; hay que 
ordenar la salida de mayor a menor.
*/

SELECT
FROM employees e