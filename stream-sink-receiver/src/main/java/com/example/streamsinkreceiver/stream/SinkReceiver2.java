package com.example.streamsinkreceiver.stream;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.annotation.StreamListener;

@EnableBinding(MySink.class)
public class SinkReceiver2 {

    private  static Logger logger = LoggerFactory.getLogger(SinkReceiver.class);
    @StreamListener(MySink.INPUT)
    public  void receiver(Object payload)
    {
        logger.info("Received2:"+payload);
    }
}
