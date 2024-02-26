import java.util.Arrays;
import java.util.Scanner;

public class lowest2index{
    public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    System.out.print("Enter array size:");
    int l=sc.nextInt();

    int arr[]=new int[l];
    System.out.print("Enter array elements:");
    for(int i=0;i<l;i++){
         arr[i]= sc.nextInt();
    }

    int[] arr2=new int[l];
    for(int i=0;i<l;i++){
        arr2[i]= arr[i];
   }
    System.out.println("arr elements:"+Arrays.toString(arr));
    System.out.println("arr2 elements:"+Arrays.toString(arr));

     Arrays.sort(arr2);
    System.out.println("arr2  elements After sorting:"+Arrays.toString(arr2));
    int ele=arr2[1];

   System.out.println(ele);

   for(int i=0;i<l;i++){
    if(arr[i]==ele){
        System.out.println("index of 2nd loewst element in array:"+i);
        System.out.println("position of 2nd loewst element in array:"+(i+1));
        
    }
   }
   sc.close();
 }
}
    

