package tw.niq.app.controller;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

import tw.niq.app.service.GreetingService;

@Controller
public class I18nController {
	
	private final GreetingService greetingService;

	public I18nController(@Qualifier("greetingI18nService") GreetingService greetingService) {
		this.greetingService = greetingService;
	}
	
	public String getGreeting() {
		return greetingService.sayGreeting();
	}

}
