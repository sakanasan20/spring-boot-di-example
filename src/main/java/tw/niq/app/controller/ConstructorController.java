package tw.niq.app.controller;

import tw.niq.app.service.GreetingService;

public class ConstructorController {
	
	private final GreetingService greetingService;

	public ConstructorController(GreetingService greetingService) {
		this.greetingService = greetingService;
	}

	public String getGreeting() {
		return greetingService.sayGreeting();
	}
	
}
