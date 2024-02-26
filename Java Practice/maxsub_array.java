public class maxsub_array {
    static int maxsum(int arr[])
    {
       int currentsum=0;
       int maxsum=0;
       for(int i=0;i<arr.length;i++){
        if(arr[i] > currentsum+arr[i])
        currentsum=arr[i];
        else{
            currentsum+=arr[i];
        }
        if(maxsum<currentsum){
            maxsum=currentsum;
        }

       }
       return maxsum;
     
      
    
    }
    public static void main(String[] args) {
        int arr[]={-6,4,5,6,-8,9,-2};
        System.out.println(maxsum(arr));


    }
    
}
