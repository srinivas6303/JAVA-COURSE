package Problems;


// public class palindrome {
//     static void pali(int num){
//         int reverse=0;
//         int rem;
//         int temp=num;
//         while(temp!=0){
//             rem=temp%10;
//             reverse=reverse*10+rem;
//             temp=temp/10;
//         }
//         if(reverse==num){
//             System.out.println("Given no is a palindrome");
//         }
//         else{
//             System.out.println("Given no is not a palindrome");
//         }
        
//     }
//     public static void main(String[] args) {
//         pali(111);
//     }
    
// }







// public class palindrome {

// 	public static void main(String[] args) {
		
// 		String s = "mada";
// 		String rev = "";
// 		for (int i = s.length()-1; i >=0 ; i--) 
// 			rev=rev+s.charAt(i);
// 		if(s.equals(rev))
// 			System.out.println("String is palindrome");
// 		else 
// 			System.out.println("String is not palindrome");

// 	}

// }



//String buffer or builder

class palindrome{
    public static void main(String args[]){
        String str="madam";
        StringBuffer s=new StringBuffer(str);
        s.reverse();
        String revstr=s.toString();
        if(str.equals(revstr)){
            System.out.println("Palindrome");
        }
        else{
            System.out.println("Not Palindrome");

        }
    

    }
}
