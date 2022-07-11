package com.statisticsservice.statisticsservice.dto;


import java.util.List;

import com.statisticsservice.statisticsservice.entities.CasoLV;
import com.statisticsservice.statisticsservice.entities.Paciente;
import com.statisticsservice.statisticsservice.entities.Sintoma;

public class CasoLVDTO {

    private String codigoIbge;

    private CasoLV caso;

    private Paciente paciente;

    private List<Sintoma> sintomas;

    public List<Sintoma> getSintomas() {
        return sintomas;
    }

    public CasoLV getCaso() {
        return caso;
    }

    public String getCodigoIbge() {
        return codigoIbge;
    }

    public Paciente getPaciente() {
        return paciente;
    }
    
}
