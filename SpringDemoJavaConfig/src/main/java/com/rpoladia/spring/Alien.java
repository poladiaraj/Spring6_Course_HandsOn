package com.rpoladia.spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.beans.ConstructorProperties;

@Component //This is a stereotype annotation in Spring, means Spring will manage them
public class Alien {

    @Value("21") //This annotation can be used to read the property file or any other resource outside the code.
    private int age;
    //@Autowired
    //@Qualifier("desktop") //Bean name is the class name in small letters
    //Qualifier("com2") //Bean name is the class name in small letters
    private Computer com;

    public Alien() {
        System.out.println("Alien object created!");
    }

    public int getAge() {
        return age;
    }

    public void setAge(int pAge) {
        //System.out.println("Setter called");
        this.age = pAge;
    }

    public Computer getCom() {
        return com;
    }

    //Recommended to use @Autowired to use on setters rather than field injection
    @Autowired
    @Qualifier("laptop") //Qualifier gets preference over Primary, in this case Desktop is Primary, and qualifier is Laptop so Laptop will be called
    public void setCom(Computer com) {
        this.com = com;
    }

    public void code() {
        System.out.println("Coding");
        com.compile();
    }
}
