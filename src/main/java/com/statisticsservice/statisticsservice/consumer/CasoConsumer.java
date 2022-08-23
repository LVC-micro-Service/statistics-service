package com.statisticsservice.statisticsservice.consumer;

import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Component;

import com.statisticsservice.statisticsservice.dto.ConsumerDTO;
import com.statisticsservice.statisticsservice.entities.*;
import com.statisticsservice.statisticsservice.service.*;

@Component
class CasoConsumer {

    @Autowired
    private CasoServico casoServico;

    @Autowired
    private CasosMunicipioServico casoMunicipioServico;

    @Autowired
    private PacienteServico pacienteServico;

    @RabbitListener(queues = "crud.statistics.caso")
    public void consumer(@Payload ConsumerDTO caso) {
        try {
            CasoLV casoNew = salvarCaso(caso);
            Paciente pacienteNew = salvarPaciente(caso);
            // salvarSintomas(caso) &&
            salvarMunicipioCaso(pacienteNew, casoNew);
            System.out.println("Caso registrado com sucesso");
        } catch (

        Exception e) {
            System.out.println(e.getMessage());
        }
    }

    private CasoLV salvarCaso(ConsumerDTO caso) {

        return casoServico.inserir(caso.getCaso());
    }

    private Paciente salvarPaciente(ConsumerDTO dto) {
        Paciente paciente = dto.getPaciente();
        return pacienteServico.inserir(paciente);

    }

    private boolean salvarMunicipioCaso(Paciente pac, CasoLV caso) {
        MunicipioCaso municipioCaso = new MunicipioCaso(caso, pac);
        casoMunicipioServico.inserir(municipioCaso);
        return true;
    }

}