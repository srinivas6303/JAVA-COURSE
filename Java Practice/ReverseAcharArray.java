import java.util.*;
public class ReverseAcharArray {
    public static void main(String[] args) {

    //       collection.reverse()
    //     Character ch[]={'h','e','l','l','o'};
    //      System.out.println(Arrays.asList(ch));
    //      Collections.reverse(Arrays.asList(ch));
    //    System.out.print(Arrays.asList(ch));



    //   //2 pointer technique
    //  char ch[]={'s','r','i','n','u'};
    //  System.out.println(Arrays.toString(ch));

    //  int left=0;
    //  int right=ch.length-1;
    // char temp; 
    //  while(left<right){
    //     temp=ch[left];
    //     ch[left]=ch[right];
    //     ch[right]=temp;
    //     left++;
    //     right--;
    //  }
    //  System.out.println(Arrays.toString(ch));


     int arr[]={1,2,3,4,5};
     System.out.println(Arrays.toString(arr));
     int temp=0;
     int i=0,j=arr.length-1;
     while(i<j){
         temp=arr[i];
         arr[i]=arr[j];
         arr[j]=temp;
         i++;
         j--;
     }
     System.out.println(Arrays.toString(arr));


    }   
    
}
