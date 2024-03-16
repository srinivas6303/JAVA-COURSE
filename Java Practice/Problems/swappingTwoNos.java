package Problems;
public class swappingTwoNos {
    public static void main(String[] args) {
        // //using temp variable
        // int a=10;
        // int b=5;
        // System.out.println("Before swapping:"+a+ " "+b);
        // int temp=a;
        // a=b;
        // b=temp;
        // System.out.println("Before swapping:"+a+ " "+b);

        //without using temp variable
        // int a=1;
        // int b=2;
        // System.out.println("Before swapping:"+a+ " "+b);
        // a=a+b;
        // b=a-b;
        // a=a-b;
        // System.out.println("After swapping:"+a+ " "+b);


        //using Bitwise Operator
        int a=5;
        int b=10;
        System.out.println("Before swapping:"+a+ " "+b);
        a=a^b;
        b=a^b;
        a=a^b;
        System.out.println("After swapping:"+a+ " "+b);




    }
}
