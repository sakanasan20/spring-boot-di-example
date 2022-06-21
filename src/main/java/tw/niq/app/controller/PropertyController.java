package tw.niq.app.controller;

import tw.niq.app.service.GreetingService;

public class PropertyController {
	
	public GreetingService greetingService;

	public String getGreeting() {
		return greetingService.sayGreeting();
	}
	
}
