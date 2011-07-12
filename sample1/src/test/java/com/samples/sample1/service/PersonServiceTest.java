package com.samples.sample1.service;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@ContextConfiguration
@RunWith(SpringJUnit4ClassRunner.class)
public class PersonServiceTest {
	@Autowired
	private PersonService personService;

	@Test
	public void testIfServiceIsNotNull() {
		assertNotNull(personService);
	}

	@Test
	public void testIfPersonsAreProduced() {
		assertTrue(personService.getAllPersons().size() == 10);
	}
}
