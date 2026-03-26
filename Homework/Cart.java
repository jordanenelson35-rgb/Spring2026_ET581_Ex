public class Cart {
    private Product[] products = new Product[5]; // this array is to store up to 5 products nun more.
    private int count = 0; // will track the number of products in the cart.

    private static int totalCartNumber = 0;

    // with this constructor we will increment the total count of carts.
    public Cart() { 
        totalCartNumber++;
    }

    // this will add a product to the cart if space is available.
    public void addProduct(Product p) {
        if (count < products.length) {
            products[count] = p;
            count++;
        } else {
            System.out.println("Cart is full! Cannot add more products.");
        }
    }

    // with this it calculates the total prices of all products in the cart.
    public double calculateTotal() { 
        double total = 0.0;
        for (int i = 0; i < count; i++) {
            total += products[i].getPrice();
        }
        return total;
    }

    // then use this to display all the products and total price.
    public void showCart() { 
        System.out.println("Cart contents:");
        for (int i = 0; i < count; i++) {
            System.out.println("- " + products[i].getName() + ": $" + products[i].getPrice());
        }
        System.out.println("Total: $" + calculateTotal());
    }

    // this will then print the number of carts that was created.
    public static void printTotalCartNumber() {
        System.out.println("Total Carts Created: " + totalCartNumber);
    }
}