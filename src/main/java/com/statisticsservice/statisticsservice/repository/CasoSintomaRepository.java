package com.statisticsservice.statisticsservice.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.statisticsservice.statisticsservice.entities.CasoSintoma;
import com.statisticsservice.statisticsservice.entities.CasoSintomaId;

@Repository
public interface CasoSintomaRepository extends JpaRepository<CasoSintoma, CasoSintomaId> {
    
    public List<CasoSintoma> findByCasoId(Long id);
}
