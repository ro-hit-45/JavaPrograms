
// WRITE A JAVA PROGRAM TAKE TWO INTEGER VALUE FROM THE USER AND PRINT THIRE MULTIPLICATION.

import java.util.Scanner;

public class Question66 {
    public static void main(String[] args) {
        int a, b, multi;
        Scanner m = new Scanner(System.in);
        System.out.println("Enter the first value:");
        a = m.nextInt();
        System.out.println("Enter the second value:");
        b = m.nextInt();
        multi = a * b;
        System.out.println("Multiplication of entered value is = " + multi);
    }

}
