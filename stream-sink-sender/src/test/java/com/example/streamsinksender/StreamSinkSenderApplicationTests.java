package com.example.streamsinksender;

import com.example.streamsinksender.stream.SinkSender;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class StreamSinkSenderApplicationTests {
	@Autowired
	SinkSender sinkSender;

	@Test
	public void contextLoads() {
		sinkSender.timerMessageSource();
	}

}
