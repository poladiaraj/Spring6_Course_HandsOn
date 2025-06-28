package com.rpoladia.app;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Alien {
	//@Component annotation is to tell spring which classes are bean
	//In order to get the bean @Autowired annotation is required
	@Autowired
	Laptop laptop;
	
	public void code() {
		//System.out.println("Coding");
		laptop.compile();
	}
}
