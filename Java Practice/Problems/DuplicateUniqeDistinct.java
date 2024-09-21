import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;

public class DuplicateUniqeDistinct {

    //COLLECTIONS
    //Duplicates elements
    public static void Duplicates(int arr[]) {
        HashMap < Integer, Integer > hm = new HashMap < > ();

        for (int i = 0; i < arr.length; i++) {
            if (hm.containsKey(arr[i])) {
                hm.put(arr[i], hm.get(arr[i]) + 1);
            } else {
                hm.put(arr[i], 1);
            }

        }


        // for(int x: hm.keySet()){
        //     System.out.println(x+"->"+hm.get(x));
        // }


        System.out.println("DUPLICATES");
        for (int i: hm.keySet()) {
            if (hm.get(i) > 1) {
                System.out.println(i);
            }
        }
    }


    //uniqe elements
    public static void Uniqe(int arr[]) {
        HashMap < Integer, Integer > hm = new HashMap < > ();

        for (int i = 0; i < arr.length; i++) {
            if (hm.containsKey(arr[i])) {
                hm.put(arr[i], hm.get(arr[i]) + 1);
            } else {
                hm.put(arr[i], 1);
            }

        }


        //    for(int x: hm.keySet()){
        //        System.out.println(x+"->"+hm.get(x));
        //    }


        System.out.println("UNIQUES");
        for (int i: hm.keySet()) {
            if (hm.get(i) == 1) {
                System.out.println(i);
            }
        }
    }


    //uniqe elements
    public static void Distinct(int arr[]) {
        HashSet < Integer > hs = new HashSet < > ();

        for (int i = 0; i < arr.length; i++) {
            hs.add(arr[i]);
        }



        System.out.println("DISTINCT");
        for (int x: hs) {
            System.out.println(x);
        }
    }





        //BRUTE FORCE METHODS
        //Duplicates
        public static void duplicates(int arr[]) {
            System.out.println("DUPLICATES");
            int n = arr.length;
            for (int i = 0; i < n - 1; i++) {
                for (int j = i + 1; j < n; j++) {
                    if (arr[i] == arr[j] && arr[i] != -1) {
                        System.out.println(arr[i]);
                        arr[j] = -1;
                        break;
                    }

                }
            }
        }


        //Uniqes
        public static void unique(int arr[]) {
            System.out.println("UNIQES");
            int n = arr.length;

            for (int i = 0; i < n ; i++) {
                int count=0;

                for (int j = 0; j < n; j++) {
                    if (arr[i] == arr[j]) {
                        count++;
                    }
                }
                if(count==1){
                    System.out.println(arr[i]);
                }

            }

            //single unique element
        //     int ans=0;
        //     for(int i=0;i<n;i++){
        //         ans = ans ^ arr[i];
                
        //     }
        //     System.out.println(ans);
            
         }


        //DISTINCT
        public static void distinct(int arr[]) {
            System.out.println("DISTINCT");
            Arrays.sort(arr); 
            int n = arr.length;
            
            for (int i = 0; i < n - 1; i++) {
                if (arr[i] != arr[i + 1]) { 
                    System.out.println(arr[i]);
                }
            }
            System.out.println(arr[n - 1]); 
        }
        
    






    public static void main(String[] args) {
        int arr[] = {
            1,
            2,
            3,
            1,
            2,
            3,
            4,
            5
        };

        int arr1[] = {
            1,
            2,
            3,
            1,
            2,
            3,
            4,
            5
        };

        int arr2[] = {1,2,3,1,2};
        
        System.out.println("Array elements:");
        System.out.println(Arrays.toString(arr));
        //collections methods
        Duplicates(arr);
        Uniqe(arr);
        Distinct(arr);
        System.out.println("----------------------");
        //brute force methods
        duplicates(arr);
        unique(arr1);
        distinct(arr1);
        


    }

}