
/*write a java program to calculate thire commision on which sales made by person */
import java.util.*;

public class Question79 {
    public static void main(String[] args) {
        int sale;
        Scanner m = new Scanner(System.in);
        System.out.println("Enter the sales made by person:-");
        sale = m.nextInt();

        if (sale < 2500) {
            System.out.println("No sale commision is under 2500");
        } else {
            System.out.println("you got 5% scommision on sale " + sale);
        }
    }
}