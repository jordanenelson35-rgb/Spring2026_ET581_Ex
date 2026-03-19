public class Main {
public static void main(String[] args) {

        // where creating a Phone objects using different constructors and each one will test a different constructor version
        Phone p1 = new Phone(); // no arguments
        Phone p2 = new Phone("Apple"); // only brand being stored 
        Phone p3 = new Phone("Samsung", "Galaxy S23"); // only brand + model is stored
        Phone p4 = new Phone("Google", "Pixel 8", 899.99); // brand, model, price are stored 

        // print all the initial information we stored for all phones and how each constructor would initialized the object
        p1.printInfo();
        p2.printInfo();
        p3.printInfo();
        p4.printInfo();

        // this will return true or false if p4 is expenisve or not
        System.out.println("Is p4 expensive? " + p4.isExpensive());

        // apply a 10% discount to p4 it modifies the price we stored in the object
        p4.applyDiscount(10);

        // print updated phone info after discount
        p4.printInfo();

        // when this is run it will update the price manually to 750 replacing the previous price
        p4.updatePrice(750);

        // this will now print final updated info of Phone
        p4.printInfo();


        // we will now create calculator objects calc1 starts counting from 0 and then calc2 starts counting from 5
        Calculator calc1 = new Calculator();
        Calculator calc2 = new Calculator(5);

        // using calc1
        System.out.println("=== calc1 ===");

        // call all the calc methods that was used and display results
        System.out.println("Add 10 + 5 = " + calc1.add(10,5));
        System.out.println("Subtract 10 - 5 = " + calc1.subtract(10,5));
        System.out.println("Multiply 10 * 5 = " + calc1.multiply(10,5));
        System.out.println("Divide 10 / 5 = " + calc1.divide(10,5));

        // this code script is show casing how method overloading would look like
        System.out.println("Add doubles 5.5 + 4.5 = " + calc1.add(5.5,4.5));

        // print the exacly number of methods that were used
        System.out.println("Counter: " + calc1.counter);

        System.out.println();

        // Using calc2
        System.out.println("=== calc2 ===");

        // Call a couple methods and check counter again
        System.out.println("Add 20 + 10 = " + calc2.add(20,10));
        System.out.println("Subtract 20 - 10 = " + calc2.subtract(20,10));

        // Final counter value should reflect starting value + method calls
        System.out.println("Counter: " + calc2.counter);
    }
}