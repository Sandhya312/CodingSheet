package ifelse;

import java.util.Scanner;

public class q1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // System.in is a standard input stream.
        System.out.print("Enter digit : ");
        int a = sc.nextInt();
        if (a % 2 == 0) {
            
            System.out.printf("Even : %d", a );
        } else {
            System.out.printf("Odd : %d", a );
            
        }
        sc.close();
    }
}
