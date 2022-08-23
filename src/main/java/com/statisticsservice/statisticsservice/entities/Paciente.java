package com.statisticsservice.statisticsservice.entities;


import java.util.ArrayList;
import java.util.List;

import javax.persistence.*;


@Entity
@Table(name = "paciente")
public class Paciente {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    // Para anonimato do serviço de estatísticas o campo "name" deve ser removido
    @Column(nullable = true)
    private String nome;

    @Column
    private Boolean hiv;

    @Column
    private String telefone;

    @Column
    private String nomeMae;

    @Column
    private Float peso;

    @Column
    private Boolean gestante;

    @Column
    private Long numCartaoSus;

    @Column
    private EtniaEnum etniaEnum;

    @Column
    private String escolaridade;

    @Column
    private String sexo;

    @OneToMany(mappedBy = "caso", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<MunicipioCaso> caso = new ArrayList<MunicipioCaso>();

    public Paciente(String nome, Boolean hiv, String telefone, String nomeMae, Float peso, Boolean gestante,
            Long numCartaoSus, EtniaEnum etniaEnum, String escolaridade, String sexo) {
        this.nome = nome;
        this.hiv = hiv;
        this.telefone = telefone;
        this.nomeMae = nomeMae;
        this.peso = peso;
        this.gestante = gestante;
        this.numCartaoSus = numCartaoSus;
        this.etniaEnum = etniaEnum;
        this.escolaridade = escolaridade;
        this.sexo = sexo;
    }

    public Paciente(){
        
    }

    public Long retornarId() {
        return id;
    }

    public String retornarNome() {
        return nome;
    }

    public void definirNome(String nome) {
        this.nome = nome;
    }

    public Boolean retornarHiv() {
        return hiv;
    }

    public void definirHiv(Boolean hiv) {
        this.hiv = hiv;
    }

    public String retornarTelefone() {
        return telefone;
    }

    public void definirTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String retornarNomeMae() {
        return nomeMae;
    }

    public void definirNomeMae(String nomeMae) {
        this.nomeMae = nomeMae;
    }

    public Float retornarPeso() {
        return peso;
    }

    public void definirPeso(Float peso) {
        this.peso = peso;
    }

    public Boolean retornarGestante() {
        return gestante;
    }

    public void definirGestante(Boolean gestante) {
        this.gestante = gestante;
    }

    public Long retornarNumCartaoSus() {
        return numCartaoSus;
    }

    public void definirNumCartaoSus(Long numCartaoSus) {
        this.numCartaoSus = numCartaoSus;
    }

    public EtniaEnum retornarEtniaEnum() {
        return etniaEnum;
    }

    public void definirEtniaEnum(EtniaEnum etniaEnum) {
        this.etniaEnum = etniaEnum;
    }

    public String retornarEscolaridade() {
        return escolaridade;
    }

    public void definirEscolaridade(String escolaridade) {
        this.escolaridade = escolaridade;
    }

    public String retornarSexo() {
        return sexo;
    }

    public void definirSexo(String sexo) {
        this.sexo = sexo;
    }

    public List<MunicipioCaso> retornarCaso() {
        return caso;
    }

    public void definirCaso(List<MunicipioCaso> caso) {
        this.caso = caso;
    }

}
