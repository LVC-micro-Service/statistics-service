package com.statisticsservice.statisticsservice.dto;

import java.io.Serializable;

public class CasosMunicipioDTO implements Serializable{

    private static final long serialVersionUID = 1L;
    
    private int count;
    private int codigo_ibge;

    public CasosMunicipioDTO(int codigoIbge, int count) {
        this.codigo_ibge = codigoIbge;
        this.count = count;
    }

    public int getCodigoIbge() {
        return codigo_ibge;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public void setCodigoIbge(int codigoIbge) {
        this.codigo_ibge = codigoIbge;
    }

    
    }