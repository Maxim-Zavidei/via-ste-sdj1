import java.util.Scanner;

public class NestedLoops {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int years;
        double average = 0;

        while (true) {
            System.out.print("Enter the number of years: ");
            years = in.nextInt();
            if (1 < years) break;
            System.out.println("Invalid  input of years.");
        }

        double input;
        for (int i = 1; i <= years; i++) {
            for (int j = 1; j <= 12; j++) {
                while (true) {
                    System.out.print("Enter the inches of rainfall of year " + i + ", month " + j + ": ");
                    input = in.nextDouble();
                    if (0 <= input) {
                        average += input;
                        break;
                    }
                    System.out.println("Invalid  input.");
                }
            }
        }
        System.out.println();
        System.out.println("Total inches of rainfall: " + average);
        System.out.println("Total months: " + years * 12);
        System.out.println("Average rainfall per month: " + average / (years * 12));
        in.close();
    }
}
