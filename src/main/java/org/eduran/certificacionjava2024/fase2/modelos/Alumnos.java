package org.eduran.certificacionjava2024.fase2.modelos;

public class Alumnos {
    private String run_alu;
    private String nom_alu;
    private String ape_alu;
    private int car_alu;

    public Alumnos(String run_alu, String nom_alu, String ape_alu, int car_alu) {
        this.run_alu = run_alu;
        this.nom_alu = nom_alu;
    }

    public String getRun_alu() {
        return run_alu;
    }

    public void setRun_alu(String run_alu) {
        this.run_alu = run_alu;
    }

    public String getNom_alu() {
        return nom_alu;
    }

    public void setNom_alu(String nom_alu) {
        this.nom_alu = nom_alu;
    }

    public String getApe_alu() {
        return ape_alu;
    }

    public void setApe_alu(String ape_alu) {
        this.ape_alu = ape_alu;
    }

    public int getCar_alu() {
        return car_alu;
    }

    public void setCar_alu(int car_alu) {
        this.car_alu = car_alu;
    }
}
