
//write a  java program to  print Reverse number ;
import java.util.Scanner;

class Question52 {
    public static void main(String args[]) {
        int a, x = 0;
        System.out.println("Enter the number which you want to reverse:-");
        Scanner m = new Scanner(System.in);
        a = m.nextInt();
        while (a != 0) {
            x = x * 10;
            x = x + a % 10;
            a = a / 10;
        }
        System.out.println("Reverse of entered number is " + x);
    }
}