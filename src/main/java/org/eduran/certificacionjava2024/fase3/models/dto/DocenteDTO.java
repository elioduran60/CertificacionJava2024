package org.eduran.certificacionjava2024.fase3.models.dto;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name="docentes")
@AllArgsConstructor
@NoArgsConstructor
@Data
public class DocenteDTO {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "run_doc")
    private String runDoc;

    @Column(name = "nom_doc")
    private String nomDoc;

    @Column(name = "ape_doc")
    private String apeDoc;

//    @OneToOne(mappedBy = "docentes")
//    private AsignaturaDTO asignaturas;

//    @OneToMany(mappedBy = "docentes", cascade = CascadeType.ALL, orphanRemoval = true)
//    List<CursoDTO> cursos = new ArrayList<>();
}
