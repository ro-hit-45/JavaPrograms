
//CALCULATE TAX ON PURCHASED CAR ;
import java.util.*;

public class Question41 {
    public static void main(String[] args) {
        Scanner m = new Scanner(System.in);
        System.out.print(" ENTER YOUR CAR PRICE: ");
        int x = m.nextInt();

        if (x < 250000) {
            System.out.println("YOUR CAR PRICE IS " + x + " Rs. SO YOU TAX FREE");
        } else if (x >= 250000 && a < 500000) {
            int n = (a * 5) / 100;
            System.out.println("YOUR CAR PRICE IS " + x + " Rs. SO YOU HAVE TO " + n + " Rs. TAX ");
        } else if (a >= 500000 && a < 1000000) {
            int k = (a * 10) / 100;
            System.out.println("YOUR CAR PRICE IS " + x + " Rs. SO YOU HAVE TO " + k + " Rs. TAX");

        } else if (a >= 1000000) {
            int j = (a * 20) / 100;
            System.out.println("YOUR CAR PRICE IS " + x + " Rs. SO YOU HAVE TO PAY " + j + " Rs. TAX");
        } else {
            System.out.println("ENTER VALID PRICE!!!");
        }
    }
}
