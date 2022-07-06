package com.statisticsservice.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.statisticsservice.repository.CasoLVCRepository;

@Service
public class CasoLVCService {
    
    @Autowired
    private CasoLVCRepository repository;
}
