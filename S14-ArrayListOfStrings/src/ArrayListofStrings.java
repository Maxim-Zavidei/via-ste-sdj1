import java.util.Scanner;
import java.util.ArrayList;

public class ArrayListofStrings {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        ArrayList<String> list = new ArrayList<>();
        String newString;

        for (int i = 0; i < 7; i++) {
            System.out.print("Enter a string for i=" + i + ", : ");
            list.add(in.nextLine());
        }

        for (int i = 0; i < 7; i++) {
            System.out.println("stringArray[" + i + "]= " + list.get(i));
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

        for (int i = list.size() - 1; i >= index; i--) {
            list.set(i, list.get(i - 1));
        }

        list.set(index, newString);

        for (int i = 0; i < list.size(); i++) {
            System.out.println("stringArray[" + i + "]= " + list.get(i));
        }

        in.close();
    }
}
