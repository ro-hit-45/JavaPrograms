
/*Write a program which enter two integers then check and print that how many times
the first integer can be divided by the second integer and what will be left:*/
import java.util.*;

public class Question24 {

    public static void main(String[] args) {
        int a, b;

        Scanner m = new Scanner(System.in);
        System.out.print("Enter the first value of integer =");
        int j = m.nextInt();
        System.out.print("Enter the second value of integer =");
        int k = m.nextInt();
        a = j / k;
        b = j % k;
        System.out.println("We can divide " + a + " times " + j + " by " + k + " and will be left " + b);
    }
}
