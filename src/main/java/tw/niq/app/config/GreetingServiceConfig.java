package tw.niq.app.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;

import tw.niq.app.service.GreetingConstructorService;
import tw.niq.app.service.GreetingI18nEnglishService;
import tw.niq.app.service.GreetingI18nSpanishService;
import tw.niq.app.service.GreetingPrimaryService;
import tw.niq.app.service.GreetingPropertyService;
import tw.niq.app.service.GreetingSetterService;

@Configuration
public class GreetingServiceConfig {
	
	@Profile({"default", "EN"})
	@Bean("greetingI18nService")
	GreetingI18nEnglishService greetingI18nEnglishService() {
		return new GreetingI18nEnglishService();
	}
	
	@Profile("ES")
	@Bean("greetingI18nService")
	GreetingI18nSpanishService GreetingI18nSpanishService() {
		return new GreetingI18nSpanishService();
	}
	
	@Primary
	@Bean
	GreetingPrimaryService GreetingPrimaryService() {
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
