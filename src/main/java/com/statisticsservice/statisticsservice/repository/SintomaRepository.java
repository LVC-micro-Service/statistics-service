package com.statisticsservice.statisticsservice.repository;


import org.springframework.data.jpa.repository.JpaRepository;

import com.statisticsservice.statisticsservice.entities.Sintoma;

public interface SintomaRepository extends JpaRepository<Sintoma, Long> {
    
}
