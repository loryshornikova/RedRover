import java.util.Scanner;
public class ht3_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a: ");
        int a = sc.nextInt();
        System.out.println("Enter b: ");
        int b = sc.nextInt();

        if (a > b) {
            System.out.println("a > b");
        } else if (b > a){
            System.out.println("a < b");
        } else {
            System.out.println("a == b");
        }
    }
}