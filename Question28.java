/*  Write a program which enter any integer than check and print, whether it is odd number 
 or even number using Conditional operator.*/

import java.util.*;

public class Question28 {
    public static void main(String[] args) {
        Scanner m = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int a = m.nextInt();

        String s = (a % 2 == 0) ? "The entered number  " + a + " is even" : "The entered number  " + a + " is odd.";
        System.out.println(s);

    }

}
