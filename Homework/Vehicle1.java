public abstract class Vehicle1 {
    String brand; // this stores the vehicle brand.
    String model; // this stores the vehicle model.
    int year; // this stores the year of the vehicle.

    // this constructor initializes all vehicle information.
    public Vehicle1(String brand, String model, int year) {
        this.brand = brand;
        this.model = model;
        this.year = year;
    }

    // we would then use this method starts the vehicle.
    public void start() {
        System.out.println("Vehicle is starting...");
    }

    // we then abstract these methods that child classes must implement.
    public abstract void drive();

    public abstract void stop();
}