package tw.niq.app.bean;

import org.springframework.stereotype.Component;

@Component
public class SingletonBean {

	public SingletonBean() {
		System.out.println("SingletonBean()");
	}
	
	public String getScope() {
		return "Singleton";
	}
	
}
