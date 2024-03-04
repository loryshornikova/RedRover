public class ht6_2_5 {
    public static int findSmallestInt(int[] args) {
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < args.length; i++) {
            if(args[i] < min) {
                min = args[i];
            }

        }
           return min;
    }


    public static void main(String[] args) {
        int [] arr = {4, 6, 7, -4, 23, 9};
        int min = findSmallestInt(arr);
        System.out.println(min);
    }

    }