-- CONSULTA 3:
-- Mostrar todas las carreras por su nombre junto a sus directores de carrera por nombre y apellido
-- más el conteo (dato generado en la consulta, no es un campo de tabla) de docentes por cada
-- carrera.

select c.nom_car         as carrera,
       d.nom_dir         as director_nombre,
       d.ape_dir         as director_apellido,
       COUNT(d2.run_doc) as conteo_docentes
from carreras c
         join directores d ON
    d.run_dir = c.dir_car
         join asignaturas a ON
    a.car_asi = c.id_car
         JOIN docentes d2 ON
    d2.run_doc = a.doc_asi
GROUP by c.nom_car,
         d.nom_dir,
         d.ape_dir