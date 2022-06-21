package tw.niq.app.controller;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import tw.niq.app.service.GreetingConstructorService;

class ConstructorControllerTest {
	
	ConstructorController constructorController;

	@BeforeEach
	void setUp() throws Exception {
		constructorController = new ConstructorController(new GreetingConstructorService());
	}

	@Test
	void testGetGreeting() {
		System.out.println(constructorController.getGreeting());
	}

}
