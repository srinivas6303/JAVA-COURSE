public class stringevennosum {
    public static void main(String[] args) {
        String str="123";
        int sum=0;
        for (int i = 0; i < str.length(); i++) {

            int a = Integer.parseInt(String.valueOf(str.charAt(i)));
             if(a%2!=0){
                 sum=sum+a;
             }

        }
        System.out.println(sum);
    }
}
