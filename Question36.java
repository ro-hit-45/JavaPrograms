import java.util.Scanner;

public class Question36 {
    public static void main(String[] args) {
        Scanner m = new Scanner(System.in);
        System.out.println("Enter the number :");
        Double a = m.nextDouble();

        if (a == 59.56 || a == 45.76 || a == 41.14 || a == 46.64) {

            System.out.println(a + ", YOU ARE PICKED THE RIGHT NUMBER.");

        } else {

            System.out.println(a + " , ITS WRONG NUMBER,TRY AGAIN!!! ");

        }
    }

}
