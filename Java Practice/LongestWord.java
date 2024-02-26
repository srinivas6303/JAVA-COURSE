public class LongestWord {
    public static void main(String[] args) {
        String str = "I am srinivas";
        str = str + " ";
        String word = "";
        String longword = "";
        String shortword = "";
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (c != ' ') {
                word = word + c;
            } 
            else {
                if (word.length() > longword.length()) {
                    longword = word;
                }
                if (shortword.isEmpty() || word.length() < shortword.length()) {
                    shortword = word;
                }
                word = "";
            }
        }

        System.out.println("Longest word is: " + longword + ", length: " + longword.length());
        System.out.println("Shortest word is: " + shortword + ", length: " + shortword.length());
    }
}
