import java.util.*;

public class CheckNum {
    public static void main(String[] args) {
        int num;
        Scanner m = new Scanner(System.in);
        num = m.nextInt();
        if (num % 2 == 0) {
            System.out.println("Enterd number is sum");
        } else {
            System.out.println("Enterd number is odd");
        }

    }
}
