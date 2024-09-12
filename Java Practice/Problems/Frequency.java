import java.util.HashMap;

class Frequency {
    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 1, 2, 3, 1, 2, 3, 4};
        int n = arr.length;
        int freq[] = new int[n];

        int visited = -1;

        // Count frequency of each element
        for (int i = 0; i < n; i++) {
            if (freq[i] == visited) {
                continue; // Skip if already visited
            }
            int count = 1;
            for (int j = i + 1; j < n; j++) {
                if (arr[i] == arr[j]) {
                    count++;
                    freq[j] = visited; // Mark element as visited
                }
            }
            freq[i] = count; // Set frequency of the current element
        }

        // Print frequency of each element
        for (int i = 0; i < n; i++) {
            if (freq[i] != visited) {
                System.out.println(arr[i] + " -> " + freq[i]);
            }
        }
    }
}


//or

//import java.util.HashMap;
//class Frequency {
//    public static void main(String[] args) {
//        int arr[]={1,2,3,1,2,3,4};
//        HashMap<Integer,Integer> hs=new HashMap<>();
//
//        for(int i=0;i<arr.length;i++){
//            if(hs.containsKey(arr[i])){
//                int value=hs.get(arr[i]);
//                hs.put(arr[i],value+1);
//            }
//            else{
//                hs.put(arr[i],1);
//            }
//        }
//
//        for(int x:hs.keySet()){
//            System.out.println(x+"->"+hs.get(x));
//        }
//
//    }
//}
