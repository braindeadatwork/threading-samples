package com.samples.sample1.service;

import java.util.List;

import org.springframework.stereotype.Component;

import com.samples.sample1.domain.Person;
import com.samples.sample1.utils.PersonUtils;

@Component
public class PersonServiceImpl implements PersonService {
	public List<Person> getAllPersons() {
		return PersonUtils.getPersons();
	}
}
