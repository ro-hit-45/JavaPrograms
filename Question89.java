
import java.util.*;

class Qustion89 {
    public static void main(String[] args) {

        Scanner m = new Scanner(System.in);

        System.out.println("Enter age:-");
        int age = m.nextInt();

        System.out.println("Enter sex: M/F");
        int sex = m.next().charAt(0);

        System.out.println("Are you married? Yes/No");
        int married = m.next().charAt(0);

        if (sex == 'F') {
            System.out.println("You will work only in urban areas");
        }

        if (sex == 'M') {
            if ((age >= 20) && (age < 40)) {
                System.out.println("You may work anywhere.");
            } else if ((age >= 40) && (age < 60)) {
                System.out.println("You will work only in urban areas.");
            } else {
                System.out.println("ERROR!!!");
            }
        }
    }
}