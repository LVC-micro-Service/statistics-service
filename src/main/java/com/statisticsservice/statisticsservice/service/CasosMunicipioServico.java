package com.statisticsservice.statisticsservice.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.statisticsservice.statisticsservice.dto.CasosMunicipioDTO;
import com.statisticsservice.statisticsservice.repository.CasoLVCRepository;
import com.statisticsservice.statisticsservice.repository.MunicipioCasoRepository;


@Service
public class CasosMunicipioServico {
    
    @Autowired
    private MunicipioCasoRepository repository;

    @Transactional(readOnly = true)
    public Optional<List<CasosMunicipioDTO>> listarCasosPorMunicipio(Pageable pageable){
        return repository.casosPorMunicipio();
    }
}
