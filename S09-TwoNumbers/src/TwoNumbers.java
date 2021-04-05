import java.util.Scanner;

public class TwoNumbers {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.print("a= ");
        int a = in.nextInt();
        System.out.print("b= ");
        int b = in.nextInt();

        if (a > b) {
            int c = b;
            b = a;
            a = c;
        }

        System.out.println("Sorted: " + a + " " + b);
        System.out.println("Sum= " + (a + b));
        if (b != 0) {
            System.out.println("Quotient= " + a / b);
            System.out.println("Modulus= " + a % b);
        } else {
            System.out.println("Cannot divide by 0.");
        }
        in.close();
    }
}
