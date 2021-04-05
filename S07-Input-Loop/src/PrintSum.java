import java.util.Scanner;

public class PrintSum {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("How many inputs: ");
        int count = input.nextInt();

        int sum = 0;
        for (int i = 0; i < count; i++) {
            System.out.print("Enter number of seconds (#" + String.format("%d", i + 1) + "): ");
            int value = input.nextInt();
            sum += value;
        }

        System.out.println("The total number of seconds: " + sum);
        double avg = (double) sum / count;
        System.out.println("The average seconds: " + avg);
        Clock clockObj = new Clock(sum);
        System.out.println("The clock is " + clockObj.toString());
    }
}
