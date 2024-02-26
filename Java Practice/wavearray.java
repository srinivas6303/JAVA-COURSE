import java.util.*;
public class wavearray {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.err.println("enter array size:");
        int l=sc.nextInt();
        int[] arr=new int[l];
        System.out.println("enter Array element are:");// 1 2 3 4 5
       for(int i=0;i<l;i++){
        arr[i]=sc.nextInt();
       }
       System.out.println("Before sorting Array element are:"+Arrays.toString(arr));
    Arrays.sort(arr);
    System.out.println("After sorting Array element are:"+Arrays.toString(arr));
    
    int i=0,j=1;
    while(i<l && j<l){
        int temp=arr[i];
         arr[i]=arr[j];
         arr[j]=temp;
         i=i+2;
         j=j+2;
    } 
   
    
    System.out.println("WAVE ARRAY:"+Arrays.toString(arr));
    sc.close();
    }

}
