package tw.niq.app.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;

import tw.niq.app.repository.GreetingI18nEnglishRepository;
import tw.niq.app.repository.GreetingI18nEnglishRepositoryImpl;
import tw.niq.app.service.GreetingConstructorService;
import tw.niq.app.service.GreetingI18nEnglishService;
import tw.niq.app.service.GreetingI18nSpanishService;
import tw.niq.app.service.GreetingPrimaryService;
import tw.niq.app.service.GreetingPropertyService;
import tw.niq.app.service.GreetingSetterService;

@Configuration
public class GreetingServiceConfig {
	
	@Bean
	GreetingI18nEnglishRepository greetingI18nEnglishRepository() {
		return new GreetingI18nEnglishRepositoryImpl();
	}
	
	@Profile({"default", "EN"})
	@Bean("greetingI18nService")
	GreetingI18nEnglishService greetingI18nEnglishService(GreetingI18nEnglishRepository greetingI18nEnglishRepository) {
		return new GreetingI18nEnglishService(greetingI18nEnglishRepository);
	}
	
	@Profile("ES")
	@Bean("greetingI18nService")
	GreetingI18nSpanishService greetingI18nSpanishService() {
		return new GreetingI18nSpanishService();
	}
	
	@Primary
	@Bean
	GreetingPrimaryService greetingPrimaryService() {
		return new GreetingPrimaryService();
	}
	
	@Bean
	GreetingConstructorService greetingConstructorService() {
		return new GreetingConstructorService();
	}
	
	@Bean
	GreetingPropertyService greetingPropertyService() {
		return new GreetingPropertyService();
	}
	
	@Bean
	GreetingSetterService greetingSetterService() {
		return new GreetingSetterService();
	}

}
