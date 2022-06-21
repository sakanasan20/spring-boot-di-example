package tw.niq.app.service;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Profile({"default", "EN"})
@Service("greetingI18nService")
public class GreetingI18nEnglishService implements GreetingService {

	@Override
	public String sayGreeting() {

		return "Hello world! - English";
	}

}
