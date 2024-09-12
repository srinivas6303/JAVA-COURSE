package Inheritance;
class shapess{
    public void area(){
        System.out.println("Displays Area of Shape");
    }
}

class  triangleee extends shapess{
    public void area(int h, int b) {
        System.out.println("triangle area:"+ (0.5*b*h));
    }
}


class circle extends shapess {
    public void area(int radius) {
        double area = (3.14)*radius*radius;
        System.out.println("circle area:"+area);
    }

}

public class Hierarchical_inheritance {
    public static void main(String[] args) {
        triangleee t=new triangleee();
        t.area(10,10);

        circle c=new circle();
        c.area(10);

    }
}
