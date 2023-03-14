import java.util.Scanner;

public class naturalNumber {
    public static void main(String arg[]) {
        int n, sum;
        n = 10;
        Scanner s = new Scanner(System.in);
        sum = (n * (n + 1)) / 2;
        System.out.println(+sum);
    }
}