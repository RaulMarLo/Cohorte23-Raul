SELECT * FROM employee
WHERE employee_id IN (1, 3, 7, 8, 5);

-- BETWEEN
SELECT * FROM employee
WHERE salary NOT BETWEEN 200000 AND 500000;

-- LIMIT
SELECT * FROM employee LIMIT 5;

-- LIMIT + OFFSET
SELECT * FROM employee LIMIT 3 OFFSET 3;

-- LIKE
SELECT * FROM employee
WHERE last_name LIKE 'B%';

SELECT * FROM employee
WHERE last_name LIKE BINARY '%A';

-- LIKE ++
SELECT * FROM employee
WHERE join_date LIKE '02%';

UPDATE employee
	SET salary = 300000
WHERE employee_id IN (1, 2, 3, 4, 5, 6, 7, 8);    

SELECT * FROM employee;

-- ACTUALIZACION DE DATOD EN la columna 'join_date'
UPDATE employee
	SET  join_date = "2013-05-11"
    WHERE employee_id = 5;
    
SELECT * FROM employee;

-- ACTUALIZACION DE UNA TABLA CON UNA NUEVA COLUMNA llamada 'location'
ALTER TABLE employee 
ADD COLUMN location VARCHAR(30) AFTER department;

