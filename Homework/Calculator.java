public class Calculator {
    // this code will keep track of how many times any method is used.
    int counter;

    // this is the default constructor, we then make counter equal to 0 when object is created.
    public Calculator() {
        counter = 0;
    }

    // This constructor lets you set the starting value of the counter when the object is created.
    public Calculator(int counter) {
        this.counter = counter;
    }
    
    // this method is used to add two integers (int a, int b).
    public int add(int a, int b) {
        counter++;           // track method usage
        return a + b;
    }

    // this method is used to subtract two integers (int a, int b).
    public int subtract(int a, int b) {
        counter++;
        return a - b;
    }

    // this method is used to multiply two integers (int a, int b).
    public int multiply(int a, int b) {
        counter++;
        return a * b;
    }

    // this method is used to divided two integers (int a, int b) and also u will assume b is not 0 as we stated at counter = 0.
    public int divide(int a, int b) {
        counter++;
        return a / b;
    }

    // this show case the overloaded method which would have the same method name but works with differnt parameters.
    public double add(double a, double b) {
        counter++;
        return a + b;
    }
}