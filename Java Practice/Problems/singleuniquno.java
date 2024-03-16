package Problems;
public class singleuniquno {
    public static void main(String args[]){
        int arr[]={1,2,3,4,2,1,3};
        int result=0;

        // XOR ^
        //  1 1   0
        //  0 0   0
        //  1 0   1
        //  0 1   1

        //  0 ^ nonzerono=no zero value
        for(int i=0;i<arr.length;i++){
            result=result ^ arr[i];
        }
        System.out.println(result);
    }
}
