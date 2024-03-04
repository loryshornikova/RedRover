public class ht5_4 {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9};

        double sum =0;
        for (int i = 0; i < array.length; i++) {
            sum+=array[i];

        }
        //double average = sum/ array.length;
        System.out.println(sum/ array.length);
    }
}
