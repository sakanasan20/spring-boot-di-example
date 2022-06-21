package tw.niq.app.controller;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import tw.niq.app.service.GreetingServiceImpl;

class SetterControllerTest {
	
	SetterController setterController;

	@BeforeEach
	void setUp() throws Exception {
		setterController = new SetterController();
		setterController.setGreetingService(new GreetingServiceImpl());
	}

	@Test
	void testGetGreeting() {
		System.out.println(setterController.getGreeting());
	}

}
