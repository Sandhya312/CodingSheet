package ifelse;

import java.util.Scanner;

public class q3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // System.in is a standard input stream.
        System.out.print("Enter 2 digit : ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        if (a > b && a > c) {
            System.out.printf("%d is Largest among other", a);
        } else if (b > a && b > c) {
            System.out.printf("%d is Largest among other", b);
        } else {
            System.out.printf("%d is Largest among other", c);
        }

        sc.close();
    }
}
