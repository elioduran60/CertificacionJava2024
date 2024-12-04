package org.eduran.certificacionjava2024.fase3.models.dto;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "directores")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class DirectorDTO {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "run_dir")
    private String runDir;

    @Column(name = "nom_dir")
    private String nomDir;

    @Column(name = "ape_dir")
    private String apeDir;

    @Column(name = "pro_dir")
    private String proDir;

    @OneToOne(mappedBy = "director")
    private CarreraDTO carrera;

}