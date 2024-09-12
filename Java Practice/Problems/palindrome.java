public class palindrome {
    public static void main(String[] args) {
        String s = "aabbaa";
        int n = s.length();
        boolean ispal = true;

        for (int i = 0; i < n / 2; i++) {
            if (s.charAt(i) != s.charAt(n - i - 1)) {
                ispal = false; // Set ispal to false if characters don't match
                break; // Break the loop if not a palindrome
            }
        }

        // Check the result after the loop
        if (ispal) {
            System.out.println("palindrome");
        } else {
            System.out.println("not a palindrome");
        }
    }
}
