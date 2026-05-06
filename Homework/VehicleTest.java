public class VehicleTest {
    public static void main(String[] args) {

        // creating array of vehicles using runtime polymorphism.
        Vehicle1[] vehicles = new Vehicle1[5];

        vehicles[0] = new Car1("Toyota", "Camry", 2022, 4);
        vehicles[1] = new Motorcycle("Harley-Davidson", "Iron 883", 2021, false);
        vehicles[2] = new Car1("Honda", "Civic", 2023, 4);
        vehicles[3] = new Motorcycle("Yamaha", "MT-07", 2022, false);
        vehicles[4] = new Car1("Ford", "Mustang", 2024, 2);

        // using for-each loop to call methods for every object.
        for (Vehicle1 v : vehicles) {

            System.out.println("---- Vehicle Info ----");

            v.start();
            v.drive();
            v.stop();

            System.out.println();
        }
    }
}