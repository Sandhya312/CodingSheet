package basic;

import java.util.Scanner;

public class q6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // System.in is a standard input stream.
        System.out.print("Enter 2 digit : ");
        int a = sc.nextInt();
        int b = sc.nextInt();

        System.out.printf("Number before swap : %d & %d", a, b);
        a = a + b;
        b = a - b;
        a = a - b;
        System.out.printf("\nNumber after swap : %d & %d", a, b);
        sc.close();
    }
}
