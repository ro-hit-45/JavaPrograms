
/* */
import java.util.*;

public class Question96 {
    public static void main(String args[]) {
        float Fahrenheit, Celsius;
        Scanner m = new Scanner(System.in);
        System.out.println("Enter temparature in celsius:-");
        Celsius = m.nextFloat();
        Fahrenheit = ((Celsius * 9) / 5) + 32;
        System.out.println("Temperature in Fahrenheit is: " + Fahrenheit);
    }
}
