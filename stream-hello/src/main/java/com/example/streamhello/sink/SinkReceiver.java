package com.example.streamhello.sink;

import com.example.streamhello.entity.User;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.cloud.stream.messaging.Sink;


//@EnableBinding(Sink.class)
//public class SinkReceiver {
//    private  static Logger logger = LoggerFactory.getLogger(SinkReceiver.class);
//    @StreamListener(Sink.INPUT)
//    public  void receiver(Object payload)
//    {
//        logger.info("Received:"+"name: "+((User)payload).getName()+" password: "+((User)payload).getPassword());
//    }
//}

//自定义使用
@EnableBinding(MySink.class)
public class SinkReceiver {
    private  static Logger logger = LoggerFactory.getLogger(SinkReceiver.class);
    @StreamListener(MySink.INPUT)
    public  void receiver(Object payload)
    {
        logger.info("Received:"+"name: "+((User)payload).getName()+" password: "+((User)payload).getPassword());
    }
}
