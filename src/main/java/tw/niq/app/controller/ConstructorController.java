package tw.niq.app.controller;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

import tw.niq.app.service.GreetingService;

@Controller
public class ConstructorController {
	
	private final GreetingService greetingService;

	public ConstructorController(@Qualifier("greetingConstructorService") GreetingService greetingService) {
		this.greetingService = greetingService;
	}

	public String getGreeting() {
		return greetingService.sayGreeting();
	}
	
}
