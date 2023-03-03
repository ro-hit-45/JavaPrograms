import java.util.*;

public class swapque {
    public static void main(String[] args) {
        int x, y, temp;
        System.out.println("Enter x and y");
        Scanner n = new Scanner(System.in);
        x = n.nextInt();
        y = n.nextInt();
        System.out.println("Before swapping\n x=" + x + "\ny=" + y);
        temp = x;
        x = y;
        y = temp;
        System.out.println("After swapping\n x=" + x + "\n y=" + y);
    }

}
