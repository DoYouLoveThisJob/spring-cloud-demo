package com.example.streamhello;

import com.example.streamhello.entity.User;
import com.example.streamhello.sink.SinkSender;
import org.junit.Test;
import org.junit.runner.RunWith;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.annotation.Output;
import org.springframework.integration.support.MessageBuilder;
import org.springframework.messaging.MessageChannel;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@EnableBinding(value = {SinkSender.class})
public class StreamHelloApplicationTests {
	@Autowired
	private SinkSender sinkSender;
	@Test
	public void contextLoads() {
		for(int i=0;i<10;i++){
			User user = new User();
			user.setName("czx"+i);
			user.setPassword("123456"+i);
			sinkSender.output().send(MessageBuilder.withPayload(i).build());
		}

	}

}
