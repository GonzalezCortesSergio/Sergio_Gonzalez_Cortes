--EJERCICIO 1

--1: Seleccionar el nombre, apellidos y email de los empleados 
--que pertenecen a un departamento que tenga sede en United Kingdom.

SELECT first_name, last_name, email
FROM employees e
	JOIN departments d ON (d.department_id = e.department_id)
	JOIN locations l ON (l.location_id = d.location_id)
	JOIN countries c ON (c.country_id = l.country_id)
WHERE c.country_name = 'United Kingdom';

--2: Seleccionar el nombre de aquellos departamentos en los que 
--trabaja un empleado que fue contratado a lo largo del año 1993.

SELECT DISTINCT d.department_name
FROM departments d
	JOIN employees e ON (e.department_id = d.department_id)
WHERE e.hire_date::text LIKE '1993%';

--3: Seleccionar la región de los empleados con un salario inferior
--a 10000$

SELECT DISTINCT r.region_name
FROM regions r
	JOIN countries c ON (c.region_id = r.region_id)
	JOIN locations l ON (l.country_id = c.country_id)
	JOIN departments d ON (d.location_id = l.location_id)
	JOIN employees e ON (e.department_id = d.department_id)
WHERE e.salary < 10000;

--4: Seleccionar el nombre de aquellos empleados cuyo jefe directo 
--tenga un apellido que empiece por D, H o S.

SELECT e.first_name, e.last_name
FROM employees e
	JOIN employees j ON (j.employee_id = e.manager_id)
WHERE (j.last_name LIKE 'D%'
	OR j.last_name LIKE 'H%'
	OR j.last_name LIKE 'S%');
	
--5: Seleccionar el número de familiares (dependents) que son hijos 
--de algún miembro de los departamentos de Marketing, Administration e IT. 

SELECT COUNT (*)
FROM dependents
	JOIN employees e USING (employee_id)
	JOIN departments d USING (department_id)
WHERE relationship = 'Child'
	AND department_name IN ('Marketing', 'Administration', 'IT');