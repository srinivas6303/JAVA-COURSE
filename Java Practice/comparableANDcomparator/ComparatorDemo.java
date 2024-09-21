package comparableANDcomparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ComparatorDemo {
    //"Comparator is used to compare two objects in a collection; it is for defining your own way of sorting."
    public static void main(String[] args) {
        List<Integer> list=new ArrayList<>();
        list.add(302);
        list.add(204);
        list.add(101);
        //sorting based on last digit of number 101,302,204
        // Collections.sort(list,new Comparator<Integer>() {
        //     @Override
        //     public int compare(Integer i,Integer j){
        //         if(i%10 > j%10){
        //             return 1;
        //         }
        //         else if(i%10 < j%10){
        //             return -1;

        //         }
        //         else{
        //             return 0;
        //         }
        //     }
            
        // });

        Collections.sort(list,(i,j) -> (i%10 > j%10) ? 1 : (i%10 < j%10) ? -1 :0);
            
        System.out.print(list);
        
    }
    
}
