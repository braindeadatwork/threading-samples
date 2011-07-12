package com.samples.sample1.config;

import javax.jms.ConnectionFactory;

import org.apache.activemq.ActiveMQConnectionFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.jms.connection.CachingConnectionFactory;
import org.springframework.stereotype.Component;

@Component
public class JmsConfiguration {
	@Bean(name = "connectionFactory")
	public ConnectionFactory getConnectionFactory() {
		ActiveMQConnectionFactory targetConnectionFactory = new ActiveMQConnectionFactory();
		targetConnectionFactory.setBrokerURL("vm://localhost");

		CachingConnectionFactory connectionFactory = new CachingConnectionFactory(
				targetConnectionFactory);
		connectionFactory.setSessionCacheSize(10);
		connectionFactory.setCacheProducers(false);
		return connectionFactory;
	}
}
