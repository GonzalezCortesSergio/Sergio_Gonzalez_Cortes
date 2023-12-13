SELECT ROUND (AVG (maximo), 2)
FROM (
		SELECT department_name, MAX (salary) AS "maximo"
		FROM departments JOIN employees USING (department_id)
		GROUP BY department_name
	);
	
	
/*
Seleccionar el nº medio de empleados que tiene
cada departamento
*/

SELECT ROUND (AVG (nempleados), 2)
FROM (
		SELECT COUNT (*) AS "nempleados"
		FROM employees
		GROUP BY department_id
	);
	
	
/*
Seleccionar aquellos empleados 
que cobran más que todos los empleados
del departamento de Purchasing
*/

SELECT *
FROM employees 
WHERE salary > ALL (
					SELECT salary
					FROM employees	
						JOIN departments USING (department_id)
					WHERE department_name = 'Purchasing'
				);