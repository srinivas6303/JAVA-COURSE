import java.util.*;
class largestele{
    public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    System.out.print("Enter array size:");
    int l=sc.nextInt();

    int arr[]=new int[l];
    System.out.print("Enter array elements:");
    for(int i=0;i<l;i++){
         arr[i]= sc.nextInt();
    }
    System.out.println("Array elements Before sorting:");
    System.out.println(Arrays.toString(arr));

    Arrays.sort(arr);
    System.out.println("Array elements After sorting:");
    System.out.println(Arrays.toString(arr));


    System.out.println("Array 2nd largest elements:"+arr[arr.length-2]);
    sc.close();
 }
}