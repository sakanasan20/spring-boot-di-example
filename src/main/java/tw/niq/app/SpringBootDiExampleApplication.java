package tw.niq.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;

import tw.niq.app.bean.PrototypeBean;
import tw.niq.app.bean.SingletonBean;
import tw.niq.app.controller.ConstructorController;
import tw.niq.app.controller.HelloController;
import tw.niq.app.controller.I18nController;
import tw.niq.app.controller.PetController;
import tw.niq.app.controller.PropertyController;
import tw.niq.app.controller.SetterController;

@ComponentScan(basePackages = {"tw.niq.app", "tw.niq.pet"})
@SpringBootApplication
public class SpringBootDiExampleApplication {

	public static void main(String[] args) {
		
		ApplicationContext ctx = SpringApplication.run(SpringBootDiExampleApplication.class, args);
				
		System.out.println("--- Scope ---");
		
		SingletonBean singletonBean_1 = ctx.getBean(SingletonBean.class);
		SingletonBean singletonBean_2 = ctx.getBean(SingletonBean.class);
		
		System.out.println(singletonBean_1.getScope());
		System.out.println(singletonBean_2.getScope());
		System.out.println("singletonBean_1 == singletonBean_2: " + (singletonBean_1 == singletonBean_2));
		
		PrototypeBean prototypeBean_1 = ctx.getBean(PrototypeBean.class);
		PrototypeBean prototypeBean_2 = ctx.getBean(PrototypeBean.class);
		
		System.out.println(prototypeBean_1.getScope());
		System.out.println(prototypeBean_2.getScope());
		System.out.println("prototypeBean_1 == prototypeBean_2: " + (prototypeBean_1 == prototypeBean_2));
		
		System.out.println("--- Best Pet ---");
		
		PetController petController = (PetController) ctx.getBean("petController");
		
		System.out.println(petController.getBestPet());
		
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
