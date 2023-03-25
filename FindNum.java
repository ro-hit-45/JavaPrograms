import java.util.Scanner;

public class FindNum {
    public static void main(String[] args) {
        double x = -4.5, y = 3.9, z = 2.5;
        if (x >= y && x >= z)
            System.out.println(x + " is the largest number.");
        else if (y >= x && y >= z)
            System.out.println(y + " is the largest number.");
        else
            System.out.println(z + " is the largest number.");

    }
}
