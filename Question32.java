/*  Write a program which enter age of a person if the age is 18 or more than print you
are adult otherwise print you are minor:*/

import java.util.*;

public class Question32 {
    public static void main(String[] args) {
        Scanner m = new Scanner(System.in);
        System.out.print(" ENTER YOUR AGE:");
        int a = m.nextInt();
        String s = (a >= 18) ? " YOU ARE ADULT " : " YOU ARE MINOR";
        System.out.println(s);

    }
}
