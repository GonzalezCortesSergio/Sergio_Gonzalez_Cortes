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

SELECT street_address, department_name, COUNT (e.*) AS "numero_empleados"
FROM employees e
	JOIN departments d USING (department_id)
	JOIN locations l USING (location_id)
GROUP BY street_address, department_name
ORDER BY numero_empleados DESC;


/*
4. Modificar la consulta anterior para que muestre las 
localizaciones que no tienen ningún empleado.
*/

SELECT street_address, department_name, COUNT (e.*) AS "numero_empleados"
FROM employees e
	JOIN departments d USING (department_id)
	JOIN locations l USING (location_id)
GROUP BY street_address, department_name
ORDER BY numero_empleados DESC;

/*
5. Seleccionar el salario que es cobrado a la vez por 
más personas. Mostrar dicho salario y el número de personas.
*/

SELECT salary, COUNT (e.*) AS "numero_empleados"
FROM employees e
GROUP BY salary;


/*
6. Seleccionar el número de empleados que empezaron a 
trabajar cada año, ordenando la salida por el año.
*/

SELECT EXTRACT (year from hire_date) AS "año_contratado", COUNT (e.*)
FROM employees e
GROUP BY año_contratado
ORDER BY año_contratado;

