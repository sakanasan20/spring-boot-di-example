package tw.niq.app.controller;

import org.springframework.stereotype.Controller;

@Controller
public class HelloController {

	public String sayHello() {
		
		System.out.println("Hello world!");
		
		return "sayHello()";
	}
	
}
