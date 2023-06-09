
/*Write a Java method to print the multiplication table of a number n. */
import java.util.*;

public class Question92 {

    public static void main(String args[]) {
        Scanner m = new Scanner(System.in);
        System.out.print("Enter any number:- ");

        int n = m.nextInt();
        for (int i = 1; i <= 10; i++) {
            /* prints table of the entered number */
            System.out.println(n + " * " + i + " = " + n * i);
        }
    }
}
