import java.util.Scanner;

public class PasswordValidation {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        String username;
        String password;
        String passwordConfirmation;

        while (true) {
            System.out.print("Enter a username: ");
            username = in.nextLine();
            System.out.print("Enter a password: ");
            password = in.nextLine();
            System.out.print("Retype the password: ");
            passwordConfirmation = in.nextLine();
            if (password.equals(passwordConfirmation)) break;
            else System.out.println("Passwords do not match.");
        }

        System.out.println("Username= " + username);
        System.out.println("Password= " + password);
        in.close();
    }
}
