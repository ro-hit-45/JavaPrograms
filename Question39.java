/*write a program which enter the age of a person and if the age is 18 or more, than
print you can drive otherwise print you can not drive */

import java.util.*;

public class Question39 {
    public static void main(String[] args) {
        Scanner m = new Scanner(System.in);
        System.out.print("ENTER THE YOUR AGE:");
        int a = m.nextInt();
        if (a > 18) {
            System.out.println("you can ");
        } else {
            System.out.println("you are underage ");

        }
    }

}
