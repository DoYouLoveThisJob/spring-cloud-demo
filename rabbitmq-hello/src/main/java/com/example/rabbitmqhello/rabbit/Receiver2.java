package com.example.rabbitmqhello.rabbit;

import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

@Component
@RabbitListener(queues = "topic.message")
public class Receiver2 {
    @RabbitHandler
    public void proccess(String hello){
        System.out.println("Receiver2:"+hello);
    }
}
