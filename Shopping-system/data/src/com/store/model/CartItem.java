package com.store.model;

public class CartItem {

    // this stores the product object.
    private Product product;

    // this stores the quantity added to the cart.
    private int quantity;

    // constructor used to create a cart item.
    public CartItem(Product product, int quantity) {
        this.product = product;
        this.quantity = quantity;
    }

    // returns the product object.
    public Product getProduct() {
        return product;
    }

    // returns the quantity.
    public int getQuantity() {
        return quantity;
    }

    // this updates the quantity in the cart.
    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    // this calculates the subtotal price for the cart item.
    public double getSubtotal() {
        return product.getPrice() * quantity;
    }

    // this prints the cart item details neatly.
    @Override
    public String toString() {
        return product.getName() +
                " x " + quantity +
                " = $" + getSubtotal();
    }
}