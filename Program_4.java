import java.util.*;

public class Program_4 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Number: ");
        int a = sc.nextInt();

        if (a % 5 == 0) {
            if (a % 11 == 0) {
                System.out.println("Number is Divisible by 5 and 11.");
            } else {

                System.out.println("Number is Divisible by 5 but not by 11.");

            }
        }

        if (a % 11 == 0) {

            System.out.println("Number is Divisible by 11 but not by 5.");

        } else {
            System.out.println("Number is not Divisible by both 5 and 11.");
        }

    }

}
