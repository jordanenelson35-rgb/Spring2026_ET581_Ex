public class HWMain {
    public static void main(String[] args) {

        // creating a basic vehicle.
        Vehicle v = new Vehicle("Generic Vehicle", 2020);

        // creating a car object.
        Car c = new Car("Toyota", 2023, 4);

        // creating drivers and assigning vehicles to them.
        Driver d1 = new Driver("Alice", v);
        Driver d2 = new Driver("Bob", c);

        // starting both vehicles.
        v.start();
        c.start();

        // drivers driving their vehicles.
        d1.drive();
        d2.drive();
    }
}