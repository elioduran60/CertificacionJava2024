-- CONSULTA 1:
-- Extraer todos los datos de los alumnos más el promedio de las evaluaciones que tengan
-- ingresadas ordenando los registros por promedio (dato generado en la consulta, no es un campo
-- de tabla) de manera ascendente. A la hora de mostrar la carrera, deberá mostrarse el nombre (no
-- el código) de cada carrera.
-- Redonderar el promedio a 2 decimales:

SELECT a.run_alu,
       a.nom_alu,
       a.ape_alu,
       c.nom_car,
       round(AVG(e.not_eva), 2) AS promedio
FROM alumnos a
         JOIN carreras c ON
    a.car_alu = c.id_car
         JOIN evaluaciones ea ON
    a.run_alu = ea.alu_eva
         JOIN evaluaciones e ON
    ea.id_eva = e.id_eva
GROUP BY a.run_alu,
         a.nom_alu,
         a.ape_alu,
         c.nom_car
ORDER BY promedio asc;


