import java.util.*;

public class Program_2 {
    public static void main(String[] args) {

        System.out.println("Hello.");
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number 1 here: ");
        int a = sc.nextInt();
        System.out.print("Enter number 2 here: ");
        int b = sc.nextInt();
        System.out.print("Enter number 3 here: ");
        int c = sc.nextInt();

        if (a > b) {
            if (a > c) {
                System.out.println("A is Biggest.");
            } else {
                System.out.println("C is Biggest. ");
            }
        }

        else if (b > a) {
            if (b > c) {
                System.out.println("B is Biggest. ");
            } else {
                System.out.println("C is Biggest. ");
            }

        }

        else {
            System.out.println("C is Biggest. ");
        }

    }

}
