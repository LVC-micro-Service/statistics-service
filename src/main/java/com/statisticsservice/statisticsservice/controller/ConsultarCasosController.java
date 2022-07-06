package com.statisticsservice.statisticsservice.controller;

import java.util.List;

import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;

import com.statisticsservice.statisticsservice.dto.CasosMunicipioDTO;
import com.statisticsservice.statisticsservice.service.CasosMunicipioServico;

@RestController
@RequestMapping("/casos")
public class ConsultarCasosController {

    @Autowired
    private CasosMunicipioServico service;
    
    @GetMapping("/listar")
    public List<CasosMunicipioDTO> listarCasos(Pageable pageable){
        return service.listarCasosPorMunicipio(pageable);
    }
}
