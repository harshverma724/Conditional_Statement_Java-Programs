public class java_programs {
    public static void main(String[] args) {
        // sum of first 10 natural numbers using while and for loop.
        // Using while loop

        int a = 1;
        int xsum = 0;
        while (a <= 10) {
            xsum = xsum + a;
            a++;
        }
        System.out.print("Using 'while' loop: ");
        System.out.println("Sum is: " + xsum);

        // Using For loop

        int ysum = 0;
        for (int i = 1; i <= 10; i++) {
            ysum = ysum + i;
        }
        System.out.print("Using 'for' loop: ");
        System.out.println("Sum is: " + ysum);
    }

}
