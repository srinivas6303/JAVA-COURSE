import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;

public class Accenture {
    //problem 1
//    public static String replacechar(String str){
//        int n=str.length();
//        Scanner scanner=new Scanner(System.in);
//        System.out.println("enter ch1:");
//        char ch1=scanner.next().charAt(0);
//        System.out.println("enter ch2:");
//        char ch2=scanner.next().charAt(0);
//
//        StringBuilder newstring=new StringBuilder();
//
//        for (int i = 0; i < n -1; i++) {
//            if(str.charAt(i)==ch1){
//                newstring.append(ch2);
//            }
//            else if(str.charAt(i)==ch2){
//                newstring.append(ch1);
//            }
//            else{
//                newstring.append(str.charAt(i));
//            }
//
//        }
//
//        return newstring.toString();
//    }
//
//    public static void main(String[] args) {
//        Scanner scanner=new Scanner(System.in);
//        System.out.println("Enter string");
//        String str=scanner.next();
//        System.out.println(replacechar(str));
//
//    }

    //problem 2
//    public static int max(int arr[]){
//        int n=arr.length;
//        Arrays.sort(arr);
//        int maximun=arr[n-1];
//        int secondmaxelement=arr[0];
//
//        for (int i = 1; i < arr.length ; i++) {
//            if(arr[i]>secondmaxelement && arr[i]!=maximun){
//                secondmaxelement=arr[i];
//            }
//        }
//
//        int count=0;
//        for (int i = 0; i < arr.length; i++) {
//            if(secondmaxelement==arr[i]){
//                count++;
//            }
//
//        }
//        return  count;
//    }
//
//    public static void main(String[] args) {
//       int arr[]={1,2,3,4,4,4,4,5,5,5};
//        System.out.println(max(arr));
//    }


    public static int max(int arr[]){
        int n=arr.length;
        HashSet<Integer> hs=new HashSet<>();

        for(int i=0;i<n;i++){
          hs.add(arr[i]);
        }
        Integer[] uniquearray=hs.toArray(new Integer[0]);
        int l=uniquearray.length;

        Arrays.sort(uniquearray);



        int secondmaxelement=uniquearray[l-2];



        int count=0;
        for (int i = 0; i < arr.length; i++) {
            if(secondmaxelement==arr[i]){
                count++;
            }

        }
        return  count;
    }

    public static void main(String[] args) {
        int arr[]={1,2,3,4,4,4,5,5,5};
        System.out.println(max(arr));
    }
}
