package com.store.app;

import com.store.model.Product;
import com.store.model.Customer;
import com.store.service.ProductService;
import com.store.service.CustomerService;
import com.store.service.OrderService;

import java.util.List;

public class Main {

    public static void main(String[] args) {

        // create service objects.
        ProductService ps = new ProductService();
        CustomerService cs = new CustomerService();
        OrderService os = new OrderService(ps);

        // ----- load data from text files -----
        ps.loadProducts("data/products.txt");
        cs.loadCustomers("data/customers.txt");

        // ----- display all products -----
        System.out.println("===== ALL PRODUCTS =====");

        ps.listAll().forEach(System.out::println);

        // ----- display all customers -----
        System.out.println("\n===== ALL CUSTOMERS =====");

        cs.listAll().forEach(System.out::println);

        // ----- product crud operations -----

        // add a new product.
        Product newProduct =
                new Product(141,
                        "Gaming Chair",
                        250.00,
                        12);

        ps.addProduct(newProduct);

        // update stock quantity.
        ps.updateStock(102, 50);

        // remove a product.
        ps.removeProduct(103);

        System.out.println("\n===== PRODUCTS AFTER CRUD =====");

        ps.listAll().forEach(System.out::println);

        // ----- customer crud operations -----

        // add a new customer.
        Customer newCustomer =
                new Customer(21,
                        "Alice Johnson",
                        "alice@example.com");

        cs.addCustomer(newCustomer);

        // update customer info.
        Customer customer1 = cs.getCustomerById(1);

        if (customer1 != null) {

            customer1.setName("John Updated");

            customer1.setEmail("johnupdated@example.com");
        }

        // delete customer.
        cs.deleteCustomer(2);

        System.out.println("\n===== CUSTOMERS AFTER CRUD =====");

        cs.listAll().forEach(System.out::println);

        // ----- cart and checkout process -----

        Customer c1 = cs.getCustomerById(1);

        os.addToCart(c1, 101, 2);

        os.addToCart(c1, 104, 1);

        System.out.println("\n===== CHECKOUT FOR CUSTOMER 1 =====");

        os.checkout(c1);

        // second customer checkout.
        Customer alice = cs.getCustomerById(21);

        os.addToCart(alice, 102, 1);

        os.addToCart(alice, 105, 2);

        System.out.println("\n===== CHECKOUT FOR CUSTOMER 21 =====");

        os.checkout(alice);

        // ----- display all completed orders -----
        System.out.println("\n===== ALL ORDERS =====");

        os.listOrders().forEach(System.out::println);

        // ----- search products by keyword -----
        System.out.println("\n===== SEARCH RESULTS: APPLE =====");

        List<Product> searchResults =
                ps.searchByName("Apple");

        searchResults.forEach(System.out::println);

        // ----- filter products by price -----
        System.out.println("\n===== FILTERED PRODUCTS: $100 - $500 =====");

        List<Product> filteredProducts =
                ps.filterByPrice(100, 500);

        filteredProducts.forEach(System.out::println);
    }
}