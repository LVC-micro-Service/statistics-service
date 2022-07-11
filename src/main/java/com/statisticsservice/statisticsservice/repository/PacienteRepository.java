package com.statisticsservice.statisticsservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.statisticsservice.statisticsservice.entities.Paciente;

public interface PacienteRepository extends JpaRepository<Paciente, Long>{
    
}
