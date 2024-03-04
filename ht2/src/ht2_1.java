public class ht2_1 {

    public static void main(String[] args) {
        int a = 205;
        int b = 825;
        int result;

        result = a+b;
        System.out.println("a+b=" + result);
        isEven (result);
        result = b-a;
        System.out.println("b-a=" + result);
        isEven(result);
        result = a*b;
        System.out.println("a*b=" + result);
        isEven(result);
        result = b/a;
        System.out.println("b:a=" + result);
        isEven(result);
    }

    private static void isEven(int result) {
        if (result%2==0) {
            System.out.println("Result is even");
        }
        else {
            System.out.println("Result is odd");
        }
    }


}