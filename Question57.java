import java.util.Scanner;

class Question57 {
    public static void main(String args[]) {
        int a, b;
        System.out.println("ENTER THE NUMBER TO PRINT THIRE MULTIPLICATION TABLE:-");
        Scanner in = new Scanner(System.in);
        a = in.nextInt();
        System.out.println("MULTIPLICATION TABLE OF " + a + " IS :-");
        for (b = 1; b <= 10; b++)
            System.out.println(a + "*" + b + "  =    " + (a * b));
    }
}
