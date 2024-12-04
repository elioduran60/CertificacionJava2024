package org.eduran.certificacionjava2024.fase3.controllers;

import java.util.List;

import org.eduran.certificacionjava2024.fase3.models.dto.AlumnoDTO;
import org.eduran.certificacionjava2024.fase3.services.IAlumnosServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ApiRestProyect {

    @Autowired
    private IAlumnosServices alumnoService;

    @GetMapping("/api/listaAlumnos")
    public ResponseEntity<List<AlumnoDTO>> listar(){
        try {
            List<AlumnoDTO> lista = alumnoService.findAll();
            return new ResponseEntity<>(lista, HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
}
