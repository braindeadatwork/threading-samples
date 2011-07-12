package com.samples.sample1.domain;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.integration.Message;
import org.springframework.integration.MessageChannel;
import org.springframework.integration.core.PollableChannel;
import org.springframework.integration.support.MessageBuilder;

public class Driver {
	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
				"classpath:/META-INF/spring/person-service.xml");
		context.start();

		MessageChannel input = (MessageChannel) context.getBean("input",
				MessageChannel.class);
		PollableChannel output = (PollableChannel) context.getBean("output",
				PollableChannel.class);
		input.send(MessageBuilder.withPayload(10)
				.build());
		Message<?> reply = output.receive();
		System.out.println("received: " + reply);
	}
}
