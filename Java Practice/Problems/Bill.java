package Problems;
import java.util.*;
public class Bill{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int totalSum = 0;
        int billAmount;

        System.out.println("Enter the bill amount or -1 to exit: ");
        billAmount = input.nextInt();

        while (billAmount != -1) {
            totalSum =totalSum+ billAmount;
            System.out.println("Enter the next bill amount or -1 to exit: ");
            billAmount = input.nextInt();
        }

        System.out.println("The total sum of the bills is: " + totalSum);
        input.close();
    }
}

