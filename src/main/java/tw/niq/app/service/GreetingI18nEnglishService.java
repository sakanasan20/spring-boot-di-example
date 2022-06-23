package tw.niq.app.service;

import tw.niq.app.repository.GreetingI18nEnglishRepository;

public class GreetingI18nEnglishService implements GreetingService {
	
	private final GreetingI18nEnglishRepository greetingI18nEnglishRepository;

	public GreetingI18nEnglishService(GreetingI18nEnglishRepository greetingI18nEnglishRepository) {
		this.greetingI18nEnglishRepository = greetingI18nEnglishRepository;
	}

	@Override
	public String sayGreeting() {

		return greetingI18nEnglishRepository.getGreeting();
	}

}
