package Inheritance;

class shape{
    public void area(){
        System.out.println("Displays Area of Shape");
    }
}
class  triangle extends shape{
    public void area(int h, int b) {
        super.area();
        System.out.println(0.5*b*h);
    }

}

public class Single_Inheritance {
    public static void main(String[] args) {
        triangle t=new triangle();
        t.area(10,2);
    }

}

