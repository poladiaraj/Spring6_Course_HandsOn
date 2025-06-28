package com.rpoladia.springbootdemo;

import com.rpoladia.springbootdemo.model.Alien;
import com.rpoladia.springbootdemo.model.Laptop;
import com.rpoladia.springbootdemo.service.LaptopService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringBootDemoApplication {

    public static void main(String[] args) {
        //This is the application context which contains Spring Container context
        ApplicationContext context = SpringApplication.run(SpringBootDemoApplication.class, args);

        //System.out.println("Hello World!");

        /*
        Alien obj = context.getBean(Alien.class);
        System.out.println(obj.getAge());
        obj.code();
        */

        LaptopService service = context.getBean(LaptopService.class);
        Laptop lap = context.getBean(Laptop.class);
        service.addLaptop(lap);
    }

}
