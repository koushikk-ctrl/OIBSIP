import java.util.Scanner;
public class NGG {
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
int number = 25;
int guess = 0;
System.out.println("Enter number between 1 and 100");
while (guess != number) {
System.out.print("Enter your guess: ");
guess = sc.nextInt();
if (guess < number) {
System.out.println("Too low!");
} else if (guess > number) {
System.out.println("Too high!");
} else {
System.out.println("Correct! You won.");
}
}
sc.close();
}
}
