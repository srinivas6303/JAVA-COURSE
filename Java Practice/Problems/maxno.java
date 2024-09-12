import java.util.Scanner;

public class maxno {
    public static void main(String[] args) {
        //max no
//        int max=0;
//        Scanner sc=new Scanner (System.in);
//        while(true){
//            System.out.print("Enter a no(Enter 0 to exit):");
//            int userinput=sc.nextInt();
//
//            if(userinput==0){
//                break;
//            }
//            if(userinput>max){
//                max=userinput;
//            }
//
//        }
//        System.out.println("Max no:"+max);



        int sum=0;
        Scanner sc=new Scanner (System.in);
        while(true){
            System.out.print("Enter a no(Enter 0 to exit):");
            int userinput=sc.nextInt();

            if(userinput==0){
                break;
            }
            else{
                sum=sum+userinput;
            }

        }
        System.out.println("Total sum:"+sum);
    }
}
