--EJERCICIO 2

--1: Seleccionar el FIRST_NAME y LAST_NAME de los empleados del departamento de IT o 
--Finance cuya fecha de alta (HIRE_DATE) fuera un día cualquiera de Abril o Junio.

SELECT e.first_name, e.last_name
FROM employees e
	JOIN departments d USING (department_id)
WHERE (d.department_name = 'IT' 
	OR d.department_name = 'Finance')
	AND (e.hire_date::text LIKE '%-04-%'
		OR e.hire_date::text LIKE '%-06-%');
		
--2: Seleccionar el FIRST_NAME y LAST_NAME de los managers de los empleados 
--del departamento de Administration.

SELECT j.first_name, j.last_name
FROM employees j 
	JOIN employees e ON (e.manager_id = j.employee_id)
	JOIN departments d ON (d.department_id = e.department_id)
WHERE d.department_name = 'Administration';
