package com.statisticsservice.entities;



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
// @Data
@Table(name = "casoLVC")
public class CasoLVC {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-mm-dd")
    private Date dataRegistro;

    @OneToMany(mappedBy = "sintoma", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<CasoSintoma> sintomas = new ArrayList<CasoSintoma>();

    @OneToMany(mappedBy = "paciente", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<MunicipioCaso> pacientes = new ArrayList<MunicipioCaso>();

    public Long getId() {
        return id;
    }

    public Date getDataRegistro() {
        return dataRegistro;
    }

    public void setDataRegistro(Date dataRegistro) {
        this.dataRegistro = dataRegistro;
    }

    public CasoLVC(Date dataRegistro){
        this.dataRegistro = dataRegistro;
    }

}
