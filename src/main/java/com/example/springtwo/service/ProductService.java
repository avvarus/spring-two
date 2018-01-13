package com.example.springtwo.service;

import com.example.springtwo.model.Product;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class ProductService {

    public List<Product> getAllProds () {

        List<Product> products = new ArrayList<> ();

        Product p = new Product ("iPhone", 100);
        Product p1 = new Product ("Samsung", 200);
        Product p2 = new Product ("Nokia", 200);

        products.add (p);
        products.add (p1);
        products.add (p2);

        return products;
    }
}
