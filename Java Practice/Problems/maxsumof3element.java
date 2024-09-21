

class maxsumof3element {
    public static void main(String[] args) {
        // //O(n^2)
        // int arr[]={5,9,1,8,7};
        // int n=arr.length;
        // int sl=3;
        // int maxx=0;
        // int sum=0;
        
        // for(int i=0;i<=n-sl;i++){
        //     sum=0;
        //     for(int j=i;j<sl+i;j++){
        //         sum+=arr[j];
        //     }
        //     maxx=Math.max(maxx,sum);
        // }
        
        // System.out.println(maxx);

        //O(n) slidding window
        
        int arr[]={5,9,1,8,7};
        int n=arr.length;
        int sl=3;
        int maxx=0;
        int sum=0;
        int l=0;
        
        for(int r=0;r<n;r++){
            sum=sum+arr[r];
            if(r-l==sl){
                sum=sum-arr[l];
                l++;

            }

            if(r-l+1==sl){
                maxx=Math.max(maxx,sum);

            }
            

        }
        
        System.out.println(maxx);
    }
}