import java.util.Scanner;

public class NameTest {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter your first name= ");
        String firstName = input.nextLine();
        System.out.print("Enter your last name= ");
        String lastName = input.nextLine();
        Name nameObj = new Name(firstName, lastName);

        System.out.println();
        System.out.println("getFirstName= " + nameObj.getFirstName());
        System.out.println("getLastName= " + nameObj.getLastName());
        System.out.println("getFullName= " + nameObj.getFullName());
        System.out.println("getFormalName= " + nameObj.getFormalName());

        input.close();
    }
}
