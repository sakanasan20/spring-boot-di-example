package tw.niq.app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

import tw.niq.app.service.GreetingService;

@Controller
public class PropertyController {
	
	@Qualifier("greetingPropertyService")
	@Autowired
	public GreetingService greetingService;

	public String getGreeting() {
		return greetingService.sayGreeting();
	}
	
}
