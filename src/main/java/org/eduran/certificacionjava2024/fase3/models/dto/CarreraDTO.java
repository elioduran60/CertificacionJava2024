package org.eduran.certificacionjava2024.fase3.models.dto;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "carreras")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class CarreraDTO {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_car")
    private Integer idCar;

    @Column(name = "nom_car")
    private String nomCar;

    @Column(name = "tip_car")
    private String tipCar;

    @Column(name = "dur_car")
    private Integer durCar;

    @OneToOne(cascade = CascadeType.ALL) // Propiedad cascada
    @JoinColumn(name = "dir_car")
    private DirectorDTO director;

}
