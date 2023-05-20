
//write a simple java program to add two string value.
import java.util.Scanner;

public class Question70 {
    public static void main(String[] args) {
        String s1, s2, sum;
        Scanner m = new Scanner(System.in);
        System.out.println("Enter first string :-");
        s1 = m.nextLine();
        System.out.println("Enter second string:-");
        s2 = m.nextLine();
        sum = s1 + s2;
        System.out.println("you entered string is :" + sum);
    }
}
