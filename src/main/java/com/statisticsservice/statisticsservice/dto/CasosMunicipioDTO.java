package com.statisticsservice.statisticsservice.dto;

import java.io.Serializable;

public class CasosMunicipioDTO implements Serializable{

    private static final long serialVersionUID = 1L;
    
    private int codigoIbge;
    private Long casoId;
    private Long pacienteId;

    public CasosMunicipioDTO(int codigoIbge) {
        this.codigoIbge = codigoIbge;
    }

    public int getCodigoIbge() {
        return codigoIbge;
    }

    public void setCodigoIbge(int codigoIbge, Long casoId, Long pacienteId) {
        this.codigoIbge = codigoIbge;
        this.casoId = casoId;
        this.pacienteId = pacienteId;
    }

    public Long getCasoId() {
        return casoId;
    }

    public void setCasoId(Long casoId) {
        this.casoId = casoId;
    }

    public Long getPacienteId() {
        return pacienteId;
    }

    public void setPacienteId(Long pacienteId) {
        this.pacienteId = pacienteId;
    }

    
    
    }