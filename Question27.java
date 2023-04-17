// pattern printing of diamond.

public class Question27 {
    public static void main(String[] args) {
        System.out.println("Pattern printing:-");
        int n = 5;
        for (int i = 1; i <= 2 * n - 1; i++) {
            int a = (i > n) ? 2 * n - i : i;
            for (int j = 1; j <= a; j++) {
                System.out.print("*");
            }
            System.out.println(" ");
        }
        System.out.println(" Reverse pattern printing:- ");
        for (int i = 1; i <= 2 * n - 1; i++) {
            int a = (i > n) ? 2 * n - i : i;
            int space = n - a;
            for (int s = 1; s <= space; s++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= a; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println("Diamond pattern printing :-");
        for (int i = 1; i <= 2 * n; i++) {
            int a = (i > n) ? 2 * n - i : i;
            int space = n - a;
            for (int s = 1; s <= space; s++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= a; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
