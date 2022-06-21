package tw.niq.app.service;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

@Primary
@Service
public class GreetingPrimaryService implements GreetingService {

	@Override
	public String sayGreeting() {

		return "Hello world! - Primary";
	}

}
