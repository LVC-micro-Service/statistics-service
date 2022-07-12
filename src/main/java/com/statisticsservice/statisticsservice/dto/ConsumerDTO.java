package com.statisticsservice.statisticsservice.dto;


import com.statisticsservice.statisticsservice.entities.*;

public class ConsumerDTO {
    private String codigoIbge;
    private CasoLV caso;
    private Paciente paciente;

    public String getCodigoIbge(){
        return codigoIbge;
    }

    public CasoLV getCaso() {
        return caso;
    }

    public Paciente getPaciente() {
        return paciente;
    }
    
}

