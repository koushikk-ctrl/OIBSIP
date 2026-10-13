```java
import java.util.Random;
import java.util.Scanner;

public class NumberGuessingGame {
public static void main(String[] args) {

Scanner sc = new Scanner(System.in);
Random random = new Random();
int number = random.nextInt(100) + 1;
int guess;
int attempts = 8;
  System.out.println("===== Number Guessing Game =====");
  System.out.println("Guess a number between 1 and 100.");
  System.out.println("You have 8 attempts.");

        for (int i = 1; i <= attempts; i++) {

            System.out.print("Enter your guess: ");
            guess = sc.nextInt();

            if (guess == number) {
                System.out.println("Congratulations! Correct guess.");
                System.out.println("Attempts used: " + i);
                break;
            } else if (guess < number) {
                System.out.println("Too low! Try again.");
            } else {
                System.out.println("Too high! Try again.");
            }

            if (i == attempts) {
                System.out.println("Game over!");
                System.out.println("The correct number was: " + number);
            }
        }

        sc.close();
}
}
