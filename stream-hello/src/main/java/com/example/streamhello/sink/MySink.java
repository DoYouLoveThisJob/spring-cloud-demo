package com.example.streamhello.sink;

import org.springframework.cloud.stream.annotation.Input;
import org.springframework.messaging.SubscribableChannel;
import org.springframework.stereotype.Component;

@Component
public interface MySink {
    String INPUT = "greetings";

    @Input("greetings")
    SubscribableChannel input();
}
