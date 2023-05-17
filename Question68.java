
/*WRITE A JAVA PROGRAM AND TAKE STRING VALUE FROM USER
 AND
 CHECK THE ENTERED STRING IS PALINDROME OR NOT */
import java.util.*;

class Question68 {
    public static void main(String args[]) {
        String a, reverse = "";
        Scanner m = new Scanner(System.in);
        System.out.println("ENTER STRING TO CHECK IF  IT IS A PALINDROME:-");
        a = m.nextLine();
        int length = a.length();
        for (int i = length - 1; i >= 0; i--)
            reverse = reverse + a.charAt(i);
        if (a.equals(reverse))
            System.out.println("ENTERED STRING IS PALINDROME...");
        else
            System.out.println("ENTERED STRING IS NOT PALINDROME !!!");
    }
}
