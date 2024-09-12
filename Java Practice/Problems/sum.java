

class sum {
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,6,7};
        int TwoPaircount=0;
        int ThreePaircount=0;
        int target=9;
        //Two Pairs
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                  if(arr[i]+arr[j]==target){
                    TwoPaircount++;
                    System.out.println("("+arr[i]+","+arr[j]+")");
                    }
                    
                }
            }
        
        System.out.println("----------------------------------");
        //thtee Pair
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                for(int k=j+1;k<arr.length;k++){
                    if(arr[i]+arr[j]+arr[k]==target){
                    ThreePaircount++;
                    System.out.println("("+arr[i]+","+arr[j]+","+arr[k]+")");
                    }
                    
                }
            }
        }
        
        System.out.println("Twopairs:"+TwoPaircount);
        System.out.println("Threepairs:"+TwoPaircount);
        System.out.println("Totalpairs:"+(TwoPaircount+ThreePaircount));
        
    }
}