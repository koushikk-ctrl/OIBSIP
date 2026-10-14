import java.util.ArrayList;
import java.util.Scanner;

public class BankAccount {
    private String holderName;
    private double balance;
    private ArrayList<String> history = new ArrayList<>();

    BankAccount(String holderName, double openingBalance) {
        this.holderName = holderName;
        this.balance = openingBalance;
        history.add("Account opened with Rs. " + openingBalance);
    }

    void showBalance() {
        System.out.println(holderName + ", your balance is Rs. " + balance);
    }

    void deposit(double amt) {
        if (amt <= 0) {
            System.out.println("Please enter an amount greater than 0.");
            return;
        }
        balance += amt;
        history.add("Deposited Rs. " + amt);
        System.out.println("Deposit done.");
    }

    void withdraw(double amt) {
        if (amt <= 0) {
            System.out.println("Please enter an amount greater than 0.");
        } else if (amt > balance) {
            System.out.println("Not enough balance.");
        } else {
            balance -= amt;
            history.add("Withdrew Rs. " + amt);
            System.out.println("Withdrawal done.");
        }
    }

    void showHistory() {
        for (String entry : history) {
            System.out.println("- " + entry);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BankAccount acc = new BankAccount("Your Name", 1000);
        int choice;

        do {
            System.out.println("\n1. Check balance  2. Deposit  3. Withdraw  4. History  5. Exit");
            System.out.print("Choose: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1: acc.showBalance(); break;
                case 2:
                    System.out.print("Amount: ");
                    acc.deposit(sc.nextDouble());
                    break;
                case 3:
                    System.out.print("Amount: ");
                    acc.withdraw(sc.nextDouble());
                    break;
                case 4: acc.showHistory(); break;
                case 5: System.out.println("Goodbye!"); break;
                default: System.out.println("Invalid choice.");
            }
        } while (choice != 5);

        sc.close();
    }
}
