
/*prime number program */
import java.util.*;

public class Question76 {
    public static void main(String[] args) {
        int a, count = 0;
        Scanner m = new Scanner(System.in);
        System.out.println("Enter any number:-");
        a = m.nextInt();
        for (int i = 1; i <= a; i++) {
            if (a % i == 0) {
                count++;
            }
        }
        if (count == 2) {
            System.out.println("you entered prime number... ");
        } else {
            System.out.println("you entered NonPrime number...");
        }
    }
}
