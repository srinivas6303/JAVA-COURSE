package Collections;

import java.util.LinkedList;

public class LinkedListDemo {//LinkedList        (Allow Duplicate values) (follow insertion Order)
    public static void main(String[] args) {
        LinkedList<Integer> ll=new LinkedList<Integer>();
        ll.add(9);
        ll.add(5);
        ll.add(3);
        ll.add(3);
        ll.addFirst(0);
        ll.addLast(9);
        System.out.println(ll);
        ll.remove(1);
        System.out.println(ll);
       

        System.out.println("Peek");
        System.out.println(ll.peek());
        System.out.println(ll.peekFirst());
        System.out.println(ll.peekLast());
        System.out.println(ll);

        System.out.println("Pop");
        System.out.println(ll.pop());
        System.out.println(ll);

        System.out.println("Push");
        ll.push(100);
        System.out.println(ll);
   
        System.out.println("Poll");
        System.out.println(ll);
        System.out.println(ll.poll());
        System.out.println(ll.pollFirst());
        System.out.println(ll.pollLast());
        System.out.println(ll);

        System.out.println(ll.isEmpty());

    }
    
}
