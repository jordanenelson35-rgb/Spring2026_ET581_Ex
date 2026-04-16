public class    Main{
    public static void main(String[] args) {
        
        Cat c = new Cat();
        System.out.println("Cat name is " + c.name);
        c.eat();

        Dog d = new Dog();
        System.out.println("Dog name is " + d.name);
        d.eat();
    }
}