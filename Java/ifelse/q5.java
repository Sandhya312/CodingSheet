package ifelse;

import java.util.Scanner;

public class q5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // System.in is a standard input stream.
        System.out.print("Enter digit : ");
        int a = sc.nextInt();
        if (a % 4 == 0) {
            System.out.printf("The %d is a Leap Year", a);
        } else {
            System.out.printf("The %d is not a Leap Year", a);
        }
        sc.close();
    }
}
