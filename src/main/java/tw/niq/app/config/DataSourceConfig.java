package tw.niq.app.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

import tw.niq.app.datasource.FakeDataSource;

@PropertySource("classpath:datasource.properties")
@Configuration
public class DataSourceConfig {

	@Bean
	FakeDataSource fakeDataSource(@Value("${tw.niq.username}") String username, 
			@Value("${tw.niq.password}") String password, 
			@Value("${tw.niq.jdbc-url}") String jdbcUrl) {
		FakeDataSource fakeDataSource = new FakeDataSource();
		fakeDataSource.setUsername(username);
		fakeDataSource.setPassword(password);
		fakeDataSource.setJdbcUrl(jdbcUrl);
		return fakeDataSource;
	}
	
}
