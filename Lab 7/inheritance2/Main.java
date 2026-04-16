

public class Main{
    public static void main(String [] args){
        Animal animal = new Animal("animal");
        System.out.println("the animal name is" + animal.name);
        Cat cat = new Cat();
        System.out.println("cat name is " + cat.name); // from parent
        cat.eat(); // from the parent
        System.out.println("cat name is" + cat.age); // from the child
        cat.sound(); // from the child

    }
}