package com.rpoladia.simplewebapp_aws.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("/")
    public String greet() {
        return "Hello World!";
    }

    @GetMapping("info")
    public String aboutMachine() {
        String os = System.getenv("os.name");
        String version = System.getProperty("os.version");
        String architecture = System.getProperty("os.arch");
        String javaVersion = System.getProperty("java.version");
        String user =  System.getProperty("user.name");

        return "OS: " + os + ", Version: " + version + ", Architecture: " + architecture + ", Java: " + javaVersion + ", User: " + user;
    }
}
