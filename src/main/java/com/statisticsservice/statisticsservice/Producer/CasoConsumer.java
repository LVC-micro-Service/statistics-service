package com.statisticsservice.statisticsservice.Producer;

import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Component;

import com.statisticsservice.statisticsservice.entities.CasoLVC;
import com.statisticsservice.statisticsservice.repository.CasoLVCRepository;

@Component
class CasoConsumer {

    private CasoLVCRepository repository;

    @Autowired
    public CasoConsumer(CasoLVCRepository repository) {
        this.repository = repository;
    }

    @RabbitListener(queues = {"$crud.rabbit.mq.queueCaso"})
    public void consumer(@Payload CasoLVC caso){
        repository.save(caso);
    }
}