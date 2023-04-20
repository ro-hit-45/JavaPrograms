// Write a java program to find  the day of the week given number. e.g:- [1 for monday, 2 for tuesday....and so on!!!];

import java.util.*;

public class Question29 {
    public static void main(String[] args) {
        System.out.print("ENTER THE NUMBER : ");
        Scanner m = new Scanner(System.in);
        int day = m.nextInt();

        switch (day) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
            default:
                System.out.println(" Entered number should be between 1 to 7 !!!");
                break;

        }
    }
}
