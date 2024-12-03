package org.eduran.certificacionjava2024.fase2.modelos;

public class AlumnosCarrera {
    private String carrera;
    private String cantidad_alumnos;

    public AlumnosCarrera(String carrera, String cantidad_alumnos) {
        this.carrera = carrera;
        this.cantidad_alumnos = cantidad_alumnos;
    }

    public String getCarrera() {
        return carrera;
    }

    public String getCantidad_alumnos() {
        return cantidad_alumnos;
    }

    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }

    public void setCantidad_alumnos(String cantidad_alumnos) {
        this.cantidad_alumnos = cantidad_alumnos;
    }

}
