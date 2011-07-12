package com.samples.sample1.service;

import junit.framework.TestCase;

import com.samples.sample1.service.ExampleService;

public class ExampleServiceTests extends TestCase {

	private ExampleService service = new ExampleService();
	
	public void testReadOnce() throws Exception {
		assertEquals("Hello world!", service.getMessage());
	}

}
