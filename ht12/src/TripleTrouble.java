import java.util.ArrayList;
import java.util.List;

public class TripleTrouble {
    public static String tripleTrouble(String one, String two, String three) {
        List<String> myList = new ArrayList<String>();
        for (int i = 0; i < one.length(); i++) {

            myList.add("" + one.charAt(i) + two.charAt(i) + three.charAt(i));
        }
        return String.join("", myList);
    }

    public static void main(String[] args) {
        System.out.println(tripleTrouble("Bm", "aa", "tn"));
    }
}
