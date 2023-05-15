
// WRITE A JAVA PROGRAM TAKE THREE INTEGER VALUE FROM THE USER AND PRINT THIRE SUM.
import java.util.*;

public class Question65 {
    public static void main(String[] args) {
        int a, b, c, sum;
        Scanner m = new Scanner(System.in);
        System.out.println("Enter the first integer value:");
        a = m.nextInt();
        System.out.println("Enter the second integer value:");
        b = m.nextInt();
        System.out.println("Enter the third integer value:");
        c = m.nextInt();
        sum = a + b + c;
        System.out.println("sum of entered value is =" + sum);
    }
}