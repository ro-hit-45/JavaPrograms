
//write a java program to compare two string value nd print them;
import java.util.Scanner;

class Question48 {
    public static void main(String args[]) {
        String a1, a2;
        Scanner m = new Scanner(System.in);
        System.out.println("Enter the first string:-");
        a1 = m.nextLine();
        System.out.println("Enter the second string:-");
        a2 = m.nextLine();
        if (a1.compareTo(a2) > 0)

            System.out.println("First string is greater than second string.");
        else if (a1.compareTo(a2) < 0)
            System.out.println("First string is smaller than second string.");
        else
            System.out.println("Both strings are equal.");
    }
}