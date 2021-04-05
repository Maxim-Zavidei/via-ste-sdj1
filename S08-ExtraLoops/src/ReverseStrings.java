import java.util.Scanner;

public class ReverseStrings {

    public static String reverseStringIterative(String toReverse) {
        StringBuilder toReturn = new StringBuilder(toReverse.length());
        char lastChar = toReverse.charAt(0);
        for (int i = toReverse.length() - 1; i > 0; i--) toReturn.append(toReverse.charAt(i));
        toReturn.append(lastChar);
        return toReturn.toString();
    }

    public static String reverseStringRecursive(String toReverse, StringBuilder sb) {
        return toReverse.length() == 1 ? sb.append(toReverse.charAt(0)).toString() : reverseStringRecursive(toReverse.substring(0, toReverse.length() - 1), sb.append(toReverse.charAt(toReverse.length() - 1)));
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String inputString;
        while (true) {
            System.out.print("Enter a string= ");
            inputString = in.nextLine();
            if (inputString.equals("quit")) break;
            System.out.println();
            System.out.println("reverseStringIterative= " + reverseStringIterative(inputString));
            System.out.println("reverseStringRecursive= " + reverseStringRecursive(inputString, new StringBuilder(inputString.length())));
            System.out.println();
        }
        in.close();
    }
}
