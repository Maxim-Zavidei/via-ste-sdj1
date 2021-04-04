import java.util.Scanner;

public class MyPersonalData {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter your name: ");
        String name = input.nextLine();

        System.out.print("Enter your age: ");
        int age = input.nextInt();

        System.out.print("Enter your address: ");
        input.nextLine();
        String address = input.nextLine();

        System.out.print("Your name is " + name + ", you are " + age + " years old and you live at " + address + ".");
        input.close();
    }
}
