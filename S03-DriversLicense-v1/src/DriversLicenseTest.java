import java.util.Scanner;

public class DriversLicenseTest {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        int number;
        boolean permitForTruck;
        boolean permitForBus;
        int answer;

        System.out.println("Testing the first drivers license constructor type:");
        System.out.print("Enter the license number= ");
        number = input.nextInt();

        System.out.print("Press 1 if the license is valid for trucks and 0 if not: ");
        answer = input.nextInt();
        permitForTruck = answer == 1;

        System.out.print("Press 1 if the license is valid for busses and 0 if not: ");
        answer = input.nextInt();
        permitForBus = answer == 1;

        DriversLicense firstLicenseObj = new DriversLicense(number, permitForTruck, permitForBus);

        System.out.println();
        System.out.println("getNumber= " + firstLicenseObj.getNumber());
        System.out.println("getPermitForTruck= " + firstLicenseObj.getPermitForTruck());
        System.out.println("getPermitForBus= " + firstLicenseObj.getPermitForBus());
        System.out.println("toString: " + firstLicenseObj.toString());
        System.out.println();

        System.out.println("Testing the second drivers license constructor type:");
        System.out.print("Enter the license number= ");
        number = input.nextInt();

        System.out.print("Press 1 if the license is valid for trucks and busses and 0 if not: ");
        answer = input.nextInt();

        DriversLicense secondLicenseObj = new DriversLicense(number, (answer == 1));

        System.out.println();
        System.out.println("getNumber= " + secondLicenseObj.getNumber());
        System.out.println("getPermitForTruck= " + secondLicenseObj.getPermitForTruck());
        System.out.println("getPermitForBus= " + secondLicenseObj.getPermitForBus());
        System.out.println("toString: " + secondLicenseObj.toString());
        System.out.println();

        System.out.println("Testing the third drivers license constructor type:");
        System.out.print("Enter the license number= ");
        number = input.nextInt();

        DriversLicense thirdLicenseObj = new DriversLicense(number);

        System.out.println();
        System.out.println("getNumber= " + thirdLicenseObj.getNumber());
        System.out.println("getPermitForTruck= " + thirdLicenseObj.getPermitForTruck());
        System.out.println("getPermitForBus= " + thirdLicenseObj.getPermitForBus());
        System.out.println("toString: " + thirdLicenseObj.toString());
        System.out.println();

        input.close();
    }
}
