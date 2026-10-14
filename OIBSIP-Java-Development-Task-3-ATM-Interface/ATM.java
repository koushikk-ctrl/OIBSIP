import java.util.ArrayList;

public class Account {
    private String holderName;
    private double balance;
    private ArrayList<String> history = new ArrayList<>();

    Account(String holderName, double openingBalance) {
        this.holderName = holderName;
        this.balance = openingBalance;
        history.add("Account opened with Rs. " + openingBalance);
    }

    void checkBalance() {
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
}
