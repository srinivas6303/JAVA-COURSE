import java.util.Scanner;

public class switchcase {

    public static void main(String args[]){
        int a,b;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter one operator +,/,-,*");
        char c=sc.next().charAt(0); // Corrected to read a single character

        switch(c){
            case '+':
                System.out.println("enter a value:");
                a=sc.nextInt();
                System.out.println("enter b value:");
                b=sc.nextInt();
                System.out.println("sum="+(a+b));
                break;

            case '-':
            System.out.println("enter a value:");
                a=sc.nextInt();
                System.out.println("enter b value:");
                b=sc.nextInt();
                System.out.println("sub=" +(a-b));
                break;

            case '/':
            System.out.println("enter a value:");
                a=sc.nextInt();
                System.out.println("enter b value:");
                b=sc.nextInt();
                System.out.println("division="+(a/b));
                break;

            case '*':
            System.out.println("enter a value:");
                a=sc.nextInt();
                System.out.println("enter b value:");
                b=sc.nextInt();
                System.out.println("multiple="+(a*b));
                break;

            default:
                System.out.println("Please enter valid operator");
        }
    }
}