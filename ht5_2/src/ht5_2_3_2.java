public class ht5_2_3_2 {
    public static void main(String[] args) {

        for (int i = 10; i >= 0; i--) {
            for (int j = 10; j > i; j--) {

                System.out.print("  ");
            }
            for (int j = i-1; j > 0; j--) {
                System.out.print(j + " ");
            }
            for (int j = 0; j < i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
}





