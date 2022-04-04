// print  number entered by user

package basic;

import java.util.Scanner;

public class q2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // System.in is a standard input stream.
        System.out.print("Enter first number- ");
        int a = sc.nextInt();
        System.out.println("User entered " + a);
        sc.close();
    }
}
