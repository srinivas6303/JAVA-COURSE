package Problems;
import java.util.Arrays;

public class wordcount {
    public static void main(String[] args) {
        // String str="India is not just a country, it is an emotion.";
        // System.out.println(str);
        // String arr[]=str.split(" ");
        // System.out.println(Arrays.toString(arr));
        // System.out.println("Total words in a String is:"+arr.length);

        String str="India is not just a country, it is an emotion.";
        System.out.println(str);
        str=str+" ";
        int count=0;
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)==' '){
                count+=1;
            }
           
        }
        System.out.println("Total words in a String is:"+count);
    }
    
}
