
/*Exception handling in java */
import java.util.*;

class Question78 {
    public static void main(String[] args) {
        int x, y, result;
        Scanner m = new Scanner(System.in);
        System.out.println("Enter two integers:-");
        x = m.nextInt();
        y = m.nextInt();
        // try block
        try {
            result = x / y;
            System.out.println("Result = " + result);
        }
        // catch block
        catch (Exception e) {
            System.out.println("Exception caught:- Division by zero.");
        }
    }
}