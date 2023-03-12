import java.util.Scanner;

public class star {

    void display(int n) {

        for (int i = 0; i <= n; i++) {

            for (int j = 0; j <= n / 2; j++) {

                System.out.print("*");

                System.out.print(" ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        star r = new star();
        r.display(10);
    }
}