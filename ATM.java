import java.util.Scanner;

public class ATM {
    public static void main(String args[]) {
        int balance = 10000, withdraw, deposit;

        Scanner r = new Scanner(System.in);

        while (true) {
            System.out.println("Automated Teller Machine");

            System.out.print("Choose the operation you want to perform:");

            int choice = r.nextInt();
            switch (choice) {
                case 1:
                    System.out.print("Enter money to be withdrawn:");

                    withdraw = r.nextInt();

                    if (balance >= withdraw) {
                        balance = balance - withdraw;
                        System.out.println("Please collect your money");
                    }
            }
        }
    }
}