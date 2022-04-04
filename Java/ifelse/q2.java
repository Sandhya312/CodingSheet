package ifelse;

import java.util.Scanner;

public class q2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // System.in is a standard input stream.
        System.out.print("Enter digit : ");
        char a = sc.next().charAt(0);
        if (a == 'a' || a == 'e' || a == 'i' || a == 'o' || a == 'u') {

            System.out.printf("%c is Vowel", a);
        } else {
            System.out.printf("%c is Consonant", a);

        }
        sc.close();
    }
}
