/*ite a program which enter the marks of  five subject of a student and
 calculate its average if the average is 33 or more than print passed oterwise print failed.*/

import java.util.*;

public class Question38 {
    public static void main(String[] args) {
        int average;
        Scanner m = new Scanner(System.in);
        System.out.print("ENTER THE MARKS OF HINDI:");
        int hindi = m.nextInt();
        System.out.print("ENTER THE MARKS OF ENGLISH:");
        int english = m.nextInt();
        System.out.print("ENTER THE MARKS OF MATH:");
        int math = m.nextInt();
        System.out.print("ENTER THE MARKS OF SCIENCE:");
        int science = m.nextInt();
        System.out.print("ENTER THE MARKS OF COMPUTER:");
        int computer = m.nextInt();

        average = (hindi + english + math + science + computer) / 5;

        if (average <= 33) {
            System.out.println("YOU ARE PASSED");

        } else {
            System.out.println("YOU ARE FAILED");

        }

    }
}
