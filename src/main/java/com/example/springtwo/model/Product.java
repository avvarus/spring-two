package com.example.springtwo.model;


<<<<<<< 3bb973a1ccdbb14b09f31b59c83ff7861e5398e1
=======
import org.springframework.context.annotation.Bean;


>>>>>>> Boot Security
public class Product {


    private String Name;
    private int quantity;

    public Product(String name, int quantity) {
        Name = name;
        this.quantity = quantity;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
}
