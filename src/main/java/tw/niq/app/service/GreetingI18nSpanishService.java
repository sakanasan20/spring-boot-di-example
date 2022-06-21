package tw.niq.app.service;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Profile("ES")
@Service("greetingI18nService")
public class GreetingI18nSpanishService implements GreetingService {

	@Override
	public String sayGreeting() {

		return "Hola Mundo! - Spanish";
	}

}
