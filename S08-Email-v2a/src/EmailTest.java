import java.util.Scanner;

public class EmailTest {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter the user= ");
        String user = input.nextLine();
        System.out.print("Enter the host= ");
        String host = input.nextLine();
        System.out.print("Enter the domain= ");
        String domain = input.nextLine();

        Email emailObj = new Email(user, host, domain);

        System.out.println();
        System.out.println("Email object data:");
        System.out.println("getUser= " + emailObj.getUser());
        System.out.println("getHost= " + emailObj.getHost());
        System.out.println("getDomain= " + emailObj.getDomain());
        System.out.println("toString: " + emailObj.toString());

        input.close();
    }
}
