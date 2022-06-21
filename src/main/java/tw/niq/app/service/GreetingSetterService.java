package tw.niq.app.service;

import org.springframework.stereotype.Service;

@Service
public class GreetingSetterService implements GreetingService {

	@Override
	public String sayGreeting() {

		return "Hello world! - Setter";
	}

}
