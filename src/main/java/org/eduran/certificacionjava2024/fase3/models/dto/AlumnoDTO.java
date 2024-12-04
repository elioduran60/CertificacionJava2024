package org.eduran.certificacionjava2024.fase3.models.dto;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "alumnos")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class AlumnoDTO implements Serializable {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "run_alu")
    private String runAlu;

    @Column(name = "nom_alu")
    private String nomAlu;

    @Column(name = "ape_alu")
    private String apeAlu;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "car_alu", nullable = true)
    private CarreraDTO carrera;

    @OneToMany(mappedBy = "alumno", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<EvaluacionDTO> evaluaciones = new ArrayList<>();

    @OneToMany(mappedBy = "alumnos", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<CursoDTO> cursos = new ArrayList<>();

    public Double getPromedio(){
        if(evaluaciones == null || evaluaciones.isEmpty()){
            return 0.0;
        }
        return 0.0;
        /*return (double)Math.round(evaluaciones.stream().mapToDouble(EvaluacionDTO::getNotEvaluacion)
                .average()
                .orElse(0.0) * 10.0) / 10.0;*/
    }

    public String getSitFinal(){

        Double promedio = getPromedio();

        if(promedio != null && promedio >= 4.0){
            return "aprobado";
        }else{
            return "reprobado";
        }
    }

}
