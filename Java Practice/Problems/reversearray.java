import java.util.Arrays;

public class reversearray {
    public static void main(String[] args) {
        //using extra array
//        int arr1[]={1,2,3,4};
//        int n=arr1.length;
//        int[] arr2=new int[n];
//
//        for (int i = 0; i < n; i++) {
//            arr2[i]=arr1[n-1-i];
//        }
//        System.out.println(Arrays.toString(arr2));


        //without using extra array
        int arr1[]={1,2,3,4};
        int n=arr1.length;


        for (int i = 0; i < n/2; i++) {
            int temp=arr1[i];
            arr1[i]=arr1[n-1-i];
            arr1[n-1-i]=temp;
        }
        System.out.println(Arrays.toString(arr1));

    }
}
