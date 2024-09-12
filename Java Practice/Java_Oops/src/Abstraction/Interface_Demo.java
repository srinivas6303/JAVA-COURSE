package Abstraction;

interface Person1 {
    public abstract void walk();
    public abstract void run();
    public abstract void eat();

    default public void routine() {
        System.out.println("Every person can do these activities.");
    }
}

class providebody implements Person1 {
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

public class Interface_Demo {
    public static void main(String[] args) {
        providebody pb = new providebody();
        pb.walk();
        pb.eat();
        pb.run();
        pb.routine();  // You can call the default routine method
    }
}
