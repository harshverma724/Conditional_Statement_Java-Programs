import java.util.Scanner;

public class Table_Of_A_Number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the no. here: ");
        int a = sc.nextInt();
        System.out.println("Table of " + a + " is: ");
        for (int i = 1; i <= 10; i++) {
            System.out.println(a + " X " + i + " = " + (a * i));
        }
    }
}
