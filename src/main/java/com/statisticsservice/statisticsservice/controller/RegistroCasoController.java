package com.statisticsservice.statisticsservice.controller;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.statisticsservice.statisticsservice.dto.CasoLVDTO;
import com.statisticsservice.statisticsservice.entities.CasoLV;
import com.statisticsservice.statisticsservice.entities.CasoSintoma;
import com.statisticsservice.statisticsservice.entities.MunicipioCaso;
import com.statisticsservice.statisticsservice.entities.Paciente;
import com.statisticsservice.statisticsservice.entities.Sintoma;
import com.statisticsservice.statisticsservice.service.CasoServico;
import com.statisticsservice.statisticsservice.service.CasoSintomaServico;
import com.statisticsservice.statisticsservice.service.CasosMunicipioServico;
import com.statisticsservice.statisticsservice.service.PacienteServico;
import com.statisticsservice.statisticsservice.service.SintomaServico;

@RestController
@RequestMapping(value = "/caso")
public class RegistroCasoController {

    @Autowired
    private CasoServico service;

    @Autowired
    private CasosMunicipioServico casosMunicipioServico;

    @Autowired
    private CasoSintomaServico casoSintomaServico;

    @Autowired
    private SintomaServico sintomaServico;

    @Autowired
    private PacienteServico pacienteServico;

    @PostMapping("/inserir")
    public void salvarCasoLVC(@RequestBody CasoLVDTO dto) {

        capturarCaso(dto);
    }

    public ResponseEntity<String> capturarCaso(CasoLVDTO dto) {
        CasoLV caso = new CasoLV(dto.getCaso().getId(), dto.getCaso().getDataRegistro());
        
        try {
            service.inserir(caso);

            if (dto.getCodigoIbge() == null) {
                throw new Exception("É necessário informar o código ibge do município de contaminação");
            } else {

                List<Sintoma> sintomas = dto.getSintomas().stream().collect(Collectors.toList());
                salvarSintomas(sintomas, caso);
                Paciente paciente = salvarPaciente(dto);
                salvarMunicipioCaso(caso, paciente, dto);
                return new ResponseEntity<>("Caso registrado com sucesso", HttpStatus.OK);
            }
        } catch (Exception e) {
            return new ResponseEntity<String>(e.getMessage(), HttpStatus.BAD_REQUEST);
        }
    }

    private boolean salvarSintomas(List<Sintoma> sintomas, CasoLV caso) {

        for (Sintoma item : sintomas) {
            Sintoma sintoma = sintomaServico.findSintomaById(item.getId());
            CasoSintoma casoSintoma = new CasoSintoma(caso, sintoma);
            casoSintomaServico.inserir(casoSintoma);
        }
        return true;
    }

    private Paciente salvarPaciente(CasoLVDTO dto) {
        Paciente paciente = new Paciente(dto.getPaciente().getName(), dto.getPaciente().getHiv(),
                dto.getPaciente().getTelefone(), dto.getPaciente().getNomeMae(), dto.getPaciente().getPeso(),
                dto.getPaciente().getGestante(), dto.getPaciente().getNumCartaoSus(), dto.getPaciente().getEtniaEnum(),
                dto.getPaciente().getEscolaridade(), dto.getPaciente().getSexo());
        pacienteServico.inserir(paciente);
        return paciente;
    }

    private boolean salvarMunicipioCaso(CasoLV caso, Paciente paciente, CasoLVDTO dto) {
        MunicipioCaso municipioCaso = new MunicipioCaso(caso, paciente, dto.getCodigoIbge());
        casosMunicipioServico.inserir(municipioCaso);
        return true;
    }

}
