import java.util.Arrays;
 //Sentance reversing

//public class ReverseString {
//    static void reverse(String str) {
//        System.out.println("Original String: " + str);
//        String[] strarr = str.split(" ");
//        String rev = "";
//
//        for (int i = strarr.length - 1; i >= 0; i--) {
//            rev = rev + strarr[i] + " ";
//        }
//
//        System.out.println("Sentance reversed String: " + rev.trim());
//    }
//
//    public static void main(String[] args) {
//        String str = "programming in java";
//        reverse(str);
//    }
//}



public class ReverseString {
    static void reverse(String str) {
        System.out.println("Original String: " + str);
        String[] strarr = str.split(" ");
        String rev = "";

        for (int i = 0; i < strarr.length; i++) {
            for (int j = strarr[i].length() - 1; j >= 0; j--) {
                rev = rev + strarr[i].charAt(j);
            }
            rev = rev + " ";
        }

        System.out.println("Sentence with words reversed: " + rev.trim());
    }

    public static void main(String[] args) {
        String str = "programming in java";
        reverse(str);
    }
}
