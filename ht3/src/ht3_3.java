import java.util.Scanner;

public class ht3_3 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);


        System.out.println("Enter a: ");
        int a = sc.nextInt();


        if (a > 10 && a < 100)  {
            System.out.println("More than 10" + " \n" + "Less than 100");
        } else if (a >= 100){
            System.out.println("More than 10");
        } else {
            System.out.println("Less than 100");
        }


        if (a*1.0/2 > 20) {
            System.out.println("Your number divided by 2 is more than 20");
        }


        if (a >= 5 && a <= 40) {
            System.out.println("Your number is in the range from 5 to 40");
        } else {
            System.out.println("Your number is less than 5 or more than 40");
        }
    }
}