package com.statisticsservice.statisticsservice.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;

import com.statisticsservice.statisticsservice.dto.CasosMunicipioDTO;
import com.statisticsservice.statisticsservice.service.CasosMunicipioServico;

@RestController
@RequestMapping(value= "/casos")
public class ConsultarCasosController {

    @Autowired
    private CasosMunicipioServico service;
    
    @GetMapping(value= "/listar")
    public ResponseEntity<Optional<List<CasosMunicipioDTO>>> listarCasos(Pageable pageable){
        Optional<List<CasosMunicipioDTO>> casosPorMunicipio= service.listarCasosPorMunicipio(pageable);
    
        return ResponseEntity.ok(casosPorMunicipio);
    }
}
