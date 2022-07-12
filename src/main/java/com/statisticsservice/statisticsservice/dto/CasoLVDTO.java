package com.statisticsservice.statisticsservice.dto;


import java.util.Date;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.statisticsservice.statisticsservice.entities.CasoLV;
import com.statisticsservice.statisticsservice.entities.Paciente;
import com.statisticsservice.statisticsservice.entities.Sintoma;


public class CasoLVDTO {

    private Long id;

    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-mm-dd")
    private Date dataRegistro;

    private String codigoIbge;

    private List<Sintoma> sintomas;
    
    private Paciente paciente;

    public Date getDataRegistro() {
        return dataRegistro;
    }
    
    public List<Sintoma> getSintomas() {
        return sintomas;
    }

    public Paciente getPaciente() {
        return paciente;
    }

    public String getCodigoIbge() {
        return codigoIbge;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
   
    
}
