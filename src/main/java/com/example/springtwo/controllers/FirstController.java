package com.example.springtwo.controllers;


import com.example.springtwo.model.Product;
<<<<<<< 3bb973a1ccdbb14b09f31b59c83ff7861e5398e1
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
=======
import com.example.springtwo.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class FirstController {

    @Autowired
    ProductService productService;


    @RequestMapping (value = "/list")
    public ResponseEntity<String> productGreet () {
        return ResponseEntity.ok ("A very welcome to you all people !! ");
    }


    @RequestMapping (value = "/list/getlist")
    public ResponseEntity<List<Product>> getProd () {
        return ResponseEntity.ok (productService.getAllProds ());
>>>>>>> Boot Security
    }
}
