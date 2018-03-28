package com.example.streamsinkreceiver.stream;

import org.springframework.cloud.stream.annotation.Input;
import org.springframework.messaging.SubscribableChannel;
import org.springframework.stereotype.Component;

@Component
public interface MySink {
    String INPUT = "czxtest";

    @Input("czxtest")
    SubscribableChannel input();
}
