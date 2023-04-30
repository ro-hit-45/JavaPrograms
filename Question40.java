// Write a java program to find of the months of the year given number [1 for january, 2 for february....and so on!];

import java.util.*;
import java.lang.*;
import javax.swing.SwingConstants;

public class Question40 {
    public static void main(String[] args) {
        System.out.print("ENTER THE NUMBER : ");
        Scanner m = new Scanner(System.in);
        int months = m.nextInt();

        switch (months) {
            case 1:
                System.out.println("JANUARY");
                break;
            case 2:
                System.out.println("FEBRUARY");
                break;
            case 3:
                System.out.println("MARCH");
                break;
            case 4:
                System.out.println("APRIL");
                break;
            case 5:
                System.out.println("MAY");
            case 6:
                System.out.println("JUNE");
                break;
            case 7:
                System.out.println("JULY");
                break;
            case 8:
                System.out.println("AUGUST");
                break;
            case 9:
                System.out.println("SEPTEMBER");
                break;
            case 10:
                System.out.println("OCTOBER");
                break;
            case 11:
                System.out.println("NOVEMBER");
                break;
            case 12:
                System.out.println("DECEMBER");
                break;
            default:
                System.out.println("Entered number should be between 1 to 12 only");
                break;

        }
    }
}
