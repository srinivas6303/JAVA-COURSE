package Abstraction;

//Abstraction is achieved in 2 ways :
//Abstract class
//Interfaces (Pure Abstraction)

abstract class Person {
    public abstract void walk();
    public abstract void run();
    public abstract void eat();

    public void routine() {
        System.out.println("Every person can do these activities.");
    }
}

class Implementation extends Person {
    @Override
    public void walk() {
        System.out.println("Person can walk.");
    }

    @Override
    public void run() {
        System.out.println("Person can run.");
    }

    @Override
    public void eat() {
        System.out.println("Person can eat.");
    }
}

public class Abstract_Demo {
    public static void main(String[] args) {
        Implementation imp = new Implementation();
        imp.walk();
        imp.eat();
        imp.run();
        imp.routine();  // You can also call the routine method
    }
}
