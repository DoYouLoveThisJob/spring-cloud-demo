package com.example.rabbitmqhello.rabbit;

import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

@Component
@RabbitListener(queues = "fanout.A")
public class ReceiverFanout {
    @RabbitHandler
    public void proccess(String hello){
        System.out.println("ReceiverFanout1:"+hello);
    }
}
