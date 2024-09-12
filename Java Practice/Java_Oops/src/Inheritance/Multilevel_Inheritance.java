package Inheritance;

class shapes{
    public void area(){
        System.out.println("Displays Area of Shape");
    }
}

class  trianglee extends shapes{
    public void area(int h, int b) {
        System.out.println("triangle area:"+ (0.5*b*h));
    }
}


class EquilateralTriangle extends trianglee {
    public void area(int side) {
        double area = (Math.sqrt(3) / 4) * side * side;  // Formula for equilateral triangle
        System.out.println("EquilateralTriangle area:"+area);
    }

}

public class Multilevel_Inheritance {
    public static void main(String[] args) {
        EquilateralTriangle et=new EquilateralTriangle();
        et.area(10);
    }






}
