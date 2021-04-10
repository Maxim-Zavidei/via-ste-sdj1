import java.util.Scanner;

public class ArrayCreation {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        String[] stringArray = new String[8];
        String newString;

        for (int i = 0; i < stringArray.length - 1; i++) {
            System.out.print("Enter a string for i=" + i + ", : ");
            stringArray[i] = in.nextLine();
        }

        for (int i = 0; i < stringArray.length; i++) {
            System.out.println("stringArray[" + i + "]= " + stringArray[i]);
        }

        System.out.print("Enter a string you want to add: ");
        newString = in.nextLine();

        int index;
        while (true) {
            System.out.print("Index= ");
            index = in.nextInt();
            if (0 <= index && index <= 7) break;
            System.out.println("Invalid index.");
        }

        for (int i = stringArray.length - 1; i >= index; i--) {
            stringArray[i] = stringArray[i - 1];
        }

        stringArray[index] = newString;

        for (int i = 0; i < stringArray.length; i++) {
            System.out.println("stringArray[" + i + "]= " + stringArray[i]);
        }

        in.close();
    }
}
