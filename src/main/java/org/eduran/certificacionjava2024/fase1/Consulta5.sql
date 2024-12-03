-- CONSULTA 5:
-- Desplegar un listado de todas las carreras por nombre, que sean del tipo 'Profesional', junto con
-- sus semestres, además de un conteo (dato generado en la consulta, no es un campo de tabla) de
-- todas las asignaturas asociadas a cada carrera.


SELECT
    c.nom_car AS carrera,
    c.dur_car as semestres,
    COUNT(a.id_asi) AS asignaturas
FROM
    carreras c
        JOIN asignaturas a ON c.id_car = a.car_asi
WHERE
    c.tip_car = 'Profesional'
GROUP BY
    c.nom_car, c.dur_car;