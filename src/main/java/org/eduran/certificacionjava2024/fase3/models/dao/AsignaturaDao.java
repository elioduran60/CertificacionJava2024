package org.eduran.certificacionjava2024.fase3.models.dao;

import org.eduran.certificacionjava2024.fase3.models.dto.AsignaturaDTO;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AsignaturaDao extends JpaRepository<AsignaturaDTO,Integer> {
}
