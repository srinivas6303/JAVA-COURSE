package Collections;

import java.util.ArrayList;
import java.util.Arrays; // Importing Arrays class statically

public class ArrayelementsToList {
    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 5};
        System.out.println("Array elements: " + Arrays.toString(arr)); // Using Arrays.toString(arr)

        ArrayList<Integer> al = new ArrayList<Integer>();

        for (int num : arr) {
            al.add(num);
        }
        System.out.println("ArrayList elements: " + al);
    }
}
