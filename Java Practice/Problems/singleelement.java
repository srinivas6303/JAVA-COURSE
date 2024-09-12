import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;

public class singleelement {
    public static void main(String[] args) {
        int arr[]={1,2,6,3,2,1,6};

        HashMap<Integer,Integer> hm=new HashMap<>();

        for (int i = 0; i < arr.length; i++) {
           if(hm.containsKey(arr[i])){
               int value= hm.get(arr[i]);
               hm.put(arr[i],value+1);
           }
           else{
               hm.put(arr[i],1);
           }
        }


        for(int x: hm.keySet()){
            System.out.println(x+"->"+hm.get(x));
        }

        for(int x: hm.keySet()){
            if(hm.get(x)==1){
                System.out.println("single element:"+ x);
            }

        }
//                Arrays.sort(arr);
//                for (int i = 0; i < arr.length; i++) {
//                    if ((i == arr.length - 1 || arr[i] != arr[i + 1]) && (i == 0 || arr[i] != arr[i - 1])) {
//                        System.out.println("The single element is: " + arr[i]);
//                        break;
//                    }
//
//                }




    }
}
