
//WRITE A JAVA PROGRAM FOR SUM OF INTEGER AND FLOAT VALUE;
import java.util.Scanner;

public class Question64 {
    public static void main(String[] args) {
        int a;
        float b, sum;
        Scanner m = new Scanner(System.in);
        System.out.println("Enter the integer value:-");
        a = m.nextInt();
        System.out.println("Enter the float value:-");
        b = m.nextFloat();
        sum = a + b;
        System.out.println("Sum of ineger and float is =" + sum);
    }

}
