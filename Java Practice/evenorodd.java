public class evenorodd {
    public static void main( String args[]){
        // //With using module operator
        // int n=5;
        // String eo=(n%2==0)?"even":"odd";
        // System.out.println(eo);

        //With using module operator
        int n=3;
        if((n&1)==0){
            System.out.println("even");
        }
        else{
            System.out.println("odd");
        }


    }
    
}
