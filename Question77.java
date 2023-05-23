
/*perfect number program using java language */
import java.util.*;

public class Question77 {

    public static void main(String[] args) {
        int a, sum;
        System.out.println("Enter any number:-");
        Scanner m = new Scanner(System.in);
        a = m.nextInt();
        for (int i = 1; i < a; i++) {
            if (a % i == 0) {
                sum = sum + i;
            }

            if (a == sum) {
                System.out.println("Perfect number");
            } else {
                System.out.println("Not a perfect number");

            }
        }
    }
}