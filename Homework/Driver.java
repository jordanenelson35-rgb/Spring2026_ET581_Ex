public class Driver {
    String name; // this stores the driver name.
    Vehicle vehicle; // this means driver HAS-A vehicle.

    // this constructor sets the driver name and assigns a vehicle.
    public Driver(String name, Vehicle vehicle) {
        this.name = name;
        this.vehicle = vehicle;
    }

    // this method will make the driver start and drive the vehicle.
    public void drive() {
        vehicle.start(); // calling the start method from vehicle.
        System.out.println("Driver " + name + " is driving " + vehicle.brand);
    }
}