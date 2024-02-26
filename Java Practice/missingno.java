
/*
public class missingno {
    static int fun(int arr[]){
        int n=arr.length+1;//4+1=5
        int sum=(n*(n+1)/2);//30/2=15
        for(int i=0;i<arr.length;i++){
            sum=sum-arr[i];
        }
        return sum;
    }
    public static void main(String args[]){
        int arr[]={1,2,3,5};//15
        System.out.println(fun(arr));
    }
}*/

import java.util.*;
public class missingno {
public static void main(String[] args) {
    int arr[]={1,2,4,5};
    Arrays.sort(arr);
    System.out.println("Array after sorting"+Arrays.toString(arr));
    int first=arr[0];
    int last=arr[arr.length-1];
     
    int sum1=0;
    int sum2=0;
    for(int i=0;i<arr.length;i++){
         sum1=sum1+arr[i];
    }
    for(int i=first;i<=last;i++){
        sum2=sum2+i;
    }

    
    int missno=sum2-sum1;
    System.out.println(missno);

}
    
}
