
/*OdD oR EvEn */
import java.util.*;

import javax.security.sasl.SaslException;

public class Question97 {

    public static void main(String[] args) {

        int n;
        Scanner m = new Scanner(System.in);
        System.out.println("Enter any number:-");
        n = m.nextInt();
        if ((n | 1) > n) {

            System.out.println("Entered number is Even");
        } else {

            System.out.println(" Entered number is Odd");
        }
    }
}