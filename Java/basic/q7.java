package basic;

import java.util.Scanner;

public class q7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // System.in is a standard input stream.
        System.out.print("Enter digit : ");
        char a = sc.next().charAt(0);
        int convert = a;
        System.out.printf("\nThe ascii value of %c is %d", a, convert);
        sc.close();
    }
}
