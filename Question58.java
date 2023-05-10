
// WRITE A JAVA PROGRAM TO PRINT THE REVERSE OF THE ENTERED STRING;
import java.util.*;

class Question58 {
    public static void main(String args[]) {
        String a, b = "";
        Scanner m = new Scanner(System.in);
        System.out.println("ENTER THE STRING WHICH YOU WANT TO PRINT THIRE REVERSE:-");
        a = m.nextLine();
        int length = a.length();
        for (int i = length - 1; i >= 0; i--)
            b = b + a.charAt(i);
        System.out.println("REVERSE OF ENTERED STRING IS :- " + b);
    }
}