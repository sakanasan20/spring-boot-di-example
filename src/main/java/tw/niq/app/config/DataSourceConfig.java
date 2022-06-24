package tw.niq.app.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import tw.niq.app.datasource.FakeDataSource;

@ConfigurationProperties("tw.niq")
@Configuration
public class DataSourceConfig {
	
	private String username;
	private String password;
	private String jdbcUrl;
	private String mode;
	private String driver;

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getJdbcUrl() {
		return jdbcUrl;
	}

	public void setJdbcUrl(String jdbcUrl) {
		this.jdbcUrl = jdbcUrl;
	}

	public String getMode() {
		return mode;
	}

	public void setMode(String mode) {
		this.mode = mode;
	}

	public String getDriver() {
		return driver;
	}

	public void setDriver(String driver) {
		this.driver = driver;
	}

	@Bean
	FakeDataSource fakeDataSource() {
		
		FakeDataSource fakeDataSource = new FakeDataSource();
		
		fakeDataSource.setUsername(username);
		fakeDataSource.setPassword(password);
		fakeDataSource.setJdbcUrl(jdbcUrl);
		fakeDataSource.setMode(mode);
		fakeDataSource.setDriver(driver);
		
		return fakeDataSource;
	}
	
}
