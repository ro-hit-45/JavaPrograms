
//WRITE A JAVA PROGRAM IN WHICH CONVERT FAHRENHEIT TO CELSIUS;  
import java.util.*;

class Question41 {
    public static void main(String[] args) {
        float temp;
        Scanner m = new Scanner(System.in);
        System.out.println("ENTER TEMPERATURE FAHRENHEIT:");
        temp = m.nextInt();
        temp = ((temp - 32) * 5) / 9;
        System.out.println("TEMPERATURE IN CELSIUS = " + temp);
    }
}