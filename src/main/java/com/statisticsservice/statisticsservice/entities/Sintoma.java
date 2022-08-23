package com.statisticsservice.statisticsservice.entities;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "sintoma")
public class Sintoma {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nome;

    public void definirNome(String nome) {
        this.nome = nome;
    }

    public Long retornarId() {
        return id;
    }

    public String retornarNome() {
        return nome;
    }

}
