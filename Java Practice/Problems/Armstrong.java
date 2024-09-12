import java.util.*;
class Armstrong {
    //1 pow 3=1
    //153->  1^3=3 + 5^3=125  + 3^3=27 =153

    public static void main(String[] args) {

        int n=45;
        int temp=n;
        int sum=0;

        while(n!=0){
            int r=n%10;
            int eachqube=(int)Math.pow(r,3);
            sum=sum+eachqube;
            n=n/10;
        }
        if(temp==sum){
            System.out.println("armstrong");
        }
        else{
            System.out.println("not armstrong");
        }
    }
}