import java.util.*;

public class addnumber {
    public static void main(String[] args) {
        int x, y, z;
        System.out.println("Enter two integer number to calculate thire sum");
        Scanner in = new Scanner(System.in);
        x = in.nextInt();
        y = in.nextInt();
        z = x + y;
        System.out.println("sum of entered integers=" + z);

    }

}