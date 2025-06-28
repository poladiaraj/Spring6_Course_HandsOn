package com.rpoladia.springsecdemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringSecDemoApplication {

    /*
    NOTES
        1. Spring security module provides default login page:
            username: user
            password: <password-in-console-logs>
        2. Module also provides default /logout page/endpoint
        3. By default, the module will implement CSRF for POST/PUT/DELETE HTTP methods as these update data on server.
           GET is considered safe as the data is not updated on server.
     */

    public static void main(String[] args) {
        SpringApplication.run(SpringSecDemoApplication.class, args);
    }

}
