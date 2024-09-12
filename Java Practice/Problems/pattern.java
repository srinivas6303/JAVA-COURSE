class pattern {
    public static void main(String[] args) {
        int n = 5;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i == 0 || j == 0 || i == n - 1 || j == n - 1) {
                    System.out.print(" * ");
                } else {
                    System.out.print("   ");
                }
            }
            System.out.println();
        }
    }
}




//class pattern {
//    public static void main(String[] args) {
//        int count=1;
//        for (int i = 1; i <= 4; i++) {
//            for (int j = 1; j <= i ; j++) {
//                System.out.print(count+" ");
//                count++;
//            }
//            System.out.println();
//        }
//    }
//}
