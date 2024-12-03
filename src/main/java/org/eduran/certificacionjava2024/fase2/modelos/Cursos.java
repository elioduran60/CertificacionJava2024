package org.eduran.certificacionjava2024.fase2.modelos;

public class Cursos {
    private String nom_cur;
    private String jor_cur;
    private int asi_cur;
    private String doc_cur;
    private String alu_cur;

    public Cursos(String nom_cur, String jor_cur, int asi_cur, String doc_cur, String alu_cur) {
        this.nom_cur = nom_cur;
        this.jor_cur = jor_cur;
        this.asi_cur = asi_cur;
        this.doc_cur = doc_cur;
        this.alu_cur = alu_cur;
    }
    public String getNom_cur() {
        return nom_cur;
    }
    public void setNom_cur(String nom_cur) {
        this.nom_cur = nom_cur;
    }
    public String getJor_cur() {
        return jor_cur;
    }
    public void setJor_cur(String jor_cur) {
        this.jor_cur = jor_cur;
    }
    public int getAsi_cur() {
        return asi_cur;
    }
    public void setAsi_cur(int asi_cur) {
        this.asi_cur = asi_cur;
    }
    public String getDoc_cur() {
        return doc_cur;
    }
    public void setDoc_cur(String doc_cur) {
        this.doc_cur = doc_cur;
    }
    public String getAlu_cur() {
        return alu_cur;
    }
    public void setAlu_cur(String alu_cur) {
        this.alu_cur = alu_cur;
    }
}
