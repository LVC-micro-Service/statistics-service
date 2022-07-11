package com.statisticsservice.statisticsservice.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.statisticsservice.statisticsservice.entities.Paciente;
import com.statisticsservice.statisticsservice.repository.PacienteRepository;

@Service
public class PacienteServico {

    @Autowired
    private PacienteRepository repository;

    public void inserir(Paciente paciente){
        repository.save(paciente);
    }
    
}
