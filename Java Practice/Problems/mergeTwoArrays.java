package Problems;
import java.util.*;

public class mergeTwoArrays {
    public static void main(String[] args) {


        //unsorted array using arraycopy() method
    //     int arr1[] = {1, 6, 3, 4};
    //     int arr2[] = {5, 2, 7, 8};
    //     int l = arr1.length;
    //     int ll = arr2.length;
    //     int size = l + ll;
    //     int result[] = new int[size];

    //     System.arraycopy(arr1, 0, result, 0, l);
    //     System.arraycopy(arr2, 0, result, l, ll);
    //    // Arrays.sort(result); //after merging two array performing sort method
    //     System.out.println(Arrays.toString(result));



        //sorting 2 array and merging

                int arr1[] = {1, 6, 3, 4};
                 Arrays.sort(arr1);
                int arr2[] = {5, 2, 7, 8};
                Arrays.sort(arr2);
                int l = arr1.length;
                int ll = arr2.length;
                int size = l + ll;
                int result[] = new int[size];
        
                int i = 0, j = 0, k = 0;
                while (i < l && j < ll) {
                    if (arr1[i] < arr2[j]) {
                        result[k] = arr1[i];
                        i++;
                    } else {
                        result[k] = arr2[j];
                        j++;
                    }
                    k++;
                }
        
                while (i < l) {
                    result[k] = arr1[i];
                    i++;
                    k++;
                }
        
                while (j < ll) {
                    result[k] = arr2[j];
                    j++;
                    k++;
                }
        
                System.out.println(Arrays.toString(result));
            }
        }
    
        
    