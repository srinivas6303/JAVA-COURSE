package Collections;
import java.util.*;
public class LinkedHashSetDemo {
    //(Don't allow Duplicate values) (follow insertion Order)
    public static void main(String[] args) {
        LinkedHashSet <Integer> hs=new LinkedHashSet<>();
        hs.add(1);
        hs.add(1);
        hs.add(2);
        hs.add(4);
        hs.add(3);
        System.out.println(hs);
        
        // Iterator<Integer> itr=hs.iterator();
        // while (itr.hasNext()) {
        //     System.out.println(itr.next());
        // }

        // for(int num:hs){
        //     System.out.println(num);
        // }

    }
}

