package tw.niq.app.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.ConstructorBinding;

@ConstructorBinding
@ConfigurationProperties("tw.niq")
public class DataSourceConfig {
	
	private final String username;
	private final String password;
	private final String jdbcUrl;
	private final String mode;
	private final String driver;

	public DataSourceConfig(String username, String password, String jdbcUrl, String mode, String driver) {
		this.username = username;
		this.password = password;
		this.jdbcUrl = jdbcUrl;
		this.mode = mode;
		this.driver = driver;
	}
	
	public String getUsername() {
		return username;
	}

	public String getPassword() {
		return password;
	}

	public String getJdbcUrl() {
		return jdbcUrl;
	}

	public String getMode() {
		return mode;
	}

	public String getDriver() {
		return driver;
	}
	
}
