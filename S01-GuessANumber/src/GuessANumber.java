import java.util.Scanner;

public class GuessANumber {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        java.util.Random randomizer = new java.util.Random();

        boolean isGameActive = true;
        System.out.print("Enter the minimum number of the range: ");
        int lowerBound = input.nextInt();
        System.out.print("Enter the maximum number of the range: ");
        int upperBound = input.nextInt();
        int target = randomizer.nextInt((upperBound - lowerBound) + 1) + lowerBound;
        int userGuessedInt;
        int triesNum = 1;

        while (isGameActive) {
            System.out.print("Guess the number: ");
            userGuessedInt = input.nextInt();
            if (userGuessedInt == target) {
                System.out.println("Congrats you've guessed the number " + target + " within " + triesNum + " tries.");
                isGameActive = false;
            } else if (userGuessedInt < target) {
                System.out.println("You have guessed too low.");
            } else {
                System.out.println("You have guessed too high.");
            }
            triesNum++;
        }
        input.close();
    }
}
