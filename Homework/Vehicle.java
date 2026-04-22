public class Vehicle {
    String brand; // this stores the brand of the vehicle.
    int year; // this stores the year the vehicle was made.

    // this constructor will initialize the vehicle info when created.
    public Vehicle(String brand, int year) {
        this.brand = brand;
        this.year = year;
        System.out.println("Vehicle created: " + brand + ", " + year);
    }

    // this method will start a basic vehicle.
    public void start() {
        System.out.println("Vehicle starts");
    }
}