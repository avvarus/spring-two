package com.example.springtwo.controllers;


import com.example.springtwo.model.Product;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FirstController {


    Product product = new Product("Chickpeas", 100);

    @RequestMapping(value = "/hi/{name}")
    public String greet(@PathVariable("name") String name) {

        return "Welcome to World -- " + name;
    }

    @RequestMapping(value = "/list")
    public Product product() {

        return product;
    }
}
