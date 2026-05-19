package com.store.service;

import com.store.model.Customer;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CustomerService {

    // this list stores all customers in memory.
    private List<Customer> customers = new ArrayList<>();

    // this loads customers from the text file.
    public void loadCustomers(String filePath) {

        try {

            Scanner scanner = new Scanner(new File(filePath));

            while (scanner.hasNextLine()) {

                String line = scanner.nextLine();

                // split the line using commas.
                String[] data = line.split(",");

                int id = Integer.parseInt(data[0]);
                String name = data[1];
                String email = data[2];

                // create and add customer object.
                customers.add(new Customer(id, name, email));
            }

            scanner.close();

        } catch (Exception e) {
            System.out.println("Error loading customers.");
        }
    }

    // this returns all customers.
    public List<Customer> listAll() {
        return customers;
    }

    // this adds a new customer.
    public void addCustomer(Customer customer) {
        customers.add(customer);
    }

    // this deletes a customer using the id.
    public void deleteCustomer(int id) {
        customers.removeIf(customer -> customer.getId() == id);
    }

    // this finds a customer using the id.
    public Customer getCustomerById(int id) {

        return customers.stream()
                .filter(customer -> customer.getId() == id)
                .findFirst()
                .orElse(null);
    }
}