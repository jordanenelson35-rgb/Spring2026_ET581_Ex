package com.store.service;

import com.store.model.Product;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ProductService {

    // this list stores all products in memory.
    private List<Product> products = new ArrayList<>();

    // this loads products from the text file.
    public void loadProducts(String filePath) {

        try {

            Scanner scanner = new Scanner(new File(filePath));

            while (scanner.hasNextLine()) {

                String line = scanner.nextLine();

                // split the line using commas.
                String[] data = line.split(",");

                int id = Integer.parseInt(data[0]);
                String name = data[1];
                double price = Double.parseDouble(data[2]);
                int quantity = Integer.parseInt(data[3]);

                // create and add the product object.
                products.add(new Product(id, name, price, quantity));
            }

            scanner.close();

        } catch (Exception e) {
            System.out.println("Error loading products.");
        }
    }

    // this returns all products.
    public List<Product> listAll() {
        return products;
    }

    // this adds a new product.
    public void addProduct(Product product) {
        products.add(product);
    }

    // this removes a product using the id.
    public void removeProduct(int id) {
        products.removeIf(product -> product.getId() == id);
    }

    // this finds a product using the id.
    public Product getProductById(int id) {

        return products.stream()
                .filter(product -> product.getId() == id)
                .findFirst()
                .orElse(null);
    }

    // this updates the quantity of a product.
    public void updateStock(int id, int quantity) {

        Product product = getProductById(id);

        if (product != null) {
            product.setQuantity(quantity);
        }
    }

    // this searches for products using a keyword.
    public List<Product> searchByName(String keyword) {

        return products.stream()
                .filter(product ->
                        product.getName().toLowerCase()
                                .contains(keyword.toLowerCase()))
                .collect(Collectors.toList());
    }

    // this filters products using a price range.
    public List<Product> filterByPrice(double min, double max) {

        return products.stream()
                .filter(product ->
                        product.getPrice() >= min &&
                        product.getPrice() <= max)
                .collect(Collectors.toList());
    }
}