import java.util.*;

public class Program_1 {
    public static void main(String[] args) {

        System.out.println("Hello.");
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number 1 here: ");
        int a = sc.nextInt();
        System.out.print("Enter number 2 here: ");
        int b = sc.nextInt();

        if (a > b) {
            System.out.println("A is Greatest. ");

        } else {
            System.out.println("B is Greatest.");
        }

    }

}
