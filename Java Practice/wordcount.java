import java.util.Arrays;

public class wordcount {
    public static void main(String[] args) {
        String str="India is not just a country, it is an emotion.";
        System.out.println(str);
        String arr[]=str.split(" ");
        System.out.println(Arrays.toString(arr));
        System.out.println("Total words in String is:"+arr.length);

    }
    
}
