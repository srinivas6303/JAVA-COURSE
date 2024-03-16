package Collections;

import java.util.ArrayList;
import java.util.Arrays;

public class ListToArray {
    public static void main(String[] args) {
        ArrayList<Integer> list=new ArrayList<Integer>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        System.out.println("ArrayList Elements are:"+list);

        // Convert List to array
        Integer[] array = new Integer[list.size()];
        list.toArray(array);
        System.out.println("Array Elements are:"+Arrays.toString(array));
    }
}
