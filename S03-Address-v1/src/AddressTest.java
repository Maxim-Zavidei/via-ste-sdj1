import java.util.Scanner;

public class AddressTest {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter the town= ");
        String town = input.nextLine();
        System.out.print("Enter the street= ");
        String street = input.nextLine();
        System.out.print("Enter the number= ");
        int number = input.nextInt();
        input.nextLine();
        System.out.print("Enter the letter= ");
        String line = input.nextLine();
        char letter = line.charAt(0);

        System.out.print("Enter the floor= ");
        int floor = input.nextInt();
        input.nextLine();
        System.out.print("Enter the door= ");
        String door = input.nextLine();
        Address addressObj = new Address(town, street, number, letter, floor, door);

        System.out.println();
        System.out.println("Address object data:");
        System.out.println("getTown= " + addressObj.getTown());
        System.out.println("getStreet= " + addressObj.getStreet());
        System.out.println("getNumber= " + addressObj.getNumber());
        System.out.println("getLetter= " + addressObj.getLetter());
        System.out.println("getFloor= " + addressObj.getFloor());
        System.out.println("getDoor= " + addressObj.getDoor());
        System.out.println("getFullNumber= " + addressObj.getFullNumber());
        System.out.println("toString: " + addressObj.toString());

        input.close();
    }
}
