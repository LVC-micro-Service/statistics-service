package com.statisticsservice.statisticsservice.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.statisticsservice.statisticsservice.entities.CasoLV;
import com.statisticsservice.statisticsservice.repository.CasoLVRepository;

@Service
public class CasoServico {
    
    @Autowired
    private CasoLVRepository repository;

    public CasoLV inserir(CasoLV caso){
        CasoLV c = repository.save(caso);
        return c;
    }
}
