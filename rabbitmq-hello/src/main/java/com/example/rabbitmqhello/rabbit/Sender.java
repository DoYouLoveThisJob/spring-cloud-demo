package com.example.rabbitmqhello.rabbit;

import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Date;

@Component
public class Sender {
    @Autowired
    private AmqpTemplate amqpTemplate;

    public  void send(){
        String context ="hello"+new Date();
        System.out.println("sender:"+context);
        this.amqpTemplate.convertAndSend("hello",context);
    }

    public void send1() {
        String context = "hi, i am message 1";
        System.out.println("Sender : " + context);
        this.amqpTemplate.convertAndSend("exchange", "topic.message", context);
    }

    public void send2() {
        String context = "hi, i am messages 2";
        System.out.println("Sender : " + context);
        this.amqpTemplate.convertAndSend("exchange", "topic.messages", context);
    }

    public void send3() {
        String context = "hi, fanout msg ";
        System.out.println("Sender : " + context);
        this.amqpTemplate.convertAndSend("fanoutExchange","fanout.C", context);
    }
}
