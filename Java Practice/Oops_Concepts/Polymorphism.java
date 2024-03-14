package Oops_Concepts;

//One thing into many forms
//Benefits:flexibility,code reduction
class Shape {
    void findArea() {
        System.out.println("Area calculation for this shape.");
    }

    void display() {
        System.out.println("Shape is not specified.");
    }
}

class Rectangle extends Shape {
    int length = 5;
    int width = 5;

    void findArea() {
        int area = length * width;
        System.out.println("Area of Rectangle: " + area);
    }

    @Override
    void display() {
        System.out.println("Shape is Rectangle");
    }
}

class Square extends Shape {
    int sideLength = 10;

    void findArea() {
        int area = sideLength * sideLength;
        System.out.println("Area of Square: " + area);
    }

    @Override
    void display() {
        System.out.println("Shape is Square");
    }
}

class Circle extends Shape {
    int radius = 10;

    void findArea() {
        double area = 3.14 * radius * radius;
        System.out.println("Area of Circle: " + area);
    }

    @Override
    void display() {
        System.out.println("Shape is Circle");
    }
}

public class Polymorphism {
    public static void main(String[] args) {

        Rectangle r = new Rectangle();
        Square sq = new Square();
        Circle c = new Circle();

        fun(r);
        fun(sq);
        fun(c);
    }

    public static void fun(Shape s) {
        s.findArea();
        s.display();
    }
}
