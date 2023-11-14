SELECT e.first_name, e.last_name, department_name, 
	dd.first_name, dd.last_name, relationship
FROM employees e, departments d, dependents dd
WHERE e.department_id = d.department_id 
	AND dd.employee_id = e.employee_id;
	
SELECT e.employee_id, dd.employee_id
FROM employees e, dependents dd
ORDER BY e.employee_id, dd.employee_id;

SELECT first_name, last_name, salary
FROM employees e, departments d,
	locations l, countries c
WHERE e.department_id = d.department_id
	AND d.location_id = l.location_id
	AND l.country_id = c.country_id
	AND c.country_name = 'United States of America';
	
SELECT *
FROM employees CROSS JOIN departments;


SELECT*
FROM employees NATURAL JOIN departments;

SELECT *
FROM employees JOIN departments USING (department_id);


SELECT *
FROM employees JOIN departments ON 