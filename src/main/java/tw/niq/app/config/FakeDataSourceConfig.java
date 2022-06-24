package tw.niq.app.config;

import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import tw.niq.app.datasource.FakeDataSource;

@EnableConfigurationProperties(DataSourceConfig.class)
@Configuration
public class FakeDataSourceConfig {

	@Bean
	FakeDataSource fakeDataSource(DataSourceConfig dataSourceConfig) {
		
		FakeDataSource fakeDataSource = new FakeDataSource();
		
		fakeDataSource.setUsername(dataSourceConfig.getUsername());
		fakeDataSource.setPassword(dataSourceConfig.getPassword());
		fakeDataSource.setJdbcUrl(dataSourceConfig.getJdbcUrl());
		fakeDataSource.setMode(dataSourceConfig.getMode());
		fakeDataSource.setDriver(dataSourceConfig.getDriver());
		
		return fakeDataSource;
	}

}
