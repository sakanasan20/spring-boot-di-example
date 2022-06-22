package tw.niq.app.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import tw.niq.app.service.GreetingConstructorService;
import tw.niq.app.service.GreetingPropertyService;
import tw.niq.app.service.GreetingSetterService;

@Configuration
public class GreetingServiceConfig {
	
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
