package com.rpoladia.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringBootFirstApplication {

	public static void main(String[] args) {
		//This is the application context which contains Spring Container context
		ApplicationContext context = SpringApplication.run(SpringBootFirstApplication.class, args);
		
		//System.out.println("Hello World!");
		
		//Conventional way of creating an object
		//Alien obj = new Alien();
		
		//Using Spring: ApplicationContext.getBean(Class)
		//NoSuchBeanDefinitionException: If the class is not Spring enabled
		//@Component annotation added on Alien class
		Alien obj = context.getBean(Alien.class);
		obj.code();

		//Autowiring in Spring
		//@Component annotation is to tell spring which classes are bean
		//In order to get the bean @Autowired annotation is required
		Alien obj1 = context.getBean(Alien.class);
		obj1.code();
	}

}
