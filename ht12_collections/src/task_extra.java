import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class task_extra {
    public static Map<Character, String> findLongestWordsByFirstLetter(List<String> initialList) {

        Map<Character, String> result = new HashMap<>();
        for(String word: initialList) {
            char firstLetter = word.charAt(0);
            String currentLongestWord = result.get(firstLetter);
            if(currentLongestWord == null || word.length() > currentLongestWord.length()) {
            result.put(firstLetter, word);
            }
        }
        return result;

    }

    public static void main(String[] args) {
        System.out.println(findLongestWordsByFirstLetter(new ArrayList<>(List.of("script", "lose", "party", "telephone", "integrity",
                "language", "panic", "compromise", "swop", "sweat", "incapable", "lame", "brand", "adventure", "go", "mill", "aisle",
                "pack", "population", "tribute", "climate", "bar", "intensify", "window", "mobile", "even", "irony",
                "memorial", "abandon", "piece"))));
    }
}