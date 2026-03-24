package edu.cuny.qcc;

public class Main{ 
    public static void main(String [] args) {
        Student s1 = new Student("Alice", 18);
        System.out.println(s1.name + s1.age);
        Professor professor = new Professor("Bob");
        System.out.println(professor.name);
    }
}