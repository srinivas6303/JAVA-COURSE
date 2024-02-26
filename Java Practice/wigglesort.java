import java.util.Arrays;

public class wigglesort {
    static void swap(int arr[],int i,int j){
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
    public static void main(String[] args) {
        int arr[]={1, 2, 3, 4, 5, 6, 7, 8, 9};
        System.out.println("Before Wiggle sort : "+Arrays.toString(arr));

        for(int i=0;i<arr.length-1;i++){
            if((i%2)==0){
                if(arr[i]>arr[i+1]){
                swap(arr,i,i+1);
            }
        }
            else{
                if(arr[i]<arr[i+1]){
                    swap(arr,i,i+1);
                }
            }
        }
        System.out.println("After Wiggle sort : "+Arrays.toString(arr));
        
    }
    
}
