public class Product {
    private String name;   // this will stores the product's name.
    private double price;  // this will stores the product's price.

    // with this constructor we initializes the product with name and price.
    public Product(String name, double price) {
        this.name = name;
        this.price = price; 
    }

    // with this it will returns the price of the product.
    public double getPrice() {
        return price;
    }

    // this will update the price of the product.
    public void setPrice(double price) {
        this.price = price;
    }
    
    // then this will return the name of the product.
    public String getName() {
        return name;
    }
}