package com.store.service;

import com.store.model.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class OrderService {

    // this gives access to all products.
    private ProductService productService;

    // this stores carts for each customer.
    private Map<Integer, List<CartItem>> carts = new HashMap<>();

    // this stores completed orders.
    private List<Order> orders = new ArrayList<>();

    // this keeps track of order ids.
    private int orderCounter = 1;

    // constructor used to connect product service.
    public OrderService(ProductService productService) {
        this.productService = productService;
    }

    // this adds a product to the customer's cart.
    public void addToCart(Customer customer, int productId, int quantity) {

        Product product = productService.getProductById(productId);

        // check if product exists.
        if (product == null) {
            System.out.println("Product not found.");
            return;
        }

        // get customer's current cart.
        List<CartItem> cart =
                carts.getOrDefault(customer.getId(),
                        new ArrayList<>());

        // check if product already exists in cart.
        for (CartItem item : cart) {

            if (item.getProduct().getId() == productId) {

                // increase quantity if product already exists.
                item.setQuantity(item.getQuantity() + quantity);

                carts.put(customer.getId(), cart);
                return;
            }
        }

        // add new cart item.
        cart.add(new CartItem(product, quantity));

        carts.put(customer.getId(), cart);
    }

    // this completes checkout and creates an order.
    public void checkout(Customer customer) {

        List<CartItem> cart = carts.get(customer.getId());

        // check if cart is empty.
        if (cart == null || cart.isEmpty()) {
            System.out.println("Cart is empty.");
            return;
        }

        // create the completed order.
        Order order =
                new Order(orderCounter++, customer, cart);

        orders.add(order);

        // print the order summary.
        System.out.println(order);

        // clear the customer's cart.
        carts.remove(customer.getId());
    }

    // this returns all completed orders.
    public List<Order> listOrders() {
        return orders;
    }
}