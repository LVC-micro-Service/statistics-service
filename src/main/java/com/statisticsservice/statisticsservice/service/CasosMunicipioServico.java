package com.statisticsservice.statisticsservice.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.statisticsservice.statisticsservice.entities.MunicipioCaso;
import com.statisticsservice.statisticsservice.repository.MunicipioCasoRepository;


@Service
public class CasosMunicipioServico {
    
    @Autowired
    private MunicipioCasoRepository repository;

    public void inserir(MunicipioCaso municipioCaso){
        repository.save(municipioCaso);
    }
}
