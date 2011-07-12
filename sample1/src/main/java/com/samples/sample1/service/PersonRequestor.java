package com.samples.sample1.service;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.integration.channel.DirectChannel;
import org.springframework.integration.support.MessageBuilder;

public class PersonRequestor {
	private DirectChannel channel; 
	 
	  @Value("#{personInputChannel}") 
	  public void setChannel(DirectChannel channel) { 
	    this.channel = channel; 
	  } 
	 
	  void getPersons(int howMany) { 
	    channel.send(MessageBuilder.withPayload( howMany).build() ); 
	    System.out.println("Get Persons - " + howMany); 
	  } 
}
