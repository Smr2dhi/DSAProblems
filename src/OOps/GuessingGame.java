package OOps;
import java.util.*;

public class GuessingGame {
    private int targetNumber;   // The number to be guessed
    private int attempts;       // Counter for the number of attempts

    // Constructor to initialize the target number and attempts
    public GuessingGame() {
        Random random = new Random();
        this.targetNumber = random.nextInt(100) + 1;  // Number between 1 and 100
        this.attempts = 0;   // Initialize attempts to zero
    }

    // Getter for attempts
    public int getAttempts() {
        return attempts;
    }

    // Setter for attempts (increments the attempt counter)
    public void incrementAttempts() {
        this.attempts++;
    }

    // Method to check the user's guess
    public String checkGuess(int guess) {
        incrementAttempts();   // Increment attempts each time a guess is made

        if (guess == targetNumber) {
            return "You guessed right! The number was " + targetNumber +
                    ". It took you " + attempts + " attempts.";
        } else if (guess > targetNumber) {
            return "Your guess is too high. Try again.";
        } else {
            return "Your guess is too low. Try again.";
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        GuessingGame game = new GuessingGame();

        System.out.println("Enter a random number between 1 and 100");

        while (true) {
            int userGuess = sc.nextInt();
            String result = game.checkGuess(userGuess);
            System.out.println(result);

            if (userGuess == game.targetNumber) {
                break;   // Exit the loop if the guess is correct
            }
        }

        System.out.println("Game Over! Total attempts: " + game.getAttempts());
    }
}
