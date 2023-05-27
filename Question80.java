
/*palindrome number program */
import java.util.*;

public class Question80 {
    public static void main(String[] args) {
        int a, b, c, d;
        System.out.println("Enter number");
        Scanner m = new Scanner(System.in);
        a = m.nextInt();
        b = a;
        while (a > 0) {
            d = a % 10;
            b = (b * 10) + d;
            a = a / 10;
        }
        if (c == b) {
            System.out.println("its a palindrome number");
        } else
            System.out.println("Not a palindrome number");

    }
}