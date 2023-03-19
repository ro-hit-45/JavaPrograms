import java.util.Scanner;

class input {
    public static void main(String args[]) {

        Scanner m = new Scanner(System.in);

        String s = m.nextLine();
        System.out.println("You entered string " + s);

        int a = m.nextInt();
        System.out.println("You entered integer " + a);

        float b = m.nextFloat();
        System.out.println("You entered float " + b);
    }
}
