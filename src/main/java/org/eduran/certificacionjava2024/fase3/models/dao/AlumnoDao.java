package org.eduran.certificacionjava2024.fase3.models.dao;

import org.eduran.certificacionjava2024.fase3.models.dto.AlumnoDTO;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AlumnoDao extends JpaRepository<AlumnoDTO,String> {

}
