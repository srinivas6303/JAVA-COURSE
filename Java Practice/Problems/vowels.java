import java.util.Arrays;

class Vowels {
    public static void main(String[] args) {
        // a e i o u
        String s1 = "programming in java";
        System.out.println("Original Strig : "+s1);

        String[] words = s1.split(" ");
        System.out.println("ArrayofString : "+Arrays.toString(words));

        for (int i = 0; i < words.length; i++) {
            if (words[i].length() % 2 != 0) {
                words[i] = replaceVowels(words[i]);
            } else {
                words[i] = replaceWithPreviousChars(words[i]);
            }
        }
        System.out.println("Final Output : "+String.join(" ", words));
    }

    public static String replaceVowels(String word) {
        StringBuilder newWord = new StringBuilder();
        for (char c : word.toCharArray()) {
            switch (c) {
                case 'a':
                    newWord.append('e');
                    break;
                case 'e':
                    newWord.append('i');
                    break;
                case 'i':
                    newWord.append('o');
                    break;
                case 'o':
                    newWord.append('u');
                    break;
                case 'u':
                    newWord.append('a');
                    break;
                default:
                    newWord.append(c);
                    break;
            }
        }
        return newWord.toString();
    }

    private static String replaceWithPreviousChars(String word) {
        StringBuilder newWord = new StringBuilder();
        for (char c : word.toCharArray()) {
            if (c == 'a') {
                newWord.append('z');
            } else {
                newWord.append((char) (c - 1));
            }
        }
        return newWord.toString();
    }
}