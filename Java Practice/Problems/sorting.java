package Problems;
import java.util.*;
public class sorting {
    public static void main(String[] args) {
        int arr[]={3,2,5,7,6};
        System.out.println("Before sorting:"+Arrays.toString(arr));
        int temp;
        for (int i= 0;i< arr.length;i++) {
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]>arr[j]){
                    temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
 
                }
            }
            
        }
        System.out.println("After sorting:"+Arrays.toString(arr));
    }
}
