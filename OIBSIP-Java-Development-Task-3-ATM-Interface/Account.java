package atminterface;
import java.util.ArrayList;
public class Account {
String name;
double balance;
ArrayList<String> history = new ArrayList<>();
Account(String n, double b) {
name = n;
balance = b;
history.add("Account opened with Rs. " + b);
}
void showBalance() {
System.out.println("Name: " + name);
System.out.println("Balance: Rs. " + balance);
}
void deposit(double amount) {
if (amount > 0) {
balance = balance + amount;
history.add("Deposited Rs. " + amount);
System.out.println("Deposit successful");
} else {
System.out.println("Invalid amount");
 }
 }
void withdraw(double amount) {
if (amount > 0 && amount <= balance) {
 balance = balance - amount;
 history.add("Withdrawn Rs. " + amount);
System.out.println("Withdrawal successful");
} else {
System.out.println("Invalid amount or insufficient balance");
}
}
void showHistory() {
for (String h : history) {
System.out.println(h);
}
}
}
