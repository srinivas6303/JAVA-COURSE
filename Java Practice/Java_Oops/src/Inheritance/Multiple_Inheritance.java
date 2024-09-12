package Inheritance;

//Multiple inheritance is not supported in Java due to the ambiguity problem faced by the compiler,
// commonly known as the Diamond Problem.
//This occurs when a class inherits methods from multiple superclasses with the same method signature.

interface A{
    public void print();
}

interface B{
    public void show();
}

class demo implements  A,B{
    @Override
    public void print() {
        System.out.println("I am from A interface");
    }

    @Override
    public void show() {
        System.out.println("I am from B interface");
    }
}

public class Multiple_Inheritance {
    public static void main(String[] args) {
        demo d=new demo();
        d.print();
        d.show();
    }
}
