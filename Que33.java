import java.util.*;

public class Que33 {
    public static void main(String[] args) {

        int a, b, c, largest, temp;

        Scanner m = new Scanner(System.in);

        System.out.println("Enter the first number:");
        a = m.nextInt();
        System.out.println("Enter the second number:");
        b = m.nextInt();
        System.out.println("Enter the third number:");
        c = m.nextInt();

        temp = a > b ? a : b;

        largest = c > temp ? c : temp;

        System.out.println("The largest number is: " + largest);
    }

}
