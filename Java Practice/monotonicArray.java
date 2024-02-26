import java.util.*;

public class monotonicArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter array length: ");
        int l = sc.nextInt();
        int arr[] = new int[l];
        System.out.println("Enter array elements: ");
        for (int i = 0; i < l; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Elements are: " + Arrays.toString(arr));

        boolean isAscending = true;
        boolean isDescending = true;
        
        for (int x = 0; x < l - 1; x++) {
            if (arr[x] > arr[x + 1]) {
                isAscending = false;
            } else if (arr[x] < arr[x + 1]) {
                isDescending = false;
            }
        }

        if (isAscending) {
            System.out.println("Array is in ascending order (monotonic).");
        } else if (isDescending) {
            System.out.println("Array is in descending order (monotonic).");
        } else {
            System.out.println("Array is not monotonic.");
        }

        sc.close();
    }
}