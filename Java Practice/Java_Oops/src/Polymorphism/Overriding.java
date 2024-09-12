package Polymorphism;

//Runtime polym

class Car{
    public void start(){
        System.out.println("car is started...");
    }
    public void move(){
        System.out.println("car is moving...");
    }
    public void stop(){
        System.out.println("car is Stopped...");
    }

}

class Bike extends Car{
    public void start(){
        System.out.println("bike is started...");
    }
    public void move(){
        System.out.println("bike is moving...");
    }
    public void stop(){
        System.out.println("bike is Stopped...");
    }

}
public class Overriding {
    public static void main(String[] args) {
        Car c=new Car();
        c.start();
        c.move();
        c.stop();
System.out.println("----------------");
        Bike b=new Bike();
        b.start();
        b.move();
        b.stop();
    }
}



