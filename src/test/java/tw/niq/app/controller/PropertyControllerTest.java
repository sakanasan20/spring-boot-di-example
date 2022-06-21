package tw.niq.app.controller;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import tw.niq.app.service.GreetingServiceImpl;

class PropertyControllerTest {
	
	PropertyController propertyController;
	
	@BeforeEach
	void setUp() {
		propertyController = new PropertyController();
		propertyController.greetingService = new GreetingServiceImpl();
	}

	@Test
	void testGetGreeting() {
		System.out.println(propertyController.getGreeting());
	}

}
