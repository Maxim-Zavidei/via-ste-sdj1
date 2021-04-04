import java.util.Scanner;
import java.util.Random;

public class NimGame {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        Random ran = new Random();

        boolean isProgramRunning = true;
        boolean isGameActive = true;
        boolean randomStart = true;
        int[] thisGamePiles = new int[6];
        int[] lastGamePiles = new int[6];
        String winner = "";

        while (isProgramRunning) {
            // Initialize the game.
            if (randomStart) {
                thisGamePiles[0] = ran.nextInt(4) + 2;
                lastGamePiles[0] = thisGamePiles[0];
                for (int i = 1; i <= thisGamePiles[0]; i++) {
                    thisGamePiles[i] = ran.nextInt(10) + 1;
                    lastGamePiles[i] = thisGamePiles[i];
                }
            } else {
                System.arraycopy(lastGamePiles, 0, thisGamePiles, 0, 6);
            }

            while (isGameActive) {
                // Print the piles.
                System.out.println();
                for (int i = 1; i <= thisGamePiles[0]; i++) {
                    System.out.print(i + ":  ");
                    for (int j = 1; j <= thisGamePiles[i]; j++) {
                        System.out.print("|");
                    }
                    System.out.println("  :" + thisGamePiles[i]);
                }
                System.out.println();

                int playerPileInput;
                int sticksToRemove;

                // Player 1 interaction.
                System.out.println("Player 1, Choose a pile.");
                playerPileInput = input.nextInt();
                while (!(playerPileInput > 0 && playerPileInput <= thisGamePiles[0]
                        && thisGamePiles[playerPileInput] > 0)) {
                    System.out.println(
                            "Please pick a pile number between 1 and " + thisGamePiles[0] + " that has sticks in it.");
                    playerPileInput = input.nextInt();
                }
                System.out.println("How many sticks do you want to remove?");
                sticksToRemove = input.nextInt();
                while (!(sticksToRemove > 0 && sticksToRemove <= thisGamePiles[playerPileInput])) {
                    System.out.println("Please choose 1 to " + thisGamePiles[playerPileInput] + " sticks to remove.");
                    sticksToRemove = input.nextInt();
                }

                // Remove the sticks.
                thisGamePiles[playerPileInput] = thisGamePiles[playerPileInput] - sticksToRemove;

                // Check for any left sticks.
                for (int i = 1; i <= thisGamePiles[0]; i++) {
                    if (thisGamePiles[i] > 0) {
                        break;
                    } else {
                        if (i == thisGamePiles[0]) {
                            isGameActive = false;
                            winner = "Player 2";
                        }
                    }
                }

                if (isGameActive) {
                    // Print the piles.
                    System.out.println();
                    for (int i = 1; i <= thisGamePiles[0]; i++) {
                        System.out.print(i + ":  ");
                        for (int j = 1; j <= thisGamePiles[i]; j++) {
                            System.out.print("|");
                        }
                        System.out.println("  :" + thisGamePiles[i]);
                    }
                    System.out.println();

                    // Player 2 interaction.
                    System.out.println("Player 2, Choose a pile.");
                    playerPileInput = input.nextInt();
                    while (!(playerPileInput > 0 && playerPileInput <= thisGamePiles[0]
                            && thisGamePiles[playerPileInput] > 0)) {
                        System.out.println("Please pick a pile number between 1 and " + thisGamePiles[0]
                                + " that has sticks in it.");
                        playerPileInput = input.nextInt();
                    }
                    System.out.println("How many sticks do you want to remove?");
                    sticksToRemove = input.nextInt();
                    while (!(sticksToRemove > 0 && sticksToRemove <= thisGamePiles[playerPileInput])) {
                        System.out
                                .println("Please choose 1 to " + thisGamePiles[playerPileInput] + " sticks to remove.");
                        sticksToRemove = input.nextInt();
                    }

                    // Remove the sticks.
                    thisGamePiles[playerPileInput] = thisGamePiles[playerPileInput] - sticksToRemove;

                    // Check for any left sticks.
                    for (int i = 1; i <= thisGamePiles[0]; i++) {
                        if (thisGamePiles[i] > 0) {
                            break;
                        } else {
                            if (i == thisGamePiles[0]) {
                                isGameActive = false;
                                winner = "Player 1";
                            }
                        }
                    }
                }
            }

            System.out.println(winner + " wins.");

            // End the game.
            System.out.print("Press 1 to replay or 0 to quit: ");
            isProgramRunning = (input.nextInt() == 1);
            if (isProgramRunning) {
                isGameActive = true;
                System.out.print("Press 1 to generate a new game or 0 to replay this exact game: ");
                randomStart = (input.nextInt() == 1);
            }
        }

        input.close();
    }
}
