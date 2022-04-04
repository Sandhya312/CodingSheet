package basic;

import java.util.Scanner;

public class q4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // System.in is a standard input stream.
        System.out.print("Enter 2 digit : ");
        int a = sc.nextInt();
        int b = sc.nextInt();

        System.out.printf("Quotient : %d", a / b);
        System.out.println("\nRemainder : " + (a % b));
        sc.close();

    }
}
