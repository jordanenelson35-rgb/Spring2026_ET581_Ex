public class Motorcycle extends Vehicle1 {

    boolean hasSidecar; // this checks if the motorcycle has a sidecar.

    // this constructor initializes motorcycle information.
    public Motorcycle(String brand, String model, int year, boolean hasSidecar) {
        super(brand, model, year);
        this.hasSidecar = hasSidecar;
    }

    // this shows how the motorcycle drives.
    @Override
    public void drive() {
        System.out.println("Motorcycle is speeding on the highway.");
    }

    // this shows how the motorcycle stops.
    @Override
    public void stop() {
        System.out.println("Motorcycle stopped safely.");
    }
}