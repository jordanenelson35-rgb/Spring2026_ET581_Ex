package com.store.model;

public class Product {

    // this stores the unique id for the product.
    private int id;

    // this stores the name of the product.
    private String name;

    // this stores the price of the product.
    private double price;

    // this stores how many products are left in stock.
    private int quantity;

    // constructor used to create a new product object.
    public Product(int id, String name, double price, int quantity) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    // returns the product id.
    public int getId() {
        return id;
    }

    // returns the product name.
    public String getName() {
        return name;
    }

    // returns the product price.
    public double getPrice() {
        return price;
    }

    // returns the quantity in stock.
    public int getQuantity() {
        return quantity;
    }

    // updates the product name.
    public void setName(String name) {
        this.name = name;
    }

    // updates the product price.
    public void setPrice(double price) {
        this.price = price;
    }

    // updates the quantity in stock.
    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    // this prints all the product details neatly.
    @Override
    public String toString() {
        return "Product ID: " + id +
                ", Name: " + name +
                ", Price: $" + price +
                ", Quantity: " + quantity;
    }
}