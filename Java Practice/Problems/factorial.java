public class factorial {
    public static int fact(int num){
        if(num==0){
            return 1;
        }
        else{
            return (num*fact(num-1));
        }
    }
    public static void main(String[] args) {
//        //without using recursion
//        int fact=1;
//        int num=5;
//
//        for(int i=1;i<=num;i++){
//            fact=fact*i;
//        }
//        System.out.println(fact);

        int res=fact(5);
        System.out.println(res);




    }
}
