package org.eduran.certificacionjava2024.fase3.controllers;

import org.eduran.certificacionjava2024.fase3.models.dto.AlumnoDTO;
import org.eduran.certificacionjava2024.fase3.services.IAlumnosServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
public class ProyectoControllers {

    @Autowired
    private IAlumnosServices alumnoService;

    @GetMapping("/")
    public String index(Model model) {
        return "index";
    }

    @GetMapping("/listaAlumnos")
    public String listaAlumnos(Model model) {
        model.addAttribute("titulo", "App Curso v.3");
        model.addAttribute("subTitulo", "Lista de Alumnos");
        model.addAttribute("alumnos", alumnoService.findAll());
        return "listaAlumnos";
    }

    @GetMapping("/agregarAlumno")
    public String agregarAlumno(Model model) {
        model.addAttribute("titulo", "App Curso v.3");
        model.addAttribute("subTitulo", "Agregar Alumno");
        return "agregarAlumnoForm";
    }

    @PostMapping("/listarAlumnosFiltrados")
    public String listarAlumnosFiltrados(Model model,
                                         @RequestParam(required = false) String runAlu,
                                         @RequestParam(required = false) String situacion) {
        model.addAttribute("titulo", "Listado de Alumnos Filtrados");
        System.out.println(runAlu);

        if (runAlu != null && !runAlu.trim().isEmpty()) {
            AlumnoDTO alumno = alumnoService.findById(runAlu);

            if (alumno != null) {
                model.addAttribute("alumnos", List.of(alumno));
                model.addAttribute("subTitulo", "Resultados para RUN: " + runAlu);
            } else {
                model.addAttribute("mensajeError", "No se encontró ningún alumno con RUN: " + runAlu);
                model.addAttribute("alumnos", alumnoService.findAll());
            }
        }

        else if (situacion != null && !situacion.equals("todos")) {
            List<AlumnoDTO> alumnosFiltrados = alumnoService.findBySitFinal(situacion);
            model.addAttribute("alumnos", alumnosFiltrados);
            model.addAttribute("subTitulo", "Resultados para: " + (situacion.equals("aprobado") ? "Aprobado" : "Reprobado"));
        } else {
            model.addAttribute("alumnos", alumnoService.findAll());
        }
        return "listaAlumnos";
    }

    @PostMapping("/agregarAlumno")
    public String agregarAlumno(Model model,
                                @RequestParam String runAlu,
                                @RequestParam String nomAlu,
                                @RequestParam String apeAlu) {
        model.addAttribute("titulo", "App Curso v.3");
        model.addAttribute("subTitulo", "Agregar Alumno");
        AlumnoDTO alumno = new AlumnoDTO();
        alumno.setRunAlu(runAlu);
        alumno.setNomAlu(nomAlu);
        alumno.setApeAlu(apeAlu);
        alumnoService.save(alumno);
        return "redirect:/listaAlumnos";
    }

    @DeleteMapping("/eliminarAlumno/{id}")
    public String eliminarAlumno(Model model, @RequestParam Integer id) {
        model.addAttribute("titulo", "App Curso v.3");
        model.addAttribute("subTitulo", "Eliminar Alumno");
        alumnoService.delete(String.valueOf(id));
        return "redirect:/listaAlumnos";
    }
}

