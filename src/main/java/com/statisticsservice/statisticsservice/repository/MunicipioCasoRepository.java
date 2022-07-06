package com.statisticsservice.statisticsservice.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.statisticsservice.statisticsservice.dto.CasosMunicipioDTO;
import com.statisticsservice.statisticsservice.entities.MunicipioCaso;
import com.statisticsservice.statisticsservice.entities.MunicipioCasoId;

@Repository
public interface MunicipioCasoRepository  extends JpaRepository<MunicipioCaso, MunicipioCasoId>{
    
    @Query(
  value = "SELECT * FROM municipio_caso ORDER BY count(codigo_ibge) DESC", 
  countQuery = "SELECT count(codigo_ibge) FROM municipio_caso GROUP BY codigo_ibge", 
  nativeQuery = true)
    List<CasosMunicipioDTO> casosPorMunicipio();

}
