package Collections;

import java.util.ArrayDeque;

public class ArrayDequeDemo {   //addFirst(),addLast(),removeFirst(),etc...
    public static void main(String[] args) {
        ArrayDeque<Integer> ad=new ArrayDeque<Integer>();
        ad.add(30);
        ad.add(10);
        ad.add(20);
        System.out.println(ad);

        ad.addFirst(100);
        System.out.println("After addFirst");
        System.out.println(ad);
        
        
        ad.addLast(200);
        System.out.println("After addLast");
        System.out.println(ad);
    }
}
