import java.util.Scanner;

public class MyNameAndAge {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter your name: ");
        String name = input.nextLine();

        System.out.print("Enter your age: ");
        int age = input.nextInt();

        System.out.print("Your name is " + name + " and you are " + age + " years old.");
        input.close();
    }
}
