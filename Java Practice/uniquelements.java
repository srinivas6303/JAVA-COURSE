import java.util.Arrays;
import java.util.HashSet;

public class uniquelements {
    public static void main(String[] args) {
        int arr[]={1,1,2,3,4,3,6};
        System.out.println(Arrays.toString(arr));
        HashSet<Integer> hs=new HashSet<>();
        for(int i:arr){
            hs.add(i);
        }
        System.out.println(hs);
    }
    
}
