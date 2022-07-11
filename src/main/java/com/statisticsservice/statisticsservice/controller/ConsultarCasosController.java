package com.statisticsservice.statisticsservice.controller;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;


@RestController
@RequestMapping(value= "/casos")
public class ConsultarCasosController {

    
    // @GetMapping(value= "/listar")
    // public ResponseEntity<Optional<List<CasosMunicipioDTO>>> listarCasos(Pageable pageable){
    //     Optional<List<CasosMunicipioDTO>> casosPorMunicipio= service.listarCasosPorMunicipio(pageable);
    
    //     return ResponseEntity.ok(casosPorMunicipio);
    // }
}
