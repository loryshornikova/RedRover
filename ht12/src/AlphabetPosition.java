import java.util.HashMap;
import java.util.Map;

public class AlphabetPosition {
    public static String position(char alphabet) {
        Map<Character, Integer>  charPosition= new HashMap<>();
        for (int i = 1, Character = 'a'; i < 27; i++, Character++) {
            charPosition.put((char) Character, i);
        }
        return "Position of alphabet: " + charPosition.get(alphabet).toString();
    }

    public static void main(String[] args) {
        System.out.println(position('a'));
    }
}
