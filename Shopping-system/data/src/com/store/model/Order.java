package com.store.model;

import java.time.LocalDateTime;
import java.util.List;

public class Order {

    // this stores the order id.
    private int id;

    // this stores the customer who placed the order.
    private Customer customer;

    // this stores all cart items in the order.
    private List<CartItem> items;

    // this stores the date and time of the order.
    private LocalDateTime orderDate;

    // this stores the total order cost.
    private double total;

    // constructor used to create a completed order.
    public Order(int id, Customer customer, List<CartItem> items) {
        this.id = id;
        this.customer = customer;
        this.items = items;
        this.orderDate = LocalDateTime.now();
        this.total = calculateTotal();
    }

    // this calculates the total cost of the order.
    public double calculateTotal() {
        return items.stream()
                .mapToDouble(CartItem::getSubtotal)
                .sum();
    }

    // returns the order id.
    public int getId() {
        return id;
    }

    // returns the customer object.
    public Customer getCustomer() {
        return customer;
    }

    // returns the cart items.
    public List<CartItem> getItems() {
        return items;
    }

    // returns the total order price.
    public double getTotal() {
        return total;
    }

    // this prints all order details neatly.
    @Override
    public String toString() {
        return "Order ID: " + id +
                "\nCustomer: " + customer.getName() +
                "\nDate: " + orderDate +
                "\nItems: " + items +
                "\nTotal: $" + total + "\n";
    }
}