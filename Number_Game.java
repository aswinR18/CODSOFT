import java.util.Scanner;

public class Number_Game
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        int totalScore = 0;
        int roundsPlayed = 0;

        System.out.println("Welcome to the Number Guessing Game!");
        int playAgain = 1;

        while (playAgain == 1)
        {
            roundsPlayed++;
            int randomNumber = (int) (Math.random() * 100) + 1;
            int maxAttempts = 5;
            int attemptsUsed = 0;
            boolean guessedCorrectly = false;

            System.out.println("\nRound " + roundsPlayed + ": Guess a number between 1 and 100.");
            System.out.println("You have " + maxAttempts + " attempts.");

            while (attemptsUsed < maxAttempts)
            {
                System.out.print("Enter your guess: ");
                int userGuess = scanner.nextInt();
                attemptsUsed++;

                if (userGuess == randomNumber)
                {
                    System.out.println("Correct! You guessed the number in " + attemptsUsed + " attempts.");
                    int roundScore = (maxAttempts - attemptsUsed + 1) * 10;
                    totalScore += roundScore;
                    System.out.println("You earned " + roundScore + " points this round!");
                    guessedCorrectly = true;
                    break;
                }
                else if (userGuess < randomNumber)
                {
                    System.out.println("Too low. Try again.");
                }
                else
                {
                    System.out.println("Too high. Try again.");
                }
            }

            if (!guessedCorrectly)
            {
                System.out.println("Out of attempts! The correct number was " + randomNumber + ".");
            }

            System.out.println("Your current total score is: " + totalScore);


            System.out.print("Do you want to play another round? (1 for yes / 0 for no): ");
            playAgain = scanner.nextInt();
        }

        System.out.println("\nGame Over!");
        System.out.println("You played " + roundsPlayed + " round(s).");
        System.out.println("Your total score is: " + totalScore);
        scanner.close();
    }
}
