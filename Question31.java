/*  Write a program which enter sales made by the salesman that calculate and print the 
commission, according to following rules-
sale up to 25000, commission is 5% of sale, otherwise it is & 7% of sales
          output format :- commission=.....Rs.*/

import java.util.*;

public class Question31 {
    public static void main(String[] args) {
        float A, LESS, MORE;

        Scanner m = new Scanner(System.in);
        System.out.print("ENTER THE SALES MADE BY SALESMAN:");
        A = m.nextFloat();

        if (A <= 25000) {
            LESS = (A * 5) / 100;

            System.out.println("Commision is " + LESS + " Rs.");
        } else {
            MORE = (A * 7) / 100;
            System.out.println("Commision= " + MORE + " Rs.");

        }
    }
}
