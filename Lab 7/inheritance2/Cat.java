

public class Cat extends Animal{
    public int age;

    public cat() {
        super("cat"); //  call parent constructor 
        this.age = 3;
        System.err.println("Cat constructor is called");
    }
    public void sound(){
        System.out.println("Cat sound");
    }
}