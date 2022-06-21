package tw.niq.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import tw.niq.app.controller.ConstructorController;
import tw.niq.app.controller.HelloController;
import tw.niq.app.controller.I18nController;
import tw.niq.app.controller.PropertyController;
import tw.niq.app.controller.SetterController;

@SpringBootApplication
public class SpringBootDiExampleApplication {

	public static void main(String[] args) {
		
		ApplicationContext ctx = SpringApplication.run(SpringBootDiExampleApplication.class, args);
		
		System.out.println("--- i18n with Profile ---");
		
		I18nController i18nController = (I18nController) ctx.getBean("i18nController");
		
		System.out.println(i18nController.getGreeting());
		
		System.out.println("--- Primary ---");
		
		HelloController helloController = (HelloController) ctx.getBean("helloController");
		
		System.out.println(helloController.sayHello());
		
		System.out.println("--- Property ---");
		
		PropertyController propertyController = (PropertyController) ctx.getBean("propertyController");

		System.out.println(propertyController.getGreeting());
		
		System.out.println("--- Setter ---");
		
		SetterController setterController = (SetterController) ctx.getBean("setterController");

		System.out.println(setterController.getGreeting());
		
		System.out.println("--- Constructor ---");
		
		ConstructorController constructorController = (ConstructorController) ctx.getBean("constructorController");

		System.out.println(constructorController.getGreeting());
		
	}

}
