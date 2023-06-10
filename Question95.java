
/*Write a function to find the average of a set of numbers passed as 
arguments */
import java.util.*;

public class Question95 {
    public static void main(String[] args) {
        int n, count = 1;
        float x, average, sum = 0;
        Scanner m = new Scanner(System.in);
        System.out.println("Enter the value of n:-");
        n = m.nextInt();
        while (count <= n) {
            System.out.println("Enter the " + count + " number?");
            x = m.nextInt();
            sum += x;
            ++count;
        }
        average = sum / n;
        System.out.println("The Average is" + average);
    }
}
