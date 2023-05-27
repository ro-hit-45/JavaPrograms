
/*Armstrong number program */
import java.util.*;

public class Question81 {
    public static void main(String[] args) {
        int a, c, reminder, arm;
        System.out.println("Enter any number:-");
        Scanner m = new Scanner(System.in);
        a = m.nextInt();
        c = a;
        while (a > 0) {
            reminder = a % 10;
            arm = (reminder * reminder * reminder);
            a = a % 10;

        }
        if (c == arm)
            System.out.println("its Armstrong number");
        else
            System.out.println("Not armstrong number");
    }

}
