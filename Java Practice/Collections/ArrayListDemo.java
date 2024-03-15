package Collections;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class ArrayListDemo {
    public static void main(String[] args) {

//PROGRAM-1(add,get,set)
        // ArrayList A=new ArrayList();//ArrayList<Integer> A=new ArrayList<>();
        // A.add(999);
        // A.add("Srinivas");
        // A.add(4.99);
        // A.add(true);


        // System.out.println(A);    //[999, Srinivas, 4.99, true]
        // System.out.println(A.get(1));//Srinivas
       
        // A.add(1,"Praveen");
        // System.out.println(A);  //[999, Praveen, Srinivas, 4.99, true]

        // A.set(1,"Madhav");
        // System.out.println(A);  //[999, Madhav, Srinivas, 4.99, true]



//PROGRAM-2(sort)
        // ArrayList<Integer> A = new ArrayList<>();
        // A.add(90);
        // A.add(70);
        // A.add(85);
        // A.add(40);
        
        // System.out.println("Before Sorting:");
        // System.out.println(A);

        // System.out.println("After Sorting(Ascending Order):");
        // Collections.sort(A);
        // System.out.println(A);
        
        // System.out.println("Descending order:");
        // Collections.reverse(A);
        // System.out.println(A);


//PROGRAM-3(addAll)
        ArrayList<String> fruits = new ArrayList<>();
        fruits .add("Banana");
        fruits .add("Grapes");
        System.out.println("fruits");
        System.out.println(fruits);


        ArrayList<String> veg = new ArrayList<>();
        veg .add("Tomato");
        veg .add("Potato");
        System.out.println("veg");
        System.out.println(veg);


        ArrayList<String> food = new ArrayList<>();
        food.addAll(fruits);
        food.addAll(veg);
        System.out.println("food");
        System.out.println(food);



    }
}
