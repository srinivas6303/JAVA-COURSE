import java.util.Arrays;

public class sort {
    public void sorting(int arr[]){
        System.out.println("before sort:"+ Arrays.toString(arr));
        int n=arr.length;
        for (int i = 0; i < n-1; i++) {
            for (int j = i+1; j < n; j++) {
                if(arr[i]>arr[j]){
                    int temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }

        }
        System.out.println("after sort:"+ Arrays.toString(arr));

    }

    public static void main(String[] args) {
        int arr[]={2,1,6,5,3,4};
        sort s=new sort();
        s.sorting(arr);

    }
}
