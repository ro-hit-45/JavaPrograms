//write a java program  in which swap 2 no using 3rd variable ;

import java.util.Scanner;

class Question44 {
    public static void main(String args[]) {
        int a, b, temp;
        System.out.println("Enter the value of a and b: ");
        Scanner m = new Scanner(System.in);
        a = m.nextInt();
        b = m.nextInt();
        System.out.println("Before Swapping :-\na = " + a + "\nb = " + b);
        temp = a;
        a = b;
        b = temp;
        System.out.println("After Swapping:-\na = " + a + "\nb = " + b);
    }
}