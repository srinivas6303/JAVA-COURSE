package Collections;

import java.util.TreeSet;

public class TreeSetDemo {
    //(Don't Allow Duplicate values) (Don't follow insertion Order)
    public static void main(String[] args) {
        TreeSet<Integer> ts=new TreeSet<Integer>();
        ts.add(6);
        ts.add(2);
        ts.add(12);
        ts.add(12);
        ts.add(4);
        ts.add(5);
        System.out.println(ts);
    }
}
