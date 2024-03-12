import java.util.stream.IntStream;

public class Sum {
    public static int arrayPlusArray(int[] arr1, int[] arr2) {
//        int sum = 0;
//        for (int i = 0; i < arr1.length; i++) {
//           sum+= arr1[i] + arr2[i];
//        }
//        return sum;
//    }
        return IntStream.of(arr1).sum() + IntStream.of(arr2).sum();
    }

    public static void main(String[] args) {
        System.out.println(arrayPlusArray(new int[]{1,2,3}, new int[]{4,5,6}));
    }
}
