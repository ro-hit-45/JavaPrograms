import java.util.Scanner;

class Question45 {
    public static void main(String args[]) {
        int a, b, c;
        System.out.println("Enter two numbers to calculate their sum: ");
        Scanner m = new Scanner(System.in);
        a = m.nextInt();
        b = m.nextInt();
        c = a + b;
        System.out.println("Sum of entered number is = " + c);
    }
}