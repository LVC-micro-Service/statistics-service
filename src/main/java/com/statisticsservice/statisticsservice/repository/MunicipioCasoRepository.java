package com.statisticsservice.statisticsservice.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.statisticsservice.statisticsservice.dto.CasosMunicipioDTO;
import com.statisticsservice.statisticsservice.entities.MunicipioCaso;
import com.statisticsservice.statisticsservice.entities.MunicipioCasoId;

@Repository
public interface MunicipioCasoRepository  extends JpaRepository<MunicipioCaso, MunicipioCasoId>{
    
    @Query(value = "SELECT new com.statisticsservice.statisticsservice.dto.CasosMunicipioDTO (obj.codigo_ibge, SUM(obj.amount)) FROM MunicipioCaso As obj GROUP BY obj.codigo_ibge") 
    Optional<List<CasosMunicipioDTO>> casosPorMunicipio();

}
