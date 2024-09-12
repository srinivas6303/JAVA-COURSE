package Polymorphism;

public class Overloading {
    //same method name but different parameters
    //compile time poly

    public void add(int a, int b){
        System.out.println(a+"+"+b+"="+(a+b));
    }

    public void add(int aa, int bb, int cc){
        System.out.println(aa +"+"+bb+"+"+cc+"="+(aa +bb+cc));
    }

    public String add( ){
        return "addition performed...";
    }

    public static void main(String[] args) {
        Overloading obj=new Overloading();
        obj.add(5,5);
        obj.add(5,5,5);
        System.out.println(obj.add());


    }
}
