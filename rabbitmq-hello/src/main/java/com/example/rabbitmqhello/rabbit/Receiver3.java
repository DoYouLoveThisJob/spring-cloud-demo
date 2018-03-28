package com.example.rabbitmqhello.rabbit;

import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

@Component
@RabbitListener(queues = "topic.messages")
public class Receiver3 {
    @RabbitHandler
    public void proccess(String hello){
        System.out.println("Receiver3:"+hello);
    }
}
