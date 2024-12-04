package org.eduran.certificacionjava2024.fase3.models.dto;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Entity
@Table(name = "evaluaciones")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class EvaluacionDTO implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_eva")
    private Integer idEva;

    @Column(name = "nom_eva")
    private String nomEva;

    @Column(name = "fec_eva")
    private String fecEva;

    @Column(name = "not_eva")
    private Double notEva;

    @ManyToOne
    @JoinColumn(name = "asi_eva")
    private AsignaturaDTO asignatura;

    @ManyToOne
    @JoinColumn(name = "alu_eva")
    private AlumnoDTO alumno;


}