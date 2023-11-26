/*
1.  Selecciona el número de empleados que fueron contratados 
en el año 1997 en la que trabajen en una oficina situada en 
Bélgica.
*/

SELECT COUNT (*)
FROM employees e 
	JOIN departments USING (department_id)
	JOIN locations USING (location_id)
	JOIN countries USING (country_id)
WHERE country_name = 'Belgium'
	AND EXTRACT (year from hire_date) = 1997;
	
	
/*
2.  Selecciona la media de salario máximo de los trabajadores 
de Administration en Asia.
*/

SELECT AVG (salary)
FROM employees e 
	JOIN departments d USING (department_id)
	JOIN locations l USING (location_id)
	JOIN countries c USING (country_id)
	JOIN regions r USING (region_id)
WHERE d.department_name = 'Administration'
	AND r.region_name = 'Asia';