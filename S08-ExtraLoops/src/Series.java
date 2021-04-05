import java.util.Scanner;

public class Series {

    public static double seriesIterative(int term) {
        double series = 1;
        term--;
        for (int i = 1; i <= term; i++)
            series += Math.pow(1 / 2f, i);
        return series;
    }

    public static double seriesRecursive(int term) {
        return --term == 0 ? 1 : seriesRecursive(term) + Math.pow(1 / 2f, term);
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double sum = 1;
        System.out.print("n= ");
        int n = in.nextInt();
        System.out.println("seriesIterative= " + seriesIterative(n));
        System.out.println("seriesRecursive= " + seriesRecursive(n));
        in.close();
    }
}
