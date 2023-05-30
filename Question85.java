
/*Create an ATM program in Java for representing ATM transection. the user has to 
select an option from the options displayed on the screen. The options are related to 
withdraw the money, deposit the money, check the balance, and exit */
import java.util.*;

public class Question85 {
    public static void main(String[] args) {
        int balance = 100000, withdraw, deposit;
        Scanner m = new Scanner(System.in);

        while (true) {
            System.out.println("Automated Teller Machine");
            System.out.println("Choose 1 for Withdraw");
            System.out.println("Choose 2 for Deposit");
            System.out.println("Choose 3 for Check Balance");
            System.out.println("Choose 4 for EXIT");
            System.out.print("Choose the operation you want to perform:");

            int choice = m.nextInt();
            switch (choice) {
                case 1:
                    System.out.print("Enter money to be withdrawn:-");

                    withdraw = m.nextInt();

                    if (balance >= withdraw) {

                        balance = balance - withdraw;
                        System.out.println("Please collect your money.");
                    } else {

                        System.out.println("Insufficient Balance!!!");
                    }
                    System.out.println("");
                    break;

                case 2:

                    System.out.print("Enter money to be deposited:");

                    deposit = m.nextInt();

                    balance = balance + deposit;
                    System.out.println("Your Money has been successfully depsited:");
                    System.out.println("");
                    break;

                case 3:
                    System.out.println("Balance : " + balance);
                    System.out.println("");
                    break;

                case 4:

                    System.exit(0);
            }
        }
    }
}
