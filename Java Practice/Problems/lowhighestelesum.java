package Problems;
import java.util.*;
public class lowhighestelesum {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter array size:");
        int l=sc.nextInt();
        int arr[]=new int[l];
        System.out.println("enter array elements:");
        for(int i=0;i<l;i++){
             arr[i]=sc.nextInt();
        }
        System.out.print("Array elements before sorting:"+Arrays.toString(arr));
        System.out.println();
        Arrays.sort(arr);
        System.out.println("Array elements After sorting:"+Arrays.toString(arr));
        int low=arr[0];
        int high=arr[arr.length-1];
        System.out.println("low="+low+"high="+high);
        int sum=high+low;
        System.out.println("lowest element and highest element sum="+sum);
        sc.close();
    }
}
