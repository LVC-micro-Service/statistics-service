package com.statisticsservice.statisticsservice.consumer;

import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Component;

import com.statisticsservice.statisticsservice.entities.CasoLV;
import com.statisticsservice.statisticsservice.repository.CasoLVRepository;

@Component
class CasoConsumer {

    private CasoLVRepository repository;

    @Autowired
    public CasoConsumer(CasoLVRepository repository) {
        this.repository = repository;
    }

    @RabbitListener(queues = {"$crud.rabbitmq.queueCaso"})
    public void consumer(@Payload CasoLV caso){
        repository.save(caso);
    }
}