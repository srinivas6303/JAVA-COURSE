package Collections;

import java.util.ArrayList;
import java.util.Scanner;

public class userinput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        ArrayList<Integer> al = new ArrayList<>();
        System.out.println("Enter numbers (enter any non-integer value to stop):");
        while (sc.hasNextInt()) { // Check if the next token is an integer
            int num = sc.nextInt();
            al.add(num);
        }

        System.out.println("Entered numbers:");
        System.out.println(al);

        sc.close(); // Close the scanner to release system resources
    }
}
