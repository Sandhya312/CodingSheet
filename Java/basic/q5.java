package basic;

// Write a Program to Find Size of int, float, double and char
// in your computer

public class q5 {
    public static void main(String[] args) {

        System.out.printf("int : %d \n", Integer.SIZE / 8);
        System.out.printf("double : %d \n", Double.SIZE / 8);
        System.out.printf("char : %d \n", Character.SIZE / 8);
        System.out.printf("float : %d \n", Float.SIZE / 8);
    }
}
