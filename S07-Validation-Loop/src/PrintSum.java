import java.util.Scanner;

public class PrintSum {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int sum = 0;
        int counter = 0;
        int value;

        do {
            System.out.print("Enter number of seconds or -1 to end (#" + String.format("%d", counter + 1) + "): ");
            value = input.nextInt();
            if (value > 0) {
                sum += value;
                counter++;
            } else if (value != -1) {
                value = 0;
                System.out.println("Please enter a non-negative number or -1 to end");
            }
        } while (value != -1);

        System.out.println("The total number of seconds: " + sum);
        double avg = (double) sum / counter;
        System.out.println("The average seconds: " + avg);
        Clock clockObj = new Clock(sum);
        System.out.println("The clock is " + clockObj.toString());
    }
}
