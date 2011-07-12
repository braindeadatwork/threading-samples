package com.samples.sample1.integration;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.integration.annotation.ServiceActivator;
import org.springframework.stereotype.Component;

import com.samples.sample1.domain.Person;
import com.samples.sample1.service.PersonService;

@Component
public class MessageHandler {
	@Autowired
	private PersonService personService;

	public void setPersonService(PersonService personService) {
		this.personService = personService;
	}

	@ServiceActivator
	public Person handleMessage(Integer howMany) {
		System.out.println("Received --->: " + howMany);
		List<Person> persons = personService.getAllPersons();
		return persons.get(0);
	}
}