package Collections;
import java.util.*;
public class HashsetDemo {
    //(Don't allow Duplicate values) (Don't follow insertion Order)
    public static void main(String[] args) {
        HashSet<Integer> hs=new HashSet<>();
        hs.add(1);
        hs.add(1);
        hs.add(2);
        hs.add(4);
        hs.add(3);
        System.out.println(hs);
        System.out.println(hs.size());
        Iterator<Integer> itr=hs.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }

        // for(int num:hs){
        //     System.out.println(num);
        // }

    }
}

