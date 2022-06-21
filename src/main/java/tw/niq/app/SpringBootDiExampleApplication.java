package tw.niq.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import tw.niq.app.controller.HelloController;

@SpringBootApplication
public class SpringBootDiExampleApplication {

	public static void main(String[] args) {
		
		ApplicationContext ctx = SpringApplication.run(SpringBootDiExampleApplication.class, args);
		
		HelloController helloController = (HelloController) ctx.getBean("helloController");
		
		String returnedMessage = helloController.sayHello();
		
		System.out.println(returnedMessage);
		
	}

}
