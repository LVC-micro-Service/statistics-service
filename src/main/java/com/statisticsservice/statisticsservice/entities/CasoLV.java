package com.statisticsservice.statisticsservice.entities;



import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonFormat;

import java.util.Date;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "casoLV")
public class CasoLV {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-mm-dd")
    private Date dataRegistro;

    @OneToMany(mappedBy = "paciente", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<MunicipioCaso> pacientes = new ArrayList<MunicipioCaso>();

    public Long retornarId() {
        return id;
    }

    public Date retornarDataRegistro() {
        return dataRegistro;
    }

    public void definirDataRegistro(Date dataRegistro) {
        this.dataRegistro = dataRegistro;
    }

    public CasoLV(Long id, Date dataRegistro) {
        this.id = id;
        this.dataRegistro = dataRegistro;
    }

    public CasoLV() {
    }


    

}
