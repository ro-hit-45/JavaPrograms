import java.util.Scanner;

class Question41 {
    public static void main(String args[]) {
        int a;
        float b;
        String s;
        Scanner m = new Scanner(System.in);
        System.out.println("ENTER AN INTEGER");
        a = m.nextInt();
        System.out.println("YOU ENTERED INTEGER:-" + a);
        System.out.println("ENTER A FLOAT:");
        b = m.nextFloat();
        System.out.println("YOU ENTERED FLOAT:- " + b);
        System.out.println("ENTER A STRING:");
        s = m.nextLine();
        System.out.println("YOU ENTERED STRING:-" + s);

    }
}