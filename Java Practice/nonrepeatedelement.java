import java.util.Arrays;

public class nonrepeatedelement {
    public static void main(String[] args) {
        int arr[] = {1, 1, 2, 3, 4, 3, 6};
        System.out.println(Arrays.toString(arr));

        boolean isUnique;

        for (int i = 0; i < arr.length; i++) {
            isUnique = true;

            for (int j = 0; j < arr.length; j++) {
                if (i != j && arr[i] == arr[j]) {
                    isUnique = false;
                    break;  // Enclose the break statement in curly braces
                }
            }
            if (isUnique) {
                System.out.print(arr[i] + " ");
            }
        }
    }
} 
    

