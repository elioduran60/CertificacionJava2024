package org.eduran.certificacionjava2024.fase3.models.dao;
import org.eduran.certificacionjava2024.fase3.models.dto.EvaluacionDTO;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EvaluacionesDao extends JpaRepository<EvaluacionDTO, Integer> {
}
