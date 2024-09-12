public class prime {
    public static void main(String[] args) {
        //check prime
        int n=5;

        boolean isprime=true;

        if(n<=1) {
            isprime = false;
        }
        else {
            for (int i = 2; i <= n / 2; i++) {
                if (n % i == 0) {
                    isprime = false;
                    break;
                }
            }
        }

        if(isprime){
            System.out.println(n+" is prime");
        }
        else{
            System.out.println(n+" Not a is prime");
        }


//        //prime no's printing
//        int n=50;
//
//        for(int i=2;i<=50;i++){
//            boolean isprime=true;
//            for(int j=2;j<i;j++){
//                if(i%j==0){
//                    isprime=false;
//                    break;
//                }
//            }
//            if(isprime){
//                System.out.print(i+",");
//            }
        }
    }

