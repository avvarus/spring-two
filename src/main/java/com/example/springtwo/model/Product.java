package com.example.springtwo.model;


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
