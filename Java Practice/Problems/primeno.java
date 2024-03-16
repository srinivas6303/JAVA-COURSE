package Problems;
//checking prime no or not
// public class primeno {
//     static void check(int n){
//         int flag=0;
//          
//         if(n==0 || n==1){
//             System.out.println(+n+" is not a prime no");
//         }
//         else{
//             for(int i=2;i<n/2;i++){
//                 if(n%i==0){
//                 System.out.println(+n+" is not a prime no");
//                 flag=1;
//                 break;
//                 }
//             }
//             if(flag==0){
//                 System.out.println(+n+" is a prime no");
//             }
//         }
//     }

//     public static void main(String[] args) {
//         check(2);
//         check(20);
//     }
    
// }



//printing prime no's
public class primeno
 {
   public static void main (String[]args)
   {

     int lower = 1, upper = 20;


     for (int i = lower; i <= upper; i++)
       if (isPrime (i))
        System.out.println (i);
   }

   static boolean isPrime (int n)
   {
   // 0, 1 negative numbers are not prime
     if (n < 2)
       return false;

     // checking the number of divisors b/w 1 and the number n-1
     for (int i = 2; i < n; i++)
       {
     if (n % i == 0)
        return false;
       }

     // if reached here then must be true
     return true;
   }
 }


