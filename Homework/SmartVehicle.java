public class SmartVehicle extends Vehicle1 implements Playable {

    // this constructor initializes smart vehicle information.
    public SmartVehicle(String brand, String model, int year) {
        super(brand, model, year);
    }

    // this shows smart vehicle driving behavior.
    @Override
    public void drive() {
        System.out.println("SmartVehicle is driving autonomously.");
    }

    // this shows smart vehicle stopping behavior.
    @Override
    public void stop() {
        System.out.println("SmartVehicle has stopped safely.");
    }

    // this plays media inside the smart vehicle.
    @Override
    public void play() {
        System.out.println("SmartVehicle is playing media.");
    }

    // this pauses media inside the smart vehicle.
    @Override
    public void pause() {
        System.out.println("SmartVehicle media paused.");
    }
}