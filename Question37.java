
/*Write a program which enter two float value then check and print that how many times
 the first float value can be divided by the second float value and what will be left.*/
import java.util.*;

public class Question37 {

    public static void main(String[] args) {
        float a, b;

        Scanner m = new Scanner(System.in);
        System.out.print("ENTER THE FIRST VALUE OF FLOAT=");
        float i = m.nextFloat();
        System.out.print("ENTER THE SECOND VALUE OF FLOAT=");
        float u = m.nextFloat();
        a = i / u;
        b = i % u;
        System.out.println("WE CAN DIVIDED " + a + " TIMES " + i + " BY " + u + " AND THE WILL BE LEFT " + b);
    }
}
