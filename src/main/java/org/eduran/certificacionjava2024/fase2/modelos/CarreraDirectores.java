package org.eduran.certificacionjava2024.fase2.modelos;

import org.eduran.certificacionjava2024.fase2.interfaces.ICarreraDirectores;

public class CarreraDirectores {
    private String nombre_carrera;
    private String nombre_dir;
    private String apellido_dir;

    public CarreraDirectores(String nombre_carrera, String nombre_dir, String apellido_dir) {
        this.nombre_carrera = nombre_carrera;
        this.nombre_dir = nombre_dir;
        this.apellido_dir = apellido_dir;
    }

    public String getNombre_carrera() {
        return nombre_carrera;
    }

    public void setNombre_carrera(String nombre_carrera) {
        this.nombre_carrera = nombre_carrera;
    }

    public String getNombre_dir() {
        return nombre_dir;
    }

    public void setNombre_dir(String nombre_dir) {
        this.nombre_dir = nombre_dir;
    }

    public String getApellido_dir() {
        return apellido_dir;
    }

    public void setApellido_dir(String apellido_dir) {
        this.apellido_dir = apellido_dir;
    }

    @Override
    public String toString() {
        return "{" +
                "nombre_carrera='" + nombre_carrera + '\'' +
                ", nombre_dir='" + nombre_dir + '\'' +
                ", apellido_dir='" + apellido_dir + '\'' +
                '}';
    }
}
