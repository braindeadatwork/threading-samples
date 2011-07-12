package com.samples.sample1.service;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.integration.MessageChannel;
import org.springframework.integration.support.MessageBuilder;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@ContextConfiguration(locations = { "classpath:META-INF/spring/person-service.xml" })
@RunWith(SpringJUnit4ClassRunner.class)
public class JMSConfigTests {
	@Autowired
	private MessageChannel input;

	@Test
	public void testSendingMessage() throws Exception {
		input.send(MessageBuilder.withPayload("Pro Spring Integration Example")
				.build());
		Thread.sleep(5000);
	}
}
