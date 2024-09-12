import java.util.Arrays;

public class swapping {
    public static void main(String[] args) {
        int arr[]={4,3,2,1};
        System.out.println("Before Sorting:"+ Arrays.toString(arr));
        for(int i=0;i< arr.length;i++){
            for(int j=i+1;j< arr.length;j++){
                if(arr[i]>arr[j]){
                    int temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
        }
        System.out.println("After Sorting:"+ Arrays.toString(arr));
    }
}
