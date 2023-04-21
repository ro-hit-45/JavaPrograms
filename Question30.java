/*  Write a program which enter the number of words to be send by whatsapp than calculate
  and print whatsapp charge according to following rule:-
 upto 10 word, total charge is Rs: 7.5, for each extra word, the charge is rs. 1.5 per words extra. */

import java.util.*;

public class Question30 {
    public static void main(String[] args) {
        Scanner m = new Scanner(System.in);
        System.out.print("ENTER THE NUMBER OF WORDS TO BE SEND BY WHATSAPP:");
        int a = m.nextInt();

        if (a <= 20) {
            Double b = a * 7.5;
            System.out.println("THE TOTAL CHARGE IS " + b + " Rs: FOR " + a + " WORDS");
        } else {
            int c = a - 20;
            double d = (c * 1.5) + 7.5;
            System.out.println("THE TOTAL CHARGE IS " + d + " Rs. FOR " + a + " WORDS");

        }
    }
}
