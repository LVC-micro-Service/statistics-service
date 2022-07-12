package com.statisticsservice.statisticsservice.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.statisticsservice.statisticsservice.entities.MunicipioCaso;
import com.statisticsservice.statisticsservice.entities.MunicipioCasoId;

@Repository
public interface MunicipioCasoRepository  extends JpaRepository<MunicipioCaso, MunicipioCasoId>{
    
}
