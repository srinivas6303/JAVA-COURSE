package Problems;
// example 2,2,1 output =1

public class singleelement {
    public static void main(String[] args) {
        int arr[]={2,2,1};
        int single=0;
        for(int i=0;i<arr.length;i++){
           single= arr[i] ^ single;
        }
        System.out.println(single);
    }
}
