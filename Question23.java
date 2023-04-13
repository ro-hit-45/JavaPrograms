/*  Write a program to enter any integer  then check and print it , whether the given 
integer is a positive number,  negative number or zero.*/

import java.util.*;

public class Question23 {
    public static void main(String[] args) {
        Scanner m = new Scanner(System.in);
        System.out.print("Enter the number:");
        int s = m.nextInt();

        if (s > 0) {
            System.out.println("The number " + s + " is positive");

        } else if (s == 0) {
            System.out.println("The number is zero");
        } else if (s < 0) {
            System.out.println("The number is " + s + "is negative ");
        }

    }
}