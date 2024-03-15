package Collections;

import java.util.*;
public class IteratorDemo {
    public static void main(String... args){
        LinkedList<Integer> ll=new LinkedList<Integer>();
        ll.add(10);
        ll.add(20);
        ll.add(30);
        ll.add(40);
        System.out.println(ll);
        System.out.println("-------------------");

        Iterator<Integer> itr = ll.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }


        System.out.println("-------------------");

        for(int num:ll){
            System.out.println(num);

        }
    }
}
