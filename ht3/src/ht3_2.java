import java.util.Scanner;

public class ht3_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a: ");
        int a = sc.nextInt();
        System.out.println("Enter b: ");
        int b = sc.nextInt();


        if ((a+b)%2 == 0) {
            System.out.println("maybe a and b are even");
        } else {
            System.out.println("some variable is odd ");
        }
    }
}
