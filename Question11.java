
import java.util.*;

//FIND THE COMMISSION ON THE SALE PRODUCTS
public class Question11 {
    public static void main(String[] args) {

        Scanner m = new Scanner(System.in);
        System.out.print(" ENTER THE AMOUNT OF PRODUCT : ");
        int a = m.nextInt();
        int b = (a * 5) / 100;
        int c = (a * 7) / 100;
        String r = (a <= 25000) ? "THE COMMISSION IS " + b + " Rs. ON THE SALE OF " + a
                : "THE COMMISION IS " + c + " Rs. ON THE SALE OF " + a;
        System.out.println(r);
    }
}
