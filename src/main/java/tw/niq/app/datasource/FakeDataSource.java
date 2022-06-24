package tw.niq.app.datasource;

public class FakeDataSource {

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

	@Override
	public String toString() {
		return "FakeDataSource [username=" + username + ", password=" + password + ", jdbcUrl=" + jdbcUrl + ", mode="
				+ mode + ", driver=" + driver + "]";
	}
	
}
