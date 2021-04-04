import java.util.Scanner;

public class StringTest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a string= ");
        String line = input.nextLine();

        int lineLength = line.length();
        System.out.println("The length of the line is " + lineLength + " characters.");

        char firstCharacter = line.charAt(0);
        System.out.println("The first character in the line is " + firstCharacter);

        char lastCharacter = line.charAt(lineLength - 1);
        System.out.println("The last character in the line is " + lastCharacter);

        System.out.println("The line in all uppercase looks like this: " + line.toUpperCase());

        System.out.println("The line in all lowercase looks like this: " + line.toLowerCase());

        System.out.println("The first 5 characters in the line are: " + line.substring(0, 5));

        System.out.println("The last 5 characters in the line are: " + line.substring(lineLength - 5, lineLength));

        System.out.println("Does the line end with the suffix abc? Answer: " + line.endsWith("abc"));

        System.out.println("Is the index of a what you expected? Index: " + line.indexOf("a"));

        System.out.println("Is the index of b what you expected? Index: " + line.indexOf("b"));

        System.out.println("Is the index of X what you expected? Index: " + line.indexOf("X"));

        System.out.println("The edited line looks like this: " + line.replace("a", "X"));

        input.close();
    }
}
