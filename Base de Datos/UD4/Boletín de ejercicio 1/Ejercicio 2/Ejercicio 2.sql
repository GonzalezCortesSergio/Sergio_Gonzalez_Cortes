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

SELECT DISTINCT j.first_name, j.last_name
FROM employees j 
	JOIN employees e ON (e.manager_id = j.employee_id)
	JOIN departments d ON (d.department_id = e.department_id)
WHERE d.department_name = 'Administration';


--3: Seleccionar el COUNTRY_NAME donde tiene localización el departamento 
--de Public Relations

SELECT country_name
FROM countries c
	JOIN locations l USING (country_id)
	JOIN departments d USING (location_id)
WHERE department_name = 'Public Relations';

--4: Seleccionar aquellos empleados que trabajen en oficinas de América.

SELECT e.*
FROM employees e
	JOIN departments d USING (department_id)
	JOIN locations l USING (location_id)
	JOIN countries c USING (country_id)
	JOIN regions r USING (region_id)
WHERE region_name = 'Americas';

--5: Seleccionar el nombre y apellidos de los hijos, así como el nombre y 
--apellidos de sus padres, para aquellos empleados que trabajen en oficinas 
--de América. Ordena la salida por orden alfabético del país

SELECT dd.first_name, dd.last_name, e.first_name, e.last_name
FROM dependents dd
	JOIN employees e USING (employee_id)
	JOIN departments d USING (department_id)
	JOIN locations l USING (location_id)
	JOIN countries c USING (country_id)
	JOIN regions r USING (region_id)
WHERE region_name = 'Americas'
ORDER BY country_name;

--6: Diseña una consulta (incluyendo su solución) para la base de datos HR que 
--contenga los siguientes elementos.
--La salida del select no será SELECT *
--Debe realizar el JOIN de al menos 3 tablas.
--Uno de los JOINs debe, obligatoriamente, ser un JOIN ON
--Al menos, tendrá dos condiciones en el WHERE (conectadas con AND u OR)
--Debe ordenar la salida por algún criterio.


/*
Selecciona el first_name y last_name de los empleados que tengan como mánager
a Alexander Hunold y su región sea Americas.
*/
SELECT e.first_name ,  e.last_name  
FROM employees e
	JOIN employees j ON (e.manager_id = j.employee_id)
	JOIN departments d ON (e.department_id = d.department_id)
	JOIN locations l USING (location_id)
	JOIN countries c USING (country_id)
	JOIN regions r USING (region_id)
WHERE j.first_name = 'Alexander'
	AND j.last_name = 'Hunold'
	AND r.region_name = 'Americas';

