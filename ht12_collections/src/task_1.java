
import java.util.ArrayList;

import java.util.List;

public class task_1 {
    public static String removeColorsWithL(List<String> listOfStrings) {
        List<String> result = new ArrayList<>();
            for (int i = 0; i < listOfStrings.size(); i++) {
            if(!listOfStrings.get(i).contains("l")) {
              result.add(listOfStrings.get(i));
            }
        }
            return result.toString();
    }

    public static void main(String[] args) {

        System.out.println(removeColorsWithL(new ArrayList<>
                (List.of("White", "Tan", "Yellow", "Orange", "Red", "Pink", "Purple", "Blue"))));
    }

    }
