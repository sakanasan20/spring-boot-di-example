package tw.niq.app.controller;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import tw.niq.app.service.GreetingPropertyService;

class PropertyControllerTest {
	
	PropertyController propertyController;
	
	@BeforeEach
	void setUp() {
		propertyController = new PropertyController();
		propertyController.greetingService = new GreetingPropertyService();
	}

	@Test
	void testGetGreeting() {
		System.out.println(propertyController.getGreeting());
	}

}
