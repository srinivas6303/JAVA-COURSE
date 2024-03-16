package Problems;
import java.util.HashMap;

public class FrequencyOfCharacter {
    public static void main(String[] args) {
        String str = "Srinivas";
        str = str.toUpperCase();
        HashMap<Character, Integer> map = new HashMap<>();

        for (char ch : str.toCharArray()) {
            if (map.get(ch) == null) {
                map.put(ch, 1);
            } else {
                map.put(ch, map.get(ch) + 1);
            }
        }

        System.out.println("Occurrences of each character in the string: ");
        for (Character c : map.keySet()) {
            System.out.println(c + " : " + map.get(c));
        }
    }
}