package tw.niq.app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

import tw.niq.app.service.GreetingService;

@Controller
public class SetterController {
	
	private GreetingService greetingService;

	@Qualifier("greetingSetterService")
	@Autowired
	public void setGreetingService(GreetingService greetingService) {
		this.greetingService = greetingService;
	}

	public String getGreeting() {
		return greetingService.sayGreeting();
	}
	
}
