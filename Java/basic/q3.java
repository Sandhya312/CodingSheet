package basic;

import java.util.Scanner;

public class q3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // System.in is a standard input stream.
        System.out.print("Enter 2 digit : ");
        int a = sc.nextInt();
        int b = sc.nextInt();

        System.out.printf("Addition : %d", a + b);
        System.out.println("Addition : " + (a + b));
        sc.close();

    }
}
