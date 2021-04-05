import java.util.Scanner;

public class PIApproximation {

    public static double piApproximationIterative(int terms) {
        double pi = 4;
        --terms;
        for (int i = 1; i <= terms; i++) pi += (i % 2 == 0 ? 4f : -4f) / (i * 2 + 1);
        return pi;
    }

    public static double piApproximationRecursive(int terms) {
        return --terms == 0 ? 4 : (terms % 2 == 0 ? 4f : -4f) / (terms * 2 + 1) + piApproximationRecursive(terms);
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double pi = 4;
        System.out.print("terms= ");
        int terms = in.nextInt();
        System.out.println("piApproximationIterative= " + piApproximationIterative(terms));
        System.out.println("piApproximationRecursive= " + piApproximationRecursive(terms));
        in.close();
    }
}
