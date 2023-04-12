import java.util.*;
//find the tax according to your income

public class Question22 {
    public static void main(String[] args) {
        Scanner m = new Scanner(System.in);
        System.out.print(" ENTER YOUR INCOME : ");
        int a = m.nextInt();
        if (a < 2500000) {
            System.out.println("YOUR INCOME IS " + a + " Rs. SO, YOU ARE TAX FREE");
        } else if (a >= 250000 && a < 50000) {
            int n = (a * 5) / 100;
            System.out.println("YOUR INCOME IS " + a + " Rs. SO YOU HAVE TO " + n + " Rs. TAX ");
        } else if (a >= 50000 && a < 100000) {
            int s = (a * 20) / 100;
            System.out.println("YOUR INCOME IS " + a + " Rs. SO YOU HAVE TO " + s + " Rs. TAX");

        } else if (a >= 100000) {
            int k = (a * 30) / 100;
            System.out.println("YOUR INCOME IS " + a + " Rs. SO YOU HAVE TO PAY " + k + " Rs. TAX");
        } else {
            System.out.println(" ENTER THE INCOME 2500000 AND ABOVE ");
        }
    }
}