import java.util.Scanner;

public class SelectionSort {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int[] x = new int[10];
        int startSwap = 0;

        for (int i = 0; i < x.length; i++) {
            System.out.print("x[" + i + "]= ");
            x[i] = in.nextInt();
        }

        System.out.println();
        System.out.println("All elements:");
        for (int i = 0; i < x.length; i++) {
            System.out.print(x[i] + " ");
        }

        int minIndex = 0;
        for (int i = startSwap + 1; i < 10; i++) if (x[i] < x[minIndex]) minIndex = i;
        System.out.println();
        System.out.println("The smallest element is at index " + minIndex + " with the value " + x[minIndex]);

        int tmp;
        tmp = x[startSwap];
        x[startSwap] = x[minIndex];
        x[minIndex] = tmp;
        minIndex = startSwap;

        System.out.println();
        System.out.println("All elements:");
        for (int i = 0; i < 10; i++) {
            System.out.print(x[i] + " ");
        }

        int minSoFarIndex;
        int temp;
        for (int start = 0; start < x.length - 1; start++) {
            minSoFarIndex = start;
            for (int i = start + 1; i < x.length; i++) if (x[i] < x[minSoFarIndex]) minSoFarIndex = i;
            temp = x[start];
            x[start] = x[minSoFarIndex];
            x[minSoFarIndex] = temp;
        }

        System.out.println();
        System.out.println("All elements:");
        for (int i = 0; i < 10; i++) {
            System.out.print(x[i] + " ");
        }

        in.close();
    }
}
