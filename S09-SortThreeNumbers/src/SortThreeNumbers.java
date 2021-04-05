import java.util.Scanner;

public class SortThreeNumbers {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        int a = in.nextInt();
        System.out.print("Enter the second number: ");
        int b = in.nextInt();
        System.out.print("Enter the third number: ");
        int c = in.nextInt();

        int d;
        if (a > b) {
            d = b;
            b = a;
            a = d;
        }
        if (a > c) {
            d = c;
            c = a;
            a = d;
        }
        if (b > c) {
            d = c;
            c = b;
            b = d;
        }

        System.out.println("Sorted: " + a + " " + b + " " + c);
        in.close();
    }
}
