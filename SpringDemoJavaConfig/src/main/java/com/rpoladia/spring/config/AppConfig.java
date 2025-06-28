package com.rpoladia.spring.config;

import com.rpoladia.spring.Alien;
import com.rpoladia.spring.Computer;
import com.rpoladia.spring.Desktop;
import com.rpoladia.spring.Laptop;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.*;

@Configuration
@ComponentScan("com.rpoladia.spring") //This is required if stereotype annotations areused
public class AppConfig {

    /*@Bean
    public Alien alien(*//*@Autowired*//* Computer com) {
        Alien obj = new Alien();
        obj.setAge(25);
        //This is tight coupling
        //obj.setCom(desktop());

        //This will use interface
        obj.setCom(com);
        return obj;
    }*/

    /*@Bean
    public Alien alien(@Qualifier("desktop1") Computer com) { //If more than 1 qualified beans present then @Qualifier annotation can be used
        Alien obj = new Alien();
        obj.setAge(25);
        obj.setCom(com);
        return obj;
    }*/

    /*@Bean
    public Alien alien(Computer com) {
        Alien obj = new Alien();
        obj.setAge(25);
        obj.setCom(com);
        return obj;
    }*/

    //Method name will be the default name of the  if the name is not provided.
    //Once name/s are provided the method name won't be considered
    /*@Bean(name = {"com2","desktop1"})
    //@Scope("prototype") //Default value is singleton
    public Desktop desktop() {
        return new Desktop();
    }*/

}