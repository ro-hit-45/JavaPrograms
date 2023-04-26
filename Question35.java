/*  Write a program which enter any number in integer and if it is 25,37,41 or 64 then print
 Right code otherwise print Wrong code.*/

import java.util.*;

public class Question35 {
    public static void main(String[] args) {
        Scanner m = new Scanner(System.in);
        System.out.print("ENTER THE NUMBER : ");
        int a = m.nextInt();

        if (a == 25 || a == 37 || a == 41 || a == 64) {

            System.out.println(a + ", YOU ARE PICKED THE RIGHT NUMBER.");

        } else {

            System.out.println(a + " , ITS WRONG NUMBER,TRY AGAIN!!! ");

        }
    }
}
