package atminterface;
import java.util.Scanner;
public class ATM {
void start() {
Scanner sc = new Scanner(System.in);
Account a = new Account("Koushik", 1000);
int choice;
do {
System.out.println("\n1. Check Balance");
System.out.println("2. Deposit");
System.out.println("3. Withdraw");
System.out.println("4. Transaction History");
System.out.println("5. Exit");
System.out.print("Enter choice: ");
choice = sc.nextInt();
if (choice == 1) {
a.showBalance();
} else if (choice == 2) {
System.out.print("Enter amount: ");
a.deposit(sc.nextDouble());
} else if (choice == 3) {
System.out.print("Enter amount: ");
a.withdraw(sc.nextDouble());
} else if (choice == 4) {
a.showHistory();
} else if (choice == 5) {
System.out.println("Thank you!");
} else {
System.out.println("Invalid choice");
}
} while (choice != 5);
sc.close();
}
}
