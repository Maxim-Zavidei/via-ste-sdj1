import java.util.Scanner;

public class ComputerGuessesANumber {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        java.util.Random randomizer = new java.util.Random();

        boolean isGameActive = true;
        int randomInt;
        int lowerBound = 1;
        int upperBound = 1024;
        int triesNum = 0;

        while (isGameActive) {
            if (lowerBound == upperBound) {
                System.out.println(
                        "Done, congrats the guessed number is " + lowerBound + " within " + triesNum + " tries.");
                isGameActive = false;
            } else {
                randomInt = randomizer.nextInt((upperBound - lowerBound) + 1) + lowerBound;
                triesNum++;
                System.out.println("My guessed number is " + randomInt + " is it correct?");
                System.out.print("Press 1 for no and 2 for yes: ");
                if (input.nextInt() == 2) {
                    lowerBound = randomInt;
                    upperBound = randomInt;
                } else {
                    System.out.print("Press 1 if it's too low and 2 if it's too high: ");
                    if (input.nextInt() == 1) {
                        lowerBound = randomInt + 1;
                    } else {
                        upperBound = randomInt - 1;
                    }
                }
            }
        }
        input.close();
    }
}
