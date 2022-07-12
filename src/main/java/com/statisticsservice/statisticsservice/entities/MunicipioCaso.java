package com.statisticsservice.statisticsservice.entities;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.ManyToOne;
import javax.persistence.MapsId;
import javax.persistence.Table;

@Entity(name = "MunicipioCaso")
@Table(name = "municipio_caso")
public class MunicipioCaso {

    @EmbeddedId
    private MunicipioCasoId id;

    @ManyToOne(fetch = FetchType.LAZY)
    @MapsId("casoId")
    private CasoLV caso;


    @ManyToOne(fetch = FetchType.LAZY)
    @MapsId("pacienteId")
    private Paciente paciente;

    @Column(name = "codigoIbge")
    private String codigoIbge;


    public MunicipioCaso(CasoLV caso, Paciente paciente) {
        this.caso = caso;
        this.paciente = paciente;
        this.id = new MunicipioCasoId(caso.getId(), paciente.getId());
    }


    public String getCodigoIbge() {
        return codigoIbge;
    }

    public void setCodigoIbge(String codigoIbge) {
        this.codigoIbge = codigoIbge;
    }

    public MunicipioCaso() {

    }

    public CasoLV getCaso() {
        return caso;
    }

    public void setCaso(CasoLV caso) {
        this.caso = caso;
    }

    public Paciente getPaciente() {
        return paciente;
    }

    public void setPaciente(Paciente paciente) {
        this.paciente = paciente;
    }
    
}
