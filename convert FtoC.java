import java.util.*;

class FarenheiteToCelsius {
    public static void main(String[] args) {
        float temperature;
        Scanner n = new Scanner(System.in);
        System.out.println("Enter temperature in farenheite");
        temperature = n.nextInt();
        temperature = ((temperature - 32) * 5) / 9;
        System.out.println("Temperature in celsius =" + temperature);

    }
}