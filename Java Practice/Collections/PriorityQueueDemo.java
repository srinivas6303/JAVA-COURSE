package Collections;

import java.util.PriorityQueue;

public class PriorityQueueDemo {
    public static void main(String[] args) {//PriorityQueue     (Allow Duplicate values) (Don't follow insertion Order)
        PriorityQueue<Integer> q=new PriorityQueue<Integer>();
        q.add(5);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);
        q.add(1);
        System.out.println("PriorityQueue Elements are:"+q);//index[0] always small number
        System.out.println(q.contains(5));

    }
}
