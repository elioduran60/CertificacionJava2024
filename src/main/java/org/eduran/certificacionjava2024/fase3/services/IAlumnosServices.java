package org.eduran.certificacionjava2024.fase3.services;

import org.eduran.certificacionjava2024.fase3.models.dto.AlumnoDTO;

import java.util.List;

public interface IAlumnosServices {

    List<AlumnoDTO> findAll();
    void save(AlumnoDTO alumno);
    AlumnoDTO findById(String id);
    void delete(String id);
    List<AlumnoDTO> findBySitFinal(String sitFinal);
}
