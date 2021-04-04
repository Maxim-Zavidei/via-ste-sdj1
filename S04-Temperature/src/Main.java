import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter a temperature in fahrenheit=");
        int fahrenheit = input.nextInt();

        Temperature temperatureObj = new Temperature(fahrenheit);

        System.out.println();
        System.out.println("Data of temperature object:");
        System.out.println("getFahrenheit= " + temperatureObj.getFahrenheit());
        System.out.println("getCelsius= " + temperatureObj.getCelsius());
        System.out.println("getKelvin= " + temperatureObj.getKelvin());

        input.close();
    }
}
