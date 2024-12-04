package org.eduran.certificacionjava2024.fase3.models.dto;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Entity
@Table(name = "cursos")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class CursoDTO implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_cur")
    private Integer idCur;

    @Column(name = "nom_cur")
    private String nomCur;

    @Column(name = "jor_cur")
    private String jorCur;

    @OneToOne
    @JoinColumn(name = "asi_cur")
    private AsignaturaDTO asignatura;

    /*@ManyToOne
    @JoinColumn(name = "doc_cur")
    private DocenteDTO docente;*/

    @ManyToOne
    @JoinColumn(name = "alu_cur")
    private AlumnoDTO alumnos;
}