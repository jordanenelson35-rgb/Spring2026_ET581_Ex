public class Car extends Vehicle {
    int doors; // this stores how many doors the car has.

    // this constructor will call the parent constructor and set doors.
    public Car(String brand, int year, int doors) {
        super(brand, year); // using super to initialize vehicle stuff first.
        this.doors = doors;
        System.out.println("Car created: " + brand + ", doors: " + doors);
    }

    // this overrides the start method to be specific for a car.
    @Override
    public void start() {
        System.out.println("Car starts");
    }
}