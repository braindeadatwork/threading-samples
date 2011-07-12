package com.samples.sample1.utils;

import java.util.ArrayList;
import java.util.List;

import com.samples.sample1.domain.Person;

public class PersonUtils {
	private static final List<Person> persons = createPersons(10);

	public static List<Person> getPersons() {
		return persons;
	}

	private static List<Person> createPersons(int id) {
		List<Person> persons = new ArrayList<Person>();
		for (int i = 0; i < 10; i++) {
			Person p = new Person();
			p.setId(id);
			p.setHeight(Math.random());
			p.setName("Name-" + id);
			persons.add(p);
		}
		return persons;
	}
}
