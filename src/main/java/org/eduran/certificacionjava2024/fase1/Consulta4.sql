-- CONSULTA 4:
-- Listar las asignaturas por nombre junto al nombre del alumno con mayor promedio de nota
-- mostrando ese promedio (dato generado en la consulta, no es un campo de tabla) ordenando
-- todos los registros de manera ascendente. Se debe limitar el resultado a los 3 primeros registros.

WITH t AS (
    SELECT
        a.nom_asi,
        alu.nom_alu,
        alu.ape_alu,
        round(AVG(e.not_eva),2) AS promedio_alumno
    FROM
        asignaturas a
            INNER JOIN evaluaciones e ON a.id_asi = e.asi_eva
            INNER JOIN alumnos alu ON e.alu_eva = alu.run_alu
    GROUP BY a.nom_asi, alu.nom_alu, alu.ape_alu
)
SELECT
    nom_asi as asignatura,
    nom_alu as alumno,
    ape_alu as apellido_alumno,
    promedio_alumno
FROM
    t
WHERE
    promedio_alumno = (
        SELECT MAX(promedio_alumno)
        FROM t p
        WHERE p.nom_asi = t.nom_asi
    )
ORDER BY promedio_alumno ASC
LIMIT 3;
