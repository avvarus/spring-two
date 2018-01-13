package com.example.springtwo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
//@ComponentScan("com.example.springtwo.controllers")
//@RestController
public class SpringTwoApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringTwoApplication.class, args);
    }
}
