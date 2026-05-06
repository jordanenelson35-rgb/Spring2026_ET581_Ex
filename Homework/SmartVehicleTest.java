public class SmartVehicleTest {
    public static void main(String[] args) {

        // creating smart vehicle objects.
        SmartVehicle smart1 = new SmartVehicle("Tesla", "Model S", 2024);
        SmartVehicle smart2 = new SmartVehicle("Tesla", "Model X", 2023);

        // vehicle array with mixed vehicle types.
        Vehicle1[] vehicles = new Vehicle1[4];

        vehicles[0] = smart1;
        vehicles[1] = new Car1("Toyota", "Corolla", 2022, 4);
        vehicles[2] = smart2;
        vehicles[3] = new Motorcycle("Kawasaki", "Ninja 400", 2021, false);

        System.out.println("=== Vehicle Behavior ===");

        // testing vehicle behaviors.
        for (Vehicle1 v : vehicles) {
            v.start();
            v.drive();
            v.stop();

            System.out.println();
        }

        // playable array with playable objects.
        Playable[] players = new Playable[3];

        players[0] = smart1;
        players[1] = new MusicPlayer();
        players[2] = smart2;

        System.out.println("=== Media Behavior ===");

        // testing media behaviors.
        for (Playable p : players) {
            p.play();
            p.pause();
            p.stop();

            System.out.println();
        }
    }
}