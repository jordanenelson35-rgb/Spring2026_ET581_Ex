package com.store.model;

public class Customer {

    // this stores the unique id for the customer.
    private int id;

    // this stores the customer's full name.
    private String name;

    // this stores the customer's email address.
    private String email;

    // constructor used to create a customer object.
    public Customer(int id, String name, String email) {
        this.id = id;
        this.name = name;
        this.email = email;
    }

    // returns the customer id.
    public int getId() {
        return id;
    }

    // returns the customer name.
    public String getName() {
        return name;
    }

    // returns the customer email.
    public String getEmail() {
        return email;
    }

    // this updates the customer name.
    public void setName(String name) {
        this.name = name;
    }

    // this updates the customer email.
    public void setEmail(String email) {
        this.email = email;
    }

    // this prints all customer information neatly.
    @Override
    public String toString() {
        return "Customer ID: " + id +
                ", Name: " + name +
                ", Email: " + email;
    }
}