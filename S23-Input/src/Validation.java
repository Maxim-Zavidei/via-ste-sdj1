import java.util.InputMismatchException;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class Validation {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int sum = 0;
        int i = 0;

        while (true) {
            System.out.print("Type an integer in the range 10-99: ");
            try {
                int input = in.nextInt();
                if (input < 10 || 99 < input) System.out.println("The input is not an integer in the range 10-99, try again.");
                else {
                    i++;
                    sum += input;
                }
            } catch (InputMismatchException e) {
                String wrongInput = in.nextLine();
                if (wrongInput.equals("end")) break;
                System.out.println("Input must be a number, try again.");
            } catch (NoSuchElementException e) {
                System.out.println("Input is exhausted, try again.");
            } catch (IllegalStateException e) {
                System.out.println("Scanner is closed, try again.");
            }
        }
        System.out.println("The sum of the " + i + " integers is " + sum + ".");
        in.close();
    }
}
