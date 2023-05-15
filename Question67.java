
// WRITE A JAVA PROGRAM TAKE TWO INTEGER VALUE FROM THE USER ,  SUBSTRACT AND PRINT IT.

import java.util.Scanner;

public class Question67 {
    public static void main(String[] args) {
        int a, b, sub;
        Scanner m = new Scanner(System.in);
        System.out.println("Enter the first value:");
        a = m.nextInt();
        System.out.println("Enter the second value:");
        b = m.nextInt();
        sub = a / b;
        System.out.println("final value is = " + sub);
    }

}