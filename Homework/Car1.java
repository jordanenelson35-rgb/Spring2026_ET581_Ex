public class Car1 extends Vehicle1 {

    int numberOfDoors; // this stores how many doors the car has.

    // this constructor initializes the car information.
    public Car1(String brand, String model, int year, int numberOfDoors) {
        super(brand, model, year);
        this.numberOfDoors = numberOfDoors;
    }

    // this shows how the car drives.
    @Override
    public void drive() {
        System.out.println("Car is driving smoothly.");
    }

    // this shows how the car will stop.
    @Override
    public void stop() {
        System.out.println("Car stopped at the traffic light.");
    }
}