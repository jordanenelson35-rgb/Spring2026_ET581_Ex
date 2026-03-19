public class Phone {
    // these String will store the data for each Phone object we will create
    String brand;
    String model;
    double price;

    // this is the efault constructor it will run even when no value are stored whwn creating the object and it will set everything to default.
    public Phone() {
        brand = "Unknown";   // will be named default brand since non was provided.
        model = "Unknown";   // will be named default model since non was provided.
        price = 0.0;         // will be named default price since non was provided.
    }

    // this constructor will only have one parameter (brand only) which allows the user to set brand while the rest remain default.
    public Phone(String brand) {
        this.brand = brand;  // "this" would refer to the current object we have stored.
        model = "Unknown";
        price = 0.0;
    }

    // this constructor will display two parameters which allows the user to set brand and model while price remain default.
    
    public Phone(String brand, String model) {
        this.brand = brand;
        this.model = model;
        price = 0.0;
    }

    // this constructor will display all three parameters and object with all values that was stored
    public Phone(String brand, String model, double price) {
        this.brand = brand;
        this.model = model;
        this.price = price;
    }

    // this method is to display the given phone details we stored and print all instance variable values to the console.
    public void printInfo() {
        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
        System.out.println("Price: " + price);
    }

    // this method is used to check if phone is expensive then will return true if pice is higher than 800 if not its gon be false.
    public boolean isExpensive() {
        return price > 800;
    }

    // this method is applied to discount which would reduce the current price by any percentage given by the user.
    public void applyDiscount(double percent) {
        price = price - (price * percent / 100);
    }

    // this method will update the current price to a new value.
    public void updatePrice(double newPrice) {
        price = newPrice;
    }
}