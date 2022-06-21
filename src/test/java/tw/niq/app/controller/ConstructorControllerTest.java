package tw.niq.app.controller;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import tw.niq.app.service.GreetingServiceImpl;

class ConstructorControllerTest {
	
	ConstructorController constructorController;

	@BeforeEach
	void setUp() throws Exception {
		constructorController = new ConstructorController(new GreetingServiceImpl());
	}

	@Test
	void testGetGreeting() {
		System.out.println(constructorController.getGreeting());
	}

}
