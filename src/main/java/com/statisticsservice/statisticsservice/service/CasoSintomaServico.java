package com.statisticsservice.statisticsservice.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.statisticsservice.statisticsservice.entities.CasoSintoma;
import com.statisticsservice.statisticsservice.repository.CasoSintomaRepository;

@Service
public class CasoSintomaServico {
    
    @Autowired
    private CasoSintomaRepository repository;
    
    public void inserir(CasoSintoma casoSintoma){
        repository.save(casoSintoma);
    }
    
    public List<CasoSintoma> findSintomas(Long id){
        return repository.findByCasoId(id);
    }

}
