/*  Write a program to find out whether a student is pass or fail, if it requires a total of 40%
 and al least 33% in each subject to pass. Assume 3 subjects and take marks as input from the user.*/

import java.util.*;

public class Question25 {
    public static void main(String[] args) {
        float avarage;
        Scanner m = new Scanner(System.in);
        System.out.print("ENTER THE MARK OF HINDI:");
        int Hindi = m.nextInt();
        System.out.print("ENTER THE MARK OF ENGLISH:");
        int English = m.nextInt();
        System.out.print("ENTER THE MARK OF MATH:");
        int Mathematices = m.nextInt();

        avarage = (Hindi + English + Mathematices) / 3;
        System.out.println("YOUR AVERAGE MARKS IS =" + avarage);

        if (avarage >= 40 && Hindi >= 33 && English >= 33 && Mathematices >= 33) {
            System.out.println("YOU ARE PASSED. ");
        } else {
            System.out.println("YOU ARE FAILED. ");

        }

    }
}
