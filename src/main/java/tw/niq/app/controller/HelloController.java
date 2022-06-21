package tw.niq.app.controller;

import org.springframework.stereotype.Controller;

import tw.niq.app.service.GreetingService;

@Controller
public class HelloController {
	
	private final GreetingService greetingService;

	public HelloController(GreetingService greetingService) {
		this.greetingService = greetingService;
	}

	public String sayHello() {
		return greetingService.sayGreeting();
	}
	
}
