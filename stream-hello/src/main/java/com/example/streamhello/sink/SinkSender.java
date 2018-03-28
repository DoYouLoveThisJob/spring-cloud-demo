package com.example.streamhello.sink;

import org.springframework.cloud.stream.annotation.Output;
import org.springframework.messaging.MessageChannel;
import org.springframework.stereotype.Component;

@Component
public interface SinkSender {
    String OUTPUT ="greetings";
    @Output(SinkSender.OUTPUT)
    MessageChannel output();
}
