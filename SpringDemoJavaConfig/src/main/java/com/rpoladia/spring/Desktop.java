package com.rpoladia.spring;

import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component("com2") //name of the bean in parameter to component
@Primary
@Scope("prototype")
public class Desktop implements Computer{

    public Desktop() {
        System.out.println("Desktop object created");
    }

    @Override
    public void compile() {
        System.out.println("Compiling using Desktop.");
    }
}
