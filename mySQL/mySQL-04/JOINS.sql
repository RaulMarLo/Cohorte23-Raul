-- INNER JOIN
-- t.students t.countries

SELECT * FROM students;
SELECT * FROM countries;
SELECT * FROM idtypes;
SELECT * FROM courses_has_students;
SELECT * FROM courses;
SELECT * FROM modules;

-- Encontrar a que pais pertenecen. test.test2 seria la forma de representar la llave
SELECT students.*, -- Seleccionamos de donde tomaremos datos
countries.name, 
countries.code
FROM students
INNER JOIN countries -- Seleccionamos el inner join que queremos definir, el inner join contendra los datos de countries
ON
students.nationality = countries.idCountries;

SELECT students.*, -- Seleccionamos de donde tomaremos datos
students.idStudent,
countries.name, 
countries.code
FROM students -- students aqui es la tabla A
INNER JOIN countries -- countrie aqui es la tabla B
ON
students.nationality = countries.idCountries;

SELECT 
students.idstudent AS 'ID',
students.name AS 'Nombre',
students.last_name AS 'Apellido',
idtypes.name AS 'Tipo de ID de registro'
FROM students
INNER JOIN idtypes
ON students.idType_id = idtypes.id_idTypes; -- Aqui se hace el join de id types de la tabla students junto al id types de la tabla id_idTypes, sin embargo la tabla nunca se sobreescribe, solo muestra los joins especificados. SE PUEDE ESPECIFICAR LA LLAVE PRIMARIA O LA LLALVE FORANEA PRIMERO, EN OTRAS PALABARAS ANTES DEL = Y DESPUES LA LLAVE FORANEA O LA LLAVE PRIMARIA RESPECTIVAMENTE

-- Abreviaciones
SELECT
	t1.name,
    t2.name,
    t2.code
FROM students t1
INNER JOIN countries t2
ON t1.nationality = t2.idCountries;

-- Buscar estudiantes y el curso al que pertenecen
SELECT 
    t1.name AS 'Nombre',
    t1.last_name AS 'Apellido',
    t2.course_code AS 'Codigo de curso',
    t3.name AS 'Curso',
    t3.credits
FROM students t1
INNER JOIN courses_has_students t2
ON t1.idStudent = t2.students_id_student
INNER JOIN courses t3
ON t2.course_code = t3.code;

SELECT 
t1.course_code AS 'Codigo de curso',
t2.code AS 'Codigo de curso',
t2.name AS 'Curso'
FROM courses_has_students t1
INNER JOIN courses t2
ON t1.course_code = t2.code
GROUP BY t2.code; -- Agrupamos

-- Encontrar estudiantes que pertenezcan al pais 125
SELECT 
	t1.name,
    t1.last_name,
    t2.Name,
    t2.idCountries
FROM students t1
INNER JOIN countries t2
ON t2.idCountries = t1.nationality AND t2.idCountries = 125;

-- Contar estudiantes que pertenezcan al curso JAVA-1
SELECT
	t1.name,
    t1.last_name,
    t2.course_code
FROM students t1
INNER JOIN courses_has_students t2
ON t2.students_id_student = t1.idStudent AND t2.course_code = 'JAVA-1';
    

-- Contar estudiantes por cada modulo
-- Tip: 4 tablas para unir
SELECT
t4.name AS 'modulo',
count(t1.idStudent) AS 'Numero de estudiantes'
FROM students t1
JOIN courses_has_students t2
ON t1.idStudent = t2.students_id_student
JOIN courses t3
ON t2.course_code = t3.code
JOIN modules t4
ON t3.module_code = t4.code
group by t4.code
order by count(t1.idStudent);


-- Encontrar estudiantes SIN curso
SELECT
	t1.name,
    t1.last_name,
    t2.course_code
FROM students t1
INNER JOIN courses_has_students t2
ON t2.students_id_student = t1.idStudent AND t2.course_code = 'JAVA-1';