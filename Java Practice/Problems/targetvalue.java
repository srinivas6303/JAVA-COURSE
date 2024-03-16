package Problems;


class targetvalue {
    static void target(int arr[]) {
        int target = 9;
        
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                int sum = arr[i] + arr[j];
                if (sum == target) {
                    System.out.println(arr[i] + "+" + arr[j] + "=" + sum);
                   
            }
        }
    }
       
    }
    


    public static void main(String args[]) {
        int arr[] = {1, 2, 3, 4, 5, 6};
        target(arr);
    }
}