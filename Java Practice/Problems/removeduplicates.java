import java.util.Arrays;
import java.util.HashSet;

public class removeduplicates {
    public static void main(String[] args) {
        int arr[]={1,2,1,2,3,4,5,6,2};
        System.out.println("Before removing duplicates : "+Arrays.toString(arr));

        HashSet<Integer> hs=new HashSet<>();
        for(int i=0;i<arr.length;i++){
            hs.add(arr[i]);
        }
        System.out.println("hashset values : "+hs);


        int index=0;
        int newarr[]=new int[arr.length];
        for(int n : hs){
            newarr[index]=n;
            index++;
        }
        System.out.println("After removing duplicates : "+Arrays.toString(newarr));

    }
}
