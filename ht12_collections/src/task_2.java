import java.util.ArrayList;
import java.util.List;


public class task_2 {

    public static List<Integer> createListOfIntegers(int begin, int end) {
        List<Integer> result = new ArrayList<>();
        for (int i = begin; i <= end; i++) {
            result.add(i);

        }
        return result;
    }
    public static List<Integer> removeEvenElements(List<Integer> initialList) {

        for (int i = 0; i < initialList.size(); i++) {
            if(initialList.get(i) % 2 == 0) {
                initialList.remove(initialList.get(i));
            }
        }
        return initialList;
    }

    public static void main(String[] args) {
        System.out.println(removeEvenElements(createListOfIntegers(100, 1000)));
    }
}