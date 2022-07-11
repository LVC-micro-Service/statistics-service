package com.statisticsservice.statisticsservice.service;

import org.springframework.stereotype.Service;

import com.statisticsservice.statisticsservice.entities.Sintoma;
import com.statisticsservice.statisticsservice.repository.SintomaRepository;

@Service
public class SintomaServico {

    private SintomaRepository repository;

    public void inserir(Sintoma sintoma) {
        repository.save(sintoma);
    }

    public Sintoma findSintomaById(Long sintomaId) {
        return repository.getReferenceById(sintomaId);
    }

}
