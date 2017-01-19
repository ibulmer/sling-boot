package com.walmart.example;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Properties;

@SpringBootApplication
public class Example {
    public static void main (String[] args) {
        SpringApplication app = new SpringApplication(Example.class);
        Properties properties = new Properties();
        properties.setProperty("spring.resources.staticLocations",
                "classpath:/react-slingshot/dist/");
        app.setDefaultProperties(properties);
        app.run(args);
    }
}
