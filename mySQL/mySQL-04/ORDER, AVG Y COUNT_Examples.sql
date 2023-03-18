SELECT * FROM employee
ORDER BY salary ASC;

-- MIN
SELECT MIN(salary) FROM employee;
SELECT MIN(last_name) FROM employee;
-- MIN y MAX para last_name es ordenado por UTF8 entonces es dfierente a un orden alfabetico

-- AVG
SELECT AVG (salary) FROM employee;
SELECT AVG (join_date) FROM employee;

-- AVG renombrndo la columna de salario a promedio
SELECT AVG (salary) AS promedio FROM employee;

-- SUM suma los valores definidos en los parametros
SELECT SUM(employee_id) FROM employee;
SELECT SUM(salary), avg(salary) FROM employee;

-- COUNT muestra el conteo total de lo especificado, ene este caso employee_id
SELECT COUNT(employee_id) FROM employee;

SELECT COUNT(salary) FROM employee;

-- COUNT con DISTINCT nos muestra los valores diferentes en la columna especificada, ene este caso todos los employees tienen 300000 de salario por lo tanto solo retorna 1 valor
SELECT COUNT(DISTINCT(salary)) FROM employee;