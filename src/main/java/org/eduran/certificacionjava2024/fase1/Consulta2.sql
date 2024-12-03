-- CONSULTA 2:
-- Obtener un listado de todos los cursos por su nombre, el nombre de la asignatura, el nombre del
-- docente y un conteo (dato generado en la consulta, no es un campo de tabla) de todos los
-- alumnos inscritos al mismo curso (buscar en base al nombre del curso).

select c.nom_cur                         as cursos,
       a.nom_asi,
       CONCAT(d.nom_doc, ' ', d.ape_doc) as docente,
       COUNT(c.alu_cur)                  as conteo_alumnos
from cursos c
         join asignaturas a ON
    a.id_asi = c.asi_cur
         join docentes d ON
    d.run_doc = c.doc_cur
GROUP BY nom_cur,
         nom_asi,
         nom_doc,
         ape_doc