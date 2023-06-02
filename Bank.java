
/*Write a Java program to calculate the interest payable by the user. User must have 
following options:
a. To select his bank among SBI, ICICI & AXIS, 
b. To input Principal Amount,
c. To input year of loan */
/*given:
Bank Rate of interest:-
SBI 8
      ICICI 7
              AXIS 9
 */
import java.util.*;

public class Bank {
    int getRateOfInterest() {
        return 0;
    }
}

// Creating child classes
class SBI extends Bank {
    int getRateOfInterest() {
        return 8;
    }
}

class ICICI extends Bank {
    int getRateOfInterest() {
        return 7;
    }
}

class AXIS extends Bank {
    int getRateOfInterest() {
        return 9;
    }
}

// Test class to create objects and call the methods
class Interest {
    public static void main(String args[]) {
        int num, p = 0, r = 0, t = 0;
        double interest;
        SBI s = new SBI();
        ICICI i = new ICICI();
        AXIS a = new AXIS();
        System.out.println("Select your Bank:-");
        System.out.println("Enter 1 for SBI");
        System.out.println("Enter 2 for ICICI");
        System.out.println("Enter 3 for AXIS");
        Scanner sc = new Scanner(System.in);
        num = sc.nextInt();
        if (num == 1) {
            System.out.println("SBI Rate of Interest: " + s.getRateOfInterest());
            System.out.println("Enter Principal:-");
            p = sc.nextInt();
            r = s.getRateOfInterest();
            System.out.println("Enter time period:-");
            t = sc.nextInt();
        } else if (num == 2) {
            System.out.println("ICICI Rate of Interest: " + i.getRateOfInterest());
            System.out.println("Enter Principal:-");
            p = sc.nextInt();
            r = i.getRateOfInterest();
            System.out.println("Enter time period:-");
            t = sc.nextInt();
        } else if (num == 3) {
            System.out.println("AXIS Rate of Interest: " + a.getRateOfInterest());
            System.out.println("Enter Principal:-");
            p = sc.nextInt();
            r = a.getRateOfInterest();
            System.out.println("Enter time period:-");
            t = sc.nextInt();
        } else {
            System.out.println("Wrong Choice entered");
        }
        interest = (p * r * t) / 100;
        System.out.println("Interest Payable =" + interest);
    }
}
