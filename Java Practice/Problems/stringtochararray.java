package Problems;
import java.util.*;

public class stringtochararray {
    //string to char
    public static void main(String[] args) {
        String str = "java";
        char charArray[]=str.toCharArray();
        // char[] charArray = new char[str.length()]; 
        // for(int i = 0; i < str.length(); i++){
        //     charArray[i] = str.charAt(i);
        // }
        System.out.println(Arrays.toString(charArray));



    //char to string
    char cr[]={'b','a','b','y'};
    String s=new String(cr);
    System.err.println(s);
   
    

    }
}