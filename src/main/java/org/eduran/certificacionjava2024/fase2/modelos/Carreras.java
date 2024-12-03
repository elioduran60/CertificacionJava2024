package org.eduran.certificacionjava2024.fase2.modelos;

public class Carreras {

    private int id_car;
    private String nom_car;
    private int dur_car;
    private String tip_car;
    private String dir_car;

    public Carreras(String nom_car, int dur_car, String tip_car, String dir_car) {
        this.nom_car = nom_car;
        this.dur_car = dur_car;
        this.tip_car = tip_car;
        this.dir_car = dir_car;
    }

    public String getNom_car() {
        return nom_car;
    }

    public void setNom_car(String nom_car) {
        this.nom_car = nom_car;
    }

    public int getDur_car() {
        return dur_car;
    }

    public void setDur_car(int dur_car) {
        this.dur_car = dur_car;
    }

    public String getTip_car() {
        return tip_car;
    }

    public void setTip_car(String tip_car) {
        this.tip_car = tip_car;
    }

    public String getDir_car() {
        return dir_car;
    }

    public void setDir_car(String dir_car) {
        this.dir_car = dir_car;
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
