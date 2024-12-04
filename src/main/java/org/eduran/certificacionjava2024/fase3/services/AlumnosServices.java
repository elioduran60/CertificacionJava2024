package org.eduran.certificacionjava2024.fase3.services;

import org.eduran.certificacionjava2024.fase3.models.dao.AlumnoDao;
import org.eduran.certificacionjava2024.fase3.models.dto.AlumnoDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class AlumnosServices implements IAlumnosServices{

    @Autowired
    AlumnoDao alumnoDAO;

    @Override
    public List<AlumnoDTO> findAll() {
        return alumnoDAO.findAll();
    }

    @Override
    public void save(AlumnoDTO alumno) {
        alumnoDAO.save(alumno);
    }

    @Override
    public AlumnoDTO findById(String id) {
        return alumnoDAO.findById(String.valueOf(id)).orElse(null);
    }

    @Override
    public void delete(String id) {
        alumnoDAO.deleteById(String.valueOf(id));
    }

    @Override
    public List<AlumnoDTO> findBySitFinal(String sitFinal) {
        return List.of();
    }
}

