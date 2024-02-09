import java.util.*;

public class Main {
    public static void main(String[] args) {

        System.out.println("Hello.");
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Number: ");
        int a = sc.nextInt();

        if (a > 0) {
            System.out.println("Number is Positive.");
        }

        else if (a < 0) {
            System.out.println("Number is Negative.");
        }

        else if (a == 0) {
            System.out.println("Number is Zero.");
        }

    }

}
