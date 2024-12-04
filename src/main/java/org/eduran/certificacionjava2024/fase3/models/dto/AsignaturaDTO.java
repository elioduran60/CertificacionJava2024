package org.eduran.certificacionjava2024.fase3.models.dto;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

@Entity
@Table(name = "asignaturas")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class AsignaturaDTO implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_asi")
    private Long idAsi;

    @Column(name = "nom_asi")
    private String nomAsi;

    @Column(name = "tip_asi")
    private String tipAsi;

    @JoinColumn(name="car_asi")
    @ManyToOne
    private CarreraDTO carreraAsignatura;

    @JoinColumn(name="doc_asi")
    @ManyToOne
    private DocenteDTO docente;

    @OneToMany(mappedBy = "asignatura", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<EvaluacionDTO> evaluaciones = new ArrayList<>();

    //@OneToMany(mappedBy ="asignatira", cascade = CascadeType.ALL )
    //private CursoDTO   cursoDTO;
}